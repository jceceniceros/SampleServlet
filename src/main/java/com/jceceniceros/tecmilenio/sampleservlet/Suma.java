/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jceceniceros.tecmilenio.sampleservlet;

/**
 *
 * @author juancarlos
 */
public class Suma {

    private int n1;
    private int n2;
    private int resultado;

    public Suma(String n1, String n2) {
        this.setN1(Integer.parseInt(n1));
        this.setN2(Integer.parseInt(n2));
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the n2 to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void suma() {
        int res = this.getN1() + this.getN2();
        this.setResultado(res);
    }
}
