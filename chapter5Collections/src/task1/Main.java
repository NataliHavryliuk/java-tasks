package task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        // добавим в список ряд элементов
        students.add(new Student("Smart", "PI-45", 4, 4.9));
        students.add(new Student("Stupid", "TT-18", 1, 2.0));
        students.add(new Student("lessAverage", "AT-46", 2, 2.9));
        students.add(new Student("Good", "SI-28", 4, 4.0));
        students.add(new Student("Good2", "SI-29", 3, 4.2));

        ArrayList<Student> successfulStudents  =  moveStudentsUp(students);
        printStudents(successfulStudents, 5);
    }

    public static ArrayList<Student> moveStudentsUp(ArrayList<Student> students){
        Iterator<Student> studentIterator = students.iterator();//создаем итератор

        while(studentIterator.hasNext()) {//до тех пор, пока в списке есть элементы
            Student nextStudent = studentIterator.next();//получаем следующий элемент
                if (nextStudent.getAverageMark() <= 3){
                    studentIterator.remove();
                    System.out.println("Student " + nextStudent.getName() + " stays on current course");
                }
                else{
                    nextStudent.setCourse(nextStudent.getCourse() + 1);
                    System.out.println("Student " + nextStudent.getName() + " was moved on " + nextStudent.getCourse() + " course");
                }
        }
        return students;
    }

    public static void printStudents(ArrayList<Student> students, int course){
        System.out.println("Students on course " + course + " are: ");
        for(Student student : students){
            if (student.getCourse() == course)
                System.out.println(student.getName());
        }
    }
}
