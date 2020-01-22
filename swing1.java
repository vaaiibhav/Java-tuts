// Java program to create frames  
// using association 
  
import javax.swing.*; 
public class swing1 
{ 
    
    public static void main(String[] args) 
    { 
        JFrame frame; 
  
        // creating instance of JFrame with name "first way" 
        frame=new JFrame("first way"); 
        JLabel Jl = new JLabel("new text "); 
  
          
        // creates instance of JButton 
        JButton button = new JButton("let's see"); 
  
        button.setBounds(200, 150, 90, 50); 
          
        // setting close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // create a panel 
        JPanel p = new JPanel(); 
  
        // add label to panel 
        p.add(Jl); 
  
        // add panel to frame 
        frame.add(p); 
        
        // adds button in JFrame 
        frame.add(button);     
        
  
        // sets 500 width and 600 height 
        frame.setSize(500, 600); 
          
        // uses no layout managers 
        frame.setLayout(null); 
          
        // makes the frame visible 
        frame.setVisible(true); 
       
        
    } 
} 
