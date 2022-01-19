package university;

public class Dean extends Teacher {

    private String School;

    public String getSchool() {
        return School;
    }
    public void setSchool(String school) {
        School = school;
    }

    Dean(String Name, String PhoneNumber, String EmailAddress, String Department, double Salary, String ResearchInterest, String School) {
        super(Name, PhoneNumber, EmailAddress, Department, Salary, ResearchInterest);
        this.School = School;
    }
    @Override
    void printAll() {
        System.out.println("Deans info:");
        super.printAll();
        System.out.println("School: " + School);
    }
}
