public class HufflepuffStudent extends HogwartsStudent {
    // трудолюбие, верность, честность
    private int hardworking;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String studentName, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public HufflepuffStudent(String studentName) {
        super(studentName);
        hardworking = getRandomSkillLevel();
        loyalty = getRandomSkillLevel();
        honesty = getRandomSkillLevel();
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "studentName='" + getStudentName() + '\'' +
                ", magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
