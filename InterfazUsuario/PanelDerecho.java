package InterfazUsuario;

import javax.swing.*;
import java.awt.*;

public class PanelDerecho extends JPanel {

    JTextField txtPlaca;
    JLabel lblPlaca;
    JButton btnSalida;

    public PanelDerecho() {

        txtPlaca = new JTextField("");
        lblPlaca = new JLabel("Placa:");
        btnSalida = new JButton("Salida");

        this.setLayout(new GridLayout(2, 2));

        add(lblPlaca);
        add(txtPlaca);
        add(btnSalida);


    }
}
