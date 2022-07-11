package task1;

public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        if (witchcraft > 100 || transgress > 100 || witchcraft < 0 || transgress < 0){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
