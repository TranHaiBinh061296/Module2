package practice_activities.bai13_tinhchatoop;

import java.security.cert.Certificate;
import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(String iD, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificates, int expInYear, String proSkill) {
        super(iD, fullName, birthday, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience " +
                ", iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", certificates=" + certificates +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' ;
    }

}
