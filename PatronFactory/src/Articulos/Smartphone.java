/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

import patronFactory.Patron;

/**
 *
 * @author Lyzz
 */
public class Smartphone implements Patron {
    private String marca;
    private String modelo;
    private String SO;
    private int memoriaInterna;
    private boolean memoriaExpandible;
    private int noCamaras;

    public Smartphone() {
    }

    public Smartphone(String marca, String modelo, String SO, int memoriaInterna, boolean memoriaExpandible, int noCamaras) {
        this.marca = marca;
        this.modelo = modelo;
        this.SO = SO;
        this.memoriaInterna = memoriaInterna;
        this.memoriaExpandible = memoriaExpandible;
        this.noCamaras = noCamaras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    public boolean isMemoriaExpandible() {
        return memoriaExpandible;
    }

    public void setMemoriaExpandible(boolean memoriaExpandible) {
        this.memoriaExpandible = memoriaExpandible;
    }

    public int getNoCamaras() {
        return noCamaras;
    }

    public void setNoCamaras(int noCamaras) {
        this.noCamaras = noCamaras;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca = " + marca + ", modelo = " + modelo + ", SO = " + SO + ", memoriaInterna = " + memoriaInterna + " GB" +", memoriaExpandible = " + memoriaExpandible + ", noCamaras = " + noCamaras + '}';
    }

   
}
