import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class prob implements ActionListener{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        frame.setSize(5000,2500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        JLabel label=new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);



        JTextField userText=new JTextField(20);
        userText.setBounds(63,34,180,20);
        panel.add(userText);


        JLabel PasswordLabel=new JLabel("Password");
        PasswordLabel.setBounds(10,50,80,25);
        panel.add(PasswordLabel);

        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(60,70,190,35);
        panel.add(passwordField);

        JButton button=new  JButton("Login");
        button.setBounds(10,110,80,25);
        button.addActionListener(new prob());
        panel.add(button);

        JLabel success=new JLabel("ok");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}
