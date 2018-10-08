package com.itmc.calendar;

import org.junit.Test;

import java.util.*;

/**
 * Create by it_mck 2018/10/8 10:43
 *
 * @Description:
 * @Version: 1.0
 */
public class CalendarDemo2Test {

    /**
     * 3年前的今天
     */
    @Test
    public void run1() {
        Calendar instance = Calendar.getInstance();

        //设置年份  当前年份  向前推三年
        instance.add(Calendar.YEAR, -3);//三年前
        int year = instance.get(Calendar.YEAR);
        //获取月份
        int month = instance.get(Calendar.MONTH);
        //获取当前日
        int date = instance.get(Calendar.DATE);
        System.out.println("三年前的今天是:" + year + "年/" + (month + 1) + "月/" + date + "日");

    }

    /**
     * 5年后的10天前
     */
    @Test
    public void run2() {

        Calendar instance2 = Calendar.getInstance();
        //设置年份  当前年份  向前推三年
        instance2.add(Calendar.YEAR, 5);//5年后
        instance2.set(Calendar.DATE, -10);//向前推10天
        int year = instance2.get(Calendar.YEAR);
        //获取月份
        int month = instance2.get(Calendar.MONTH);
        //获取当前日
        int date = instance2.get(Calendar.DATE);
        System.out.println("5年后的今天是:" + year + "年/" + (month + 1) + "月/" + date + "日");

    }


    /**
     * c.set(2011, 11, 11);
     */
    @Test
    public void run3() {
        Calendar c = Calendar.getInstance();
        c.set(2011, 11, 11);
        // 获取年
        int year = c.get(Calendar.YEAR);
        // 获取月
        int month = c.get(Calendar.MONTH);
        // 获取日
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
    }

    /*
     * 获取任意一年的二月有多少天
     *
     * 分析：
     * 		A:键盘录入任意的年份
     * 		B:设置日历对象的年月日
     * 			年就是A输入的数据
     * 			月是2
     * 			日是1
     * 		C:把时间往前推一天，就是2月的最后一天
     * 		D:获取这一天输出即可
     *
     *
     * 测试某年一年的2月
     */
    @Test
    public void run4() {

        Calendar c = Calendar.getInstance();
        int year = 2000;
        c.set(year, 2, 1);//设置某一年的三月1日   月份从0开始  所以3月 为 2
        c.add(Calendar.DATE, -1);//将日期向前推一天
        int date = c.get(Calendar.DATE);
        if (date == 28) {
            System.out.println(year+"是闰年,他的2月:" + date + "天");
        } else {
            System.out.println(year+"是闰年,他的2月:" + date + "天");
        }
    }
    @Test
    public void run5() {

        GregorianCalendar c =
                (GregorianCalendar) GregorianCalendar.getInstance();
        int year = 2001;
        if (c.isLeapYear(year)) {
            System.out.println(year+"是闰年");
        } else {
            System.out.println(year+"是平年");
        }
    }
}