// Ejercicio en clase, Calculadora con Swing

// Segunda parte , eventos
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


class CalculadoraGrafica  {
    private JFrame window;
    private JLabel operation;
    private JLabel display;

    private double operand1=0;
    private double operand2=0;
    private String operator="";
    private double result=0;

    private boolean newOperand=true;
    private boolean decimalDot=false;

    public CalculadoraGrafica(){
        window=new JFrame();

        window.setTitle("Calculadora");

        window.setSize(290,485);
        window.setResizable(false);

        window.getContentPane().setBackground(Color.BLACK);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        // operaciones
        operation=new JLabel("");
        operation.setBounds(15,10,245,30);
        operation.setBorder(new LineBorder(Color.DARK_GRAY));
        operation.setForeground(Color.WHITE);
        operation.setHorizontalAlignment(SwingConstants.RIGHT);
        window.add(operation);

        // display
        display=new JLabel("0");
        display.setBounds(15,45,245,60);
        display.setFont(new Font("Arial",Font.PLAIN,30));
        display.setOpaque(true);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        window.add(display);

        // botones
        crearBoton("\u221a",15,120); // sqrt
        crearBoton("\u2190",80,120); // <-
        crearBoton("c",145,120);
        crearBoton("/",210,120);

        crearBoton("7",15,185);
        crearBoton("8",80,185);
        crearBoton("9",145,185);
        crearBoton("*",210,185);

        crearBoton("4",15,250);
        crearBoton("5",80,250);
        crearBoton("6",145,250);
        crearBoton("-",210,250);

        crearBoton("1",15,315);
        crearBoton("2",80,315);
        crearBoton("3",145,315);
        crearBoton("+",210,315);

        crearBoton("0",80,380);
        crearBoton(".",145,380);
        crearBoton("=",210,380);

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public void crearBoton(String text, int x , int y){
        // botones
        JButton button=new JButton(text);
        button.setBounds(x,y,50,50);
        button.setFocusPainted(false);
        button.setOpaque(true);
        if(text.equals("=") ){
            button.setBackground(Color.GREEN);
        } else {
            button.setBackground(Color.DARK_GRAY);
        }
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){


                switch(text){
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "8":
                    case "7":
                    case "9":
                        if( newOperand ) {
                            if( !text.equals("0") || !display.getText().equals("0") ) {
                                display.setText(text);
                                newOperand=false; // primer numero
                            }
                        } else {
                            display.setText(display.getText()+text);   // segundo numero
                        }
                        break;
                    case ".":
                        if( !decimalDot ) {
                            if( display.getText().equals("0")) {
                                display.setText(display.getText()+text);
                                newOperand=false;
                                decimalDot=true;
                            }
                        } else {
                            display.setText("0"+text);
                        }

                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        if(operator.equals("") ) {
                            operator=text;
                            operand1=Double.parseDouble(display.getText());
                            newOperand=true;
                            decimalDot=false;
                            operation.setText(getFormatedDecimal(operand1)+" "+operator);
                        } else {
                            operand1=getResult();
                            decimalDot=false;
                            operator=text;
                            //operation.setText(getFormatedDecimal(operand1)+" "+operator+" "+display.getText());
                        }

                        //operation.setText(getFormatedDecimal(operand1)+" "+operator);
                        break;

                    case "\u221a":  // sqrt

                        resetVars();
                        operand1=Double.parseDouble(display.getText());
                        operation.setText("\u221a"+getFormatedDecimal(operand1)+" = ");
                        operand1=Math.sqrt(operand1);
                        display.setText(getFormatedDecimal(operand1));
                        newOperand=true;
                        decimalDot=false;
                        //System.out.printf("crearBoton(): operand1 = %s , operand2 = %s , result = %s , newOperand = %s , operator = %s, decimalDot = %s\n",operand1,operand2,result,newOperand,operator,decimalDot);
                        break;

                    case "c":
                        // reset
                        display.setText("0");
                        operation.setText("");
                        resetVars();
                        break;
                    case "=":
                        if(!operator.equals("0")){
                            getResult();
                        }
                        break;
                    case "\u2190":  // <-
                        String val=display.getText();
                        if( val.length() > 1 ) {
                            display.setText(val.substring(0,val.length()-1));
                        } else {
                            display.setText("0");
                            newOperand=true;
                        }
                        if(val.contains(".")){
                            decimalDot=true;
                        } else {
                            decimalDot=false;
                        }
                        break;

                    }
        }});
        window.add(button);
    }

    private void resetVars() {
        decimalDot=false;
        newOperand=true;
        operand1=0;
        operand2=0;
        operator="";
    };

    private double getResult() {
        operand2=Double.parseDouble(display.getText());
        switch(operator){
            case "+":
                result=operand1+operand2;
                break;
            case "-":
                result=operand1-operand2;
                break;
            case "*":
                result=operand1*operand2;
                break;
            case "/":
                result=operand1/operand2;
                break;
            }
            //operation.setText(operation.getText()+" = ");
            operation.setText(getFormatedDecimal(operand1) + " " + operator + " " + getFormatedDecimal(operand2) + " =");
            display.setText(getFormatedDecimal(result));

            //System.out.printf("getResult(): operand1 = %s , operand2 = %s , result = %s , newOperand = %s , operator = %s, decimalDot = %s\n",operand1,operand2,result,newOperand,operator,decimalDot);

            resetVars();
            return result;
        }

    private String getFormatedDecimal(double decimal){
        String valueDisplay="";
        DecimalFormatSymbols separator=new DecimalFormatSymbols();
        separator.setDecimalSeparator('.');
        DecimalFormat format=new DecimalFormat("#.###########",separator);
        valueDisplay= String.valueOf(format.format(decimal));
        return valueDisplay;
    }

    public static void main(String[] args ) {
        new CalculadoraGrafica();

    }
}