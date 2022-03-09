package africa.semicolon.sendAm.dtos.responses;

import africa.semicolon.sendAm.data.models.User;

import java.time.LocalDateTime;

public class FindPackageStatus {
    private String status;
    private LocalDateTime timeAndDate;
    private User owner;
    private int Id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTimeAndDate() {
        return timeAndDate;
    }

    public void setTimeAndDate(LocalDateTime timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
