package classesproject;


import java.util.ArrayList;

/**
 * esta es la plantilla para crear un objeto de clase fruta, sus atributos son:
 * name: es el nombre de la fruta.
 * averageWeight: es el peso promedio de la fruta.
 * colors, es un array que almacena los colores de todas las frutas
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     *
     * @return nos retorna el nombre de la fruta
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nos permite establecer el nombre de la fruta
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return nos retorna el peso promedio de la fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     *
     * @param averageWeight nos permite establecer el peso promedio de la fruta
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     *
     * @return nos retorna el color de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     *
     * @param colors nos permite establecer el color de la fruta dentro del array
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
