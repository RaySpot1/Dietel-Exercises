package africa.semicolon.sendAm.controllers;

import africa.semicolon.sendAm.data.models.PackageService;
import africa.semicolon.sendAm.data.models.PackageServiceImplementation;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.requests.RegisterPackageRequest;
import africa.semicolon.sendAm.dtos.requests.UpdateTrackingInfoRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.RegisterPackageStatus;
import africa.semicolon.sendAm.dtos.responses.TrackingPackageResponse;
import africa.semicolon.sendAm.dtos.responses.UpdateTrackingInfoResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/package")
public class PackageControllers {
    private PackageService services = new PackageServiceImplementation();

    @PostMapping("/addPackage")
    public RegisterPackageStatus registerNewPackage(@RequestBody RegisterPackageRequest myPackage){
        return services.register(myPackage);
    }

    @GetMapping("/{trackingNumber}")
    public TrackingPackageResponse trackingPackageResponse(@PathVariable int trackingNumber){
        return services.trackPackage(trackingNumber);
    }

    @PostMapping("/updateStatus")
    public UpdateTrackingInfoResponse updateTrackingInfo(@RequestBody UpdateTrackingInfoRequest request){
        return services.updateTrackingInfo(request);
    }


}
