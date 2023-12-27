package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class C1704JsonWithJacksonClass {
    public static void main(String[] args) {
//        Students 객체 List 만들어서 넣기
        ObjectMapper mapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>();
        try {
            File myPath = Paths.get("src/C17ExceptionFileParsing/testdata2.json").toFile();
            JsonNode jsonNode = mapper.readTree(myPath);
            for (JsonNode stu : jsonNode.get("students")) {
                Student student = mapper.readValue(stu.toString(), Student.class);
                studentList.add(student);
            }
            System.out.println(studentList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student {
    String id;
    String name;

    String classNumber;
    String city;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student ID : " + id + "\n" + "Name : " + name + "\n" +
                "ClassNumber : " + classNumber + "\n" + "City : " + city + "\n";
    }
}