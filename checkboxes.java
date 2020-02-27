import java.awt.event.*;

import javax.swing.*;

public class checkboxes{


    public static void main(final String args[]) {
        JFrame frame;
        // creating instance of JFrame with name "first way"
        frame = new JFrame("first way");

        final JLabel Jl = new JLabel("Attendence");

        final JCheckBox chb1 = new JCheckBox("Aanand");
        final JCheckBox chb2 = new JCheckBox("Rohini");
        final JCheckBox chb3 = new JCheckBox("Satyajeet");
        final JCheckBox chb4 = new JCheckBox("Saurabh");
        chb1.setBounds(15, 15, 150, 60);
        chb2.setBounds(15, 105, 150, 60);
        chb3.setBounds(15, 205, 150, 60);
        chb4.setBounds(15, 305, 150, 60);

        // create a panel
        final JPanel p = new JPanel();
          p.setBounds(0,0,600,600);

        //    chb1.addItemListener(new ItemListener(){

        //     @Override
        //     public void itemStateChanged(ItemEvent e) {
        //         Jl.setText("Aanand Present");
        //         if(e.getStateChange() !=1 ){
        //             Jl.setText("Anand Absent");
        //         }
        //         // TODO Auto-generated method stub

        //     }


        //    });
        chb1.addItemListener( new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                Jl.setText("Aanand Present");
                        if(e.getStateChange() !=1 ){
                            Jl.setText("Anand Absent");
                        }
            }

        });


          // add label to panel 
          p.add(Jl); 
          p.add(chb1); 
          p.add(chb2); 
          p.add(chb3); 
          p.add(chb4); 
// add panel to frame   
          frame.add(p);           
          // adds button in JFrame 
         // sets 500 width and 600 height 
          frame.setSize(500, 600);    
          // uses no layout managers 
          frame.setLayout(null); 
          // makes the frame visible 
          frame.setVisible(true);        
    }
}