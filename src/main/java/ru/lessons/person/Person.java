package ru.lessons.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Person {
    String name;
    int age;
    String address;

    public abstract void introduceYourself();
}
