package classesproject;

public class Employee {
    private int id;
    private String name;
    protected float salary;
    public String position;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    void presentation(){
        System.out.println(" Hello my name is"+" "+name+" "+"and my position in the company is"+" " +position);
    }
}
