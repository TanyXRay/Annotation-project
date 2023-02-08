package ru.lessons.student.list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import ru.lessons.student.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Data
@JsonPropertyOrder({"count", "list"})
@JsonRootName(value = "STUDENTS")
public class StudentList {
    Map<Student, Integer> list;
    int count;
    private static final Random RANDOM = new Random();

    public StudentList() {
        this.list = new HashMap<>();
        this.count = 1;
    }

    public void addStudent(Student student) {
        int id = RANDOM.nextInt(1000);
        list.put(student, id);
        if (list.size() != 1) {
            count++;
        }
    }

    @JsonAnyGetter
    public Map<Student, Integer> getList() {
        return list;
    }
}
