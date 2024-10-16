class TeamMember {
    private String fullName;
    private String jobTitle;
    private int memberId;
    private double salary;

    public TeamMember(String fullName, String jobTitle, int memberId, double salary) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.memberId = memberId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + fullName + ", Title: " + jobTitle + ", ID: " + memberId + ", Salary: $" + salary);
    }

    public String getFullName() {
        return fullName;
    }
}
