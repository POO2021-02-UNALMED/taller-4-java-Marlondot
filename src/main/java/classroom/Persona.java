package classroom;

public class Persona {

    long cedula=0; //deleting the final in this line
    String nombre;
    static int totalPersonas;
    
    //deleting cedula from here
    static {
        totalPersonas = 0;
    }
    
    //constructor added
    Persona(){
    	
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }
    
    //adding this.cedula=1 for the last line of the problem
    Persona(String nombre) {
        this.nombre = "";
        this.cedula=1;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
