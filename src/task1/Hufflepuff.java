package task1;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        if (industriousness > 100 || loyalty > 100 || industriousness < 0 || loyalty < 0 ||honesty > 100 || honesty < 0){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
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
}
