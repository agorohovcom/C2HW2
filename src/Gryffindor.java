public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int magicPower, int transgressionDistance, int nobleness, int honor, int bravery) {
        super(studentName, magicPower, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
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
}
