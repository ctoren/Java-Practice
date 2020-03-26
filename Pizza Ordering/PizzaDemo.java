import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaDemo extends JPanel {
    private JRadioButton smallPizzaButton, mediumPizzaButton, largePizzaButton, totalButton;               //defining buttons

    private JCheckBox plainCheckBox, pepperoniCheckBox, veggieCheckBox, chickenCheckBox;                     //topping choices

    public PizzaDemo() {


        smallPizzaButton = new JRadioButton("Small-$5.50");
        mediumPizzaButton = new JRadioButton("Medium-$8.50");
        largePizzaButton = new JRadioButton("Large-$12.50");



        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(smallPizzaButton);
        sizeGroup.add(mediumPizzaButton);
        sizeGroup.add(largePizzaButton);

        Border buttonBorder = BorderFactory.createEtchedBorder();
        buttonBorder = BorderFactory.createTitledBorder( buttonBorder, "Pizza Size");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout( new FlowLayout(FlowLayout.LEFT));                      //creating buttons
        buttonPanel.add(smallPizzaButton);
        buttonPanel.add(mediumPizzaButton);
        buttonPanel.add(largePizzaButton);
        buttonPanel.setBorder(buttonBorder);

        smallPizzaButton.addActionListener(this);                                     //enabling action listener for size options
        buttonPanel.add(smallPizzaButton);
        mediumPizzaButton.addActionListener(this); 
        buttonPanel.add(mediumPizzaButton);
        largePizzaButton.addActionListener(this);
        buttonPanel.add(largePizzaButton);

        JPanel checkBoxPanel = new JPanel();                                         //creating check boxes for topping choices
        checkBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        plainCheckBox = new JCheckBox("Plain");
        pepperoniCheckBox = new JCheckBox("Pepperoni");
        veggieCheckBox = new JCheckBox("Veggie");
        chickenCheckBox = new JCheckBox("Chicken");

        plainCheckBox.addActionListener(this);                                      //enabling action listener for topping options
        checkBoxPanel.add(plainCheckBox);
        pepperoniCheckBox.addActionListener(this);
        checkBoxPanel.add(pepperoniCheckBox);
        veggieCheckBox.addActionListener(this);
        checkBoxPanel.add(veggieCheckBox);
        chickenCheckBox.addActionListener(this);
        checkBoxPanel.add(chickenCheckBox);

        Border toppingBorder = BorderFactory.createEtchedBorder();                              //creating a border
        toppingBorder = BorderFactory.createTitledBorder(toppingBorder, "toppings");

        JPanel toppingPanel = new JPanel();
        toppingPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        toppingPanel.add(plainCheckBox);
        toppingPanel.add(pepperoniCheckBox);
        toppingPanel.add(veggieCheckBox);
        toppingPanel.add(chickenCheckBox);


        this.setLayout(new BorderLayout());
        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(toppingPanel, BorderLayout.CENTER);
    }
    public void action (ActionEvent e){
        Object source = e.getSource();

        if (source == smallPizzaButton & plainCheckBox){                        //using if statement to calculate total pizza price for user
            System.out.println("Your total is $5.50");
        } else if (source == smallPizzaButton & (chickenCheckBox || veggieCheckBox || pepperoniCheckBox)){
            System.out.println("Your total is $6.00");
        } else if (source == mediumPizzaButton & plainCheckBox){
            System.out.println("Your total is $8.50");
        } else if (source == mediumPizzaButton & (chickenCheckBox || veggieCheckBox || pepperoniCheckBox)){
            System.out.println("Your total is $10.00");
        } else if (source == largePizzaButton & plainCheckBox){
            System.out.println("Your total is $12.50");
        } else {
            System.out.println("Your total is $14.50");
        }

    }

}
