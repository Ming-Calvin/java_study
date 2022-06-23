package day10.src;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(1, "tom");

        // 编译不通过
//        p.age = 1;

//        p.setAge(1);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
