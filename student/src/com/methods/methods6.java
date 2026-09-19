package com.methods;

import java.util.Scanner;

// 3. Return type + no parameters
// Student Academic Details

public class methods6 {

    static Scanner sc = new Scanner(System.in);
    int getStudentRollNo() {

        System.out.println("Enter student roll no:");
        int rollNo = sc.nextInt();
        return rollNo;
    }

    String getStudentName() {

        System.out.println("Enter student name:");
        String name = sc.next();
        return name;
    }

    int getStudentAge() {

        System.out.println("Enter student age:");
        int age = sc.nextInt();
        return age;
    }

    int javaMarks() {

        System.out.println("Enter Java marks:");
        int java = sc.nextInt();

        if (java >= 0 && java <= 100) {
            return java;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    int htmlMarks() {

        System.out.println("Enter HTML marks:");
        int html = sc.nextInt();

        if (html >= 0 && html <= 100) {
            return html;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    int sqlMarks() {

        System.out.println("Enter SQL marks:");
        int sql = sc.nextInt();

        if (sql >= 0 && sql <= 100) {
            return sql;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    int cssMarks() {

        System.out.println("Enter CSS marks:");
        int css = sc.nextInt();

        if (css >= 0 && css <= 100) {
            return css;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    int javascriptMarks() {

        System.out.println("Enter JavaScript marks:");
        int javascript = sc.nextInt();

        if (javascript >= 0 && javascript <= 100) {
            return javascript;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    boolean studentAttendance() {

        System.out.println("Is student present? Enter true or false:");
        boolean isPresent = sc.nextBoolean();

        return isPresent;
    }

    int projectMarks() {

        System.out.println("Enter project marks:");
        int project = sc.nextInt();

        if (project >= 0 && project <= 100) {
            return project;
        } else {
            System.out.println("Out of range marks");
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        methods6 m = new methods6();

        int r = m.getStudentRollNo();
        String n = m.getStudentName();
        int a = m.getStudentAge();

        int j = m.javaMarks();
        int s = m.sqlMarks();
        int h = m.htmlMarks();
        int c = m.cssMarks();
        int p = m.projectMarks();
        int js = m.javascriptMarks();

        boolean attendance = m.studentAttendance();

        int totalMarks = j + s + h + c + p + js;
        double averageMarks = totalMarks / 6.0;

       
        System.out.println("-------$(student details)$-----");
        System.out.println("Student Roll No : " + r);
        System.out.println("Student Name    : " + n);
        System.out.println("Student Age     : " + a);
        System.out.println("Java Marks      : " + j);
        System.out.println("SQL Marks       : " + s);
        System.out.println("HTML Marks      : " + h);
        System.out.println("CSS Marks       : " + c);
        System.out.println("Project Marks   : " + p);
        System.out.println("JavaScript Marks: " + js);
        System.out.println("Attendance      : " + attendance);

        System.out.println("Total Marks     : " + totalMarks);
        System.out.println("Average Marks   : " + averageMarks);

        System.out.println("Main method ended");
    }
}