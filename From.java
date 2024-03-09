package lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class   From extends JFrame {

    private JPanel Panel;
    private JButton btnMessageDialog;
    private JButton btnInputDialog;
    private JButton btnConfirmDialog;
    private JButton btnOptionDialog;
    public boolean checknull(){
        String yourName = JOptionPane.showInputDialog("Your Name is");
        if (yourName!= null){
            JOptionPane.showMessageDialog(this,"Your name"+yourName);
            return true;
        }
        else {
            JOptionPane.showMessageDialog(this,"Your name null");
            return false;
        }
    }
    public void MessageDialog(){
        JOptionPane.showMessageDialog(this,"input name");
    }
    public void ConfirmDialog(){
        int ret = JOptionPane.showConfirmDialog(this ,"Are you sure",
                                                    "ConFirm",JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE);
        if(ret== JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(this,"Appy");
        }
        else {

        }
    }
    public void OptionDialog(){
        int messageType = JOptionPane.QUESTION_MESSAGE;
        String[] options ={"Java" , "C++" ,"VB" , "PHP","Perl"};
        int  code = JOptionPane.showOptionDialog(this ,
                "What language do you ","Optiops Dialog Box",0,messageType,null,options,"Java");

        JOptionPane.showMessageDialog(this, "Answer " + code);
    }
    public From() {
        setContentPane(Panel);
        setTitle("Option");
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        btnMessageDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            MessageDialog();
            }
        });
        btnInputDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(checknull()){}

            }
        });
        btnConfirmDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmDialog();
            }
        });
        btnOptionDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OptionDialog();
            }
        });
    }

    public static void main(String[] args) {
        From Frame = new From();
    }


}
