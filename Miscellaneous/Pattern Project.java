public class Module3 {
    public static void pattern1(String args[]) {
    //Use a scanner to prompt user to choose number of plus signs to display
    Scanner input = new Scanner (System.in);
    Scanner.out.println(&quot;Enter max number of plus signs to display&quot;);
    int max = input.nextInt();        //User&#39;s input
        for(int i=0; i &lt;= max; i++) {
        for(int j=i; j &lt;= max; j++)
            System.out.print(&quot;+&quot;);
        System.out.print();
        }
    }
public static void pattern2 (String args[]){
    //Use a scanner to prompt user to choose # of plus signs
    Scanner input = new Scanner (System.in);
    System.out.println(&quot;Enter max number of plus signs to display&quot;);
    int max = input.nextInt();
        for(int i=0; i &gt;= max; i--){
        for(int j=i; j &gt;= max; j--)
            System.out.print(&quot;+&quot;);
        System.out.println();
        }
}
  Scanner input = new Scanner (System.in);
  System.out.println(&quot;Choose pattern 1 or pattern 2&quot;);
  int choice = input.nextInt();
  if(choice == 1) {
      System.out.print(pattern1);
      else
         System.out.print(pattern2);
  }
}
  }
