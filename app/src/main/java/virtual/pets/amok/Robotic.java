package virtual.pets.amok;

public class Robotic extends VirtualPet{

    protected int oil = 50;

    public Robotic (String petName, String description) {
        super(petName, description);
    }

    public Robotic(int oil, int health, int happiness, String petName, String description) {
        super(happiness, health, petName, description);
        this.oil = oil;
    }

    public int getOil() {
        return this.oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

@Override
    public void tick() {
        this.oil -= 1;
        this.health -= 5;
        this.happiness -= 5;

        if (this.oil >= 100) {
            this.oil = 100;
        } else if (this.oil <= 0) {
            this.oil = 0;
        }

        if (this.health >= 100) {
            this.health = 100;
        } else if (this.health <= 0) {
            this.health = 0;
        }

        if (this.happiness >= 100) {
            this.happiness = 100;
        } else if (this.happiness <= 0) {
            this.happiness = 0;
        }

    }

    @Override
    public void oil() {
        this.oil += 10;
        this.health += 10;
        this.happiness += 10;
        tick();
    }

    @Override
    public void play() {
        this.oil -= 5;
        this.health += 10;
        this.happiness += 10;
        tick();
    }
}
