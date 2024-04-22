package uz.pdp.backend.models;

public class PrivateChat extends BaseModel {
    private String title;
    private String fromId;
    private String toId;
    private final Integer userNumber = 2;

    public PrivateChat(String title, String fromId, String toId) {
        this.title = title;
        this.fromId = fromId;
        this.toId = toId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    @Override
    public String toString() {
        return title + " " + getId();
    }
}
