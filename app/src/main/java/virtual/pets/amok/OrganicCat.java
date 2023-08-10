package virtual.pets.amok;

public class OrganicCat extends Organic {

    public OrganicCat(String petName, String description) {
        super(petName, description);
    }

    @Override
    public void cleanLitterBox() {
        this.waste -= 5;
        this.health += 5;
        this.happiness += 5;
        tick();
    }
}
