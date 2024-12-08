public class Student extends User {
    private String id;
    private Faculty faculty;
    private Integer startYear;
    private Boolean ResearchStatus;

    public Student(String name, String surname, String password, Faculty faculty, Integer startYear, Boolean ResearchStatus) {
        super(name, surname, password);
        this.faculty = faculty;
        this.startYear = startYear;
        this.ResearchStatus = ResearchStatus;

    }



}
