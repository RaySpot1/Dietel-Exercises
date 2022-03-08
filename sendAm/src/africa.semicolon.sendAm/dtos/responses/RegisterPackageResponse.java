package africa.semicolon.sendAm.dtos.responses;

import africa.semicolon.sendAm.data.models.PackageDescription;
import africa.semicolon.sendAm.data.models.Status;

public class RegisterPackageResponse {
    private int id;
    private String emailAddress;
    private PackageDescription description;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PackageDescription getDescription() {
        return description;
    }

    public void setDescription(PackageDescription description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}
