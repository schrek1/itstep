package cz.itstep.pratice.users;

import java.util.Arrays;

public class User {
    private long id;
    private String username;
    private String password;
    private byte[] secPassword;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.secPassword = password != null ? password.getBytes() : null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public byte[] getSecPassword() {
        return secPassword;
    }

    public void setPassword(String password) {
        this.password = password;
        this.secPassword = password != null ? password.getBytes() : null;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", secPassword=" + secPassword +
                '}';
    }
}
