/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.netec.levm.bancadigital;

import com.netec.levm.bancadigital.entity.*;
import java.util.ArrayList;

/**
 *
 * @author levm13
 */
public class BancaDigital {

    public static void main(String[] args) {
        Domicilio domicilioBanco = new Domicilio("calle del banco", 1, "colonia del banco", "estado del banco", 1);
        Domicilio domicilioCliente1 = new Domicilio("calle del cliente 1", 2, "colonia del cliente 1", "estado del cliente 1", 3);
        Domicilio domicilioCliente2 = new Domicilio("calle del cliente 2", 3, "colonia del cliente 2", "estado del cliente 2", 3);
        Cuenta cuentaClienteAhorro = new CuentaDeAhorro(1.0,1,"21/01/2024",10.0, null);
        Cuenta cuentaClienteChque = new CuentaDeCheque(2.0,3,"23-01-2023", 3000.0,null);
        Cuenta cuentaCliente2Ahorro = new CuentaDeAhorro(1.0,2,"21/01/2024",12.0, null);
        Cuenta cuentaCliente2Chque = new CuentaDeCheque(2.0,3,"23-01-2023", 3000.0,null);
        ArrayList<Cuenta> cuentasCliente1= new ArrayList<>();
        cuentasCliente1.add(cuentaClienteChque);
        cuentasCliente1.add(cuentaClienteAhorro);
        ArrayList<Cuenta> cuentasCliente2= new ArrayList<>();
        cuentasCliente2.add(cuentaCliente2Chque);
        cuentasCliente2.add(cuentaCliente2Ahorro);
        Cliente cliente = new Cliente(1,"nombre cliente",domicilioCliente1, "rfc cliente", "12345678",cuentasCliente1,"01/01/1990" );
        Cliente cliente2 = new Cliente(2,"nombre cliente2",domicilioCliente2, "rfc cliente", "12345678",cuentasCliente2 ,"01/01/1990" );
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);
        Banco banco = new Banco("BBVA", domicilioBanco, "rfc banco", "1234567890",clientes);
        System.out.println("Datos del Banco: "+ banco.toString());
    }
}
