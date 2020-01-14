import javax.swing.*;


class label{

    static JFrame jf;
    static JLabel jl;
    static JPanel jp;
    private static JLabel j3;
    private static JLabel j2;

    public static void main(String[] args) {
        jf = new JFrame("My Frame");
        jp = new JPanel();
        jl = new JLabel(); 
        j2 = new JLabel(); 
        j3 = new JLabel();
            j2.setBounds(40,50,160,40);
            j3.setBounds(40,100,160,40);
            jp.setBounds(0,0,500,500);
        
            jp.add(jl);
            jp.add(j2);
            jp.add(j3);



            jf.add(jp);
            jl.setText("Hi i am LAbel");
            j2.setText("Hi i am LAbel2");
            j3.setText("Hi i am LAbel3");

        jf.setSize(600,600);
        jf.setVisible(true);

}
}