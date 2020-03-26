import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Job {
    int jobNum = 0;
    Random rnGenerator = new Random( rnSeed );
    int printTime = rnGenerator.nextInt(991) + 10;

    public static void main (String [] args) {
        LinkedList<String> jobs = new LinkedList<String>();
        System.out.print("Enter a print job name");
        String element = input.next();
        jobs.add(element);

        jobs.add("job1");
        jobs.add("job2");

        System.out.println();
        System.out.println("Jobs in the queue: ");
        for (int i = 0; i < jobs.length; i++) {
            System.out.println(jobs.get(i));
        }

    }
}
