/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

import Modelo.CalcMatrices;

/**
 *
 * @author Diego
 */
public class VentanaPrincipal extends JFrame { 
    
    PanelBotones miPanelBotones;    
    PanelMatrizA miPanelMatrizA;
    PanelMatrizB miPanelMatrizB;
    PanelMatrizR miPanelMatrizR;
    
    CalcMatrices miCalcMatrices;
    
    int ancho, alto;
    
     ImageIcon miImagen;
    
    public VentanaPrincipal()
    {
        ancho = 600;
        alto = 300;
        
        miCalcMatrices = new CalcMatrices();
        
        setSize(ancho, alto);
        setAlwaysOnTop(true);
        setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora de Matrices");  
        
        setLayout(new BorderLayout());
        
        miPanelMatrizA = new PanelMatrizA();
        miPanelMatrizB = new PanelMatrizB();
        miPanelMatrizR = new PanelMatrizR();  
        
        miPanelBotones = new PanelBotones(this);
        
        miImagen = new ImageIcon("");       
        ///add( miImagen, BorderLayout.NORTH  );
        
        add(miPanelMatrizA, BorderLayout.WEST );  
        add(miPanelMatrizB, BorderLayout.CENTER);
        add(miPanelMatrizR, BorderLayout.EAST);
        add(miPanelBotones, BorderLayout.SOUTH);
        
    }
    
    public static void main(String args[])
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        miVentana.setVisible(true);
    }

    /* método sumar en la ventana principal */
    void accionSumar() {
        //JOptionPane.showMessageDialog(this, "Dio click en sumar");
        int[][] a, b, r;
        
        a = new int[3][3];
        b = new int[3][3];
        r = new int[3][3];
        
        /* Capturar valores de las cajas de texto del panelA y del panelB */      
        a = miPanelMatrizA.obtenerMatriz(); //OK
        b = miPanelMatrizB.obtenerMatriz(); //OK
        
        /*  enviar a la clase del modelo que se encarga de sumarlas  */
        /* llamar a la clase calcMatrices */
        miCalcMatrices.setMatrizA(a); //OK
        miCalcMatrices.setMatrizB(b); //OK
        r = miCalcMatrices.sumarMatrices(); //OK
        
        /* mostrar el resultado */
        miPanelMatrizR.mostrarResultado(r);
    }

    void accionRestar() {
        //JOptionPane.showMessageDialog(this, "Dio click en restar");
        
    }

    void accionMulti() {
        //JOptionPane.showMessageDialog(this, "Dio click en multiplicar");
         int[][] a, b, r;
        
        a = new int[3][3];
        b = new int[3][3];
        r = new int[3][3];
        
        /* Capturar valores de las cajas de texto del panelA y del panelB */      
        a = miPanelMatrizA.obtenerMatriz(); //OK
        b = miPanelMatrizB.obtenerMatriz(); //OK        
        
        /*  enviar a la clase del modelo que se encarga de sumarlas  */
        /* llamar a la clase calcMatrices */
        
        miCalcMatrices.setMatrizA(a); //OK
        miCalcMatrices.setMatrizB(b); //OK
        r = miCalcMatrices.multMatrices();
        
        miPanelMatrizR.mostrarResultado(r);
    }
    
    
}
