package Notify;
import Filter.Filter;
import Notify.channels.NotificationChannel;

import java.util.List;

public record NotificationRule(
        List<Filter> filters,
        NotificationChannel channel
) {}
