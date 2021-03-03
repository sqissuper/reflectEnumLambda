package reflect;
class Student{
    //私有属性name
    private String name = "bit";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Class<?> c2 = s.getClass();
        Class<?> c3 = Student.class;
        System.out.println(c2);
        System.out.println(c3);
        try {
            Class<?> c1 = Class.forName("reflect.Student");
            System.out.println(c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
