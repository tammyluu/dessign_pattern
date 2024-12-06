package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetail() {
        System.out.println("Manager: Name = " + name + ", Position = " + position);
        System.out.println("  Subordinates included:");
        for (Employee subordinate : subordinates) {
            System.out.println("----> team of " + name +" "+ position);
            subordinate.showDetail();
        }

    }
}
