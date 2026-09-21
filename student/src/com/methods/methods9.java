package com.methods;
public class methods9 {

    // Instance variables
    int bugId;
    String applicationName;
    String bugtitle;
    String severity;
    String priority;
    String status;
    String assignedDeveloper;

    // Getter for Bug ID
    int getBugid() {
        return bugId;
    }

    // Getter for Application Name
    String getApplicationName() {
        return applicationName;
    }

    // Getter for Bug Title
    String getBugTitle() {
        return bugtitle;
    }

    // Getter for Severity
    String getseverity() {
        return severity;
    }

    // Getter for Priority
    String getPriority() {
        return priority;
    }

    // Getter for Status
    String getstatus() {
        return status;
    }

    // Getter for Assigned Developer
    String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    // Assign bug to developer
    void assignToDeveloper(int bugid, String developerName) {

        // Check whether given bug ID matches this object
        if (this.bugId == bugid) {

            // Assign developer
            this.assignedDeveloper = developerName;

            // Update status
            updateStatus("In Development");
        }
    }

    // Update bug status
    void updateStatus(String newstatus) {
        this.status = newstatus;
    }

    // Display complete bug details using getters
    void displayBugSummary() {

        System.out.println("Bug ID              : " + getBugid());
        System.out.println("Application Name    : " + getApplicationName());
        System.out.println("Bug Title           : " + getBugTitle());
        System.out.println("Severity            : " + getseverity());
        System.out.println("Priority            : " + getPriority());
        System.out.println("Status              : " + getstatus());
        System.out.println("Assigned Developer  : " + getAssignedDeveloper());
    }

    public static void main(String[] args) {

        // Create first BugTracker object
        methods9 b1 = new methods9();

        // Initialize bug details using object reference
        b1.bugId = 101;
        b1.applicationName = "Banking Application";
        b1.bugtitle = "Login Button Not Working";
        b1.severity = "High";
        b1.priority = "High";
        b1.status = "Open";
        b1.assignedDeveloper = "Not Assigned";

        // Display initial bug details
        System.out.println("===== INITIAL BUG DETAILS =====");
        b1.displayBugSummary();

        // Assign bug to developer
        b1.assignToDeveloper(101, "Sai");

        // Display updated details
        System.out.println("\n===== AFTER ASSIGNMENT =====");
        b1.displayBugSummary();


        // Create second object
        methods9 b2 = new methods9();

        // Different values for second object
        b2.bugId = 102;
        b2.applicationName = "E-Commerce Application";
        b2.bugtitle = "Payment Failure";
        b2.severity = "Critical";
        b2.priority = "High";
        b2.status = "Open";
        b2.assignedDeveloper = "Not Assigned";

        // Display second bug
        System.out.println("\n===== SECOND BUG =====");
        System.out.println("===== INITIAL BUG DETAILS =====");
        b1.displayBugSummary();

        // Assign bug to developer
        b2.assignToDeveloper(102, "Satya");

        // Display updated details
        System.out.println("\n===== AFTER ASSIGNMENT =====");
        b1.displayBugSummary();
        
        b2.displayBugSummary();
    }
}