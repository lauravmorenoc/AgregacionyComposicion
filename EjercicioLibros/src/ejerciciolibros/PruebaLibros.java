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
public class PruebaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConjuntoLibro biblioteca = new ConjuntoLibro();
        Autor autor = new Autor("Gabriel", "Garcia");
        Libro libro = new Libro("Cien años de soledad", 300, 8, autor);
        boolean resultado = biblioteca.añadirLibro(libro);
        boolean eliminacion = biblioteca.eliminarLibroAutor("Gabriel", "Garcia");
        
        if(resultado)System.out.println("Añadido " + libro.getTitulo());
        else System.out.println("Problemas para añadir");
        
        if(eliminacion)System.out.println("Eliminado un libro");
        else System.out.println("Problemas para eliminar");
        
        
    }
    
}
