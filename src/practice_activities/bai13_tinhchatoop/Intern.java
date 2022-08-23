package practice_activities.bai13_tinhchatoop;

import java.security.cert.Certificate;
import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {

    private String majors;
    private int semester;
    private String university_Name;

    public Intern() {
    }

    public Intern(String majors, int semester, String university_Name) {
        this.majors = majors;
        this.semester = semester;
        this.university_Name = university_Name;
    }

    public Intern(String iD, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificates, String majors, int semester, String university_Name) {
        super(iD, fullName, birthday, phone, email, certificates);
        this.majors = majors;
        this.semester = semester;
        this.university_Name = university_Name;
    }

    @Override
    public void showMe() {
        System.out.println(this);
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
    public String toString() {
        return "Intern " +
                ", iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", university_Name='" + university_Name + '\'';
    }
}
