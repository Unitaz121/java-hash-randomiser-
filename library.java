package HASHAPP;
import java.util.Scanner;
import java.io.PrintStream;
import java.util.ArrayList;
// Password to enter is "1" 
public class library {

    static void index(){
        //Enter the account and password correctly, enter the library management system
        System.out.println("**********Welcome to the Hash shuffle thing**********");

        //Operation options
        System.out.println("1. View");
        System.out.println("2. Add Hash");
        System.out.println("3. Add shuffle");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("Please enter options (1-5)");

        //Create object
        Scanner input = new Scanner(System.in);

        //Keyboard input operation options
        int sc = input.nextInt();

        //Judgment input selection
        switch (sc) {
            case 1:
                System.out.println("View");
                break;
            case 2:
                System.out.println("Add Hash ");
                HASH HASHObject = new HASH();
                HASH.main();
                System.out.println("Please copy your hash for the shuffle option");
                break;
            case 3:
                System.out.println("Add shuffle");
                RANDOMISER RANDOMISERObject = new RANDOMISER();
                try {
                    RANDOMISER.main2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                System.out.println("Delete ");

                break;
            case 5:
                System.exit(0);//Exit the program
            default:
                System.out.println("Please enter the correct option!");//Prompt when the option is entered incorrectly
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Create object

        System.out.println("**********Hash random **********");

        System.out.println("Please enter the account number:");
        int acount = input.nextInt();//Keyboard input account
        System.out.println("Please enter the password:");
        int pwd = input.nextInt();//Keyboard input password

        //Determine whether the account and password are entered correctly
        if(acount==1&pwd==1){
            while(true){

                //Call the method, enter the library management system
                index();

            }
        }
        else {
            System.out.println("The account or password is entered incorrectly!");//The account or password is entered incorrectly
        }

    }





}
