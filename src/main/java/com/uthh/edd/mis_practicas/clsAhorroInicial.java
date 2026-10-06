/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.mis_practicas;

/**
 *
 * @author Chris
 */
public class clsAhorroInicial {
    /*El programa permitirá registrar el nombre del dueño y el saldo inicial, 
    depositar dinero, retirarlo y consultar cuánto se ahorraría al depositar una
    cantidad fija durante varios días.*/
    
    //atributos
    private String propietario;
    private double saldo;
    
    //constructores parametrizado
    public clsAhorroInicial(String _propietario, double _saldo){
        propietario = _propietario;
        saldo = _saldo;
    }
    
    //constructor copia
    public clsAhorroInicial(clsAhorroInicial copia){
        propietario = copia.propietario;
        saldo = copia.saldo;
    }
  
    //propiedades getters
    public String getPropietario(){
        return propietario;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //propiedades setters
    public void setPropietario(String nombre){
        if(nombre != null){
            propietario = nombre;
        }
    }
    
    public void setSaldo(double saldoInicial){
        if(saldoInicial > 0){
            saldo = saldoInicial;
        }
    }
    
    //metodos
    public void depositar( double cantidad){
        if(cantidad > 0){
            saldo+=cantidad;
        }
    }
    
    public void retirar(double cantidad){
        if(cantidad > 0){
            saldo -= cantidad;
        }
    }
    
    public boolean puedeComprar(double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            return true;
        }else{
            return false;
        }
    }
    
    //calcular cuánto dinero juntarías al depositar la misma cantidad cada día
    public double calcularAhorro(int dias, double cantidad){
        if(dias == 0)
            return 0;
        return cantidad + calcularAhorro(dias - 1, cantidad);
    }
    
}
