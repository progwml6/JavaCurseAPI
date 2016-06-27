package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import lombok.ToString;

@ToString
public class UserClientSettingsNotification extends BaseResponse implements Response {
    public long userID;
    public long dateUpdated;
    public String globalSettings;
    public String desktopSettings;
    public String webSettings;
    public String mobileSettings;
}
