package User;

import Repository.Repository;

public class StandardUser extends User{

    public StandardUser(String userID, String userName, String userPassword, String userEmail,String UserPhone,String UserAdress) {
        super(userID, userName, userPassword, userEmail, UserPhone, UserAdress  );
    }

    public void setNotification(String preferences,String notificationType) {
        Repository.getInstance().addNotification(userID,preferences,notificationType);
    }

}
