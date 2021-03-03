package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum TestEnum {
    Red("red", 1),White("white",2),Black("black",3),Green("green",4);

    public String color;
    public int ordinal;
    TestEnum(String color,int ordinal) {
        this.color = color;
        this.ordinal = ordinal;
    }

    public static void reflectNewInstance() {
        try {
            Class<?> c = Class.forName("reflect.TestEnum");
            Constructor con = c.getDeclaredConstructor(String.class,int.class);
            con.setAccessible(true);
            TestEnum yellow = (TestEnum) con.newInstance("Yellow",5);
            System.out.println(yellow);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reflectNewInstance();
//        TestEnum[] te = TestEnum.values();
//        for (TestEnum x:te) {
//            System.out.println(x);;
//        }
//        for (int i = 0; i < te.length; i++) {
//            System.out.println(te[i].ordinal());
//        }
//
//
//        System.out.println(TestEnum.valueOf("Green"));


    }
}
