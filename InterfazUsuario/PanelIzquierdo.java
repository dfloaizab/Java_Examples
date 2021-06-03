package InterfazUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La Interfaz ActionListener permite que las clases respondan a eventos:
 */
public class PanelIzquierdo extends JPanel implements ActionListener {

    JLabel lblPlaca;
    JLabel lblDocumento;
    JLabel lblHoraEntrada;

    JTextField txtPlaca;

    JTextField txtDocumento;
    JTextField txtHoraEntrada;

    JButton btnRegistrar;

    //atributo para guardar la referencia a la ventana que creó este panel:
    VentanaPrincipal miVentana;

    public PanelIzquierdo(  VentanaPrincipal pVentanaMadre  ) {

        miVentana = pVentanaMadre;

        lblPlaca = new JLabel("Placa:");  //1

        txtPlaca = new JTextField(""); //2
        txtPlaca.setActionCommand("TextoPlaca");
        txtPlaca.addActionListener(this);

        lblDocumento = new JLabel("Documento"); //3
        txtDocumento = new JTextField(""); //4
        lblHoraEntrada = new JLabel("Hora Entrada:"); //5

        txtHoraEntrada = new JTextField(""); //6

        btnRegistrar = new JButton("Registrar"); //7
        btnRegistrar.setActionCommand("Registrar");
        btnRegistrar.addActionListener(this);

        this.setLayout(new GridLayout(4, 2));

        this.add(lblPlaca);
        this.add(txtPlaca);
        this.add(lblDocumento);
        this.add(txtDocumento);
        this.add(lblHoraEntrada);
        this.add(txtHoraEntrada);
        this.add(btnRegistrar);

    }

    @Override
    /**
     * EVENTO maneja los distintos eventos de los elementos de UI de este contenedor
     */
    public void actionPerformed(ActionEvent e) {

        String placa, doc, hora_ent;

        if(e.getActionCommand().equals("Registrar"))
        {
            //System.out.print("Se dio click en el boton registrar");
            //capturar información de las cajas de texto y crear un nuevo vehículo en el parqueadero
            placa = txtPlaca.getText();
            doc = txtDocumento.getText();
            hora_ent = txtHoraEntrada.getText();

            //1. llamar un método de la ventana principal:
            miVentana.crearVehiculo(placa, doc, hora_ent);
            JOptionPane.showMessageDialog(this,"El vehiculo ha sido agregado correctament");

            //2. la ventana principal va a llamar a la clase respectiva del modelo:
        }
        else
        {
            if(e.getActionCommand().equals("TextoPlaca")) //?
            {
                System.out.print("Se dio click en la caja de texto de la placa");
            }
        }

    }
}