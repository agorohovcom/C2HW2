public class GryffindorStudent extends HogwartsStudent {
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
        return "GryffindorStudent{" +
                "studentName='" + getStudentName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", nobleness=" + nobleness +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
