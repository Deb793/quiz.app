import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{

    Score(String name, int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 120, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for attending the quiz.");
        heading.setBounds(40, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(375, 270, 120, 40);
        submit.setBackground(new Color(0,181,226));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
