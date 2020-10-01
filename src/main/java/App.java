import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends MorseCode {
    private JPanel panel;
    private JButton convert;
    private JTextField textField;
    private JTextArea textArea;
    private JButton clearButton;
    private String text;
    private String converted;
    private char[] value;

    public App() {
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text = textField.getText();
                text.toUpperCase();
                value = text.toCharArray();
                for (char a : value) {
                    String b = String.valueOf(a);
                    converted = converted + map.get(b);
                }
                textArea.setText(converted);

            }
        });
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                textField.setText("");
                converted = "";
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Morse Converter");
        frame.setContentPane(new App().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350, 450);
        frame.setVisible(true);

    }
}


