package classesproject;

/**
 * esta es la plantilla para crear un objeto de clase estudiante universitario. Sus atributos son:
 * id: es el numero de identificación del estudiante.
 * name: es el nombre del estudiante.
 * university: es la universidad del estudiante
 * career: es la carrera que esta estudiando.
 * numSubjects: es el numero de materias que el estudiante tiene matriculadas
 * semester: es el semestre en el cual se encuentra el estudiante.
 */
public class UniversityStudent {
    private int id;
    private String name;
    private String university;
    private String career;
    protected int numSubjects;
    protected int semester;

    /**
     *
     * @return retorna el numero de identificación del estudiante.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id permite establecer el numero de identificación del estudiante.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return retorna el nombre del estudiante.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name permite establecer el nombre del estudiante.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return retorna la universidad del estudiante
     */
    public String getUniversity() {
        return university;
    }

    /**
     *
     * @param university permite establecer la universidad del estudiante
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     *
     * @return retorna la carrera que esta estudiando
     */
    public String getCareer() {
        return career;
    }

    /**
     *
     * @param career permite establecer la carrera que esta estudiando
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     *
     * @return retorna el numero de materias que el estudiante tiene matriculadas
     */
    public int getNumSubjects() {
        return numSubjects;
    }

    /**
     *
     * @param numSubjects permite establecer el numero de materias que el estudiante tiene matriculadas
     */
    public void setNumSubjects(int numSubjects) {
        this.numSubjects = numSubjects;
    }

    /**
     *
     * @return retorna el semestre en el cual se encuentra el estudiante
     */
    public int getSemester() {
        return semester;
    }

    /**
     *
     * @param semester permite establecer el semestre en el cual se encuentra el estudiante
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }
}