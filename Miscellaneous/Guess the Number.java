import java.util.Scanner;
public class Module3 {
public static void main () {
    Scanner input = new Scanner (System.in);     //Prompt user to choose #
    System.out.println(&quot;Choose a positive number&quot;);
    int N = input.nextInt();       //Value is user&#39;s input
    System.out.println(&quot;How many guesses do you want?&quot;);
    int G = input.nextInt();      //Value is user&#39;s # of guesses
    System.out.println(&quot;Pick a number between 1 and&quot; + N);
    int P = input.nextInt();     //Value is # user will guess
    
    int randomNumber = (int) (N * Math.random()) + 1;     //Program will choose a random #
    
    if(P == randomNumber) {
        System.out.println(&quot;Correct&quot;);              //If user guesses correctly
    }
    else if(P &gt; randomNumber) {
        System.out.println(&quot;Too High&quot;);
        System.out.println(&quot;Pick a number between 1 and&quot; + N);
    }
    else {
        System.out.println(&quot;Too Low&quot;);
        System.out.println(&quot;Pick a number between 1 and&quot; + N);
    }
    }
    }
