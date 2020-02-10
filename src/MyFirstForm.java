import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFirstForm {
    private JTextField textField1, textArea1;
    private JButton caalculateButton;
    public JPanel jpanel;
    private JTextField textField2;
    private JComboBox comboBox1;

    public MyFirstForm() {
        String[] options = { "Option1", "Option2", "Option3", "Option4", "Option15" };
        comboBox1 = new JComboBox(options);
        caalculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int total = 0;
                int firstField = Integer.parseInt(textField1.getText());
                int secondField = Integer.parseInt(textField2.getText());
                int selectedItem = comboBox1.getSelectedIndex();
                if (selectedItem == 0){
                    total = firstField + secondField;
                }else if (selectedItem == 1){
                    total = firstField - secondField;
                }else if (selectedItem == 2){
                    total = firstField * secondField;
                }
                textArea1.setText(String.valueOf(total));
            }
        });
    }
}
