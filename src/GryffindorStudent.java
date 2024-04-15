public class GryffindorStudent extends Hogwarts {
    // благородство, честь, храбрость
    private int nobleness;
    private int honor;
    private int bravery;

    public GryffindorStudent(String studentName, int magicPower, int transgressionDistance, int nobleness, int honor, int bravery) {
        super(studentName, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public GryffindorStudent(String studentName) {
        super(studentName);
        nobleness = getRandomSkillLevel();
        honor = getRandomSkillLevel();
        bravery = getRandomSkillLevel();
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Грифиндорец {" +
                "имя = '" + getStudentName() + '\'' +
                ", мощность колдовства = " + getStudentMagicPower() +
                ", расстояние трансгрессии = " + getStudentTransgressionDistance() +
                ", благородство = " + nobleness +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                '}';
    }

    public static void compareGryffindorStudents(GryffindorStudent student1, GryffindorStudent student2) {
        int student1Power = student1.nobleness + student1.honor + student1.bravery;
        int student2Power = student2.nobleness + student2.honor + student2.bravery;
        if (student1Power > student2Power) {
            System.out.printf("%s лучший Грифиндорец, чем %s\n",
                    student1.getStudentName(), student2.getStudentName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s лучший Грифиндорец, чем %s\n",
                    student2.getStudentName(), student1.getStudentName());
        } else {
            System.out.printf("%s и %s - равносильные Грифиндорцы\n",
                    student1.getStudentName(), student2.getStudentName());
        }
    }
}
