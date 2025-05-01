import java.util.*;

class University {
    private String name;
    private int code;
    private int numberColleges;
    private ArrayList<String> course;
    private String director;
    private String address;
    private long contact;
    private String email;

    public University() {}

    public University(String name, int code, int numberColleges, ArrayList<String> course,
                      String director, String address, long contact, String email) {
        this.name = name;
        this.code = code;
        this.numberColleges = numberColleges;
        this.course = course;
        this.director = director;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public void displayUniversity() {
        System.out.println("University:     [name= " + name + ", code= " + code +
                ", numberColleges= " + numberColleges + ", courses= " + course +
                ", director= " + director + ", address= " + address +
                ", contact= " + contact + ", email= " + email + "]");
    }
}

class College extends University {
    private String collegeName;
    private String collegeCode;
    private String grade;
    private String principal;
    private int students;
    private ArrayList<String> dept;
    private String collegeAddress;
    private String collegeEmail;

    public College() {}

    public College(String uniName, int uniCode, int numberColleges, ArrayList<String> course,
                   String director, String uniAddress, long contact, String uniEmail,

                   String collegeName, String collegeCode, String grade, String principal,
                   int students, ArrayList<String> dept, String collegeAddress, String collegeEmail) {
        super(uniName, uniCode, numberColleges, course, director, uniAddress, contact, uniEmail);
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.grade = grade;
        this.principal = principal;
        this.students = students;
        this.dept = dept;
        this.collegeAddress = collegeAddress;
        this.collegeEmail = collegeEmail;
    }

    public void displayCollege() {
        System.out.println("College :    [name= " + collegeName + ", code= " + collegeCode +
                ", Grade= " + grade + ", Principal= " + principal +
                ", Students= " + students + ", Departments= " + dept +
                ", Address= " + collegeAddress + ", Email= " + collegeEmail + "]");
    }
}

class Department extends College {
    private String deptName;
    private String hod;
    private int staff;
    private int deptStudents;

    public Department() {}

    public Department(String uniName, int uniCode, int numberColleges, ArrayList<String> course,
                      String director, String uniAddress, long contact, String uniEmail,

                      String collegeName, String collegeCode, String grade, String principal,
                      int students, ArrayList<String> dept, String collegeAddress, String collegeEmail,

                      String deptName, String hod, int staff, int deptStudents) {
        super(uniName, uniCode, numberColleges, course, director, uniAddress, contact, uniEmail,
                collegeName, collegeCode, grade, principal, students, dept, collegeAddress, collegeEmail);
        this.deptName = deptName;
        this.hod = hod;
        this.staff = staff;
        this.deptStudents = deptStudents;
    }

    public void displayDepartment() {
        System.out.println("Department:     [Name= " + deptName + ", HOD= " + hod +
                ", Staff= " + staff + ", Students= " + deptStudents + "]");
    }
}

class Professor extends Department {
    private String profName;
    private String designation;
    private String qualification;
    private long contactNumber;
    private String subject;

    public Professor() {}

    public Professor(String uniName, int uniCode, int numberColleges, ArrayList<String> course,
                     String director, String uniAddress, long contact, String uniEmail,

                     String collegeName, String collegeCode, String grade, String principal,
                     int students, ArrayList<String> dept, String collegeAddress, String collegeEmail,

                     String deptName, String hod, int staff, int deptStudents,

                     String profName, String designation, String qualification, long contactNumber, String subject) {
        super(uniName, uniCode, numberColleges, course, director, uniAddress, contact, uniEmail,
                collegeName, collegeCode, grade, principal, students, dept, collegeAddress, collegeEmail,
                deptName, hod, staff, deptStudents);
        this.profName = profName;
        this.designation = designation;
        this.qualification = qualification;
        this.contactNumber = contactNumber;
        this.subject = subject;
    }

    public void displayProfessor() {
        System.out.println("Professor :   [Name= " + profName + ", Designation= " + designation +
                ", Qualification= " + qualification + ", Contact= " + contactNumber +
                ", Subject= " + subject + "]");
    }
}

public class DriverUniversity {
    public static void main(String[] args) {
        ArrayList<String> deptList = new ArrayList<>();
        deptList.add("CSE");
        deptList.add("ENTC");
        deptList.add("CIVIL");
        deptList.add("MECH");

        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("ENGG");
        courseList.add("MBA");
        courseList.add("MCA");
        courseList.add("PHARM");

        Professor professor = new Professor(
                "SPPU", 1234, 850, courseList, "Mukesh Kumar", "Ganeshkhind Pune",
                 9876543210L, "sppu@gmail.com",

                "DY-Patil", "6834", "A+", "Mahesh Kumar", 6000, deptList,
                 "Pune", "dypatil@gmail.com",

                "Computer Science", "Suresh Kumar", 35, 1200,

                "Ramesh Kumar", "Senior Professor", "PhD", 9067854234L, "Maths"
        );

        professor.displayProfessor();
        System.out.println("      -----------------------       ");

        professor.displayDepartment();
        System.out.println("       -------------------------      ");

        professor.displayCollege();
        System.out.println("       -------------------------      ");

        professor.displayUniversity();
        System.out.println("        ------------------------       ");
    }
}
