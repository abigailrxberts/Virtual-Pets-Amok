package virtual.pets.amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoboticTest {
    
    private Robotic pet;

    @BeforeEach
    public void newPet() {
        pet = new Robotic("Stella", "Robotic Cat");
    }

    @Test
    public void shouldGetDefaultValues() {
        assertEquals(50, pet.getOil());
    }

    @Test
    public void shouldTick() {
        pet.tick();
        assertEquals(49, pet.getOil());
        assertEquals(45, pet.getHealth());
        assertEquals(45, pet.getHappiness());
    }

    @Test
    public void shouldOilRobot() {
        pet.oil();
        assertEquals(59, pet.getOil());
        assertEquals(55, pet.getHappiness());
        assertEquals(55, pet.getHealth());
    }

    @Test
    public void shouldPlay() {
        pet.play();
        assertEquals(44, pet.getOil());
        assertEquals(55, pet.getHealth());
        assertEquals(55, pet.getHappiness());
    }

}
