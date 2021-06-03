package Model;

import java.util.ArrayList;

public class Parqueadero {

    /* Atributos */
    String direccion;
    int limiteVehiculos;
    boolean abierto;

    ArrayList<Vehiculo> vehiculos;

    public Parqueadero()
    {
        vehiculos = new ArrayList<Vehiculo>();
    }

    public Parqueadero(String direccion, int limiteVehiculos, boolean abierto) {
        this.direccion = direccion;
        this.limiteVehiculos = limiteVehiculos;
        this.abierto = abierto;
        vehiculos = new ArrayList<Vehiculo>();
    }

    public void entradaVehiculo(Vehiculo pNuevoVehiculo)
    {
        if(vehiculos.size() < limiteVehiculos   )
             vehiculos.add(pNuevoVehiculo);
        else
            System.out.print("No se pueden agregar más vehículos");
    }


    public void salidaVehiculo()
    {

    }


    public String getDireccion()
    {
        return direccion;
    }



    public void setDireccion(String pNuevoValor)
    {
        this.direccion = pNuevoValor;
    }

    public void cargarInformacionArchivo(String rutaArchivo)
    {
        try
        {

        }
        catch(Exception ex)
        {

        }

    }




}


















