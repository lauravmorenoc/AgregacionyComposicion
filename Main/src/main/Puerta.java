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
public class Puerta {
    private String tipo;
    public Puerta(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String _tipo){
        tipo=_tipo;
    }
}
