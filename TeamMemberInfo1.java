public class TeamMemberInfo1 {
    static TeamMember[] teamMembers = new TeamMember[8];

    public static void main(String[] args) {
        TeamMember member1 = new TeamMember("Michael", "Manager", 101, 75000);
        TeamMember member2 = new TeamMember("Jessica", "Developer", 102, 65000);
        TeamMember member3 = new TeamMember("David", "Designer", 103, 60000);
        TeamMember member4 = new TeamMember("Sarah", "Analyst", 104, 70000);
        TeamMember member5 = new TeamMember("Daniel", "Sales", 105, 55000);
        TeamMember member6 = new TeamMember("Emily", "HR", 106, 60000);
        TeamMember member7 = new TeamMember("Sophia", "Support", 107, 50000);
        TeamMember member8 = new TeamMember("James", "Marketing", 108, 58000);

        saveTeamMember(member1);
        saveTeamMember(member2);
        saveTeamMember(member3);
        saveTeamMember(member4);
        saveTeamMember(member5);
        saveTeamMember(member6);
        saveTeamMember(member7);
        saveTeamMember(member8);

        System.out.println("\nTeam Member Details:");
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i] != null) {
                teamMembers[i].displayTeamMemberInfo();
            }
        }

        TeamMember foundByName = findTeamMemberByName("David");
        if (foundByName != null) {
            foundByName.displayTeamMemberInfo();
        } else {
            System.out.println("Team member not found by name.");
        }

        TeamMember foundById = findTeamMemberById(106);
        if (foundById != null) {
            foundById.displayTeamMemberInfo();
        } else {
            System.out.println("Team member not found by ID.");
        }

        boolean updated = updateTeamMemberById(102, "Jessica", "Senior Developer", 70000);
        System.out.println(updated ? "Team member updated successfully." : "Update failed.");

        foundById = findTeamMemberById(102);
        if (foundById != null) {
            foundById.displayTeamMemberInfo();
        }
    }

    public static boolean saveTeamMember(TeamMember member) {
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i] == null) {
                teamMembers[i] = member;
                System.out.println("Team member saved");
                return true;
            }
        }
        System.out.println("No space in the array");
        return false;
    }

    public static TeamMember findTeamMemberByName(String name) {
        for (TeamMember member : teamMembers) {
            if (member != null && member.getFullName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public static TeamMember findTeamMemberById(int id) {
        for (TeamMember member : teamMembers) {
            if (member != null && member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public static boolean updateTeamMemberById(int id, String name, String designation, double salary) {
        TeamMember member = findTeamMemberById(id);
        if (member != null) {
            member.setFullName(name);
            member.setDesignation(designation);
            member.setSalary(salary);
            return true;
        }
        return false;
    }
}

