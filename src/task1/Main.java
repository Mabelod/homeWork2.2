package task1;

public class Main {
    private static PrintStudent printStudent = new PrintStudent();
    public static void ComparisonOfStudentsGryffindor (Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int a = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getBravery();
        int b = gryffindor2.getNobility() + gryffindor2.getHonor() + gryffindor2.getBravery();
        if ( a > b ){
            System.out.println(gryffindor1.getName() + " лучше " + gryffindor2.getName());
        } else {
            System.out.println(gryffindor2.getName() + " лучше " + gryffindor1.getName());
        }
    }

    public static void ComparisonOfStudentsSlytherin (Slytherin slytherin1, Slytherin slytherin2) {
        int a = slytherin1.getDeception() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int b = slytherin2.getDeception() + slytherin2.getDetermination() + slytherin2.getAmbition() + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if ( a > b ){
            System.out.println(slytherin1.getName() + " лучше " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " лучше " + slytherin1.getName());
        }
    }

    public static void ComparisonOfStudentsHufflepuff (Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int a = hufflepuff1.getIndustriousness() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int b = hufflepuff2.getIndustriousness() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if ( a > b ){
            System.out.println(hufflepuff1.getName() + " лучше " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " лучше " + hufflepuff1.getName());
        }
    }

    public static void ComparisonOfStudentsRavenclaw (Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int a = ravenclaw1.getMind() + ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreativity();
        int b = ravenclaw2.getMind() + ravenclaw2.getWisdom() + ravenclaw2.getWit() + ravenclaw2.getCreativity();
        if ( a > b ){
            System.out.println(ravenclaw1.getName() + " лучше " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " лучше " + ravenclaw1.getName());
        }
    }

    public static void ComparisonOfStudents (Hogwarts hogwarts1, Hogwarts hogwarts2) {
        if ( hogwarts1.getTransgress() > hogwarts2.getTransgress() ){
            System.out.println(hogwarts1.getName() + " трансгрессирует на большее расстрояние чем " + hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " трансгрессирует на большее расстрояние чем " + hogwarts1.getName());
        }

        if (hogwarts1.getWitchcraft() > hogwarts2.getWitchcraft()){
            System.out.println(hogwarts1.getName() + " обладает большей силой магии чем " + hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " обладает большей силой магии чем " + hogwarts1.getName());
        }
    }


    public static void main(String[] args) {
        Gryffindor garri = new Gryffindor("Гарри Поттер", 100, 73, 100, 100, 100);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 77, 71, 41, 36, 25);
        Gryffindor ron = new Gryffindor("Рон Уизли", 27, 44, 75, 47, 65);

        Slytherin draco = new Slytherin("Драко Малфой", 5, 7, 9, 10, 44, 77, 20);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 56, 14, 95, 15, 47, 78, 12);
        Slytherin gregory = new Slytherin("Грегори Гойл", 56, 88, 15, 11, 48, 75, 21);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 45, 82, 12, 13, 78);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 5, 48, 62, 69, 85);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 57, 55, 44, 12, 45);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 58, 76, 91, 14, 46, 74);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 54, 75, 99, 14, 47, 77);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 99, 100, 91, 13, 41, 54);

        printStudent.printGryffindor(garri);
        printStudent.printRavenclaw(marcus);
        ComparisonOfStudents(garri, marcus);
        ComparisonOfStudentsGryffindor(garri, hermione);
        ComparisonOfStudentsSlytherin(draco, gregory);
        ComparisonOfStudentsHufflepuff(zachariah, justin);
        ComparisonOfStudentsRavenclaw(zhou, marcus);

    }
}
