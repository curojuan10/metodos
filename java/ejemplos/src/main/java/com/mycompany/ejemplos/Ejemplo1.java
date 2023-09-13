/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos;

/**
 *
 * @author Alumno
 */
public class Ejemplo1 {
    private int cantidad;
    private int precio;
    
    
    public Ejemplo1(){}
    
    public Ejemplo1(int cantidad,int precio){
        this.cantidad=cantidad;
        this.precio=precio;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
        
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    
    public double total(){
        double a=0;
        int subTotal=cantidad*precio;
            if (cantidad>=3) {
                a=subTotal-(subTotal*0.2);
            
        } else {
                a=subTotal-(subTotal*0.2);
        }
              
        
        return a;
    }
    
}
