import java.util.Scanner;

/**
* Ex1
*/
public class Ex1 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) 
{
        String fname=ChooseFname();
        String lname=ChooseLname();
        System.out.println("Vous vous appelez " + fname + " " + lname);        
    }
    static String ChooseFname(){
        System.out.println("Entrez votre prénom:");
        String choice=input.nextLine();
        return choice;
    }
    
    static String ChooseLname(){
        System.out.println("Entrez votre nom:");
        String choice=input.nextLine();
        return choice;
    }

}   