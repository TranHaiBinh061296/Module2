package practice_activities.bai13_tinhchatoop;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int iD, String fullName, int birthday, int phone, String email, int employee_Type, int employee_Count, int expInYear, String proSkill) {
        super(iD, fullName, birthday, phone, email, employee_Type, employee_Count);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
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
    public String ShowInfo() {
        System.out.println("Experience");
        return null;
    }
}
