package utilities;

import employees.Developer;
import employees.Manager;

public class AssignmentMain {
	public static void main(String[] args) {
        Manager manager = new Manager("Mega", 1, 100000, "HR");
        Developer developer = new Developer("Zara", 2, 85000, "Java");

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("Manager's Bonus: " + EmployeeUtilities.calculateBonus(manager));
        System.out.println("Developer's Bonus: " + EmployeeUtilities.calculateBonus(developer));
    }

}
