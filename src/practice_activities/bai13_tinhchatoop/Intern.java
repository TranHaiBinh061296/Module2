package practice_activities.bai13_tinhchatoop;

public class Intern extends Employee {

    private String majors;
    private int semester;
    private String university_Name;

    public Intern(String majors, int semester, String university_Name) {
        this.majors = majors;
        this.semester = semester;
        this.university_Name = university_Name;
    }

    public Intern(int iD, String fullName, int birthday, int phone, String email, int employee_Type, int employee_Count, String majors, int semester, String university_Name) {
        super(iD, fullName, birthday, phone, email, employee_Type, employee_Count);
        this.majors = majors;
        this.semester = semester;
        this.university_Name = university_Name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }

    @Override
    public String ShowInfo() {
        return null;
    }
}
