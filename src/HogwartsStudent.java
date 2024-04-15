public class HogwartsStudent {
    private String studentName;
    // мощность колдовства, расстояние трансгрессии
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public HogwartsStudent(String studentName) {
        this.studentName = studentName;
        magicPower = getRandomSkillLevel();
        transgressionDistance = getRandomSkillLevel();
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

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "studentName='" + studentName + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
