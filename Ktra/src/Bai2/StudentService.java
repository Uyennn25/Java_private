/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.List;

interface StudentService {
     void addStudent(Stundent stundent);

    void deleteStudent(int id);

    List<Stundent> searchStudent(String name);

    void sortedStudent();

    void showAllStudent();
    
}
