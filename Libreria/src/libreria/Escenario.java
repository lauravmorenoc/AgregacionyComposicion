
package libreria;

/**
 * Escenario para la configuracion de un escenario
 * @since 
 */



import becker.robots.*;
import java.awt.Color;
public class Escenario {
    private City ciudad;
    private Robot robot;
    public Escenario(){
    this.ciudad=new City();
        for (int i = 0; i <=6; i++) {
            Wall pared = new Wall (ciudad,0 , i, Direction.NORTH);}
        for (int i = 0; i <=6; i++) {
            Wall pared = new Wall (ciudad,i , 6 , Direction.EAST);}
        for (int i = 0; i <=6; i++) {
            Wall pared = new Wall (ciudad,i, 0 , Direction.WEST);}
       for (int i = 0; i <=6; i++){
           Wall pared = new Wall (ciudad,6,i,Direction.SOUTH);
       }
    Thing thing = new Thing (this.ciudad,5,5);
        thing.getIcon().setColor(Color.RED);
        thing.getIcon().setLabel("TO");
        this.robot = new Robot(ciudad, 4,4,Direction.EAST);
        this.robot.setLabel("ROBOT");
        
        
    }
    
    /**
     * Descripcion del metodo
     * @param pasos Descripcion del parametro 
     * 
     */
    public void ejecutar(int pasos){
        for (int i = 0; i < pasos ; i++) {
            this.robot.move();
            System.out.println(this.robot.getAvenue());
            System.out.println(this.robot.getStreet());
            if(this.robot.getDirection()==Direction.NORTH){
        }
}
}}

