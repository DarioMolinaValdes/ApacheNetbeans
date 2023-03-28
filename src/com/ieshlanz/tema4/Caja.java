package com.ieshlanz.tema4;

import java.util.*;

public class Caja {

    public boolean abierto;
    public String mensaje;

    public Caja(boolean a, String m) {
        abierto = a;
        mensaje = m;
    }

    public Caja(String m) {
        this(false, m);
    }

    public Caja() {
        this("Viva el tema 7");
    }

    public void setMensaje(String m) {
        String usuario = new Scanner(System.in).nextLine();
        usuario = m;
    }
        public void abrir() {
        abierto= true;
    }
     public void cerrar() {
        abierto = false;
        }
     public String getmensaje(){
     return mensaje;
     }
    public void pasarMayusculas() {
        if (abierto) {
            mensaje = mensaje.toUpperCase();
        }
    }
}