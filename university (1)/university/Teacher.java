package university;

public class Teacher extends Person {

    private double Salary;
    private String ResearchInterest;

    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    public String getResearchInterest() {
        return ResearchInterest;
    }
    public void setResearchInterest(String researchInterest) {
        ResearchInterest = researchInterest;
    }

    Teacher(String Name, String PhoneNumber, String EmailAddress, String Department, double Salary, String ResearchInterest) {
        super(Name, PhoneNumber, EmailAddress, Department);
        this.Salary = Salary;
        this.ResearchInterest = ResearchInterest;
    }
    @Override
    void printAll() {
        System.out.println("Teacher info:");
        super.printAll();
        System.out.println("Salary: " + Salary);
        System.out.println("Research Interest: " + ResearchInterest);
    }
}
