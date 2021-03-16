package com.fwzhang.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public static final String DATE_TIME_FORMAT = "YYYY-MM-DD HH:mm:ss";
    public static final String DATE_FORMAT = "YYYY-MM-DD";

    public static String formatInstant(Instant instant, String dateFormat) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.format(DateTimeFormatter.ofPattern(dateFormat));
    }
}
