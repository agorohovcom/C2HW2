public class Hogwarts {
    private String studentName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String studentName, int magicPower, int transgressionDistance) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public Hogwarts(String studentName) {
        this.studentName = studentName;
        magicPower = (int) (Math.random() * 100);
        transgressionDistance = (int) (Math.random() * 100);
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
}
