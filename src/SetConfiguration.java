import javax.swing.*;
import java.awt.*;

public class SetConfiguration extends JFrame {

    public SetConfiguration(){
        initComponents();
    }

    public void initComponents() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(380, 420);
        setTitle("Message Application ~ Server-Client System");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JLabel background = new JLabel(new ImageIcon("/home/akyol/Documents/MessageApplication/src/Images/backgroud1.jpg"));
        add(background);
        background.setLayout(new BorderLayout());
    }

}
