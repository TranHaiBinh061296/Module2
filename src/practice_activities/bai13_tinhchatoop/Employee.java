package practice_activities.bai13_tinhchatoop;

import java.security.cert.Certificate;
import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    public static long count = 0;
    protected String iD;
    protected String fullName;
    protected LocalDate birthday;
    protected int phone;
    protected String email;
    protected List<Certificate> certificates;

    public Employee() {}

    public Employee(String iD, String fullName, LocalDate birthday, int phone, String email, List<Certificate> certificates) {
        this.iD = iD;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
    public abstract void showMe();
}
