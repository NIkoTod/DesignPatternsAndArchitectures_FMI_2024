package Notify;
import Filter.Filter;
import Notify.channels.NotificationChannel;

public record NotificationRule(
        Filter filter,
        NotificationChannel channel
) {}
