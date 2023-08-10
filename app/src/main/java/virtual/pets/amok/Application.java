package virtual.pets.amok;

import java.util.Scanner;

public class Application {
    
    private static void displayShelter(VirtualPetShelter shelter) {
        System.out.println("\nHere are all of the pets in the shelter!\n");
        System.out.println("Name\t| Description\t|  Hunger\t|  Thirst\t|  Boredom\t| Health\t| Happiness\t| Oil Level\t| Waste\t\t|");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        for (VirtualPet pet : shelter.getPets()) {
        if (pet instanceof Organic) {
            System.out.println(pet.getPetName() + "\t| " + pet.getDescription() + "\t| " + ((Organic) pet).getHunger() + "\t\t| " + ((Organic) pet).getThirst() + "\t\t| " + ((Organic) pet).getBoredom() + "\t\t| " + pet.getHealth() + "\t\t| " + pet.getHappiness() + "\t\t|" + "N/A" + "\t\t|" + ((Organic) pet).getWaste() + "\t\t| ");
        }else if ( pet instanceof Robotic) {
            System.out.println(pet.getPetName() + "\t| " + pet.getDescription() + "\t| " + "N/A" + "\t\t| " + "N/A" + "\t\t| " + "N/A" + "\t\t| " + pet.getHealth() + "\t\t| " + pet.getHappiness() + "\t\t|" + ((Robotic) pet).getOil() + "\t\t|" + "N/A" + "\t\t| ");
        }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VirtualPetShelter shelter = new VirtualPetShelter();

        while(true) {

            displayShelter(shelter);

            System.out.println("\nWelcome to Abigail's Pet Shelter!");
            System.out.println("Choose what you would like to do from the menu below!");
            System.out.println("1. Feed all of the shelter pets");
            System.out.println("2. Water all of the shelter pets");
            System.out.println("3. Play with a specific pet");
            System.out.println("4. Give us a pet to take care of");
            System.out.println("5. Adopt a pet!");
            System.out.println("6. Oil all of the Robotic Pets");
            System.out.println("7. Walk all of the shelter Dogs");
            System.out.println("8. Clean the shelter litter box");
            System.out.println("9. Clean the dog cages");
            System.out.println("0. Exit\n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:
                    shelter.feedPets();
                    System.out.println("\nYou fed all of the pets!");
                    break;
                
                case 2:
                    shelter.waterPets();
                    System.out.println("\nYou gave water to all of the pets!");
                    break;

                case 3:
                    System.out.println("\nHere are the pets that are available to play with:");
                    for (VirtualPet pet : shelter.getPets()) {
                        System.out.println(pet.getPetName() + ": " + pet.getDescription());
                    }
                    System.out.println("\nEnter the name of the pet that you wish to play with:");
                    String petName = scanner.nextLine();
                    shelter.playPets(petName);
                    System.out.println("\nYou have played with the pet!");
                    break;

                case 4:
                System.out.println("\nEnter the name of the pet you want us to take care of:");
                String newPetName = scanner.nextLine();
                System.out.println("\nEnter a pet type. Must be one of the following:");
                System.out.println("Robotic Cat");
                System.out.println("Robotic Dog");
                System.out.println("Organic Cat");
                System.out.println("Organic Dog");
                String newPetDescription = scanner.nextLine();

                if (newPetDescription.equalsIgnoreCase("Robotic Cat")) {
                    RoboticCat newPet = new RoboticCat(newPetName, newPetDescription);
                    shelter.intakeRoboticCat(newPet);
                } else if (newPetDescription.equalsIgnoreCase("Robotic Dog")) {
                    RoboticDog newPet = new RoboticDog(newPetName, newPetDescription);
                    shelter.intakeRoboticDog(newPet);
                } else if (newPetDescription.equalsIgnoreCase("Organic Cat")) {
                    OrganicCat newPet = new OrganicCat(newPetName, newPetDescription);
                    shelter.intakeOrganicCat(newPet);
                } else if (newPetDescription.equalsIgnoreCase("Organic Dog")) {
                    OrganicDog newPet = new OrganicDog(newPetName, newPetDescription);
                    shelter.intakeOrganicDog(newPet);
                } else {
                    System.out.println("Invalid entry. Try again.");
                }
                break;

                case 5:
                System.out.println("\nHere are our pets available for adoption:");
                for (VirtualPet pet : shelter.getPets()) {
                    System.out.println(pet.getPetName() + ": " + pet.getDescription());
                }
                System.out.println("\nEnter the name of the pet that you would like to adopt:");
                String adoptPet = scanner.nextLine();
                shelter.adoptPet(adoptPet);
                System.out.println("\nCongrats on your new pet!");
                break;

                case 6:
                shelter.oilRoboticPets();
                System.out.println("\nYou have oiled all robotic pets!\n");
                break;

                case 7:
                shelter.walkRoboticDogs();
                shelter.walkOrganicDogs();
                System.out.println("\nYou have walked all of the shelter dogs!\n");
                break;

                case 8:
                shelter.cleanLitterBox();
                System.out.println("\nYou have cleaned all of the litter boxes!\n");
                break;

                case 9:
                shelter.cleanCages();
                System.out.println("\nYou have cleaned all of the dog cages!\n");
                break;
                
                case 0:
                System.out.println("Thank you for playing!");
                System.exit(0);
                scanner.close();

                default:
                System.out.println("Invalid input. Please try again.");
                break;
            }
        }
    }
}
