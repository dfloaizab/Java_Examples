/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class PanelMatrizA extends JPanel{
    
    JLabel lblMatriz;
    JPanel panelCasillas;
    
    /*
    Revisar:
        - cambiar tamaño del texto
        - definir tamaño de las cajas de texto
    */
    public PanelMatrizA()
    {
        lblMatriz = new JLabel("Matriz A");
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

    int[][] obtenerMatriz() {
       
        int [][] matrizPanel = new int[3][3];
        
        matrizPanel[0][0] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[0]).getText());
        matrizPanel[0][1] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[1]).getText());
        matrizPanel[0][2] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[2]).getText());
        matrizPanel[1][0] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[3]).getText());
        matrizPanel[1][1] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[4]).getText());
        matrizPanel[1][2] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[5]).getText());
        matrizPanel[2][0] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[6]).getText());
        matrizPanel[2][1] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[7]).getText());
        matrizPanel[2][2] =  Integer.parseInt(((JTextField) panelCasillas.getComponents()[8]).getText());
        
        /* capturar información a partir de las cajas de texto */
       
        return matrizPanel;
    }
    
}
