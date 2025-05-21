import java.util.*;
import javax.persistence.*;// Necesario para las anotaciones JPA
import java.io.Serializable;

/**
 * Clase Persona que representa a una entidad de la base de datos.
 * Va a ser guardada como un objeto completo dentro de ObjectDB.
 */
@Entity //Marca la clase como una entidad que se guardara en la base de datos
public class Persona implements Serializable{
    @Id // Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el valor automáticamente
    private int id;
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
    }
    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // Getters y Setters obligatorios para que ObjectDB pueda acceder a los atributos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Método toString para mostrar la información de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}