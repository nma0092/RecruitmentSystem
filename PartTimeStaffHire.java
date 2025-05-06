public class PartTimeStaffHire extends StaffHire {
// Attributes
private int workingHours;
private double wagesPerHour;
private String shifts;
private boolean terminated;


// Constructor
public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, int workingHours, double wagesPerHour, String shifts) {
super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
this.workingHours = workingHours;
this.wagesPerHour = wagesPerHour;
this.shifts = shifts;
this.terminated = false; //always false initially

}

// Getter methods
public int getWorkingHours() {
    return workingHours;
}

public double getWagesPerHour() {
    return wagesPerHour;
}
  
public String getShifts() {
    return shifts;
}

public boolean isTerminated() {
    return terminated;
}

// Setter for shifts
public void setShifts(String shifts) {
if (isJoined()) { // Only allow shift change if staff has joined
    this.shifts = shifts;
    System.out.println("Shift has been updated successfully.");
} else {
    System.out.println("Cannot change shift - staff has not joined yet.");
   }
}

// Method to terminate staff
public void terminateStaff() {
if (terminated) {
System.out.println("Staff is already terminated.");
} else {
setStaffName(""); // empty strings for staff details
setJoiningDate("");
setQualification("");
setAppointedBy("");
setJoined(false);
terminated = true;
System.out.println("Staff has been terminated successfully.");

   }
}

// Overriden display method
@Override 
public void display() {
super.display(); // call StaffHire display first
if (getWorkingHours()>0) { // if working hours is set
    System.out.println("Wages per Hour: " + wagesPerHour);
    System.out.println("Working Hours per Day: " + workingHours);
    System.out.println("Shifts: " + shifts);
    System.out.println("Terminated: " + terminated);
    double incomePerDay = wagesPerHour * workingHours;
    System.out.println("Income Per Day: " + incomePerDay);
   } 
  }
}
