package virtual.pets.amok;

public class OrganicDog extends Organic{

    public OrganicDog (String petName, String description) {
        super(petName, description);
    }

    @Override
    public void cleanCage() {
        this.waste -= 5;
        this.happiness += 5;
        this.health += 5;
        tick();
    }

    @Override
    public void walkDog() {
        this.waste -= 5;
        this.hunger += 5;
        this.thirst += 5;
        this.boredom -= 5;
        this.happiness += 5;
        this.health += 5;
        tick();
    }
    
}
