/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;


public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<Student>(100);

    public StudentManagement() {
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String studentsByGroup() {
        String infoGroup = "";
        for (int i = 0; i <= students.size(); i++) {
            Student sStudent = students.get(i);
            infoGroup += sStudent.getInfo() + " ";

        }

        return infoGroup;
    }

    public void removeStudent(String id) {
        int i = 0;
        while (i <= students.size()) {
            Student rmStudent = students.get(i);
            if (id == rmStudent.getId()) {
                students.remove(i);
            } else {
                i++;
            }
        }
    }
}
