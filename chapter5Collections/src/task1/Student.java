package task1;

public class Student {
    private String name, group;
    private int course;
    private double averageMark;

    public String getName(){
        return name;
    }

    public String getGroup(){
        return group;
    }

    public int getCourse(){
        return course;
    }

    public double getAverageMark(){
        return averageMark;
    }
    public void setCourse(int course){
        this.course = course;
    }

    Student(String name, String group, int course, double averageMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageMark = averageMark;
    }

}
