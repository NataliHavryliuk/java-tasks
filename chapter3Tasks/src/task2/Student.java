package task2;

// а) Класс Student содержит переменные: String firstName, lastName, group.
// А также, double averageMark, содержащую среднюю оценку.
public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGroup(){
        return group;
    }
    public double getAverageMark(){
        return averageMark;
    }

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    // в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
    // Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
    public int getScholarship(){
        return averageMark >= 5 ? 100 : 80;
    }
}
