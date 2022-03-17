package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.data.repositories.PackageRepositoryImplementation;
import africa.semicolon.sendAm.data.repositories.UserRepositoryImplementation;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.requests.RegisterPackageRequest;
import africa.semicolon.sendAm.dtos.requests.UpdateTrackingInfoRequest;
import africa.semicolon.sendAm.dtos.responses.*;
import africa.semicolon.sendAm.exception.UserNotFoundException;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class PackageServiceImplementation implements PackageService{
    private PackageRepository packageRepository = new PackageRepositoryImplementation();
    Status status = new Status();



    @Override
    public AddPackageResponse addPackage(AddPackageRequest myPackage){
       Package packageToBeAdded = new Package();
       PackageDescription description = new PackageDescription();
       description.setName(myPackage.getName());
       description.setWeightInGrammes(myPackage.getWeightInGrammes());
       packageToBeAdded.setDescription((description));
       Status status = new Status();
       status.setStatus("Created");
       packageToBeAdded.getStatusList().add(status);

       Package savedPackage = packageRepository.save(packageToBeAdded);

       AddPackageResponse packageResponse = new AddPackageResponse();
       packageResponse.setId(savedPackage.getId());
       packageResponse.setName(savedPackage.getDescription().getName());
       packageResponse.setWeightInGrammes(savedPackage.getDescription().getWeightInGrammes());
//       packageResponse.setStatus(savedPackage.getDescription());


       return packageResponse;
    }


    @Override
    public FindPackageStatus findPackageByStatusId(int statusId) {

        Package aPackage =  packageRepository.findById(statusId);
        UserRepositoryImplementation aUser = new UserRepositoryImplementation();
        if(aPackage==null) throw new UserNotFoundException(1 + " not found");
        FindPackageStatus response = new FindPackageStatus();

        response.setId(aPackage.getId());
        response.setStatus(status.getStatus());

        return response;
    }

    @Override
    public RegisterPackageStatus register(RegisterPackageRequest requestForm) {
        User user = new User();
        Package newPackage = new Package();

        PackageDescription packageDescription = new PackageDescription();
        user.setEmail((requestForm.getEmail()));
        user.setAddress(requestForm.getAddress());
        user.setFullName(requestForm.getFullName());
        user.setPhoneNumber(requestForm.getPhoneNumber());
        packageDescription.setName(requestForm.getPackageName());
        packageDescription.setWeightInGrammes(requestForm.getWeightInGrammes());
        status.setStatus(requestForm.getPackageStatus());
        newPackage.setOwner(user);
        newPackage.setDescription(packageDescription);
        newPackage.getStatusList().add(status);


        Package savedPackage = packageRepository.save(newPackage);
        requestForm.setPackageId(newPackage.getId());
        RegisterPackageStatus response = new RegisterPackageStatus();
        response.setEmail(user.getEmail());
        response.setPackageId(requestForm.getPackageId());
        response.setStatus(requestForm.getPackageStatus());

        return null;
    }

    @Override
    public PackageRepository getRepository(){
        return packageRepository;
    }

    @Override
    public UpdateTrackingInfoResponse updateTrackingInfo(UpdateTrackingInfoRequest trackingRequest){
        Package foundPackage = packageRepository.findById(trackingRequest.getTrackingNumber());
        Status status = new Status();

//        create new status
        status.setStatus(trackingRequest.getTrackingInfo());

//        add new status
//        save package
        foundPackage.getStatusList().add(status);
        packageRepository.save(foundPackage);
        return null;

    }

    @Override
    public TrackingPackageResponse trackPackage(int trackingNumber){
//        find package
        Package savedPackage = packageRepository.findById(trackingNumber);

//        get list of status
        List<Status> statusList = savedPackage.getStatusList();
//        create response
        TrackingPackageResponse response = new TrackingPackageResponse();
//        add list of status
        for(Status status : statusList){
            TrackingInfo info = new TrackingInfo();
            info.getDateTime(DateTimeFormatter.ofPattern("E yyyy-MM-dd a").format(status.getDateTime()));
            response.getTrackingInfo().add(info);
        }

        return response;
    }
}
