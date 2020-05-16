/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author Diego
 */
public class CalcMatrices {

    /**
     * @param args the command line arguments
     */
    
    final int NUM_FILAS = 3;
    final int NUM_COLS = 3;
        
    private int[][] matrizA;

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizR() {
        return matrizR;
    }

    public void setMatrizR(int[][] matrizR) {
        this.matrizR = matrizR;
    }
    private int[][] matrizB;
    private int[][] matrizR;
    Random r;

    public CalcMatrices() {        
        matrizA = new int[NUM_FILAS][NUM_COLS];
        matrizB = new int[NUM_FILAS][NUM_COLS];
        matrizR = new int[NUM_FILAS][NUM_COLS];
        r = new Random();
    }
    
    public void llenar()
    {
        for(int i = 0; i < NUM_FILAS; i++)
        {
            for(int j = 0; j < NUM_COLS; j++)
            {
                matrizA[i][j] = r.nextInt(15);
                matrizB[i][j] = r.nextInt(15);
            }
        }
    }
    
    public int[][] sumarMatrices(  )
    {
        for(int i = 0; i < NUM_FILAS; i++)
        {
            for(int j = 0; j < NUM_COLS; j++)
            {
                matrizR[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizR;
    }
    
    public int[][] multMatrices()
    {
          for(int i = 0; i < NUM_FILAS; i++)    
          {
              for(int j = 0; j < NUM_COLS; j++)
              {
                  matrizR[i][j] = productoEscalar(i, j);
              }
          }
          return matrizR;        
    }
    
    public int productoEscalar(int fila, int col)
    {
        int resultado=0;        
        for(int i = 0; i < NUM_FILAS; i++){
            resultado += matrizA[fila][i] * matrizB[i][col];                    
        }        
        return resultado;
    }
    
     public void imprimirResultado()
    {
        System.out.print("\n\nResultado:\n");
        for(int i = 0; i < NUM_FILAS; i++)    
        {
              System.out.print("\n");
              for(int j = 0; j < NUM_COLS; j++)
              {
                  System.out.print(matrizR[i][j]+",");
              }              
          }              
    }
     
    public void imprimirA()
    {
        System.out.print("\nMatriz A:\n");
        for(int i = 0; i < NUM_FILAS; i++)    
          {
              System.out.print("\n");
              for(int j = 0; j < NUM_COLS; j++)
              {
                  System.out.print(matrizA[i][j]+",");
              }              
          }              
    }
    
    public void imprimirB()
    {
        System.out.print("\nMatriz B:\n");
        for(int i = 0; i < NUM_FILAS; i++)    
          {
              System.out.print("\n");
              for(int j = 0; j < NUM_COLS; j++)
              {
                  System.out.print(matrizB[i][j]+",");
              }              
          }              
    }
    
   
    
//    public static void main(String args[])
//    {
//        CalcMatrices miCalculadora = new CalcMatrices();        
//        miCalculadora.llenar();
//        miCalculadora.imprimirA();
//        miCalculadora.imprimirB();
//        miCalculadora.sumarMatrices();
//        miCalculadora.imprimirResultado();
//        miCalculadora.multMatrices();
//        miCalculadora.imprimirResultado();
//        
//    }
    
    
        
    
  
    
}
