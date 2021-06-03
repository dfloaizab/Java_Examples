package Model;

import Model.Parqueadero;

import java.util.ArrayList;

public class Vehiculo {

    private String placa;
    private String docPropietario;
    private int horaEntrada;
    private int horaSalida;


    public Vehiculo(String placa, String docPropietario,
                    int horaEntrada) {
        this.placa = placa;
        this.docPropietario = docPropietario;
        this.horaEntrada = horaEntrada;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDocPropietario() {
        return docPropietario;
    }

    public void setDocPropietario(String docPropietario) {
        this.docPropietario = docPropietario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public ArrayList<Parqueadero> getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(ArrayList<Parqueadero> parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    ArrayList<Parqueadero> parqueaderos;



}


