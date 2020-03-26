import javax.swing.*;

public class SongDatabase extends JFrame {
    public SongDatabase(){
        setTitle("Song Database");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new SongDatabase();
        this.add(panel);
    }

    public static void main(String [] args){
        JFrame frame = new SongDatabase();
        frame.setVisible(true);
    }
}
