package classesproject;

/**
 * esta clase nos permite crear objetos de tipo empleados, sus atributos son:
 * id: es numero de identificación del empleado.
 * name: es el nombre del empleado.
 * salary: es el salario que recibe el empleado.
 * position: es el cargo que tiene el empleado.
 */
public class Employee {
    private int id;
    private String name;
    protected float salary;
    public String position;

    /**
     *
     * @return nos retorna el numero de identificación del empleado
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id nos permite establecer el numero de identificación del empleado
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return retorna el nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nos permite establecer el nombre del empleado
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return retorna el salario del empleado
     */
    public float getSalary() {
        return salary;
    }

    /**
     *
     * @param salary nos permite establecer el salario del empleado
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     *
     * @return retorna el cargo del empleado
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @param position nos permite establecer el cargo del empleado
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * este metodo imprime la descripción del empleado, la cual incluye su nombre y cargo en la empresa.
     */
    void presentation(){
        System.out.println(" Hello my name is"+" "+name+" "+"and my position in the company is"+" " +position);
    }
}
