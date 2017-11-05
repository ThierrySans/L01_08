package Main;

import java.util.ArrayList;

public class Admin extends User {

    Admin(String id, String pw){
        SetLoginID(id);
        SetLoginPW(pw);
        SetType('a');
        System.out.println();
        Data.AddUser(id,pw);
    }

    static ArrayList<Student> studentList;

    public void createStudent(String fname, String lname, int stid){
        Student newStudent = new Student(fname, lname, stid);
        studentList.add(newStudent);
    }

    public void removeStudent(int stid){
        for (Student theStudent : studentList){
            if(stid == theStudent.studentId) {
                Data.RemoveUser(theStudent.getLoginID());
                studentList.remove(theStudent);
            }
        }

    }
}