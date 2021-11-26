package task2;

public class Main {
    public static void main(String[] args) {
        // б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        Student studentTest = new Aspirant("Alexey", "Ivanov", "Pi-49", 4.4,true);
        System.out.println("Amount of scholarship equals " + studentTest.getScholarship());

        Student a1 = new Aspirant("Aspirant1", "Best", "SI-27", 5,true),
                a2 = new Aspirant("Aspirant2", "Average", "AT-11", 4.3,true),
                a3 = new Aspirant("Aspirant3", "Worst", "AT-11", 2.1,true),

                s1 = new Student("Student1", "Best", "AT-14", 5),
                s2 = new Student("Student2", "Average", "Pi-49", 4.5),
                s3 = new Student("Student3", "Worst", "AT-14", 2.9);

        // г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        Student[] students = { a1, a2, a3, s1, s2, s3 };

        // Вызвать метод getScholarship() для каждого элемента массива.
        for (Student s : students){
            System.out.println( (s instanceof Aspirant ? "Aspirant " : "Student ") + s.getFirstName()  + " " +
                    s.getLastName() + " from group " + s.getGroup() + " with average mark "  + s.getAverageMark() +
                    " gets scholarship " +  s.getScholarship());
        }
    }
}
