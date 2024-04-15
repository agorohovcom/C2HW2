import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Harry Potter");
        GryffindorStudent hermionaGreyndger = new GryffindorStudent("Hermiona Greindger");
        GryffindorStudent ronUizly = new GryffindorStudent("Ron Uizly", 33, 55, 33, 5, 22);
        students.add(harryPotter);
        students.add(hermionaGreyndger);
        students.add(ronUizly);

        SlytherinStudent drakoMalfoy = new SlytherinStudent("Drako Malfoy");
        SlytherinStudent grahamMontegu = new SlytherinStudent("Graham Montegu");
        SlytherinStudent gregoryGoyl = new SlytherinStudent("Gregory Goyl");
        students.add(drakoMalfoy);
        students.add(grahamMontegu);
        students.add(gregoryGoyl);

        HufflepuffStudent zaharySmit = new HufflepuffStudent("Zahary Smith");
        HufflepuffStudent sedrickDiggory = new HufflepuffStudent("Sedrick Diggory");
        HufflepuffStudent justinFinchFlatchly = new HufflepuffStudent("Justin Finch-Flatchly");
        students.add(zaharySmit);
        students.add(sedrickDiggory);
        students.add(justinFinchFlatchly);

        RavenclawStudent chzhouChang = new RavenclawStudent("Chzhou Chang");
        RavenclawStudent padmaPatil = new RavenclawStudent("Padma Patil");
        RavenclawStudent markusBelby = new RavenclawStudent("Markus Belby");
        students.add(chzhouChang);
        students.add(padmaPatil);
        students.add(markusBelby);

        printStudents();
    }

    private static final List<HogwartsStudent> students = new ArrayList<>();

    private static void printStudents() {
        for (HogwartsStudent student : students) {
            System.out.println(student);
        }
    }
}