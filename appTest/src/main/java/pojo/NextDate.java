package pojo;
import com.sun.org.glassfish.gmbal.ParameterNames;

/*
 * 问题描述
 * NextDate函数输入为month(月份)、day(日期)和year(年)，
 * 输出为输入后一天的日期。例如，如果输入为：1964年8月16日，
 * 则输出为1964年8月17日。要求输入变量month、day和year都是整数值，并且满足以下条件：
 * 1≤month≤12
 * 1≤day≤31
 * 1900≤year≤2050
 */

public class NextDate {


    private int year;
    private int month;
    private int day;

    public NextDate() {
    }

    public NextDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String NextDateJudge() {

        if ((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 29)) {
            day += 1;
            return year + "年" + month + "月" + day + "日";
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            month += 1;
            day = 1;
            return year + "年" + month + "月" + day + "日";
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
            return " 不可能";
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day >= 1 && day <= 30)) {
            day += 1;
            return year + "年" + month + "月" + day + "日";
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 31)) {
            month += 1;
            day = 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 12 && (day >= 1 && day <= 30)) {
            day += 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 12 && day == 31) {
            year += 1;
            month = 1;
            day = 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 2 && (day >= 1 && day <= 27)) {
            day += 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 2 && day == 28 && year % 4 == 0) {
            day += 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 2 && day == 28 && year % 4 != 0) {
            month += 1;
            day = 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 2 && day == 29 && year % 4 == 0) {
            month += 1;
            day = 1;
            return year + "年" + month + "月" + day + "日";
        }
        if (month == 2 && day == 29 && year % 4 != 0) {
            return "不可能";
        }
        if (month == 2 && (day >= 30 && day <= 31)) {
            return "不可能";
        }
        return "";
    }
}
