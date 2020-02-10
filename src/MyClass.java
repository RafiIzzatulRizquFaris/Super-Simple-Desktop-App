import javax.swing.*;

public class MyClass{

    public static void main(String[]args){
        JFrame jFrame = new JFrame("My App");
        jFrame.setContentPane(new MyFirstForm().jpanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
