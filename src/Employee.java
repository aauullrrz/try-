public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;
    public static final double BONUS_RATE = 0.1;

    public Employee(String name, int id, double salary, String department) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setDepartment(department);
    }

    public void printDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }

    public void applyBonus() {
        setSalary(salary + calculateBonus());
        System.out.println("Bonus applied! New salary : " + salary);
    }

    private double calculateBonus() {
        return salary * BONUS_RATE;
    }

    public void updateDepartment(String newDepartment) {
        setDepartment(newDepartment);
        System.out.println("Department update to : " + department);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}  class Project {
        public String projectName;
        public String projectDeadline;
        public Employee projectLeader;
        public double budget;

        public Project(String projectName, String projectDeadline, Employee projectLeader, double budget){
            this.projectName = projectName;
            this.projectDeadline = projectDeadline;
            this.projectLeader = projectLeader;
            this.budget = budget;
        }
        public void printProjectDetails(){
            System.out.println("Project name : " + projectName);
            System.out.println("Project deadline : " + projectDeadline);
            System.out.println("Budget : " + budget);
            projectLeader.printDetails();
        }
        public void updateBudget (double newBudget){
            budget = newBudget;
            System.out.println("Budget update to : "+ budget);
        }
    }
    class Client {
        public String clientName;
        public String clientEmail;
        public Project project;

        public Client(String clientName, String clientEmail, Project project){
            this.clientName = clientName;
            this.clientEmail = clientEmail;
            this.project = project;
        }
        public void printClientDetails(){
            System.out.println("Client name : " + clientName);
            System.out.println("Client email : "+ clientEmail);
            project.printProjectDetails();
        }
    }
    class MainApp {
    }