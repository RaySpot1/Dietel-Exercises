package africa.semicolon.sendAm.data.models;

import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;

public interface PackageService {
    AddPackageResponse addPackage(AddPackageRequest myPackage);
}
