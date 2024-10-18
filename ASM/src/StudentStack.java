import java.util.Stack;

class StudentStack {
    Stack<Student> studentStack;

    public StudentStack() {
        studentStack = new Stack<>();
    }

    public boolean pushStudent(Student student) {
        studentStack.push(student);
        return true;
    }

    public boolean editStudent(String id, String newName, double newMarks) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setMarks(newMarks);
                found = true;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        return found;
    }

    public boolean deleteStudent(String id) {
        Stack<Student> tempStack = new Stack<>();
        boolean deleted = false;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (!student.getId().equals(id)) {
                tempStack.push(student);
            } else {
                deleted = true;
            }
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        return deleted;
    }

    public Student searchStudent(String id) {
        Stack<Student> tempStack = new Stack<>();
        Student foundStudent = null;

        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            if (student.getId().equals(id)) {
                foundStudent = student;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }

        return foundStudent;
    }

    public void displayStudents() {
        if (studentStack.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        Stack<Student> tempStack = new Stack<>();
        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            System.out.println(student);
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            studentStack.push(tempStack.pop());
        }
    }

    public boolean isEmpty() {
        return studentStack.isEmpty();
    }
}
