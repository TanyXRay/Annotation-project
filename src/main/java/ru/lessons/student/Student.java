package ru.lessons.student;

import lombok.*;
import ru.lessons.person.Person;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString(callSuper = true)
public class Student extends Person {
    private String faculty;

    @Builder
    public Student(String name, int age, String address, String faculty) {
        super(name, age, address);
        this.faculty = faculty;
    }

    @Override
    public void introduceYourself() {
        System.out.println("My name is " + getName() + " and my faculty is " + faculty);
    }
}
