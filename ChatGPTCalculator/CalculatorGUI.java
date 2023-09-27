package ChatGPTCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorGUI extends JFrame implements ActionListener {
  private JTextField screen;
  private JButton[] buttons;

  private String[] buttonLabels = {
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", ".", "=", "+"
  };

  private double num1, num2;
  private String operator;

  public CalculatorGUI() {
    // Setting general information
    setTitle("Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);
    setLayout(new BorderLayout());

    // Setting the text of the GUI terminal.
    screen = new JTextField();
    screen.setFont(new Font("Martian Mono", Font.BOLD, 24));
    screen.setHorizontalAlignment(JTextField.RIGHT);
    screen.setEditable(false);
    add(screen, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
    buttons = new JButton[buttonLabels.length];

    // Adding buttons to
    for (int i = 0; i < buttonLabels.length; i++) {
      buttons[i] = new JButton(buttonLabels[i]);
      buttons[i].setFont(new Font("Martian Mono", Font.BOLD, 24));
      buttons[i].addActionListener(this);
      buttonPanel.add(buttons[i]);
    }

    add(buttonPanel, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();

    if (command.matches("[0-9.]")) {
      screen.setText(screen.getText() + command);
    } else if (command.equals("=")) {
      num2 = Double.parseDouble(screen.getText());

      switch (operator) {
        case "+":
          screen.setText(String.valueOf(num1 + num2));
          break;
        case "-":
          screen.setText(String.valueOf(num1 - num2));
          break;
        case "*":
          screen.setText(String.valueOf(num1 * num2));
          break;
        case "/":
          if (num2 != 0) {
            screen.setText(String.valueOf(num1 / num2));
          } else {
            screen.setText("Error");
          }
          break;
      }
    } else if (command.matches("[+\\-*/]")) {
      num1 = Double.parseDouble(screen.getText());
      operator = command;
      screen.setText("");
    }
  }
}
