package interface_reforc;

/**
 * Created by dcatalans on 05/10/16.
 */
public interface Student {


    public Student getStudent(Student student);

    public void removeStudent(Student student);

    public void addStudent(Student student);

    void contractStudent(Student student);

}

class Substudent implements Student {

    @Override
    public Student getStudent(Student student) {
        return null;
    }

    @Override
    public void removeStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {
    }

    @Override
    public void contractStudent(Student student) {

    }
}

class Main{
    public static void main(String[] args) {
        Student s = new Substudent();
        s.addStudent(new Substudent());
    }
}
