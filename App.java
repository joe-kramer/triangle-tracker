import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please Enter the length of your first triangle side:");
    int sideOne = Integer.parseInt(myConsole.readLine());
    System.out.println("Please Enter the length of your second triangle side:");
    int sideTwo = Integer.parseInt(myConsole.readLine());
    System.out.println("Please Enter the length of your third triangle side:");
    int sideThree = Integer.parseInt(myConsole.readLine());

    Triangle userTriangle = new Triangle(sideOne, sideTwo, sideThree);
    System.out.println(userTriangle.whichTriangle());

  }
}
