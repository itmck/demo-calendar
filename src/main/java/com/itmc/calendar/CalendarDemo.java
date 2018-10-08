package com.itmc.calendar;

import java.util.Calendar;

/**
 * Create by it_mck 2018/10/8 10:18
 *
 * @Description: 常用类
 * @Version: 1.0
 */
public class CalendarDemo {


    /**
     *  Calendar.YEAR :获取当前是哪一年
     *  Calendar.MONTH : 月份 默认从0开始
     *  Calendar.DATE :获取当前日期是哪一天
     */
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        //获取当前年
        int year = instance.get(Calendar.YEAR);
        //获取当前月 注意  月份从0开始.需要+1得出当前月
        int month = instance.get(Calendar.MONTH);
        //获取当前日
        int date = instance.get(Calendar.DATE);
        System.out.println("今天是:"+year+"年/"+(month+1)+"月/"+date+"日");
    }

}
