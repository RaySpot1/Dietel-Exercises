package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.data.repositories.PackageRepositoryImplementation;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;

public class PackageServiceImplementation implements PackageService{
    PackageRepository packageRepository = new PackageRepositoryImplementation();


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
       packageResponse.setDescription(savedPackage.getDescription());

       return packageResponse;
    }
}
