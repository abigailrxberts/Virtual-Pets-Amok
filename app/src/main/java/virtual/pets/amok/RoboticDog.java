package virtual.pets.amok;

public class RoboticDog extends Robotic{
    
    public RoboticDog (String petName, String description) {
        super(petName, description);
    }

    @Override
    public void walkDog() {
        this.oil -= 5;
        this.happiness += 5;
        this.health += 5;
        tick();
    }

}
