package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static float timeStarted = System.nanoTime();

    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) * 1E-9);
    }

    public static String getCurrentTimestamp() {
        String timeStamp = new SimpleDateFormat("YYYY-MM-DD.HH:mm:ss").format(new Date());
        return timeStamp;
    }
}
