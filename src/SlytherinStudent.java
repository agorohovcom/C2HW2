public class SlytherinStudent extends Hogwarts {
    // хитрость, решительность, амбициозность, находчивость, жажда власти
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String studentName, int magicPower, int transgressionDistance,
                            int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public SlytherinStudent(String studentName) {
        super(studentName);
        cunning = getRandomSkillLevel();
        determination = getRandomSkillLevel();
        ambition = getRandomSkillLevel();
        resourcefulness = getRandomSkillLevel();
        lustForPower = getRandomSkillLevel();
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизеринец {" +
                "имя = '" + getStudentName() + '\'' +
                ", мощность колдовства = " + getStudentMagicPower() +
                ", расстояние трансгрессии = " + getStudentTransgressionDistance() +
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower +
                '}';
    }

    public static void compareSlytherinStudents(SlytherinStudent student1, SlytherinStudent student2) {
        int student1Power = student1.cunning + student1.determination +
                student1.ambition + student1.resourcefulness + student1.lustForPower;
        int student2Power = student2.cunning + student2.determination +
                student2.ambition + student1.resourcefulness + student1.lustForPower;
        if (student1Power > student2Power) {
            System.out.printf("%s лучший Слизеринец, чем %s\n",
                    student1.getStudentName(), student2.getStudentName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s лучший Слизеринец, чем %s\n",
                    student2.getStudentName(), student1.getStudentName());
        } else {
            System.out.printf("%s и %s - равносильные Слизеринцы\n",
                    student1.getStudentName(), student2.getStudentName());
        }
    }
}
