import org.junit.Test;
import pojo.Triangle;

import javax.annotation.Resource;

public class TriangleTest {
    @Test
    public void test(){
        Triangle triangle = new Triangle(60, 60, 1);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test1(){
        Triangle triangle = new Triangle(60, 60, 2);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test2(){
        Triangle triangle = new Triangle(60, 60, 60);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test3(){
        Triangle triangle = new Triangle(50, 50, 99);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test4(){
        Triangle triangle = new Triangle(50, 50, 100);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test5(){
        Triangle triangle = new Triangle(60,1,60);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test6(){
        Triangle triangle = new Triangle(60,2,60);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test7(){
        Triangle triangle = new Triangle(50, 99, 50);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test8(){
        Triangle triangle = new Triangle(50, 100, 50);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test9(){
        Triangle triangle = new Triangle(1, 60, 60);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test10(){
        Triangle triangle = new Triangle(2, 60, 60);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test11(){
        Triangle triangle = new Triangle(99, 50, 50);
        System.out.println(triangle.Judge());
    }
    @Test
    public void test12(){
        Triangle triangle = new Triangle(100, 50, 50);
        System.out.println(triangle.Judge());
    }
}
