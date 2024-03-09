package lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab3 extends JFrame {
    private JTextField txtName;
    private JTextField txtPass;
    private JCheckBox checkbox;
    private JPanel Panel;
    private JButton btnReset;
    private JButton btnLogin;

    public lab3() {
        setContentPane(Panel);
        setTitle("Option");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        checkbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rememberMe();
            }
        });
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    checklogin();
                }

            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reset();
                rememberMe();
            }
        });
    }

    public void Reset() {
        txtPass.setText("");
        txtName.setText("");
        checkbox.setSelected(true);
    }

    public boolean checklogin() {
        if (txtName.getText().equals("fpt") && txtPass.getText().equals("polytechnic")) {
            JOptionPane.showMessageDialog(this, "Dang nhap thanh cong");
            return true;

        } else if (txtPass.getText().equals("polytechnic")) {
            JOptionPane.showMessageDialog(this, "sai user name");
            txtName.requestFocus();
            return false;
        } else if (txtName.getText().equals("fpt")) {
            JOptionPane.showMessageDialog(this, "Sai PassWord");
            txtPass.requestFocus();
            return false;

        } else {
            JOptionPane.showMessageDialog(this, "UserName and PassWord ERROI");
            return false;
        }
    }

    public void rememberMe() {

        if (checkbox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Tài khoản của bạn đã được\n" +
                    "ghi nhớ");
        }
    }

    public Boolean checknull() {
        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap user name");
            txtName.requestFocus();
            return false;

        } else if (txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ban chua nhap  PassWord");
            txtPass.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        lab3 Frame = new lab3();
    }
}
