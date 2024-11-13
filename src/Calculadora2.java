import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 {
    private JTextField textField1;
    private JButton btn1;
    private JButton btnadicao;
    private JButton btn4;
    private JButton btn7;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton btn3;
    private JButton btn6;
    private JButton btn9;
    private JButton btn0;
    private JButton btnsubtrair;
    private JButton btnmultiplicacao;
    private JButton btnigual;
    private JButton btndivisao;
    private JButton btnapagar;
}
    public Calculadora2 () {
        String [] buttons = {"+", "-", "*", "/", "C"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String input = JTextField.getText();
                            if (text.equals("C")) {
                                JTextField.setText("")
                            }
                        }
                    }


            ) {});
        }

    }





