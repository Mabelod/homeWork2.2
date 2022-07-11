package task1;

public class PrintStudent {
    public void printGryffindor (Gryffindor gryffindor){
        System.out.println("Имя - " + gryffindor.getName()
                + "; Сила магии - " + gryffindor.getWitchcraft()
                + "; Трансгрессия - " + gryffindor.getTransgress()
                + "; Благородство - " + gryffindor.getNobility()
                + "; Честь - " + gryffindor.getHonor()
                + "; Храбрость - " + gryffindor.getBravery());
    }

    public void printSlytherin (Slytherin slytherin){
        System.out.println("Имя - " + slytherin.getName()
                + "; Сила магии - " + slytherin.getWitchcraft()
                + "; Трансгрессия - " + slytherin.getTransgress()
                + "; Обман - " + slytherin.getDeception()
                + "; Решительность - " + slytherin.getDetermination()
                + "; Амбициозность - " + slytherin.getAmbition()
                + "; Находчивость - " + slytherin.getResourcefulness()
                + "; Жажда власти - " + slytherin.getLustForPower());
    }

    public void printHufflepuff(Hufflepuff hufflepuff) {
        System.out.println("Имя - " + hufflepuff.getName()
                + "; Сила магии - " + hufflepuff.getWitchcraft()
                + "; Трансгрессия - " + hufflepuff.getTransgress()
                + "; Трудолюбие - " + hufflepuff.getIndustriousness()
                + "; Верность - " + hufflepuff.getLoyalty()
                + "; Честность - " + hufflepuff.getHonesty());
    }

    public void printRavenclaw(Ravenclaw ravenclaw) {
        System.out.println("Имя - " + ravenclaw.getName()
                + "; Сила магии - " + ravenclaw.getWitchcraft()
                + "; Трансгрессия - " + ravenclaw.getTransgress()
                + "; Ум - " + ravenclaw.getMind()
                + "; Мудрость - " + ravenclaw.getWisdom()
                + "; Остроумие - " + ravenclaw.getWit()
                + "; Творчество - " + ravenclaw.getCreativity());
    }
}
