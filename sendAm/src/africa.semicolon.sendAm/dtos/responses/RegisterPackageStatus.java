package africa.semicolon.sendAm.dtos.responses;

public class RegisterPackageStatus {
    private String email;
    private int packageId;
    private String status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RegisterPackageStatus{" +
                "email='" + email + '\'' +
                ", packageId=" + packageId +
                ", status='" + status + '\'' +
                '}';
    }
}
