import javax.swing.*;

public class Pizza extends JFrame {
    public Pizza() {
        setTitle("Pizza Party");       //title is pizza party
        setSize(300, 220);              //setting the size of the Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //make sure the program will close properly
        JPanel panel = new PizzaDemo();
        this.add(panel);

    }

    public static void main(String [] args) {
        JFrame frame = new Pizza();
        frame.setVisible(true);           //setting the program to be visible 
    }
    }
