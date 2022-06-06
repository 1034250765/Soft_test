import org.junit.Test;
import pojo.NextDate;

public class NextDateTest {
    @Test
    public void test(){
        NextDate nextDate = new NextDate(1964,8,16);
        System.out.println(nextDate.NextDateJudge());
    }
    @Test
    //month有30天 且天数在1至29天
    public void test1(){
        NextDate nextDate = new NextDate(1967,4,29);
        System.out.println(nextDate.NextDateJudge());
        //1967年4月30日
    }
    @Test
    //month有30天 且day=30
    public void test2(){
        NextDate nextDate = new NextDate(1967,4,30);
        System.out.println(nextDate.NextDateJudge());
        //1967年5月1日
    }
    @Test
    //month有30天 且天数是31
    public void test3(){
        NextDate nextDate = new NextDate(1967,4,31);
        System.out.println(nextDate.NextDateJudge());
        // 不可能
    }
    @Test
    //month有31天 12月除外 day在1-30天
    public void test4(){
        NextDate nextDate = new NextDate(1967,1,30);
        System.out.println(nextDate.NextDateJudge());
        //1967年1月31日
    }
    @Test
    //month有31天 12月除外 day=31
    public void test5(){
        NextDate nextDate = new NextDate(1967,1,31);
        System.out.println(nextDate.NextDateJudge());
        //1967年2月1日
    }
    @Test
    //month=12 day在1-30
    public void test6(){
        NextDate nextDate = new NextDate(1967,12,30);
        System.out.println(nextDate.NextDateJudge());
        //1967年12月31日
    }
    @Test
    //month=12 day=31
    public void test7(){
        NextDate nextDate = new NextDate(1967,12,31);
        System.out.println(nextDate.NextDateJudge());
        //1968年1月1日
    }
    @Test
    //month=2 day在1-27
    public void test8(){
        NextDate nextDate = new NextDate(1967,2,27);
        System.out.println(nextDate.NextDateJudge());
        //1967年2月28日
    }
    @Test
    //month=2 day=28 year是闰年
    public void test9(){
        NextDate nextDate = new NextDate(2016,2,28);
        System.out.println(nextDate.NextDateJudge());
        //2016年2月29日
    }
    @Test
    //month=2 day=28 year不是闰年
    public void test10(){
        NextDate nextDate = new NextDate(2017,2,28);
        System.out.println(nextDate.NextDateJudge());
        //2017年3月1日
    }
    @Test
    //month=2 day=29 year是闰年
    public void test11(){
        NextDate nextDate = new NextDate(2016,2,29);
        System.out.println(nextDate.NextDateJudge());
        //2016年3月1日
    }
    @Test
    //month=2 day=29 year不是闰年
    public void test12(){
        NextDate nextDate = new NextDate(2017,2,29);
        System.out.println(nextDate.NextDateJudge());
        //不可能
    }
    @Test
    //month=2 day=30或者是31 year不是闰年
    public void test13(){
        NextDate nextDate = new NextDate(2017,2,30);
        System.out.println(nextDate.NextDateJudge());
        //不可能
    }
}
