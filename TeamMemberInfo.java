public class TeamMemberInfo {
    static TeamMember[] teamMembers = new TeamMember[8];

    public static void main(String[] args) {
        save(new TeamMember("Michael", "Manager", 101, 75000));
        save(new TeamMember("Jessica", "Developer", 102, 65000));
        save(new TeamMember("David", "Designer", 103, 60000));
        save(new TeamMember("Sarah", "Analyst", 104, 70000));
        save(new TeamMember("Daniel", "Sales", 105, 55000));
        save(new TeamMember("Emily", "HR", 106, 60000));
        save(new TeamMember("Sophia", "Support", 107, 50000));
        save(new TeamMember("James", "Marketing", 108, 58000));
        
        // Display all saved team members
        for (TeamMember member : teamMembers) {
            if (member != null) {
                member.displayInfo();
            }
        }
    }

    public static boolean save(TeamMember member) {
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i] == null) {
                teamMembers[i] = member;
                System.out.println("Saved: " + member.getFullName());
                return true;
            }
        }
        System.out.println("No space to save: " + member.getFullName());
        return false;
    }
}
