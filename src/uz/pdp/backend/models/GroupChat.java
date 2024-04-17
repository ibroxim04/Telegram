package uz.pdp.backend.models;

public class GroupChat extends BaseModel{
    private String title;
    private String userId;
    private Integer userNumber;

    public GroupChat(String title, String userId, Integer userNumber) {
        this.title = title;
        this.userId = userId;
        this.userNumber = userNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return title;
    }
}
