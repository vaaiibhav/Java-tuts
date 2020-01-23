import javax.swing.*;
import java.awt.event.*;
public class TextAdder{
    public static void main(String args[]){
        JFrame  frame = new JFrame(" This is my JFrame");
        JPanel jpnl = new JPanel();
        JButton jbtn = new JButton("Click ME");
        JLabel jl = new JLabel("Hey, i am Label");
        JTextField jtf = new JTextField("Enter first Name");

        jpnl.add(jl);
        jpnl.add(jtf);
        jpnl.add(jbtn);


        jbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // String message = jtf.getText();
                jl.setText(jtf.getText());
            }
        });
        frame.add(jpnl);
        frame.setSize(600,600);
        frame.setVisible(true);




    }
}