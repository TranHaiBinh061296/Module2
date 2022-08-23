package practice_activities.bai13_tinhchatoop;

public class Fresher extends Employee{
    private int graduation_Date;
    private String graduation_Rank;
    private String education;

    public Fresher(int graduation_Date, String graduation_Rank, String education) {
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    public Fresher(int iD, String fullName, int birthday, int phone, String email, int employee_Type, int employee_Count, int graduation_Date, String graduation_Rank, String education) {
        super(iD, fullName, birthday, phone, email, employee_Type, employee_Count);
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
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
    public String ShowInfo() {
        return null;
    }
}
