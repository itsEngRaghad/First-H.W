import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.

        int x=10;
        int y= 3;
        int z = 2;
        int sum = (x+y);
        int sub = y-z;
        int mult = (z*y);
        int reminder = (x%y);
        int divide =(x/z);
        System.out.println("Result of Sum is: "+ sum);
        System.out.println("Result of Sub is: "+ sub);
        System.out.println("Result of Multiply is: "+ mult);
        System.out.println("Result of Division is: "+ divide);
        System.out.println("Result of Reminder is: "+ reminder);
        System.out.println("------------------------------------------------");
    // End of First Q

        //2.Write a Java program to convert a given string into lowercase.
        String name = "RAGHAD";
        System.out.println(name.toLowerCase());
        System.out.println("------------------------------------------------");
// End of Sec Q

        //3.Write a Java program that takes a string
        // and a number from the user,then prints the character in the given index.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any string: ");
        String str =scanner.nextLine();
        System.out.println("Enter Any Number: ");
        int num = scanner.nextInt();
        System.out.println("the char in the given index is : "+ str.charAt(num));
        System.out.println("------------------------------------------------");

        //End of 3rd Q
        // 4.Write a Java program to accept a number and check
        // the number is even or not. Prints 1 if the number is even or 0 if the number is odd. (use if-statement)
        System.out.println("Enter Any Number: ");
        int evodd =scanner.nextInt();
        if((evodd % 2)== 0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
        System.out.println("----------------------------");
        //End of 4th Q

        //5.Write a program that checks the role of the user


        Scanner n =new Scanner(System.in);
        System.out.println("pleas Enter your Role (admin or subuser or user)");
        String Role =n.nextLine();


        if( Role.equals("admin")){
            System.out.println("Welcome Admin");}

        else if(Role.equals("subuser")){
            System.out.println("welcome subuser");
        }

        else{
            System.out.println("Welcome user ");
        }
        System.out.println("-----------------------");
        //end of 5th Q

        //6.Write a Java program to calculate the sum of two integers
        // and return true if the sum is equal to a third integer.

        int Firstint = 10;
        int Secint = 20;
        int result = (Firstint + Secint);
        int third=30;

        if(result== third){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }

        System.out.println("----------------------");
        //end 6th Q

        //7.Take three numbers from the user and print the greatest number.
        System.out.println("enter 3 numbers");
        int Firstnum = scanner.nextInt();
        int Secondnum = scanner.nextInt();
        int Thirdnum = scanner.nextInt();
        int compare1 = Math.max(Firstnum,Secondnum);
        int compare2= Math.max(compare1,Thirdnum);
        System.out.println("the greatest num is: "+ compare2);
        System.out.println("---------------------");
        //end of 7th Q
        //8.Write a Java program that keeps a number from the user
        // and generates an integer between 1 and 7 and displays the name of the weekday.

        System.out.println("enter a number between 1-7");
        int userinput = scanner.nextInt();

        switch (userinput){

            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuseday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("try again");
        }



    }}










