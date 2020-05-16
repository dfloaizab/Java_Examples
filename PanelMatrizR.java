/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class PanelMatrizR extends JPanel{
    
     JLabel lblMatriz;
    JPanel panelCasillas;
    
    public PanelMatrizR()
    {
       lblMatriz = new JLabel("Matriz R");
        setPreferredSize(new Dimension(200, 300));
        //setSize(200, 300);
        setLayout(new BorderLayout());
        
        /* panel para las casillas de */
        panelCasillas = new JPanel();
        panelCasillas.setSize(300,300);
        panelCasillas.setLayout(new GridLayout(3,3));
        /* ajustar margen de las cajas de texto: */
        for(int i = 0; i < 9; i++)
            panelCasillas.add( new JTextField(1));

        /**/
        add(new JLabel("\n\n"),BorderLayout.NORTH);
        add(panelCasillas, BorderLayout.CENTER);
        add(lblMatriz, BorderLayout.SOUTH);  
    }

    void mostrarResultado(int[][] r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int c = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                 ((JTextField) panelCasillas.getComponents()[c]).setText( String.valueOf(r[i][j]));
                 c++;
            }
        }
        
    }
    
    void limpiarCasillas()
    {
       for(int j = 0; j < 9; j++)
            {
                 ((JTextField) panelCasillas.getComponents()[9]).setText("");                 
            } 
    }
    
}
