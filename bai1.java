package lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai1 extends JFrame {
    private JTextField txtso1;
    private JTextField txtso2;
    private JButton btnTru;
    private JButton btnCong;
    private JButton btnChia;
    private JButton btnNhan;
    private JButton btnReset;
    private JPanel Panel;
    private JTextField txtkequa;


    public bai1() {
        setContentPane(Panel);
        setTitle("Calculator");
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    btnCong();
                }
            }
        });
        btnTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    btnTru();
                }
            }
        });

        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    btnChia();
                }
            }
        });
        btnNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    btnNhan();
                }
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checknull()) {
                    btnreset();
                    btnreset();
                }
            }
        });
    }
    public  void btnreset(){
        txtso1.setText("");
        txtso2.setText("");
        txtkequa.setText("");
    }
    public void btnTru() {
        float so1, so2;
        double ketqua;
        so1 = Float.parseFloat(txtso1.getText());
        so2 = Float.parseFloat(txtso2.getText());
        ketqua = so1 - so2;
        txtkequa.setText(ketqua + "");
    }

    public void btnChia() {
        float so1, so2;
        double ketqua;
        so1 = Float.parseFloat(txtso1.getText());
        so2 = Float.parseFloat(txtso2.getText());
        ketqua = so1 / so2;
        txtkequa.setText(ketqua + "");
    }

    public void btnNhan() {
        float so1, so2;
        double ketqua;
        so1 = Float.parseFloat(txtso1.getText());
        so2 = Float.parseFloat(txtso2.getText());
        ketqua = so1 * so2;
        txtkequa.setText(ketqua + "");
    }

    public void btnCong() {
        float so1, so2;
        double ketqua;
        so1 = Float.parseFloat(txtso1.getText());
        so2 = Float.parseFloat(txtso2.getText());
        ketqua = so1 + so2;
        txtkequa.setText(ketqua + "");

    }

    public boolean checknull() {
        if (txtso1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap FirtNumber");
            txtso1.requestFocus();
            return false;
        } else if (txtso2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap SecondNumber");
            txtso2.requestFocus();
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        bai1 bai1 = new bai1();
    }
}
