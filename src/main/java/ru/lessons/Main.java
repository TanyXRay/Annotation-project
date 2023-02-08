package ru.lessons;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import ru.lessons.student.Student;
import ru.lessons.student.list.StudentList;

public class Main {
    private static ObjectMapper mapper = new ObjectMapper();
    private static StudentList list = new StudentList();

    @SneakyThrows
    public static void main(String[] args) {
        Student firstStudent = Student.builder()
                .name("Jason")
                .age(18)
                .address("Pushkina street, 20")
                .faculty("biology")
                .build();

        Student secondStudent = Student.builder()
                .name("Mila")
                .age(23)
                .address("Svetlova street, 42")
                .faculty("physical - mathematical")
                .build();


        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        list.addStudent(firstStudent);
        list.addStudent(secondStudent);
        String jsonString = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(list);
        System.out.println(jsonString);
    }
}