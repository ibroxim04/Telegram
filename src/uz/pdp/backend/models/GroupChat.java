package uz.pdp.backend.models;

public class GroupChat extends BaseModel{
    private String title;
    private String ownerId;

    public GroupChat(String title, String ownerId) {
        this.title = title;
        this.ownerId = ownerId;
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

    @Override
    public String toString() {
        return title + " " + getId();
    }
}
