package oop.application;

import oop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.SetName("Ali Ikbal");

        Company.Employee employee = company.new Employee();
        employee.setName("Ali");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
