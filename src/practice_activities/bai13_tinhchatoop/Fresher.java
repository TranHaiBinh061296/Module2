package practice_activities.bai13_tinhchatoop;

import java.security.cert.Certificate;
import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
    private int graduation_Date;
    private String graduation_Rank;
    private String education;

    public Fresher() {
    }

    public Fresher(int graduation_Date, String graduation_Rank, String education) {
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    public Fresher(String iD, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificates, int graduation_Date, String graduation_Rank, String education) {
        super(iD, fullName, birthday, phone, email, certificates);
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    @Override
    public void showMe() {
        System.out.println(this);
    }

    public int getGraduation_Date() {
        return graduation_Date;
    }

    public void setGraduation_Date(int graduation_Date) {
        this.graduation_Date = graduation_Date;
    }

    public String getGraduation_Rank() {
        return graduation_Rank;
    }

    public void setGraduation_Rank(String graduation_Rank) {
        this.graduation_Rank = graduation_Rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher " +
                ", iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                "graduation_Date=" + graduation_Date +
                ", graduation_Rank='" + graduation_Rank + '\'' +
                ", education='" + education + '\'';
    }
}
