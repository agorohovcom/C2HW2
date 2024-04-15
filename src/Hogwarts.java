public class Hogwarts {
    private String studentName;
    // мощность колдовства, расстояние трансгрессии
    private int studentMagicPower;
    private int studentTransgressionDistance;

    public Hogwarts(String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.studentMagicPower = magicPower;
        this.studentTransgressionDistance = transgressionDistance;
    }

    public Hogwarts(String studentName) {
        this.studentName = studentName;
        studentMagicPower = getRandomSkillLevel();
        studentTransgressionDistance = getRandomSkillLevel();
    }

    protected int getRandomSkillLevel() {
        return (int) (Math.random() * 100);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMagicPower() {
        return studentMagicPower;
    }

    public void setStudentMagicPower(int studentMagicPower) {
        this.studentMagicPower = studentMagicPower;
    }

    public int getStudentTransgressionDistance() {
        return studentTransgressionDistance;
    }

    public void setStudentTransgressionDistance(int studentTransgressionDistance) {
        this.studentTransgressionDistance = studentTransgressionDistance;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "studentName='" + studentName + '\'' +
                ", magicPower=" + studentMagicPower +
                ", transgressionDistance=" + studentTransgressionDistance +
                '}';
    }
}
