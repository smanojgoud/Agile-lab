//Question 1
import java.util.*;
import java.util.Scanner;


public class agile1{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Techies, Welcome to WEB\n");
        System.out.println("Please enter your username and password to login\n");
            System.out.println("Username: ");
            int i,number,symbol=0, numberc=0, letter_lower=0,letter_upper=0;
            String username = scanner.next();
            System.out.println("\nPassword: ");
            String password = scanner.next();
            //zaheer
            System.out.println("Enter password having atleast  a..z  1..9   A-Z  $#@...\n");
            if(password.length()<6){
                System.out.println("Minimum length of 6 is required..\n");
            }
            else if(password.length()>12){
                System.out.println("Maximum length is 12 for password Try again\n");
            }
            else{
                //checking symbols chars
                for( i=0;i<password.length();i++){
                 char target = password.charAt(i);
                    if(Character.isDigit(target)){
                        numberc++;
                    }
                    if(Character.isUpperCase(target)){
                        letter_upper++;
                    }
                    else if(Character.isLowerCase(target)){
                        letter_lower++;
                    }
                    else if(!Character.isLetterOrDigit(target)){
                        symbol++;
                    }
                    else{}
                }   
                    if(numberc==0){
                        System.out.println("Password should contain atleast 1 number...\n");
                    }
                    else if(letter_lower==0){
                        System.out.println("Password should contain atleast 1 lowercase a..z...\n");
                    }
                    else if(letter_upper==0){
                        System.out.println("Password should contain atleast 1 uppercase A..Z...\n");
                    }
                    else if(symbol==0){
                        System.out.println("One special symbol should required..\n");
                    }
                    else{
                        System.out.println("Correct credentials! you are logged in..\n");
                    }
                
            }
            scanner.close();
    }
}
