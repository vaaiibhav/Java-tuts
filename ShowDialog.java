import javax.swing.*;
public class ShowDialog{
    public static void main(String args[])
        {
          String str1 = JOptionPane.showInputDialog("Enter First Number");
          String str2 = JOptionPane.showInputDialog("Enter Second Number");
                                         // input dialog returns always a string
          double fn = Double.parseDouble(str1);
          double sn = Double.parseDouble(str2);
       
          JOptionPane.showMessageDialog( null, "The SUm  is " + fn*sn, "Product", JOptionPane.INFORMATION_MESSAGE);
        }

        
        // public static void main(String args[])
        // {
        //   String str1 = JOptionPane.showInputDialog("Enter First Name");
        //   String str2 = JOptionPane.showInputDialog("Enter Second Name");
  
       
        //   JOptionPane.showMessageDialog( null, "Full Name" + str1 + " "+str2,"Name Joiner" ,JOptionPane.INFORMATION_MESSAGE);
        // }

    
}