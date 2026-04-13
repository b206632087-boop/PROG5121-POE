/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package student.registraionloginfeature;

/**
 *
 * @author b2066
 */
import java.util.Scanner;
public class Registraionloginfeature {

    public static void main(String[] args) {
      Scanner myInput = new Scanner(System.in);    
        
        //declarations 
        String Firstname;
        String Lastname;
        String username = null;
        String password = null;
        String cellphonenumber;
        boolean isValid =false; 
       
        
      //prompting the user
      System.out.println("Enter firstname");
      Firstname =myInput.nextLine();
      System.out.println("lastname ");
      Lastname = myInput.nextLine();
      
      
      
        //Registration
        while(!isValid) {
        System.out.println("enter username");
        System.out.println("username must contain an underscore and is no more than  five characters long");
        username = myInput.nextLine(); 
        
        if(username.contains("_") &&
           username.length() <= 5){
           isValid = true;
           System.out.println("username successfully captured");
    }else{
            System.out.println("username is not correctly formatted please ensure that your username contains underscore and is no more than five characters in length");
                    }
    }
       isValid = false;     
       
    while(!isValid) {
        System.out.println("enter a password");
        System.out.println(" please ensure that the password contains atleast eight acters ,a capital letter,a number and a special character");
        password = myInput.nextLine();
        
        if(password.length() >=8 &&
           password.matches(".*[0-9]*") &&
           password.matches(".*[A-Z].*") &&
           password.matches(".*[!@#$%^&*()].*")){
           isValid = true;
        System.out.println("password successfully captured");
    }else{
            System.out.println("password is not correctly formatted please ensure that the password contains atleast eight acters ,a capital letter,a number and a special character");
        }
      }
     String regex = "\\+27\\d{9}"; 
    isValid = false;
  
    while(!isValid ) {
    System.out.println("enter cellphone number");
    System.out.println("cellphone number should contain international code +27");
    cellphonenumber = myInput.nextLine();
    
        if(cellphonenumber.matches(regex) && cellphonenumber.contains("+27")) {
            isValid =true;
           System.out.println("cellphone number successfully captured");
        }else{
            System.out.println("cellphone number incorrectly formatted or does not contain international code ");
        
        
        }
    }
    
    //login feature
    String inputUsername ;
    String inputPassword ;
    
    isValid = false;
    
   while(!isValid) {
   System .out.println("****Login****");
    
   System.out.println("Enter your username");
   inputUsername = myInput.nextLine();
   System.out.println("Enter your password ");
   inputPassword =  myInput.nextLine();
   
   if(inputUsername.matches(username) && inputPassword.equals(password)){
       isValid = true;
       System.out.println("Welcome " + Firstname +"  "+Lastname+ "  " +"it is great to see you again.");
       
   }else{
       System.out.println("username or password incorrect please try again ");
         }
        }
     }

}
    

    




    

