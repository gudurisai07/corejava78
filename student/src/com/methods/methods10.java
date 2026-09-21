package com.methods;

import java.util.Scanner;

public class methods10 {

    // Instance variables
    int bugId;
    String applicationName;
    String bugtitle;
    String severity;
    String priority;
    String status;
    String assignedDeveloper;

    // Getter methods
    int getBugid() {
        return bugId;
    }

    String getApplicationName() {
        return applicationName;
    }

    String getBugTitle() {
        return bugtitle;
    }

    String getseverity() {
        return severity;
    }

    String getPriority() {
        return priority;
    }

    String getstatus() {
        return status;
    }

    String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    // Assign developer to the bug
    void assignToDeveloper(int bugid, String developerName) {

        if (this.bugId == bugid) {
            this.assignedDeveloper = developerName;
            updateStatus("In Development");
        } else {
            System.out.println("Bug ID does not match.");
        }
    }

    // Update bug status
    void updateStatus(String newstatus) {
        this.status = newstatus;
    }

    // Display bug details using getter methods
    void displayBugSummary() {

        System.out.println("\n===== BUG SUMMARY =====");
        System.out.println("Bug ID             : " + getBugid());
        System.out.println("Application Name   : " + getApplicationName());
        System.out.println("Bug Title          : " + getBugTitle());
        System.out.println("Severity           : " + getseverity());
        System.out.println("Priority           : " + getPriority());
        System.out.println("Status             : " + getstatus());
        System.out.println("Assigned Developer : " + getAssignedDeveloper());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create first object
        methods10 b1 = new methods10();

        // Take input from console
        System.out.print("Enter Bug ID: ");
        b1.bugId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Application Name: ");
        b1.applicationName = sc.nextLine();

        System.out.print("Enter Bug Title: ");
        b1.bugtitle = sc.nextLine();

        System.out.print("Enter Severity: ");
        b1.severity = sc.nextLine();

        System.out.print("Enter Priority: ");
        b1.priority = sc.nextLine();

        System.out.print("Enter Status: ");
        b1.status = sc.nextLine();

        System.out.print("Enter Assigned Developer: ");
        b1.assignedDeveloper = sc.nextLine();

        // Display initial details
        b1.displayBugSummary();

        // Assign developer
        System.out.print("\nEnter Bug ID to assign developer: ");
        int assignBugId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Developer Name: ");
        String developerName = sc.nextLine();

        b1.assignToDeveloper(assignBugId, developerName);

        // Display updated details
        System.out.println("\n===== UPDATED BUG DETAILS =====");
        b1.displayBugSummary();

        sc.close();
    }
}