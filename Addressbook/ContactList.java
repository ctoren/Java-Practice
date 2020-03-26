import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class ContactList {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);                   //using scanner for user to input a file of contacts for address book
        System.out.print("Which file would you like to insert?");
        String userFile = input.next();                            //userFile is the variable of user's choice of file
        Scanner inFile = new Scanner(new FileInputStream(userFile));

        try{                                                        //using try and catch filenotfoundexception in case user inputs invalid file
            FileInputStream textFile = new FileInputStream(userFile);
            Scanner inFile = new Scanner(textFile);
            System.out.println("Your file is open");
        } catch(FileNotFoundException) {
            System.out.println("File not found");
        }


        LinkedList<AdressBook> n1 = new LinkedList<AdressBook>();            //using linkedlist to add and store contacts
        n1.add(new AdressBook("John Doe", "ABC Inc", "805-555-5500", "jdoe@gmail.com"));
        System.out.println("Enter new contact:");                    //adding new contact
        String contact = input.next();
        n1.add(contact);

        for(AdressBook element : n1)                                    //print out contact list
            System.out.println(element +  "\n");
    }
}
