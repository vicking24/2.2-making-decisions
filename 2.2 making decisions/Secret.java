import java.util.Scanner;

class Secret {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print ("ENTER PASSWORD: ");
        String type= sc.nextLine();
        if (type.equals("monkey")){
        System.out.println ("How did you guess it? The secret is...The password is monkey!");
        
        } else {
        System.out.println ("Wrong password. You don't get to know.");
        
        }
        
     
        
        
    }
}