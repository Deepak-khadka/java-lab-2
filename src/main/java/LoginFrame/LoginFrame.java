package LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.Objects;

public class LoginFrame extends JFrame {

    JTextField inputEmail;

    JPasswordField inputPassword;

    public LoginFrame() {
        super("Login Frame");

        setLayout(new FlowLayout());

        inputEmail = new JTextField();
        inputPassword = new JPasswordField();
        inputEmail.setColumns(10);
        inputPassword.setColumns(10);

        JLabel labelEmail = new JLabel();
        JLabel labelPassword = new JLabel();

        labelEmail.setText("Enter Email :");
        labelPassword.setText("Enter Password :");

        JButton submit = new JButton();
        submit.setText("Return");

        add(labelEmail);
        add(inputEmail);
        add(labelPassword);
        add(inputPassword);
        add(submit);

        EventHandler handler = new EventHandler();
        submit.addActionListener(handler);
    }

    public class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String message;

            String email = inputEmail.getText();

            String password = inputPassword.getText();

            if(Objects.equals(actionEvent.getActionCommand(), "Return")) {
               message = "Email is "+ email +" and password is "+password;
            } else {
                message = "Sorry something went wrong";
            }

            JOptionPane.showMessageDialog(null, message);
        }
    }
}
