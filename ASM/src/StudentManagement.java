public class StudentManagement {
    StudentStack studentStack;

    public StudentManagement() {
        studentStack = new StudentStack();
    }

    public void addStudent(Student student) {
        if (studentStack.pushStudent(student)) {
            System.out.println("Student added successfully!");
        }
    }

    public void editStudent(String id, String newName, double newMarks) {
        if (studentStack.editStudent(id, newName, newMarks)) {
            System.out.println("Student edited successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void deleteStudent(String id) {
        if (studentStack.deleteStudent(id)) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void searchStudent(String id) {
        Student student = studentStack.searchStudent(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayStudents() {
        studentStack.displayStudents();
    }
}
