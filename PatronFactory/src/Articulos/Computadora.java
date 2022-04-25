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
public class Computadora implements Patron {
    private String marca;
    private String modelo;
    private String SO;
    private String procesador;
    private int tamanoMemoriaRam;
    private float duracionBateria;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String SO, String procesador, int tamanoMemoriaRam, float duracionBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.SO = SO;
        this.procesador = procesador;
        this.tamanoMemoriaRam = tamanoMemoriaRam;
        this.duracionBateria = duracionBateria;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getTamanoMemoriaRam() {
        return tamanoMemoriaRam;
    }

    public void setTamanoMemoriaRam(int tamanoMemoriaRam) {
        this.tamanoMemoriaRam = tamanoMemoriaRam;
    }

    public float getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(float duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca = " + marca + ", modelo = " + modelo + ", SO = " + SO + ", procesador = " + procesador + ", tamanoMemoriaRam = " + tamanoMemoriaRam + " GB" +", duracionBateria = " + duracionBateria +" horas"+ '}';
    }

    
    
    
}
