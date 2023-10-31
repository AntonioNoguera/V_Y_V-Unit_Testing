package com.example;

public class Internet extends Clientes {
    private int idInternet;
    private double saldoInternet;

    public Internet(int idCliente, String nombre, String direccion, int idInternet, double saldoInternet) {
        super(idCliente, nombre, direccion);
        this.idInternet = idInternet;
        this.saldoInternet = saldoInternet;
    }

    public Internet(Clientes cliente, int idInternet, double saldoInternet) {
        super(cliente.getIdCliente(), cliente.getNombre(), cliente.getDireccion());
        this.idInternet = idInternet;
        this.saldoInternet = saldoInternet;
    }

    public int getIdInternet() {
        return idInternet;
    }

    public void setIdInternet(int idInternet) {
        this.idInternet = idInternet;
    }

    public double getSaldoInternet() {
        return saldoInternet;
    }

    public void setSaldoInternet(double saldoInternet) {
        this.saldoInternet = saldoInternet;
    }

    public void recargarSaldo(double monto) {
        this.saldoInternet += monto;
    }

    //Métodos
    public Double navegarSitio(double tiempoEnMinutos) {
        double costo = 0.1;

        double costoNavegacion = tiempoEnMinutos*costo;
    if (this.saldoInternet >= costoNavegacion && tiempoEnMinutos>0)  {
            this.saldoInternet -= costoNavegacion;
            return this.saldoInternet;
        } else {
            System.out.println("Saldo insuficiente para navegar el sitio.");
            return null;
        }
    }

    public Double descargarArchivo(double tamanoDelArchivoEnMb) {
        double cuotaporMb = .0001;
        double costoDescarga = cuotaporMb * tamanoDelArchivoEnMb;
        if (this.saldoInternet >= costoDescarga && tamanoDelArchivoEnMb>0) {
            this.saldoInternet -= costoDescarga;
            return this.saldoInternet;
        } else {
            return null;
        }
    }
}