import javax.swing.*;

public class checkboxes{
    public static void main() {
        JFrame frame; 
         // creating instance of JFrame with name "first way" 
        frame=new JFrame("first way"); 
        JLabel Jl = new JLabel("Attendence"); 
  
        JCheckBox chb1 = new JCheckBox("Aanand");
        JCheckBox chb2 = new JCheckBox("Rohini");
        JCheckBox chb3 = new JCheckBox("Satyajeet");
        JCheckBox chb4 = new JCheckBox("Saurabh");
         
          // create a panel 
          JPanel p = new JPanel(); 
  
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