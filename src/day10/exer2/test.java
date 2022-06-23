package day10.exer2;

public class test {
  public static void main(String[] args) {
    Boy boy = new Boy("man", 21);
    boy.shout();

    Girl girl = new Girl("women", 12);
    girl.marry(boy);

    Girl girl1 = new Girl("lala", 18);
    int compare = girl.compare(girl1);
    System.out.println(compare);

    if(compare > 0) {
      System.out.println(girl.getName() + "大");
    } else if(compare < 0) {
      System.out.println(girl1.getName() + "大");
    } else {
      System.out.println("一样大");
    }
  }

}
