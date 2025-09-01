import javax.swing.*;
import java.awt.*;

public class level3 extends JFrame{
    JLabel label;
    public level3(){
        setTitle("Level 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        setSize(800,380);
        setResizable(false);
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setText("yet to set level3");
        label.setFont(new Font("Arial", Font.BOLD,18));
        label.setHorizontalAlignment(JLabel.CENTER);
        
        
        add(label);
        setVisible(true);
    }
}
