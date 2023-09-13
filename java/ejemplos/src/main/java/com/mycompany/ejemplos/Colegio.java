/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos;

/**
 *
 * @author Alumno
 */
public class Colegio {
    private int nota1;
    private int nota2;
    private int nota3;
    
    public Colegio(){}
    
    public Colegio(int nota1,int nota2,int nota3){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        
    }
    
    
    public void setNota1(int nota1){
        this.nota1=nota1;
    }
    public void setNota2(int nota2){
        this.nota2=nota2;
    }
    public void setNota3(int nota3){
        this.nota3=nota3;
    }
    public double promedio(){
        double a=0;
        a=(nota1+nota2+nota3)/3;
        return a;
    }
    public String mensaje(){
        String a="";
        int prom=(nota1+nota2+nota3)/3;
            
            if (promedio()>=13) {
                a="APROBADO";
            
        } else {
                a="DESAPROBADO";
        }
        return a;
    }
    
    
    
}
