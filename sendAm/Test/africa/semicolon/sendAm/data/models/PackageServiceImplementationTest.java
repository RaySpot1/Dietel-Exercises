package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.requests.RegisterPackageRequest;
import africa.semicolon.sendAm.dtos.requests.UpdateTrackingInfoRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.FindPackageStatus;
import africa.semicolon.sendAm.dtos.responses.RegisterPackageStatus;
import africa.semicolon.sendAm.dtos.responses.TrackingPackageResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageServiceImplementationTest {
    PackageService packageService;
    @BeforeEach
    void setUp(){
        packageService = new PackageServiceImplementation();
    }

    @Test
    public void AddPackageToRepositoryTest(){
        AddPackageRequest packageToAdd = new AddPackageRequest();

        PackageDescription description = new PackageDescription();
        description.setName("My First Package");
        description.setWeightInGrammes(25);
        packageService.addPackage(packageToAdd);
        assertEquals(1, packageService.getRepository().count());

    }

    @Test
    public void addedPackageGivesCorrectResponseTest(){
        RegisterPackageRequest requestForm = createRegisterForm();
        RegisterPackageStatus response = packageService.register(requestForm);
        assertEquals("donald@gmail.com", response.getEmail());
        assertEquals(1, response.getPackageId());
    }

    @Test
    public void statusUpdatesWhenNewPackageIsAddedTest(){
//        AddPackageRequest packageToAdd = new AddPackageRequest();
//        packageToAdd.setName("Boxers");
//        packageToAdd.setWeightInGrammes(12);
//        packageService.addPackage(packageToAdd);
//
//        Package savedPackage = packageService.getRepository().findById(1);
//        assertEquals(1, savedPackage.getStatusList().size());

        RegisterPackageRequest requestForm = createRegisterForm();
        packageService.register(requestForm);
//        System.out.println(requestForm.getPackageStatus());
        FindPackageStatus response = packageService.findPackageByStatusId(requestForm.getPackageId());
        assertEquals("Your package left the delivery Store", response.getStatus());
        assertNotNull(response.getTimeAndDate());
    }

    private RegisterPackageRequest createRegisterForm(){
        RegisterPackageRequest registerForm = new RegisterPackageRequest();

        PackageDescription packageDescription = new PackageDescription();
        registerForm.setFullName("Ray Spot");
        registerForm.setPhoneNumber("packagePhoneNumber");
        registerForm.setAddress("Lagos");
        registerForm.setEmail("donald@gmail.com");
        registerForm.setWeightInGrammes(2.3);
        registerForm.setPackageName("Shoes");
        registerForm.setPackageStatus("Your Package has left the delivery Store");

        return registerForm;
    }



    public void savePackage(){
        AddPackageRequest packageToAdd = new AddPackageRequest();
        packageToAdd.setName("Boxer");
        packageToAdd.setWeightInGrammes(12);
        packageService.addPackage(packageToAdd);
    }

    @Test
    public void addStatusTest(){
//        given that there is a status
        savePackage();
//        when i update status
        UpdateTrackingInfoRequest updateTrackingInfoRequest = new UpdateTrackingInfoRequest();
        updateTrackingInfoRequest.setTrackingNumber(1);
        updateTrackingInfoRequest.setTrackingInfo("Arrived");
        packageService.updateTrackingInfo(updateTrackingInfoRequest);
//        confirm status count
        Package savedPackage = packageService.getRepository().findById(1);
        assertEquals(2, savedPackage.getStatusList().size());
//        confirm status msg

    }

    @Test
    public void trackPackageTest(){
        savePackage();
        TrackingPackageResponse trackingInfo = packageService.trackPackage(1);
    }


}