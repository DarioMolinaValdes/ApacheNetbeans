package com.ieshlanz.tema4;

import org.junit.Test;
import static org.junit.Assert.*;

public class programaTest {

    

    @Test
    public void testGetSaldo() {
        programa programa1 = new programa("ES21099865462528660871295", 100);
        float saldo = programa1.getSaldo();
        assertEquals(100, saldo, 0);
    }
    @Test
    public void testSetSaldo() {
        programa programa1 = new programa("ES21099865462528660871295", 0);
        programa1.setSaldo(100);
        assertEquals(100, programa1.getSaldo(),0);
    }
    @Test
    public void testIngresarDinero() {
        programa programa1 = new programa("ES21099865462528660871295", 100);
        programa1.ingresarDinero(400);
        assertEquals(500, programa1.getSaldo(),0);
    }
    public void testExtraerDinero() {
        programa programa1 = new programa("ES21099865462528660871295", 100);
        programa1.extraerDinero(20);
        assertEquals(80, programa1.getSaldo(),0);
    }
}