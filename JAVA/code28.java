 class Employee {

    String name;
    int id;

    void displayEmployee() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department    : " + department);
    }

    class Team {

        int members;

        Team(int members) {
            this.members = members;
        }

        void showTeam() {
            System.out.println("Team Members  : " + members);
        }
    }
}

public class code28 {

    public static void main(String[] args) {

        Manager m = new Manager("Sanjay", 101, "IT");

        Manager.Team t = m.new Team(8);

        m.displayManager();
        t.showTeam();
    }
} 
    

