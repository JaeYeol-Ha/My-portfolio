package com.creativity.board.study;
public class User2 {
 
    private String userId;
    private String userPwd;
    private String name;
    private String authType;
    
    public User2(String userId, String name, String authType) {
        super();
        this.userId = userId;
        this.name = name;
        this.authType = authType;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPwd() {
        return userPwd;
    }
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthType() {
        return authType;
    }
    public void setAuthType(String authType) {
        this.authType = authType;
    }
    
    @Override
    public String toString() {
        return "User [userId=" + userId + ", userPwd=" + userPwd + ", name=" + name + ", authType=" + authType + "]";
    }
}
