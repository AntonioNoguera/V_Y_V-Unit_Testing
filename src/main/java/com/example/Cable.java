package com.example;

import java.util.ArrayList;

public class Cable extends Clientes {
    private int idCable;
    private double saldoCable;
    private ArrayList<String> canalesContratados = new ArrayList<>();

    public Cable(Clientes cliente, int idCable, double saldoCable) {
        super(cliente.getIdCliente(), cliente.getNombre(), cliente.getDireccion());
        this.idCable = idCable;
        this.saldoCable = saldoCable;
    }

    public int getIdCable() {
        return idCable;
    }

    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    public double getSaldoCable() {
        return saldoCable;
    }

    public void setSaldoCable(double saldoCable) {
        this.saldoCable = saldoCable;
    }

    public ArrayList<String> getCanalesContratados(){
        return this.canalesContratados;
    }

    public void recargarSaldo(double monto) {
        this.saldoCable += monto;
    }


    public Double verCanal(int minutosObservados) {
        double costoPorMinuto = 0.2;
        double costo = costoPorMinuto*minutosObservados;
        if (this.saldoCable >= costo && minutosObservados>0) {
            this.saldoCable -= costo;
            return this.saldoCable;
        } else {
            System.out.println("Saldo insuficiente o valor inválido de minutos para ver el canal.");
            return null;
        }
    }


    public Double contratarCanal(String canal) {
        double costoCanal = 5.0;
        if (this.saldoCable >= costoCanal && !canal.isEmpty()) {
            this.saldoCable -= costoCanal;
            canalesContratados.add(canal);
            return this.saldoCable;
        } else {
            System.out.println("Saldo insuficiente o nombre de canal inválido para contratar el canal.");
            return null;
        }
    }
}