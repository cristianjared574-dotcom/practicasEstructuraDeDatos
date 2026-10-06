/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.mis_practicas;

/**
 *
 * @author Chris
 */
public class Ahorro extends clsAhorroInicial{
    
    private double saldometa;
    
    public Ahorro(String propietario, double saldo, double _Saldometa){ super(propietario, saldo);
        saldometa = _Saldometa;
    }
    
    //propiedad
    public double getSaldoMeta(){
        return saldometa;
    }
    
    public void setsaldo(double cantidad){
        if(cantidad > 0){
            saldometa = cantidad;
        }
    }
    
    //funcion para calcular cuanto fala para llegar al saldo meta
    public double CalcularSaldoFaltante(){
        if(getSaldo() >= saldometa){  //600  
            return 0;
        }
        return saldometa - getSaldo();
    }
}
    

