package com.xyc.todolist.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

/**
 * 时间工具类
 */
public class DateTimeUtils {
    //返回时间戳 秒单位
    public static Long getCurrentTimeStamp(){
        Instant instant = Instant.now();
       return instant.getEpochSecond();
    }

}
