/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibros;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    
    private Libro[] libros;

    public ConjuntoLibro() {
        this.libros = new Libro[10];
    }
    
    public boolean añadirLibro(Libro libro) {
        for(int i = 0; i < libros.length; i++) {
            if(this.libros[i] == null) {
                this.libros[i] = libro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarLibroTitulo(String titulo) {
        for(int i = 0; i < libros.length; i++) {
            if(this.libros[i].getTitulo() == titulo) {
                 libros[i] = null;
                 return true;
            }   
        }
        return false;
    }
    
    public boolean eliminarLibroAutor(String nombre, String apellido) {
        for(int i = 0; i < libros.length; i++) {
            if(this.libros[i].getAutor().getNombre().equals(nombre) && this.libros[i].getAutor().getApellido().equals(apellido)){
                libros[i] = null;
                return true;
            } else return false;
        }
      return false;
    }
    
    public Libro mejorCalificacion() {
        Libro mejor = null;
        for(int i = 0; i < this.libros.length; i++) {
            if(i==0) mejor = this.libros[i];
            else {
                if(this.libros[i].getCalificacion() > mejor.getCalificacion()) {
                    mejor = this.libros[i];
                }
            }
        }
        return mejor;
    }
    
    public Libro menorCalificacion() {
        Libro menor = null;
        for(int i = 0; i < this.libros.length; i++) {
            if(i==0) menor = this.libros[i];
            else if(this.libros[i].getCalificacion() < menor.getCalificacion())menor = this.libros[i];
        }
        return menor;
    }
}

