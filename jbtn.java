import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jbtn
{
  static JFrame frame;

  public static void main(String[] args)
  {
    // schedule this for the event dispatch thread (edt)
   
   
  
    frame = new JFrame("Our JButton listener example");
    JPanel jpnl = new JPanel();

    // create our jbutton
    JButton showDialogButton = new JButton("Click Me");
    JLabel jl = new JLabel("new Label");
    
    jpnl.add(jl);
    // add the listener to the jbutton to handle the "pressed" event
    showDialogButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        // display/center the jdialog when the button is pressed
                    // JDialog d = new JDialog(frame, "Hello", true);
                    // d.setLocationRelativeTo(frame);
                    // d.setVisible(true);
                    jl.setText("Button CLicked");
                    
      }
    });

    // put the button on the frame
    // frame.getContentPane().setLayout(new FlowLayout());
    frame.add(jpnl);
    jpnl.add(showDialogButton);

    // set up the jframe, then display it
    // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    // frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  
}
}