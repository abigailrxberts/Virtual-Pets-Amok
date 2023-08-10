package virtual.pets.amok;
    
    import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getPets() {
        return pets.values();
    }

    public VirtualPet getPet(String petName) {
        return pets.get(petName);
    }

    public void intakeRoboticCat(RoboticCat pet) {
        pets.put(pet.getPetName(), pet);
    }

    public void intakeRoboticDog(RoboticDog pet) {
        pets.put(pet.getPetName(), pet);
    }

    public void intakeOrganicCat(OrganicCat pet) {
        pets.put(pet.getPetName(), pet);
    }

    public void intakeOrganicDog(OrganicDog pet) {
        pets.put(pet.getPetName(), pet);
    }

    public void adoptPet(String petName) {
        pets.remove(petName);
    }

    public void playPets(String petName) {
        VirtualPet pet = pets.get(petName);
        if (pet != null) {
            pet.play();
        }
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Robotic) {
                ((Robotic) pet).oil();
            }
        }
    }

    public void cleanCages() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
    }

    public void feedPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).feed();           
            }
        }
    }

    public void waterPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).giveWater();           
            }
        }
    }

    public void walkRoboticDogs() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Robotic) {
                ((Robotic) pet).walkDog();
            }
        }
    }

    public void walkOrganicDogs() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Organic) {
                ((Organic) pet).walkDog();
            }
        }
    }
    
    public void tick() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof Robotic || pet instanceof Organic) {
                ((Robotic) pet).tick();
                ((Organic) pet).tick();
            }
        }
    }
}
