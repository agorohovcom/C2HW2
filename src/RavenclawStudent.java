public class RavenclawStudent extends HogwartsStudent {
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
                ", magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creative=" + creative +
                '}';
    }
}
