package com.example;

public class Telefono extends Clientes {
    private long numTelefono;
    private double saldoTelefono;

    public Telefono(int idCliente, String nombre, String direccion, double saldoTotal, long numTelefono, double saldoTelefono) {
        super(idCliente, nombre, direccion);
        this.numTelefono = numTelefono;
        this.saldoTelefono = saldoTelefono;
    }

    public Telefono(Clientes cliente, long telefono, double saldo){
        super(cliente.getIdCliente(), cliente.getNombre(), cliente.getDireccion());
        this.numTelefono = telefono;
        this.saldoTelefono = saldo;
    }

    public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public double getSaldoTelefono() {
        return saldoTelefono;
    }

    public void setSaldoTelefono(double saldoTelefono) {
        this.saldoTelefono = saldoTelefono;
    }

    public void recargarSaldo(double monto) {
        this.saldoTelefono += monto;
    }

    public Double realizarLlamada(double duracionMin) {
        double costoMin =  0.1;
        double costo = duracionMin * costoMin;
        if (this.saldoTelefono >= costo && duracionMin>0) {
            this.saldoTelefono -= costo;
            return this.saldoTelefono;
        } else {
            System.out.println("Saldo insuficiente , o duración inválida para realizar la llamada.");
            return null;
        }
    }

    public Double enviarMensaje(String mensaje) {
        int sizeMessage = mensaje.length();
        double costoCar = 0.01;
        double costo = costoCar*sizeMessage;
        if (this.saldoTelefono >= costo && !mensaje.isEmpty()) {
            this.saldoTelefono -= costo;
            return this.saldoTelefono;
        } else {
            return null;
        }
    }
}