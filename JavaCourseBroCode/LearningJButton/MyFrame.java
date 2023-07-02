package JavaCourseBroCode.LearningJButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame() {

        //Creating an image
        ImageIcon icon = new ImageIcon("");
        ImageIcon icon2 = new ImageIcon("facen.png");

        //CRaeting label to see button change something
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        //Setting button shit
        button = new JButton();
        button.setBounds(300,200,100,50);
        button.addActionListener(this);
        button.setText("What when the how yep");
        button.setFocusable(false);
        button.setIcon(icon);
        


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button); // We need to add the button to the frame afterwards
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("You did it");
        }
    }
    
}
