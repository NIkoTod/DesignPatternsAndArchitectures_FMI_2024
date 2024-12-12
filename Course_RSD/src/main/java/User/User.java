package User;

import java.util.Objects;

public abstract class User {

    String userID;
    String UserName;
    String UserPassword;
    String UserEmail;
    String UserPhone;
    String UserAddress;

    public User(String userID, String userName, String userPassword, String userEmail, String userPhone, String userAddress ) {
        this.userID = userID;
        UserName = userName;
        UserPassword = userPassword;
        UserEmail = userEmail;
        UserPhone = userPhone;
        UserAddress = userAddress;

    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(UserName, user.UserName) && Objects.equals(UserPassword, user.UserPassword) && Objects.equals(UserEmail, user.UserEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, UserName, UserPassword, UserEmail);
    }
}
