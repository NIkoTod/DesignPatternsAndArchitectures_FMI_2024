package User;

import Filter.CarFilter;
import Notify.NotificationRule;
import Notify.NotificationService;
import Notify.external.SmsNotifier;
import Notify.channels.SmsNotificationChannel;

import java.util.List;

public class StandardUser extends User{

    public StandardUser(String userID, String userName, String userPassword, String userEmail,String UserPhone,String UserAdress) {
        super(userID, userName, userPassword, userEmail, UserPhone, UserAdress  );
    }

    public void setNotification(String preferences,String notificationType) {
        NotificationService notificationService = new NotificationService();
        notificationService.subscribe(
                new NotificationRule(
                        new CarFilter().build(),//inline or other filter building
                        new SmsNotificationChannel(new SmsNotifier(), "+359888888888")
                )
        );

    }

}
