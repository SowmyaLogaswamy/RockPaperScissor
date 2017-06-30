public class Player {
  private String name;
  private int mAge;
  private String city;

  public String Play() {
        return "Rock";
    }

  public void setAge(int age)
  {
      if(age >=0 && age <= 130) {
          mAge = age;
      }
      else {
          System.out.println("Age cannot be < 0 && > 130");
      }
  }

  public Integer getAge() {
      return mAge;
  }
}
