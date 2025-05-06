public class FullTimeStaffHire extends StaffHire {
// Attributes
private double salary;
private int weeklyFractionalHours;

// Constructor
public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate,
    String qualification, String appointedBy, boolean joined, double salary, int weeklyFractionalHours) {
super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
this.salary = salary;
this.weeklyFractionalHours = weeklyFractionalHours;

    }
// Getter methods
public double getSalary() {
    return salary;
}

public int getWeeklyFractionalHours() {
    return weeklyFractionalHours;
}

// Setter for salary
public void setSalary(double salary) {
if (isJoined()) { //check if staff is already appointed
    this.salary = salary;
    System.out.println("Salary has been updated successfully.");
} else {
    System.out.println("No staff appointed yet to set salary.");
  }
}

// Setter for weeklyFractionalHours
public void setWeeklyFractionalHours(int weeklyFractionalHours) {
    this.weeklyFractionalHours = weeklyFractionalHours;
    System.out.println("Weekly fractional hours updated successfully.");

}

// Overridden display method
@Override
public void display() {
    super.display(); // call display of StaffHire
    if (isJoined()) {
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Fractional Hours: " + weeklyFractionalHours);
    }

   }

}
