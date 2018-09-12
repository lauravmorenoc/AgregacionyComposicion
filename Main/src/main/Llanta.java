/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    private String marca;
    private String modelo;
    private int tamanioPulgadas;
    public Llanta(String marca, String modelo, int tamanioPulgadas){
        this.marca=marca;
        this.modelo=modelo;
        this.tamanioPulgadas=tamanioPulgadas;
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

    public int getTamanioPulgadas() {
        return tamanioPulgadas;
    }

    public void setTamanioPulgadas(int tamanioPulgadas) {
        this.tamanioPulgadas = tamanioPulgadas;
    }
    
}
