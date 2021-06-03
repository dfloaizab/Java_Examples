package InterfazUsuario;

import Model.Parqueadero;
import Model.Vehiculo;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal  extends JFrame {

    PanelIzquierdo miPanelIzquierdo;
    PanelDerecho miPanelDerecho;
    Parqueadero miParqueadero;

    public VentanaPrincipal() throws HeadlessException
    {
        miParqueadero = new Parqueadero("Calle 15 # 15-15", 200, true);


        this.setLayout(new GridLayout(1, 2));

        //Agregar panel izquierdo, para ingresar vehículo

        miPanelIzquierdo = new PanelIzquierdo(this);
        this.add(miPanelIzquierdo);

        //Agregar panel derecho, para registrar salida vehiculo:
        miPanelDerecho = new PanelDerecho();
        this.add(miPanelDerecho);


    }

    public static void main(String args[])
    {

        //VentanaPrincipal miVentana = new VentanaPrincipal();
        //miVentana.setSize(800, 600);
        //miVentana.setVisible(true);

        //Constantes Direcciones de los recorridos:
        final int DERECHA=1, BAJA=2,IZQUIERDA=3,SUBE=4;

        //límite
        int lim_izq = 0, lim_der=6, lim_tope=0, lim_fondo=6;

        int dir_actual = DERECHA;

        //contador del recorrido:
        int cont=1;

        //Matriz de ejemplo
        int[][] matriz = {   {1,2,3,4,5,6,7},
                             {24,25,26,27,28,29,8},
                             {23,40,41,42,43,30,9},
                             {22,39,48,49,44,31,10},
                             {21,38,47,46,45,32,11},
                             {20,37,36,35,34,33,12},
                             {19,18,17,16,15,14,13}};

        while(lim_izq <= lim_der && lim_tope <= lim_fondo){
            if(dir_actual == DERECHA){
                for(int i=lim_izq;i<=lim_der;i++){
                    matriz[lim_tope][i]=cont++;
                }
                // Atraviesa el límite de izquierda a derecha, listo para atravesar hacia abajo, lo anterior ha atravesado una línea, entonces arriba ++
                lim_tope++;
                dir_actual = BAJA;
            }else if(dir_actual == BAJA){
                for(int i=lim_tope;i<=lim_fondo;i++){
                    matriz[i][lim_der]=cont++;
                }
                // Atravesar desde el límite superior al inferior, listo para atravesar hacia la izquierda, una columna ha sido atravesada a la derecha, entonces a la derecha--
                lim_der--;
                dir_actual= IZQUIERDA;
            }else if(dir_actual ==  IZQUIERDA){
                for(int i=lim_der;i>=lim_izq;i--){
                    matriz[lim_fondo][i]=cont++;
                }
                // Atraviesa el límite de derecha a izquierda, listo para atravesar hacia arriba, la siguiente línea ha sido atravesada, así que abajo ...
                lim_fondo--;
                dir_actual = SUBE;
            }else if(dir_actual == SUBE){
                for(int i=lim_fondo;i>=lim_tope;i--){
                    matriz[i][lim_izq]=cont++;
                }
                // Atravesar desde el límite inferior hacia el superior, listo para atravesar hacia la derecha, la izquierda ha atravesado una columna, entonces la izquierda ++
                lim_izq++;
                dir_actual = DERECHA;
            }
        }



    }


    public void crearVehiculo(String placa, String doc, String hora_ent) {

        miParqueadero.entradaVehiculo(new Vehiculo(placa, doc, Integer.parseInt(hora_ent)));
    }
}
