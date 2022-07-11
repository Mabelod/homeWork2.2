package task1;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        if (mind > 100 || wisdom > 100 || mind < 0 || wisdom < 0 ||wit > 100 || wit < 0 || creativity > 100 || creativity < 0){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
