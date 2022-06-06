package pojo;

/*
   输入3个整数a、b和c分别作为三角形的三条边，要求a、b和c必须满足以下条件：
1、整数
2、3个数
3、边长大于等于1，小于等于100
4、任意两边之和大于第三边
输出为5种情况之一：
 如果不满足条件1、2、3，则程序输出为“输入错误”。
 如果不满足条件4，则程序输出为“非三角形”。
 如果三条边相等，则程序输出为“等边三角形”。
 如果恰好有两条边相等，则程序输出为“等腰三角形”。
 如果三条边都不相等，则程序输出为“一般三角形”。

 */

public class Triangle {
    
    private int a; //第一条边
    private int b; //第二条边
    private int c; //第三条边

    public Triangle() {
    }

    public Triangle(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String Judge() {
        // case 1 边长不符合
        if ((a < 1 || a > 100) || (b < 1 || b > 100) || (c < 1 || c > 100)) {
            return "输入错误";
        }

        //case 4 两边之和小于第三边非三角形
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            return "非三角形";
        }
        //case 5 如果三条边相等，则程序输出为“等边三角形”。
        if ((a == b) && (b == c)) {
            return "等边三角形";
        }
        //case 6如果恰好有两条边相等，则程序输出为“等腰三角形”
        if ((a == b && b != c) || (a == c && b != c) || (b == c && b != a)) {
            return "等腰三角形";
        }
        if (a != b && a != c && b != c) {
            return "一般三角形";
        } else
            return "没有预料到的情况";
    }
}
