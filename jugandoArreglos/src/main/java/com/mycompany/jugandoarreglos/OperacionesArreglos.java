/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jugandoarreglos;

/**
 *
 * @author eduar
 */
public class OperacionesArreglos {
    public float calculosSuma(float[] num){
        if(num==null)
            return 0f;
        float suma=0f;
        //recorrer el areglo
        for(int i=0; i < num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }
     public float calculosPromedio(float[] num){
        float suma = 0f;
        //recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        //calcular el promedio
        float promedio = suma / num.length;
        return promedio;
    }
     public int contarExcedentes(float[] num, float limite){
        int contador = 0;
        //recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            //verificar si el elemento excede el límite
            if(num[i] > limite){
                contador = contador + 1;
            }
        }
        return contador;
    }
      public float[] invertirArreglo(float[] num){
        float[] invertido = new float[num.length];
        
        //recorrer el arreglo original de atrás hacia adelante
        for(int i = 0; i < num.length; i++){
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }
       public float[] valoresAbsolutos(float[] num){
        float[] absolutos = new float[num.length];
        
        //recorrer el arreglo y aplicar valor absoluto
        for(int i = 0; i < num.length; i++){
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    } 
     
     
}
