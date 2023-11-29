package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentServiceImpl extends StudentService {
    private List<Stundent> students = new ArrayList<>();

    @Override
    public void addStudent(Stundent student) {
        students.add(student);
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(stundent -> stundent.getId() == id);
    }

    @Override
    public Stundent searchStudent(String name) {
        for (Stundent student : students) {
            if (student.getName().contains(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void sortedStudent() {
        Collections.sort(students, (s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
    }

    @Override
    public void showAllStudent() {
        for (Stundent student : students) {
            System.out.println(student);
        }
    }
}
