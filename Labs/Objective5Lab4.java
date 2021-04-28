import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int userNum;
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    userNum = scnr.nextInt();

    if(userNum % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }

    scnr.close();
  }
}
