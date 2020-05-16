/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class PanelBotones extends JPanel implements ActionListener{
    
    VentanaPrincipal miVentanaPadre;
    
    JButton btnSumar, btnRestar, btnMultiplicar;
    
    final String COMMAND_SUMAR="SUMAR";
    final String COMMAND_RESTAR="RESTAR";
    final String COMMAND_MULTIPLICAR="MULT";
    
    public PanelBotones( VentanaPrincipal p  )
    {
        miVentanaPadre = p;
        
        setLayout(new GridLayout(1, 3));
        setSize(600, 100); /* ¿? */
        
        btnSumar = new JButton("Sumar");
        btnSumar.setActionCommand(COMMAND_SUMAR);
        btnSumar.addActionListener(this);
        
        btnRestar = new JButton("Restar");
        btnRestar.setActionCommand(COMMAND_RESTAR);
        btnRestar.addActionListener(this);
                       
        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setActionCommand(COMMAND_MULTIPLICAR);
        btnMultiplicar.addActionListener(this);
        
        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
             String comando =  e.getActionCommand();
             switch(comando)
             {
                 case COMMAND_SUMAR: //JOptionPane.showMessageDialog(this, "Dio click en sumar");
                                     miVentanaPadre.accionSumar();
                                     break;
                 case COMMAND_RESTAR: //JOptionPane.showMessageDialog(this, "Dio click en restar");
                                     miVentanaPadre.accionRestar();
                                     break;
                 case COMMAND_MULTIPLICAR: //JOptionPane.showMessageDialog(this, "Dio click en multiplicar");
                                           miVentanaPadre.accionMulti();
                                           break;
             }
    }
    
}
