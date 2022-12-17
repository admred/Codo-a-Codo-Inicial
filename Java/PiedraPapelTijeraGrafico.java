import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

// Piedra-Papel-Tijera con Swing


class PiedraPapelTijeraGrafico extends JFrame implements ActionListener {

    private final JLabel mensaje=new JLabel("Piedra, Papel o Tijera");
    private final JButton piedra=new JButton("Piedra");
    private final JButton papel=new JButton("Papel");
    private final JButton tijera=new JButton("Tijera");
    private final JLabel computadoraDice=new JLabel("...");
    private final List<String> dices=Arrays.asList("Piedra","Papel","Tijera");

    public PiedraPapelTijeraGrafico(){
        JPanel panel;
        setTitle("Piedra Papel Tijera");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(30,30,30,30);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        panel=new JPanel();
        mensaje.setFont(new Font("Sans",Font.BOLD,16));
        mensaje.setBorder(new EmptyBorder(10,0,10,0));
        panel.add(mensaje);
        add(panel);

        panel=new JPanel();
        panel.add(new JLabel("Computadora dice :")) ;
        panel.add(computadoraDice);
        add(panel);

        panel=new JPanel();
        computadoraDice.setFont(new Font("Monospace",Font.BOLD,16));
        computadoraDice.setBorder(new EmptyBorder(10,0,10,0));
        panel.add(computadoraDice);
        add(panel);

        panel=new JPanel();
        panel.add(new JLabel("Usted dice :")) ;
        add(panel);

        JPanel botonera=new JPanel();
        botonera.setBounds(30,30,30,30);
        botonera.add(piedra);
        botonera.add(papel);
        botonera.add(tijera);
        add(botonera);


        piedra.addActionListener(this);
        papel.addActionListener(this);
        tijera.addActionListener(this);
        //setSize(300,400);
        //setHorizontalAlignment(SwingConstants.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        int num=((int)(Math.random()*10))%3;
        String jugadorOpcion=event.getActionCommand();

        computadoraDice.setText(dices.get(num));
        System.out.println(getMensaje(dices.indexOf(jugadorOpcion),num));
        mensaje.setText(getMensaje(dices.indexOf(jugadorOpcion),num));
    }

    private String getMensaje(int opcionJugador,int opcionComputadora) {
        String msje;
        if(opcionJugador == opcionComputadora){
            return "Empate";
        }
        switch(opcionJugador){
        case 0:
            if (opcionComputadora == 1){
                msje="Perdiste. Papel mata piedra";
            } else {
                msje="Ganaste. Piedra mata tijera";
            }
            break;
        case 1:
            if (opcionComputadora == 2){
                msje="Perdiste. Tijera mata papel";
            } else {
                msje="Ganaste. Papel mata piedra";
            }
            break;
        case 2:
            if (opcionComputadora == 0){
                msje="Perdiste. Piedra mata tijera";
            } else {
                msje="Ganaste. Tijera mata papel";
            }
            break;
        default:
            msje="Opcion no valida";
        }
        return msje;
    }

    public static void main(String[] args ) {
        new PiedraPapelTijeraGrafico();

    }
}
