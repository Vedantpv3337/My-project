
import java.util.Scanner;
public class randomnumber {
// Mini Project
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
  int myNumber = (int)(Math.random()*100);
  int userNumber = 0;
 do{
     System.out.println("Guess My Number(1-100) : ");
      userNumber = sc.nextInt();

     if (userNumber == myNumber ) {
         System.out.println("yesss......The Number is Correct");
         break;
     }
     else if (userNumber > myNumber) {
         System.out.println("Your Number is Too Large");

     }
     else {
         System.out.println("Your Number is Too Small");
     }
 }
     while (userNumber >= 0);

         System.out.println("My Number Was : ");
         System.out.println("myNumber");

    }
}
