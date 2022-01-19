package university;

public class Student extends Person {

    private int ID;
    private double CGPA;

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }

    Student(String Name, String PhoneNumber, String EmailAddress, String Department, int ID, double CGPA) {
        super(Name, PhoneNumber, EmailAddress, Department);
        this.ID = ID;
        this.CGPA = CGPA;
    }
    @Override
    void printAll() {
        System.out.println("Student info:");
        super.printAll();
        System.out.println("ID: " + ID);
        System.out.println("CGPA: " + CGPA);
    }
}
