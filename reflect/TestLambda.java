package reflect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}
//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}
public class TestLambda {
    public static void main(String[] args) {
//        OneParameterNoReturn one = (int a) -> {
//            System.out.println(a);
//        };
//        one.test(10);
//        MoreParameterNoReturn more = (int a,int b) -> {
//            System.out.println(a + b);
//        };
////        more.test(10,20);
//        NoParameterReturn no = () -> {
//            return 10;
//        };
//        NoParameterReturn no1 = () -> 10;
//        System.out.println(no1.test());
//
//        OneParameterReturn one = a -> a;
//        System.out.println(one.test(10));
//
//        MoreParameterReturn more = (a,b) -> a + b;
//        System.out.println(more.test(10, 20));

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(0);
        list.sort(((o1, o2) -> o1 - o2));
        list.forEach(System.out::println);
    }
}
