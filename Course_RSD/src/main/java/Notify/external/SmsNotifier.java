package Notify.external;


// не можете да ги пипате!
public class SmsNotifier {
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + " with message: " + message);
    }
}
