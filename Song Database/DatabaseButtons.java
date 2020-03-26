import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class DatabaseButtons extends JPanel implements ActionListener {
    protected JButton add, edit, delete, exit;

    public DatabaseButtons(){
        add = new JButton("Add");
        add.setVerticalTextPosition(AbstractButton.CENTER);
        add.setHorizontalTextPosition(AbstractButton.LEADING);
        add.setMnemonic(KeyEvent.VK_D);

        edit = new JButton("Edit");
        edit.setVerticalTextPosition(AbstractButton.BOTTOM;
        edit.setHorizontalTextPosition(AbstractButton.CENTER);
        edit.setMnemonic(KeyEvent.VK_M);

        delete = new JButton("Delete");
        delete.setVerticalTextPosition(AbstractButton.CENTER);
        delete.setHorizontalTextPosition(AbstractButton.TRAILING);
        delete.setMnemonic(KeyEvent.VK_E);
        delete.setActionCommand("clear");
        delete.setEnabled(true);

        exit = new JButton("Exist");
        exit.setVerticalTextPosition(AbstractButton.BOTTOM);
        exit.setHorizontalTextPosition(AbstractButton.TRAILING);
        exit.setMnemonic(KeyEvent.VK_P);

        //creating actions for add, edit, and exit buttons
        add.addActionListener(this);
        edit.addActionListener(this);
        exit.addActionListener(this);

        add.setToolTipText("Add");
        edit.setToolTipText("Edit");
        delete.setToolTipText("Delete");
        exit.setToolTipText("Exit");

        //add buttons to default FlowLayout
        add(add);
        add(edit);
        add(delete);
        add(exit);

    }
    public void actionPerformed(ActionEvent e){
        if("clear".equals(e.getActionCommand())){
            add.setEnabled(false);
            edit.setEnabled(false);
            delete.setText(" ");
            exit.setEnabled(true);
        } else {
            add.setEnabled(true);
            edit.setEnabled(true);
            delete.setEnabled(true);
            exit.setEnabled(true);
        }
    }
}
