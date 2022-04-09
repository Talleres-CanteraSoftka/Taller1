package classesproject;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    protected String breed;
    private String color;
    public int age;
    protected String sound;


    void description() {
        System.out.println("The name of the god is" + " " + name + " " + ", it's breed is" + " " + breed + " " + "and is " + age + " " + "years old");
    }

}
