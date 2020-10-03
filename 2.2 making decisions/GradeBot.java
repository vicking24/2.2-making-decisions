import java.util.Scanner;

class GradeBot {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        double total=0;
        double mark=0;
        double p=0;

        System.out.print ("What is your test out of: ");
        total= sc.nextDouble();
        System.out.print ("What is your mark: ");
        mark= sc.nextDouble();

        p=mark/total*100;
        
        if (p<=100&&p>=0){
        System.out.print ("Your percentage is: "+p+"% ");
        System.out.print ("You received a ");
    }
        if (p<=100&&p>=86){
            System.out.print ("A, perfect");
        } else if (p<=85&&p>=73){
            System.out.print ("B, great job");
        } else if (p<=72&&p>=67){
            System.out.print ("C+, it's good");
        } else  if (p<=66&&p>=60){
            System.out.print ("C, it's a pass");
        } else if (p<=59&&p>=50){
            System.out.print ("C-, you have to work harder");
        } else if (p<=49&&p>=0){
            System.out.print ("F, get your work together");
        } else if (total<=0){
            System.out.println ("Are you trying to hack this program?");
        } else if (mark<0||mark>total){
            System.out.println ("Are you trying to hack this program?");
        }

    }
}