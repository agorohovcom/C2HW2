import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Гарри Поттер");
        GryffindorStudent hermionaGreyndger = new GryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ronUizly = new GryffindorStudent("Рон Уизли", 33, 55, 33, 5, 22);
        students.add(harryPotter);
        students.add(hermionaGreyndger);
        students.add(ronUizly);

        SlytherinStudent drakoMalfoy = new SlytherinStudent("Драко Малфой", 1, 2, 3, 4, 5, 6, 7);
        SlytherinStudent grahamMontegu = new SlytherinStudent("Грэхэм Монтегю", 1, 2, 3, 4, 5, 6, 7);
        SlytherinStudent gregoryGoyl = new SlytherinStudent("Грегори Гойл");
        students.add(drakoMalfoy);
        students.add(grahamMontegu);
        students.add(gregoryGoyl);

        HufflepuffStudent zaharySmit = new HufflepuffStudent("Захария Смит");
        HufflepuffStudent sedrickDiggory = new HufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justinFinchFlatchly = new HufflepuffStudent("Джастин Финч-Флетчли");
        students.add(zaharySmit);
        students.add(sedrickDiggory);
        students.add(justinFinchFlatchly);

        RavenclawStudent chzhouChang = new RavenclawStudent("Чжоу Чанг");
        RavenclawStudent padmaPatil = new RavenclawStudent("Падма Патил");
        RavenclawStudent markusBelby = new RavenclawStudent("Маркус Белби");
        students.add(chzhouChang);
        students.add(padmaPatil);
        students.add(markusBelby);

        printStudents();

        GryffindorStudent.compareGryffindorStudents(harryPotter, ronUizly);
        HufflepuffStudent.compareHufflepuffStudents(zaharySmit, sedrickDiggory);
        RavenclawStudent.compareRavenclawStudents(chzhouChang, padmaPatil);
        SlytherinStudent.compareSlytherinStudents(drakoMalfoy, grahamMontegu);
        Hogwarts.compareHogwartsStudentsByStockParams(harryPotter, hermionaGreyndger);
    }

    private static final List<Hogwarts> students = new ArrayList<>();

    private static void printStudents() {
        for (Hogwarts student : students) {
            System.out.println(student);
        }
    }
}