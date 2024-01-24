/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.netec.levm.bancadigital.entity;


public class CuentaDeCheque extends Cuenta {
    private double costoManejoMensual;
    
    public CuentaDeCheque(double costoManejoMensual,int numero, String fechaApertura, double saldo, String fechaNacimiento) {
        super(numero, fechaApertura, saldo, fechaNacimiento);
        this.costoManejoMensual =  costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheque{" + "costoManejoMensual=" + costoManejoMensual + '}';
    }
    
}
