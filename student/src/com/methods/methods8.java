package com.methods;

import java.util.Scanner;

// Method with Return Type + Parameters
// Employee Salary Processing

public class methods8 {

    static Scanner sc = new Scanner(System.in);

    double basicSalary(double basic) {
        return basic;
    }

    double hra(double basic) {
        double hra = basic * 20 / 100;
        return hra;
    }

    double da(double basic) {
        double da = basic * 10 / 100;
        return da;
    }

    double travelAllowance(double basic) {
        double travel = basic * 5 / 100;
        return travel;
    }

    double medicalAllowance(double basic) {
        double medical = basic * 5 / 100;
        return medical;
    }

    double bonus(double basic) {
        double bonus = basic * 10 / 100;
        return bonus;
    }

    double pf(double basic) {
        double pf = basic * 12 / 100;
        return pf;
    }

    double professionalTax(double grossSalary) {
        double tax = grossSalary * 5 / 100;
        return tax;
    }

    double calculateGrossSalary(double basic, double hra, double da,
                                double travel, double medical, double bonus) {

        double gross = basic + hra + da + travel + medical + bonus;
        return gross;
    }

    double calculateNetSalary(double grossSalary, double pf,
                              double professionalTax) {

        double netSalary = grossSalary - pf - professionalTax;
        return netSalary;
    }

    public static void main(String[] args) {

        System.out.println("===== EMPLOYEE SALARY SYSTEM =====");

        methods8 e = new methods8();

        System.out.println("Enter Basic Salary:");
        double basicInput = sc.nextDouble();

        double basic = e.basicSalary(basicInput);

        double hra = e.hra(basic);
        double da = e.da(basic);
        double travel = e.travelAllowance(basic);
        double medical = e.medicalAllowance(basic);
        double bonus = e.bonus(basic);

        double grossSalary = e.calculateGrossSalary(
                basic, hra, da, travel, medical, bonus
        );

        double pf = e.pf(basic);

        double professionalTax = e.professionalTax(grossSalary);

        double netSalary = e.calculateNetSalary(
                grossSalary, pf, professionalTax
        );

        System.out.println();
        System.out.println("===== SALARY DETAILS =====");

        System.out.println("Basic Salary       : " + basic);
        System.out.println("HRA                : " + hra);
        System.out.println("DA                 : " + da);
        System.out.println("Travel Allowance   : " + travel);
        System.out.println("Medical Allowance  : " + medical);
        System.out.println("Bonus              : " + bonus);
        System.out.println("Gross Salary       : " + grossSalary);
        System.out.println("PF                 : " + pf);
        System.out.println("Professional Tax   : " + professionalTax);
        System.out.println("Net Salary         : " + netSalary);

        System.out.println("==========================");
    }
}