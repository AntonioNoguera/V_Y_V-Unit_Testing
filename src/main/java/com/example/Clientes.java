package com.example;

public class Clientes {
    private int idCliente;
    private String nombre;
    private String direccion;
    private double saldoTotal;

    public Clientes(int idCliente, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Métodos
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getSaldoTotal(Internet internet, Telefono telefono, Cable cable) {
        double saldo = internet.getSaldoInternet()+telefono.getSaldoTelefono() + cable.getSaldoCable();
        this.saldoTotal = saldo;
        return saldo;
    }
}