import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + "! to Quiz Mania");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(0,181,226));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(new Color(0, 0, 0));
        rules.setText(
            "<html>"+
                "1. Each question must be answered within a specific timeframe" + "<br><br>" +
                "2. Players must not use external aids such as books, internet, or ask others for help while answering questions." + "<br><br>" +
                "3. Specific number of points for each correct answer." + "<br><br>" +
                "4. Deduct points for incorrect answers to discourage guessing." + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(0,181,226));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(0,181,226));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
           new Quiz(name); 
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
