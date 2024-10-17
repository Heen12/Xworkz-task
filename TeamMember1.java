public class TeamMember1 {
    private String fullName;
    private String designation;
    private int id;
    private double salary;


    public TeamMember(String fullName, String designation, int id, double salary) {
        this.fullName = fullName;
        this.designation = designation;
        this.id = id;
        this.salary = salary;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void displayTeamMemberInfo() {
        System.out.println("Name: " + fullName);
        System.out.println("Designation: " + designation);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }
}
