package day13.exer2;

public class MyDateTest {
  public static void main(String[] args) {
    MyDate m1 = new MyDate(14,  3, 1976);
    MyDate m2 = new MyDate(14,  3, 1976);

    if (m1 == m2) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }

    if (m1.equals(m2)) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}

class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MyDate)) return false;
    MyDate myDate = (MyDate) o;
    return day == myDate.day && month == myDate.month && year == myDate.year;
  }
}
