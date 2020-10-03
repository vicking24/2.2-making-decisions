import java.util.Scanner;

class Magic8Ball {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int ans=0;
        
        System.out.println ("");
        System.out.println ("What is your question?");
        System.out.println ("");
        sc.nextLine();
        
        ans= (int)(Math.random()*20+1);
        
        System.out.println ("");
        if (ans==1) System.out.println ("It is certain");
        else if (ans==2) System.out.println("It is decidely so");
        else if (ans==3) System.out.println("Without a doubt");
        else if (ans==4) System.out.println("Yes-definetly");
        else if (ans==5) System.out.println("You may rely on it");
        else if (ans==6) System.out.println("As i see it-yes");
        else if (ans==7) System.out.println("Most likely");
        else if (ans==8) System.out.println("There is a good chance");
        else if (ans==9) System.out.println("If you want to");
        else if (ans==10) System.out.println("Don't count on it");
        else if (ans==11) System.out.println("No");
        else if (ans==12) System.out.println("Very doubtful");
        else if (ans==13) System.out.println("Not a high chance");
        else if (ans==14) System.out.println("Proabably not");
        else if (ans==15) System.out.println("Ask again");
        else if (ans==16) System.out.println("Cannot predict");
        else if (ans==17) System.out.println("It's better if you don't know");
        else if (ans==18) System.out.println("Maybe");
        else if (ans==19) System.out.println("We will find out soon");
        else if (ans==20) System.out.println("Don't even think about it");
        
        
    }
}