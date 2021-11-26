package task2;

public class Aspirant extends Student{
    private boolean researchWork;

    public boolean getResearchWork(){
        return researchWork;
    }

    Aspirant(String firstName, String lastName, String group, double averageMark, boolean researchWork) {
        super(firstName, lastName, group, averageMark);
        this.researchWork = researchWork;

    }

    @Override
    // в) Переопределить метод getScholarship() в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    public int getScholarship(){
        return super.getAverageMark() >= 5 ? 200 : 180;
    }
}
