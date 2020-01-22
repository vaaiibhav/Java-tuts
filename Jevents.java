
import java.awt.event.*;
import javax.swing.*;

public class Jevents{

    public static void main(String args[]){
        JFrame  frame = new JFrame(" This is my JFrame");
        JPanel jpnl = new JPanel();
        JButton jbtn = new JButton("Click ME");
        JLabel jl = new JLabel("Hey, i am Label");

        jpnl.add(jl);
        jpnl.add(jbtn);


        jbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
                jl.setText("Hooray, Button CLicked");
            }
        });
        frame.add(jpnl);
        frame.setSize(600,600);
        frame.setVisible(true);

    }
}
