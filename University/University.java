package university;

public class University {

    public static void main(String[] args) {

        Student s1 = new Student("X", "01303515213", "x@gmail.com", "CSE", 02, 3.50);
        Student s2 = new Student("Y", "01785408643", "y@gmail.com", "EEE", 23, 3.25);
        Student s3 = new Student("Z", "01521551879", "z@gmail.com", "IPE", 49, 3.00);

        Teacher t1 = new Teacher("T1", "01836384178", "t1@gmail.com", "CSE", 50000, "Software");
        Teacher t2 = new Teacher("T2", "01521551879", "t2@gmail.com", "EEE", 50000, "DC");
        Teacher t3 = new Teacher("T3", "01785408643", "t3@gmail.com", "EEE", 50000, "AC");

        Dean d1 = new Dean("A", "016785408648", "a@gmail.com", "CSE", 100000, "Software", "X");
        Dean d2 = new Dean("B", "01521551879", "b@gmail.com", "EEE", 100000, "AC", "Y");

        s1.printAll();
        s2.printAll();
        s3.printAll();
        System.out.println();

        t1.printAll();
        t2.printAll();
        t3.printAll();
        System.out.println();

        d1.printAll();
        d2.printAll();
        System.out.println();
    }

}
