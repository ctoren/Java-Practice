import java.util.Scanner;

Public class Module4 {             
    public static void printMonthCalendar() {                 //method to print the year calendar
        Scanner input = new Scanner(System.in);
        
        System.out.println(&quot;Enter a year:&quot;);       //user is prompted to choose a year
        int year = input.nextInt();
        
        for (int month = 1; month &lt;=12; month++){
            
        }
    } 

    }
    public static void printMonthHeader(int month, int year){     //method for printing month header with weekdays
    System.out.println(&quot;-------------------------------&quot;);
    System.out.println(&quot;Sun Mon Tue Wed Thu Fri Sat&quot;);
    }
    public static void printMonthBody(int month, int year){         //method for the month body
    System.out.print(month);
    System.out.print(year);
    }
    public static String getMonthName(int month){                 //method to convert number into month name
        String monthName = &quot;&quot;;                                  
        Switch (month){                                          //use switch to get month name
            case 1: monthName = &quot;January&quot;; break;
            case 2: monthName = &quot;February&quot;; break;
            case 3: monthName = &quot;March&quot;; break;
            case 4: monthName = &quot;April&quot;; break;
            case 5: monthName = &quot;May&quot;; break;
            case 6: monthName = &quot;June&quot;; break;
            case 7: monthName = &quot;July&quot;; break;
            case 8: monthName = &quot;August&quot;; break;
            case 9: monthName = &quot;September&quot;; break;
            case 10: monthName = &quot;October&quot;; break;
            case 11: monthName = &quot;November&quot;; break;
            case 12: monthName = &quot;December&quot;; break; }
            return(monthName);
    }
    public static int getStartDay(int month, int year) {                        //method to get month&#39;s start day
    final int day = 1; //Must be set to day 1 for this to work. 
    //Adjust month number &amp; year to fit Zeller&#39;s numbering system
    if(month &lt; 3) {
        month = month+12;
        year = year-1;
    }
    int yearInCent = year % 100;         //k calculate year within century
    int century = year/100              //j calculate century term
    int firstDay = 0;                  //h day number of first day in month &#39;m&#39;
    
    firstDay = (day + (13 * (month+1)/5) + yearInCent + (yearinCent / 4) + (century/4) + (5*century)) % 7
    
    //Covert Zeller&#39;s value to ISO value (1 = Mon, ... , 7 = Sun)
    int dayNum = ((firstDay + 5) % 7) + 1; 
        }
