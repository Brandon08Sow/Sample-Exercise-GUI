package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTwoNumbers extends JFrame {
    private JTextField number1;
    private JTextField number2;
    private JTextField result;
    private JButton addBtn;
    private JButton resetBtn;

    public AddTwoNumbers() {
        // Create and set up the window
        setTitle("Add Two Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(null);

        // Initialize components
        number1 = new JTextField();
        number2 = new JTextField();
        result = new JTextField();
        addBtn = new JButton("Add");
        resetBtn = new JButton("Reset");
        JLabel plusLabel = new JLabel("+");
        JLabel equalsLabel = new JLabel("=");

        // Set bounds for components
        number1.setBounds(30, 30, 90, 30);
        plusLabel.setBounds(130, 30, 10, 30);
        number2.setBounds(150, 30, 90, 30);
        equalsLabel.setBounds(250, 30, 10, 30);
        result.setBounds(270, 30, 80, 30);
        addBtn.setBounds(50, 80, 100, 30);
        resetBtn.setBounds(180, 80, 100, 30);

        // Add components to frame
        add(number1);
        add(plusLabel);
        add(number2);
        add(equalsLabel);
        add(result);
        add(addBtn);
        add(resetBtn);

        // Add action listeners
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
    }
//past year question 2018/2019
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // get value from JTextField number1 and parse its value to an int
        int num1 = Integer.parseInt(number1.getText());

        // get value from JTextField number2 and parse its value to an int
        int num2 = Integer.parseInt(number2.getText());

        // add the two values to obtain the result
        int sum = num1 + num2;

        // set the result value in JTextField result
        result.setText(String.valueOf(sum));
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear the text fields
        number1.setText("");
        number2.setText("");
        result.setText("");
    }

    public static void main(String[] args) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTwoNumbers().setVisible(true);
            }
        });
    }
}
