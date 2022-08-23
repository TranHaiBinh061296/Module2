package practice_activities.bai13_tinhchatoop;

public abstract class Employee {
    protected int iD;
    protected String fullName;
    protected int birthday;
    protected int phone;
    protected String email;
    protected int employee_Type;
    protected int employee_Count;

    public Employee() {
    }

    public Employee(int iD, String fullName, int birthday, int phone, String email, int employee_Type, int employee_Count) {
        this.iD = iD;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_Type = employee_Type;
        this.employee_Count = employee_Count;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
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

    public int getEmployee_Type() {
        return employee_Type;
    }

    public void setEmployee_Type(int employee_Type) {
        this.employee_Type = employee_Type;
    }

    public int getEmployee_Count() {
        return employee_Count;
    }

    public void setEmployee_Count(int employee_Count) {
        this.employee_Count = employee_Count;
    }

    public abstract String ShowInfo();
}
