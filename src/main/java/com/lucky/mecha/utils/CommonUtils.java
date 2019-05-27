package com.lucky.mecha.utils;

import com.lucky.mecha.exception.MechaException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class CommonUtils {
    private static String[] parsePatterns= {
            "yyyy-MM-dd","yyyy/MM/dd","yyyy.MM.dd"
    };
    public static String getMd5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }

    public static Date parseStringToDate(String dateStr) throws MechaException {
        try{
            return DateUtils.parseDate(dateStr,parsePatterns);
        }catch (Exception e){
            throw new MechaException(e.getMessage());
        }
    }
}
