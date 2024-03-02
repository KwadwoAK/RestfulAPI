package dev.tethmado.restappapi.model;

public class FriendVendor {

    private String username;
    private String realName;
    private String friendId;

    public FriendVendor(String username, String realName, String friendId) {
        this.username = username;
        this.realName = realName;
        this.friendId = friendId;
    }

    public FriendVendor() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}

