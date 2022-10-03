import javax.swing.*;
import java.awt.*;

public class CalculatorForm extends JFrame{
    private JPanel panel1;
    private JTextPane Operator;
    private JTextField Input1;
    private JTextField Input2;
    private JButton add;
    private JButton div;
    private JButton mul;
    private JButton sub;
    private JButton CLR;
    private JButton Eql;
    private JTextPane Output;

    public CalculatorForm(){
        setContentPane(panel1);
        setTitle("Calculator");
        setSize(420, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);

        add.addActionListener(e -> Operator.setText("+"));
        sub.addActionListener(e -> Operator.setText("-"));
        mul.addActionListener(e -> Operator.setText("x"));
        div.addActionListener(e -> Operator.setText("/"));
        Eql.addActionListener(e -> {
            operationFactory operationFactory = new operationFactory();
            Operation operation = operationFactory.getOperation(Operator.getText());
            try {
                Output.setText(operation.operate(Double.parseDouble(Input1.getText()), Double.parseDouble(Input2.getText())));
            }catch (NumberFormatException ex){
                Output.setText("Please fill input fields");
            }catch (NullPointerException ex){
                Output.setText("Please Select Operation");
            }
        });
        CLR.addActionListener(e -> {
            Input1.setText("");
            Input2.setText("");
            Output.setText("");
        });
    }
}

