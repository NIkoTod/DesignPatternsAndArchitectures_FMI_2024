package Notify;

import Repository.Repository;

import java.util.Map;
@Deprecated
public class Notifier {

    public Notifier(){}

    public void notify(String data) {

        Map<String,String> res = Repository.getInstance().getNotification(data);
        //For each key value switch(value)
        //So if sms we use SmsNotifier ... getting needed phone,adress,email
    }
}
