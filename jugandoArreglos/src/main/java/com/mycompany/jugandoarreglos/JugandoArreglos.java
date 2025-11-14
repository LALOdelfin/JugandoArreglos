/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*Provando webhook*/

package com.mycompany.jugandoarreglos;

/**
 *
 * @author eduar
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
                
        float[] pesos={12f,45f, 3.5f};
        
        float sum=op.calculosSuma(pesos);
        System.out.println("la suma es"+sum);
        
                // Agregar el cálculo del promedio
        float promedio = op.calculosPromedio(pesos);
        System.out.println("El promedio es: " + promedio);
        
         // Contar elementos que exceden un límite
        float limite = 5f;
        int excedentes = op.contarExcedentes(pesos, limite);
        System.out.println("Elementos que exceden " + limite + ": " + excedentes);
        
        // Invertir el arreglo
        float[] invertido = op.invertirArreglo(pesos);
        System.out.println("Arreglo original: " + java.util.Arrays.toString(pesos));
        System.out.println("Arreglo invertido: " + java.util.Arrays.toString(invertido));
        
        // Valores absolutos
        float[] numerosConNegativos = {2f, -3f, -4f, 5f, -1.5f, 0f, -8.2f};
        float[] absolutos = op.valoresAbsolutos(numerosConNegativos);
        System.out.println("Arreglo con negativos: " + java.util.Arrays.toString(numerosConNegativos));
        System.out.println("Valores absolutos: " + java.util.Arrays.toString(absolutos));
    }
    
    }
