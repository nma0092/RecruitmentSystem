import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RecruitmentSystem {
    private JFrame frame;
    private ArrayList<StaffHire> staffList;

    private JTextField txtVacancyNumber, txtDesignation, txtJobType, txtStaffName, txtJoiningDate,
    txtQualification, txtAppointedBy, txtSalary, txtWeeklyHours, txtWagesPerHour,
    txtWorkingHours, txtShifts;

    private JButton btnSetSalary, btnDisplayAll, btnSetShifts, btnTerminate, btnClear, btnAddFullTime, btnAddPartTime, btnDisplayNumber;

    public RecruitmentSystem() {
        staffList = new ArrayList<>();

        frame = new JFrame("Recruitment System");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Labels and TextFields

        JLabel lblVacancyNumber = new JLabel("Vacancy Number:");
        lblVacancyNumber.setBounds(20, 20, 120, 25);
        frame.add(lblVacancyNumber);

        JLabel lblDesignation = new JLabel("Designation:");
        lblDesignation.setBounds(20, 50, 120, 25);
        frame.add(lblDesignation);

        JLabel lblJobType = new JLabel("Job Type:");
        lblJobType.setBounds(20, 80, 120, 25);
        frame.add(lblJobType);

        JLabel lblStaffName = new JLabel("Staff Name:");
        lblStaffName.setBounds(20, 110, 120, 25);
        frame.add(lblStaffName);

        JLabel lblJoiningDate = new JLabel("Joining Date:");
        lblJoiningDate.setBounds(20, 140, 120, 25);
        frame.add(lblJoiningDate);

        JLabel lblQualification = new JLabel("Qualification:");
        lblQualification.setBounds(20, 170, 120, 25);
        frame.add(lblQualification);

        JLabel lblAppointedBy = new JLabel("Appointed By:");
        lblAppointedBy.setBounds(20, 200, 120, 25);
        frame.add(lblAppointedBy);

        JLabel lblSalary = new JLabel("Salary:");
        lblSalary.setBounds(20, 230, 120, 25);
        frame.add(lblSalary);

        JLabel lblWeeklyHours = new JLabel("Weekly Hours:");
        lblWeeklyHours.setBounds(20, 260, 120, 25);
        frame.add(lblWeeklyHours);

        JLabel lblWorkingHours = new JLabel("Working Hours:");
        lblWorkingHours.setBounds(20, 290, 120, 25);
        frame.add(lblWorkingHours);

        JLabel lblWagesPerHour = new JLabel("Wages/Hour:");
        lblWagesPerHour.setBounds(20, 320, 120, 25);
        frame.add(lblWagesPerHour);

        JLabel lblShifts = new JLabel("Shifts:");
        lblShifts.setBounds(20, 350, 120, 25);
        frame.add(lblShifts);
        
        // --- TextFields ---
        
        txtVacancyNumber = new JTextField();
        txtVacancyNumber.setBounds(150, 20, 100, 25);
        frame.add(txtVacancyNumber);

        txtDesignation = new JTextField();
        txtDesignation.setBounds(150, 50, 100, 25);
        frame.add(txtDesignation);

        txtJobType = new JTextField();
        txtJobType.setBounds(150, 80, 100, 25);
        frame.add(txtJobType);

        txtStaffName = new JTextField();
        txtStaffName.setBounds(150, 110, 100, 25);
        frame.add(txtStaffName);

        txtJoiningDate = new JTextField();
        txtJoiningDate.setBounds(150, 140, 100, 25);
        frame.add(txtJoiningDate);

        txtQualification = new JTextField();
        txtQualification.setBounds(150, 170, 100, 25);
        frame.add(txtQualification);

        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(150, 200, 100, 25);
        frame.add(txtAppointedBy);

        txtSalary = new JTextField();
        txtSalary.setBounds(150, 230, 100, 25);
        frame.add(txtSalary);

        txtWeeklyHours = new JTextField();
        txtWeeklyHours.setBounds(150, 260, 100, 25);
        frame.add(txtWeeklyHours);

        txtWagesPerHour = new JTextField();
        txtWagesPerHour.setBounds(150, 320, 100, 25);
        frame.add(txtWagesPerHour);
        
        txtWorkingHours = new JTextField();
        txtWorkingHours.setBounds(150, 290, 100, 25);
        frame.add(txtWorkingHours);

        txtShifts = new JTextField();
        txtShifts.setBounds(150, 350, 100, 25);
        frame.add(txtShifts);

        // Buttons
        btnAddFullTime = new JButton("Add Full Time Staff");
        btnAddFullTime.setBounds(300, 20, 200, 30);
        frame.add(btnAddFullTime);

        btnAddPartTime = new JButton("Add Part Time Staff");
        btnAddPartTime.setBounds(300, 60, 200, 30);
        frame.add(btnAddPartTime);

        btnDisplayAll = new JButton("Display All Staff");
        btnDisplayAll.setBounds(300, 100, 200, 30);
        frame.add(btnDisplayAll);

        btnSetSalary = new JButton("Set Salary - Full Time");
        btnSetSalary.setBounds(300, 140, 200, 30);
        frame.add(btnSetSalary);

        btnSetShifts = new JButton("Set Shifts - Part Time");
        btnSetShifts.setBounds(300, 180, 200, 30);
        frame.add(btnSetShifts);

        btnTerminate = new JButton("Terminate Part Time");
        btnTerminate.setBounds(300, 220, 200, 30);
        frame.add(btnTerminate);

        btnDisplayNumber = new JButton("Display Staff by Number");
        btnDisplayNumber.setBounds(300, 260, 200, 30);
        frame.add(btnDisplayNumber);

        btnClear = new JButton("Clear Fields");
        btnClear.setBounds(300, 300, 200, 30);
        frame.add(btnClear);

        // --- Action Listeners ---

        btnAddFullTime.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                String designation = txtDesignation.getText();
                String jobType = txtJobType.getText();
                String staffName = txtStaffName.getText();
                String joiningDate = txtJoiningDate.getText();
                String qualification = txtQualification.getText();
                String appointedBy = txtAppointedBy.getText();
                double salary = Double.parseDouble(txtSalary.getText());
                int weeklyHours = Integer.parseInt(txtWeeklyHours.getText());

                FullTimeStaffHire staff = new FullTimeStaffHire(vacancyNo, designation, jobType,
                        staffName, joiningDate, qualification, appointedBy, true, salary, weeklyHours);
                staffList.add(staff);
                JOptionPane.showMessageDialog(frame, "Full Time Staff Added.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnAddPartTime.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                String designation = txtDesignation.getText();
                String jobType = txtJobType.getText();
                String staffName = txtStaffName.getText();
                String joiningDate = txtJoiningDate.getText();
                String qualification = txtQualification.getText();
                String appointedBy = txtAppointedBy.getText();
                int workingHours = Integer.parseInt(txtWorkingHours.getText());
                double wagesPerHour = Double.parseDouble(txtWagesPerHour.getText());
                String shifts = txtShifts.getText();

                PartTimeStaffHire staff = new PartTimeStaffHire(vacancyNo, designation, jobType,
                        staffName, joiningDate, qualification, appointedBy, true, workingHours, wagesPerHour, shifts);
                staffList.add(staff);
                JOptionPane.showMessageDialog(frame, "Part Time Staff Added.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnDisplayAll.addActionListener(e -> {
            for (StaffHire staff : staffList) {
                staff.display();
            }
        });

        btnSetSalary.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                double salary = Double.parseDouble(txtSalary.getText());
                boolean found = false;
                for (StaffHire staff : staffList) {
                    if (staff.getVacancyNumber() == vacancyNo && staff instanceof FullTimeStaffHire) {
                        ((FullTimeStaffHire) staff).setSalary(salary);
                        JOptionPane.showMessageDialog(frame, "Salary updated.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Full Time Staff not found.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnSetShifts.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                String newShift = txtShifts.getText();
                boolean found = false;
                for (StaffHire staff : staffList) {
                    if (staff.getVacancyNumber() == vacancyNo && staff instanceof PartTimeStaffHire) {
                        ((PartTimeStaffHire) staff).setShifts(newShift);
                        JOptionPane.showMessageDialog(frame, "Shift updated.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Part Time Staff not found.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnTerminate.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                boolean found = false;
                for (StaffHire staff : staffList) {
                    if (staff.getVacancyNumber() == vacancyNo && staff instanceof PartTimeStaffHire) {
                        ((PartTimeStaffHire) staff).terminateStaff();
                        JOptionPane.showMessageDialog(frame, "Part Time Staff terminated.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Part Time Staff not found.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnDisplayNumber.addActionListener(e -> {
            try {
                int vacancyNo = Integer.parseInt(txtVacancyNumber.getText());
                boolean found = false;
                for (StaffHire staff : staffList) {
                    if (staff.getVacancyNumber() == vacancyNo) {
                        staff.display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Staff not found.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        btnClear.addActionListener(e -> {
            txtVacancyNumber.setText("");
            txtDesignation.setText("");
            txtJobType.setText("");
            txtStaffName.setText("");
            txtJoiningDate.setText("");
            txtQualification.setText("");
            txtAppointedBy.setText("");
            txtSalary.setText("");
            txtWeeklyHours.setText("");
            txtWorkingHours.setText("");
            txtWagesPerHour.setText("");
            txtShifts.setText("");
            JOptionPane.showMessageDialog(frame, "Fields cleared.");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RecruitmentSystem();
    }
}
        