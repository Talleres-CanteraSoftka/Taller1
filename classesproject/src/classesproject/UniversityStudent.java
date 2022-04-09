package classesproject;

public class UniversityStudent {
    private int id;
    private String name;
    private String university;
    private String career;
    protected int numSubjects;
    protected int semester;


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

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getNumSubjects() {
        return numSubjects;
    }

    public void setNumSubjects(int numSubjects) {
        this.numSubjects = numSubjects;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}