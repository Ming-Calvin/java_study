package day10.src;

public class Person {
    private int age;
    private String name;

    public Person() {
        age = 18;
    }

    public Person(int a, String n) {
        age = a;
        name = n;
    }

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            System.out.println("error");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
