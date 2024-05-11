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
        return "Хогвардсчанин {" +
                "имя = '" + studentName + '\'' +
                ", мощность колдовства = " + studentMagicPower +
                ", расстояние трансгрессии = " + studentTransgressionDistance +
                '}';
    }

    public static void compareHogwartsStudentsByStockParams(Hogwarts student1, Hogwarts student2) {
        int student1Power = student1.studentMagicPower + student1.studentTransgressionDistance;
        int student2Power = student2.studentMagicPower + student2.studentTransgressionDistance;
        if (student1Power > student2Power) {
            System.out.printf("%s обладает большей мощностью магии, чем %s\n",
                    student1.getStudentName(), student2.getStudentName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s обладает большей мощностью магии, чем %s\n",
                    student2.getStudentName(), student1.getStudentName());
        } else {
            System.out.printf("%s и %s обладают равносильной мощностью магии\n",
                    student1.getStudentName(), student2.getStudentName());
        }
    }
}
