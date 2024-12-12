package Repository;

import java.util.List;
import java.util.Map;

public class Repository {

    private static Repository instance = null;

    private Repository(){}

    public static Repository getInstance(){
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public void addNotification(String userID,String query,String notificationType){
        //Adding to db;
    }


    public Map<String,String> getNotification(String query){
        //getting from db list of ids which we shoud notify;
        return null;
    }


}
