package patterns.structural_patterns.mvc;

public class StudentController {

    private StudentModel model;
    private StudentView view;
    public StudentController() {}
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void ModelAndView(){
        view.printStudent(model.getId(), model.getFirsName(), model.getLastName(), model.getEmail(), model.getPhone());
    }
}
