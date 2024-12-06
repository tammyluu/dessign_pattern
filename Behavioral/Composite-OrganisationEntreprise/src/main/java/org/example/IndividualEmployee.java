package org.example;

public class IndividualEmployee implements Employee {
    private String name;
    private String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }


    @Override
    public void showDetail() {
        System.out.println("Individual Employee: Name = " + name + ", Position = " + position);

    }
}