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
        String[] options = { "+", "-", "*", "/", "Pythagoras" };
        comboBox1.setModel(new DefaultComboBoxModel(options));
        caalculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField1.getText().isEmpty() || textField2.getText().isEmpty()){
                    textArea1.setText("Your TextField must be filled in");
                }else if (textField1.getText().isEmpty() && textField2.getText().isEmpty()){
                    textArea1.setText("Your TextField must be filled in");
                }else {
                    int total = 0;
                    try {
                        int firstField = Integer.parseInt(textField1.getText());
                        int secondField = Integer.parseInt(textField2.getText());
                        int selectedItem = comboBox1.getSelectedIndex();
                        switch (selectedItem){
                            case 0:
                                total = firstField + secondField;
                                break;
                            case 1:
                                total = firstField - secondField;
                                break;
                            case 2:
                                total = firstField * secondField;
                                break;
                            case 3:
                                total = firstField / secondField;
                                break;
                            case 4:
                                double myMath = Math.sqrt(Math.pow(firstField, 2) + Math.pow(secondField, 2));
                                total = (int) myMath;
                                break;
                        }
                        textArea1.setText(String.valueOf(total));
                    }catch (Exception ex){
                        System.out.println(ex.toString());
                    }
                }
            }
        });
    }
}
