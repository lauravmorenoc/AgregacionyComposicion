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
public class Automovil {
    private String marca;
    private int anio;
    private String modelo;
    private Llanta llanta[];
    private Motor motor;
    private Puerta puerta[];
    //Este constructor es para cuando no tenemos ni las llantas ni las puertas, ni el motor;
    public Automovil(String marca, int anio, String modelo){
        this.marca=marca;
        this.anio=anio;
        this.modelo=modelo;
        this.llanta=new Llanta[4];
        this.puerta=new Puerta[2];
    }
    
    //Este constructor es para cuando tenemos todos los atributos del automovil;
    public Automovil(String marca, int anio, String modelo, Llanta llanta[], Motor motor, Puerta puerta[]){
        this.marca=marca;
        this.anio=anio;
        this.modelo=modelo;
        this.llanta=llanta;
        this.motor=motor;
        this.puerta=puerta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
