package virtual.pets.amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    
    private VirtualPet pet;

    @BeforeEach
    public void newPet() {
        pet = new VirtualPet("Pamela", "Organic Dog");
    }

    @Test
    public void shouldGetDefaultValues() {
        assertEquals(50, pet.getHealth());
        assertEquals(50, pet.getHappiness());
    }

}
