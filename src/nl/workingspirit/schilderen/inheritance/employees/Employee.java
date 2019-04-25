package nl.workingspirit.schilderen.inheritance.employees;

import nl.workingspirit.schilderen.inheritance.Person;

public class Employee extends Person {


    public void foo() {
        System.out.println(this.telnr);

        Person e = new Employee();
//        System.out.println(e.telnr); // vout
    }
}
