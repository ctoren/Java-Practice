import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.text.*;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.*;


public class TextFieldData extends JPanel implements PropertyChangeListener{

    //text field titles
    private String song = "One Love";
    private String itemCode = "A12B";
    private String artist = "Bob Marley";
    private String album = "Exodus";
    private int price = 10;

    //the field labels
    private JLabel songLabel;
    private JLabel itemCodeLabel;
    private JLabel artistLabel;
    private JLabel albumLabel;
    private JLabel priceLabel;

    //title the labels
    private static String songString = "Song: ";
    private static String itemCodeString = "Item Code: ";
    private static String artistString = "Artist: ";
    private static String albumString = "Album: ";
    private static String priceString = "Price: ";

    //creating the field for user to enter
    private JFormattedTextField songField;
    private JFormattedTextField itemCodeField;
    private JFormattedTextField artistField;
    private JFormattedTextField albumField;
    private JFormattedTextField priceField;

    //creating labels
    songLabel = new JLabel(songString);
    itemCodeLabel = new JLabel(itemCodeString);
    artistLabel = new JLabel(artistString);
    albumLabel = new JLabel(albumString);
    priceLabel = new JLabel(priceString);

    //creating the actual song text field
    songField = new JFormattedTextField();
    songField.setValue(new String(song));
    songField.setColumns(10);
    songField.addPropertyChangeListener("value", this);

    //creating the item code text field
    itemCodeField = new JFormattedTextField();
    itemCodeField.setValue(new String(itemCode));
    itemCodeField.setColumns(10);
    itemCodeField.addPropertyChangeListener("value", this);

    //creating the artist text field
    artistField = new JFormattedTextField();
    artistField.setValue(new String(artist));
    artistField.setColumns(10);
    artistField.addPropertyChangeListener("value", this);

    //creating the album text field
    albumField = new JFormattedTextField();
    albumField.setValue(new String(album));
    albumField.setColumns(10);
    albumField.addPropertyChangeListener("value", this);

    //creating the price text field
    priceField = new JFormattedTextField();
    priceField.setValue(new String(price));
    priceField.setColumns(10);
    priceField.addPropertyChangeListener("value", this);

    //setting the labels with corresponding field
    songLabel.setLabelFor(songField);
    itemCodeLabel.setLabelFor(itemCodeField);
    artistLabel.setLabelFor(artistField);
    albumLabel.setLabelFor(albumField);
    priceLabel.setLabelFor(priceField);

    //text fields should go in a panel
    JPanel fieldPanel = new Jpanel(new GridLayout(0,1));
    fieldPanel.add(songField);
    fieldPanel.add(itemCodeField);
    fieldPanel.add(artistField);
    fieldPanel.add(albumField);
    fieldPanel.add(priceField);

    //using borders and placing text fields
    setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    add(labelPanel, BorderLayout.CENTER);
    add(fieldPanel, BorderLayout.LINE_END);

 //creating GUI and make it visible
    private static void makeVisibleGUI(){
        JFrame frame = new JFrame("Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //use the data to display in window
        frame.add(new TextFieldData());

        //make the window visible
        frame.pack();
        frame.setVisible(true);
    }



}
