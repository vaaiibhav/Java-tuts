import javax.swing.*;

public class checkboxes{


    public static void main(String args[]) {
        JFrame frame; 
         // creating instance of JFrame with name "first way" 
        frame=new JFrame("first way"); 
        
        JLabel Jl = new JLabel("Attendence"); 
  
        JCheckBox chb1 = new JCheckBox("Aanand");
        JCheckBox chb2 = new JCheckBox("Rohini");
        JCheckBox chb3 = new JCheckBox("Satyajeet");
        JCheckBox chb4 = new JCheckBox("Saurabh");
            chb1.setBounds(15,15,150,60);
            chb2.setBounds(15,105,150,60);
            chb3.setBounds(15,205,150,60);
            chb4.setBounds(15,305,150,60);

          // create a panel 
          JPanel p = new JPanel(); 
  
          // add label to panel 
          frame.add(Jl); 
          frame.add(chb1); 
          frame.add(chb2); 
          frame.add(chb3); 
          frame.add(chb4); 
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