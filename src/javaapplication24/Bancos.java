/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author Usuario
 */
public class Bancos { 

private String tipoCuenta;
    private String titular;
    private int saldo;
    
    
    public Bancos(String tipoCuenta, String titular, int saldo, int id) {
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
   
    public String getTipoCuenta() {
        return tipoCuenta;
    }
   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setTipoCuenta(String tipo) {
        this.tipoCuenta = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
       
    public void retiro(int monto) {
        this.saldo = saldo - monto;
    }
   
    public void deposito(int monto) {
        this.saldo = saldo + monto;
    }   
}