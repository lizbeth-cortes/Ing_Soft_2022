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
public class Tablet implements Patron {
    private String marca;
    private String modelo;
    private String color;
    private String SO;
    private float tamanoDePantalla;
    private String resolucionDePantalla;

    public Tablet() {
    }

    public Tablet(String marca, String modelo, String color, String SO, float tamanoDePantalla, String resolucionDePantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.SO = SO;
        this.tamanoDePantalla = tamanoDePantalla;
        this.resolucionDePantalla = resolucionDePantalla;
        
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public float getTamanoDePantalla() {
        return tamanoDePantalla;
    }

    public void setTamanoDePantalla(float tamanoDePantalla) {
        this.tamanoDePantalla = tamanoDePantalla;
    }

    public String getResolucionDePantalla() {
        return resolucionDePantalla;
    }

    public void setResolucionDePantalla(String resolucionDePantalla) {
        this.resolucionDePantalla = resolucionDePantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca = " + marca + ", modelo = " + modelo + ", color = " + color + ", SO = " + SO + ", tamanoDePantalla = " + tamanoDePantalla +"\""+ ", resolucionDePantalla = " + resolucionDePantalla + '}';
    }

       
}
