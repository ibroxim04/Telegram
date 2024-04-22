package uz.pdp.backend.models;

public class GroupChat extends BaseModel{
    private String title;
    private String ownerId;
    private Integer userNumber;

    public GroupChat(String title, String ownerId, Integer userNumber) {
        this.title = title;
        this.ownerId = ownerId;
        this.userNumber = userNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return title + " " + getId();
    }
}
