package lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai4 extends JFrame {
    private JTextField txtInput;
    private JTextField txtaddress;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox maleCheckBox;
    private JCheckBox femaleCheckBox;
    private JButton btnValidate;
    private JButton button2;
    private JPanel Panel;

    public bai4() {


        setContentPane(Panel);
        setTitle("Option");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        txtInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnValidate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull() && checkHobby() && checksex()) {
                    setTxtInput();

                }
            }
        });
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        checkBox1.addActionListener(listener);
        checkBox2.addActionListener(listener);
        checkBox3.addActionListener(listener);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    checkBox2.setEnabled(false);
                    checkBox3.setEnabled(false);
                } else if (!(checkBox1.isSelected())) {
                    checkBox2.setEnabled(true);
                    checkBox3.setEnabled(true);
                }
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox2.isSelected()) {
                    checkBox1.setEnabled(false);
                    checkBox3.setEnabled(false);
                } else if (!(checkBox2.isSelected())) {
                    checkBox1.setEnabled(true);
                    checkBox3.setEnabled(true);
                }
            }
        });
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox3.isSelected()) {
                    checkBox2.setEnabled(false);
                    checkBox1.setEnabled(false);

                } else if (!(checkBox3.isSelected())) {
                    checkBox2.setEnabled(true);
                    checkBox1.setEnabled(true);
                }
            }
        });
        maleCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (maleCheckBox.isSelected()) {
                    femaleCheckBox.setEnabled(false);

                } else {
                    femaleCheckBox.setEnabled(true);
                }
            }
        });
        femaleCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (femaleCheckBox.isSelected()) {
                    maleCheckBox.setEnabled(false);
                } else {
                    maleCheckBox.setEnabled(true);
                }
            }
        });
    }

    public boolean checksex() {
        if (!(maleCheckBox.isSelected() || femaleCheckBox.isSelected())) {
            JOptionPane.showMessageDialog(this, "Vui long Chon Box Sex");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkHobby() {
        if (!(checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected())) {
            JOptionPane.showMessageDialog(this, "Vui long chon box Hobby");
            return false;
        } else {
            return true;
        }
    }

    public boolean checknull() {
        if (txtInput.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap name");
            txtInput.requestFocus();
            return false;
        } else if (txtaddress.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap Address");
            txtaddress.requestFocus();
            return false;
        } else {
            return true;
        }


    }

    public void reset() {
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        txtInput.setText("");
        txtaddress.setText("");
        maleCheckBox.setSelected(false);
        femaleCheckBox.setSelected(false);
        checkBox1.setEnabled(true);
        checkBox2.setEnabled(true);
        checkBox3.setEnabled(true);
        maleCheckBox.setEnabled(true);
        femaleCheckBox.setEnabled(true);
    }

    public void Validate() {

    }

    public void setTxtInput() {
        String checkbox = null;
        if (checkBox1.isSelected()) {
            checkbox = checkBox1.getText();
        } else if (checkBox2.isSelected()) {
            checkbox = checkBox2.getText();
        } else if (checkBox3.isSelected()) {
            checkbox = checkBox3.getText();
        }
        String sex = null;
        if (maleCheckBox.isSelected()) {
            sex = maleCheckBox.getText();
        } else if (femaleCheckBox.isSelected()) {
            sex = femaleCheckBox.getText();
        } else {
            sex = "Khac";
        }
        String address = txtaddress.getText();
        String Name = txtInput.getText();
        String message = "Name :" + Name + "\n" + "address" + address + "\n" + "Hobby :" + checkbox + "\n" + "Sex: " + sex;
        JOptionPane.showMessageDialog(this, message);

    }

    public static void main(String[] args) {
        bai4 Frame = new bai4();

    }
}


