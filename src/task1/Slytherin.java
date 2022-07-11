package task1;

public class Slytherin extends Hogwarts {
    private int deception;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name ,int witchcraft, int transgress, int deception, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgress);
        if (deception > 100 || determination > 100 || deception < 0 || determination < 0 ||ambition > 100 || ambition < 0 || resourcefulness > 100
                || resourcefulness < 0 || lustForPower < 0 || lustForPower > 100 ){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.deception = deception;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getDeception() {
        return deception;
    }

    public void setDeception(int deception) {
        this.deception = deception;
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

}
