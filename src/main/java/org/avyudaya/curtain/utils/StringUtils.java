package org.avyudaya.curtain.utils;

public class StringUtils extends org.springframework.util.StringUtils {
    public StringUtils() {
        super();
    }

    public static String getNotNullString(String val){
        return val == null ? "": val;
    }
}
