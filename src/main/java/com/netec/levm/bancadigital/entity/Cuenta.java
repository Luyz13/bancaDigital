/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.netec.levm.bancadigital.entity;

/**
 *
 * @author levm13
 */
public abstract class Cuenta {
    private int numero;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;

    public Cuenta(int numero, String fechaApertura, double saldo, String fechaCancelacion) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.fechaCancelacion = fechaCancelacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaNacimiento() {
        return fechaCancelacion;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaCancelacion = fechaNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numero=").append(numero);
        sb.append(", fechaApertura=").append(fechaApertura);
        sb.append(", saldo=").append(saldo);
        sb.append(", fechaNacimiento=").append(fechaCancelacion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
