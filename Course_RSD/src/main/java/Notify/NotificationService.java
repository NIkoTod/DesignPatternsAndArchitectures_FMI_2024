package Notify;

import java.util.ArrayList;
import java.util.List;

import Filter.Filter;
import Post.Post;
public class NotificationService {

    private final List<NotificationRule> notificationRules = new ArrayList<>();

    public void subscribe(NotificationRule notificationRule) {
        notificationRules.add(notificationRule);
    }

    public void onNewListingAdded(Post post) {
        for (NotificationRule notificationRule : notificationRules) {
            boolean shouldNotify = true;
            for (Filter filter : notificationRule.filters()) {
                if (!filter.filter(notificationRule.toString(),post.getProduct())) {
                    shouldNotify = false;
                    break;
                }
            }
            if (shouldNotify) {
                String message = post.getProduct().toString();
                notificationRule.channel().notify(
                        "New car found for you!",
                        message
                );
            }
        }
    }
}
