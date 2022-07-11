package task1;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        if (nobility > 100 || honor > 100 || nobility < 0 || honor < 0 ||bravery > 100 || bravery < 0){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
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
