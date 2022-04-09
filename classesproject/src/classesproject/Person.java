package classesproject;

import java.util.Date;

/**
 * esta es la plantilla para crear un objeto de clase persona.
 * sus atributos son:
 * name: es el nombre de la persona.
 * lastName1: es el primer apellido de la persona
 * lastName2: es el segundo apellido de la persona.
 * dateBirth: es la fecha de nacimiento de la persona
 * height: es la altura de la persona
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;


    /**
     *
     * @param name nos permite establecer el nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return retorna el nombre de la persona
     */
    public String getName() {
        return name;
    }
}
