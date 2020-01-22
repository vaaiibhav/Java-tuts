import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JB {

    public static void main(String[] args) {
        JButton b = new JButton("push me");
        b.addActionListener((ActionListener) new ActionListener() {

         

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }
}