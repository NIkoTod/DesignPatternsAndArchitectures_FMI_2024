package User;

public class Dealer extends User{

    String Info;
    String Licence;
    String name;

    public Dealer(String info, String licence, String name,
                  String userName, String password,String userEmail, String userId) {

        super(userName, password, userEmail, userId);
        this.Info = info;
        this.Licence = licence;
        this.name = name;


    }

    public Dealer(String userID, String userName, String userPassword, String userEmail) {
        super(userID, userName, userPassword, userEmail);
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getLicence() {
        return Licence;
    }

    public void setLicence(String licence) {
        Licence = licence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
