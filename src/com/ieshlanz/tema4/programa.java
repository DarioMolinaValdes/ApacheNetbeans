package com.ieshlanz.tema4;

public class programa {

    private String número;
    private float saldo;

    public programa(String numCta, float saldoCta) {
        número = numCta;
        saldo = saldoCta;

    }

    public String getNúmero() {
        return número;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNúmero(String numCta) {
        número = numCta;
    }

    public void setSaldo(float saldoCta) {
        saldo = saldoCta;
    }

    public void ingresarDinero(float importe) {
        saldo = saldo + importe;
    }

    public void extraerDinero(float importe) {
        if((saldo - importe ) < 0)
            throw new java.lang.ArithmeticException("Saldo negativo");
        else
        saldo = saldo - importe;
    }

    public void mostrarCuenta() {
        System.out.println("N° cuenta: " + getNúmero());
        System.out.println("Saldo: " + getSaldo() + " ");
    }
}
