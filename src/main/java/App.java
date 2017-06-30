import java.io.Console;

public class App
{
  public static void main(String[] args)
  {
      // Console myConsole = System.console();
      // Integer userInputAge = Integer.parseInt(myConsole.readLine());

      Player player1 = new Player();
      player1.setAge(900000);
      player1.mAge = 100000;

      System.out.println(player1.getAge());
      //System.out.println(player2.age);
  }
}
