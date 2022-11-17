import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ContadorDeClicks implements ActionListener {

    int contador;
    JFrame ventana;
    JPanel grupo;
    JButton boton;
    JLabel texto;
    public ContadorDeClicks(){
        contador=0;
        ventana=new JFrame();
        ventana.setTitle("Contador de Clicks");
        ventana.setSize(300,300);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        grupo=new JPanel();
        grupo.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        grupo.setLayout(new GridLayout(0,1));

        ventana.add(grupo);

        boton=new JButton("Ok");
        boton.addActionListener(this);
        grupo.add(boton);

        texto=new JLabel("Cantidad de CLicks : "+contador);
        grupo.add(texto);

        // esto al final o no muetra nada
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        contador++;
        texto.setText("Cantidad de CLicks : "+contador);
    }

    public static void main (String[] args) {
        new ContadorDeClicks();
    }
}

