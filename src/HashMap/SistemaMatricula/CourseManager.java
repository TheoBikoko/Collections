package HashMap.SistemaMatricula;

import java.util.HashMap;

public class CourseManager {
    HashMap<String, Student> matriculaCurs;

    public CourseManager() {
        matriculaCurs = new HashMap<>();
    }

    public void enrollStudent(Student student){
      if (matriculaCurs.containsKey(student.getId())) {
          System.out.println("This student is already enrolled");
      }
      else {
          matriculaCurs.put(student.getId(), student);
      }
    }

    public void unenrollStudent(String id){
        if (!matriculaCurs.containsKey(id)){
            System.out.println("This student is not enrolled");
        }
        else{
            matriculaCurs.remove(id);
        }
    }

    public Student findStudentById(String id){
        for (Student student: matriculaCurs.values()){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public void listAllStudents(){
            for (Student student: matriculaCurs.values()){
                System.out.println("Student ID: " + student.getId() + ", Name: " + student.getAge() + ", Age: " + student.getAge());
            }
        }
    }



