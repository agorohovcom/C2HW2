public class HufflepuffStudent extends Hogwarts {
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
        return "Пуффендуец {" +
                "имя = '" + getStudentName() + '\'' +
                ", мощность колдовства = " + getStudentMagicPower() +
                ", расстояние трансгрессии = " + getStudentTransgressionDistance() +
                ", трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty +
                '}';
    }

    public static void compareHufflepuffStudents(HufflepuffStudent student1, HufflepuffStudent student2) {
        int student1Power = student1.hardworking + student1.loyalty + student1.honesty;
        int student2Power = student2.hardworking + student2.loyalty + student2.honesty;
        if (student1Power > student2Power) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n",
                    student1.getStudentName(), student2.getStudentName());
        } else if (student1Power < student2Power) {
            System.out.printf("%s лучший Пуффендуец, чем %s\n",
                    student2.getStudentName(), student1.getStudentName());
        } else {
            System.out.printf("%s и %s - равносильные Пуффендуйцы\n",
                    student1.getStudentName(), student2.getStudentName());
        }
    }
}
