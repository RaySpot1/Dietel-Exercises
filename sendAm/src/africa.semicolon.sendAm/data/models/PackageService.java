package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.requests.RegisterPackageRequest;
import africa.semicolon.sendAm.dtos.requests.UpdateTrackingInfoRequest;
import africa.semicolon.sendAm.dtos.responses.*;

public interface PackageService {
//    AddPackageResponse addPackage(AddPackageRequest myPackage);

    RegisterPackageStatus register(RegisterPackageRequest requestForm);

    PackageRepository getRepository();

    AddPackageResponse addPackage(AddPackageRequest myPackage);

    FindPackageStatus findPackageByStatusId(int StatusId);

    UpdateTrackingInfoResponse updateTrackingInfo(UpdateTrackingInfoRequest trackingInfoRequest);

    TrackingPackageResponse trackPackage(int trackingNumber);
}
