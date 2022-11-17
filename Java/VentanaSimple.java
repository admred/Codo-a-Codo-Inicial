import javax.swing.JFrame;


public class VentanaSimple {

    public static void main (String[] args) {
        JFrame ventana=new JFrame();

        ventana.setTitle("Ventana Simple");
        ventana.setSize(300,300);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ventana.setVisible(true);

    }
}

