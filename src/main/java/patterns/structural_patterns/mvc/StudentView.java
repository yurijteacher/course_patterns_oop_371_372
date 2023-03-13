package patterns.structural_patterns.mvc;

public class StudentView {

    public void printStudent(Long id, String firsName, String lastName, String email, String phone){

        System.out.println("Student{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}');
    }

}
