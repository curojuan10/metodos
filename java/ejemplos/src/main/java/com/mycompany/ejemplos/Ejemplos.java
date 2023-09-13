/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplos;

/**
 *
 * @author Alumno
 */
public class Ejemplos {

    public static void main(String[] args) {
//        Ejercicios ej1=new Ejercicios();
//        ej1.setX(10);
//        ej1.setY(5);
//        System.out.println("la suma es: "+ej1.suma());
//        System.out.println("la resta es : "+ej1.resta());
//        System.out.println("la multiplicacion  es : "+ej1.multiplicacion());
//        System.out.println("la divicion es: "+ej1.divicion());
//       
        Colegio co=new Colegio();
        Colegio co1=new Colegio(17, 15, 10);
        
       
        
        co.setNota1(15);
        co.setNota2(12);
        co.setNota3(18);
        System.out.println("el estudiante es :"+co.mensaje());
        System.out.println("con: "+  co.promedio());
        
       
        System.out.println(co1.mensaje()+"  con: "+co1.promedio());
       
        Ejemplo1 ej1=new Ejemplo1();
        ej1.setCantidad(4);
        ej1.setPrecio(20);
        System.out.println(ej1.total());
    }
}
