import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        String alice = "Alice";
        String bob = "Bob";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please identify yourself.");
        String userName = scanner.nextLine();

        if(userName.equals(alice)){
            System.out.println("Hello there Alice. It\'s nice seeing you again.");
        }
        if (userName.equals(bob)){
            System.out.println("Oh it\'s just you Bob. Go away!");
        } else{
            System.out.println("Sorry but you don\'t have access.");

        }


    }
}
