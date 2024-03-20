package org.example;

import java.util.HashMap;
import java.util.Map;

public class School {

    private Map<String,Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student findById(String id) {
        return students.get(id);
    }

    public boolean removeStudent(String id) {
        return (students.remove(id) != null);
    }

    @Override
    public String toString() {
        String result = "School{" +
                "students= {\n";
        for(Student student : students.values()) {
            result += student.toString() + "\n";
        }
        result += "}}";
        return result;
    }

    public String retrieveAllCoursesForStudent(String id) {
        String result = "";
        Student student = findById(id);
        if (student != null) {
            result += "Courses for Student with id " + id + ":\n";
            for (Course course: student.getCourses()) {
                result += course.toString() + "\n";
            }
        }
        return result;
    }
}
