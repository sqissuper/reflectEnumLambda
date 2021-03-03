package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectClassDemo {
    public static void reflectNewInstance() {
        try {
            Class<?> c1 = Class.forName("reflect.Student");
//            Constructor con = c1.getConstructor();
//            Student s = (Student) c1.newInstance();
            Constructor con = c1.getDeclaredConstructor(String.class,int.class);
            con.setAccessible(true);
            Student s1 = (Student) con.newInstance("shiqiang",20);
            System.out.println(s1);
//            System.out.println(con);
//            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void reflectPrivateField() {
        try {
            Class<?> c1 = Class.forName("reflect.Student");
            Field f = c1.getDeclaredField("name");
            f.setAccessible(true);
            Student s = (Student) c1.newInstance();
            f.set(s,"shiqiang");
            System.out.println(f);
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }


        public static void main(String[] args) {
//        reflectNewInstance();
            reflectPrivateField();
    }
}
