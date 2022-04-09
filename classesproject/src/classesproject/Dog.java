package classesproject;

/**
 * esta clase es la plantilla para la creacion de un objeto de clase perro, el cual tiene los siguientes atributos:
 * name, el cual es el nombre del perro.
 * breed, el cual es la raza del perro.
 * color, este es el color del perro.
 * age, es la edad del perro.

 */
public class Dog {
    private String name;
    protected String breed;
    private String color;
    public int age;

    /**
     *
     * @return rerona el nombre del perro
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name permite establecer el nombre del perro
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return nos retorna la raza del perro
     */
    public String getBreed() {
        return breed;
    }

    /**
     *
     * @param breed nos permite establecer la raza del perro
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     *
     * @return nos retorna el color del perro
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color nos permite establecer el color del perro
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return retorna la raza del perro
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age nos permite establecer la raza del perro
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * este metodo imprime la descripción del perro.
     */
    void description() {
        System.out.println("The name of the god is" + " " + name + " " + ", it's breed is" + " " + breed + " " + "and is " + age + " " + "years old");
    }

}
