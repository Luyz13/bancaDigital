/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.netec.levm.bancadigital.entity;


public class CuentaDeAhorro extends Cuenta {

    private double tasaInteresMensual;
    
    public CuentaDeAhorro(double tasaInteresMensual,int numero, String fechaApertura, double saldo, String fechaNacimiento) {
           super(numero, fechaApertura, saldo, fechaNacimiento);
           this.tasaInteresMensual= tasaInteresMensual;
 
    }
    public Double calcularInteres(){
        return 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaDeAhorro{");
        sb.append("tasaInteresMensual=").append(tasaInteresMensual);
        sb.append('}');
        return sb.toString();
    }
    
}
