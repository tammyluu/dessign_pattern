package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new IndividualEmployee("Toto", "Developer");
        Employee emp2 = new IndividualEmployee("Tata", "Tester");
        Employee emp3 = new IndividualEmployee("Lyly", "Devops");

        Manager manager1 = new Manager("Lila", "Team Lead");
        Manager manager2 = new Manager("Coco", "Project Manager");

        // Ajout des subordonnés au manager 1
        manager1.addSubordinate(emp1);
        manager1.addSubordinate(emp2);

        // Ajout des subordonnés au manager 2
        manager2.addSubordinate(manager1);
        manager2.addSubordinate(emp3);


        System.out.println("--- Organization Hierarchy: \n");
        manager2.showDetail();
    }
}
