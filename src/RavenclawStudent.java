public class RavenclawStudent extends Hogwarts {
    // ум, мудрость, остроумие, творчество
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creative;

    public RavenclawStudent(String studentName, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wittiness, int creative) {
        super(studentName, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
    }

    public RavenclawStudent(String studentName) {
        super(studentName);
        intelligence = getRandomSkillLevel();
        wisdom = getRandomSkillLevel();
        wittiness = getRandomSkillLevel();
        creative = getRandomSkillLevel();
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "studentName='" + getStudentName() + '\'' +
                ", magicPower=" + getStudentMagicPower() +
                ", transgressionDistance=" + getStudentTransgressionDistance() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creative=" + creative +
                '}';
    }

    public static void compareRavenclawStudents(RavenclawStudent student1, RavenclawStudent student2) {
        int student1Power = student1.intelligence + student1.wisdom + student1.wittiness + student1.creative;
        int student2Power = student2.intelligence + student2.wisdom + student2.wittiness + student1.creative;
        if (student1Power > student2Power) {
            System.out.printf("%s лучший Когтевранец, чем %s\n",
                    student1.getStudentName(), student2.getStudentName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s лучший Когтевранец, чем %s\n",
                    student2.getStudentName(), student1.getStudentName());
        } else {
            System.out.printf("%s и %s - равносильные Когтевранцы\n",
                    student1.getStudentName(), student2.getStudentName());
        }
    }
}
