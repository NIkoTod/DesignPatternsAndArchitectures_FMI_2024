package Notify.external;
// не можете да ги пипате!
public class EmailNotifier {
    public void sendEmail(String email, String title, String message) {
        System.out.println("Sending email to " + email + " with title: " + title + " and message: " + message);
    }
}