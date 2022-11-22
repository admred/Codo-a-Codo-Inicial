// Ejercicio en clase, Calculadora con Swing
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
    static JFrame window;
    static JLabel operation;
    //static JButton button;
    static JLabel display;

    private static void crearBoton(String text, int x , int y){
        // botones
        JButton button=new JButton(text);
        button.setBounds(x,y,50,50);
        button.setOpaque(true);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                JButton btn=(JButton)event.getSource();
                String text=btn.getText();
                operation.setText(text);
                System.out.println( text );
            }
        });


        window.add(button);
    }

    public static void main(String[] args) {
        window=new JFrame();

        window.setTitle("Calculadora");

        window.setSize(275,485);
        window.setResizable(false);

        window.getContentPane().setBackground(Color.BLACK);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        // operaciones
        operation=new JLabel("6 * 9 = ");
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
}