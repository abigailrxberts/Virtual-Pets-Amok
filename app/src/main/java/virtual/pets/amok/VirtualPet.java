package virtual.pets.amok;

public class VirtualPet {
    
    protected int health = 50;
    protected int happiness = 50;
    private String petName;
    private String description;

    public VirtualPet (String petName, String description) {
        this.petName = petName;
        this.description = description;
    }

    public VirtualPet(int health, int happiness, String petName, String description) {
        this.health = health;
        this.happiness = happiness;
        this.petName = petName;
        this.description = description;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void oil() {
    }

    public void walkDog() {
    }

    public void tick() {
    }

    public void feed() {
    }

    public void giveWater() {
    }

    public void cleanCage() {
    }

    public void cleanLitterBox() {
    }

    public void play() {
    }
}
