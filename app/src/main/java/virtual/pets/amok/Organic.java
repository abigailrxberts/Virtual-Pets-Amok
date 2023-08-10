package virtual.pets.amok;

public class Organic extends VirtualPet {
    protected int hunger = 50;
    protected int thirst = 50;
    protected int boredom = 50;
    protected int waste = 0;


    public Organic (String petName, String description) {
        super(petName, description);
    }

    public Organic(int hunger, int thirst, int boredom, int waste, int health, int happiness, String petName, String description) {
        super(health, happiness, petName, description);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.waste = waste;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }


    public int getWaste() {
        return this.waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }
    
    @Override
    public void tick() {
        this.hunger += 1;
        this.thirst += 1;
        this.boredom += 1;
        this.waste += 1;
        this.happiness -= 1;
        this.health -= 1;

        if(this.hunger >= 100) {
            this.hunger = 100;
        } else if (this.hunger <= 0) {
            this.hunger = 0;
        }
        
        if (this.thirst >= 100) {
            this.thirst = 100;
        }else if (this.thirst <= 0) {
            this.thirst = 0;
        }
        
        if (this.boredom >= 100) {
            this.boredom = 100;
        } else if (this.boredom <= 0) {
            this.boredom = 0;
        }
        
        if (this.waste >= 100) {
            this.waste = 100;
        } else if (this.waste <= 0) {
            this.waste = 0;
        }
        
        if (this.happiness >= 100) {
            this.happiness = 100;
        } else if (this.happiness <= 0) {
            this.happiness = 0;
        }

        if (this.health >= 100) {
            this.health = 100;
        } else if (this.health <= 0) {
            this.health = 0;
        }

    }

    @Override
    public void feed() {
        this.hunger -= 5;
        this.thirst += 5;
        this.health += 3;
        this.health -= 2;
        this.happiness += 3;
        this.health -= 2;
        this.waste += 2;
        tick();
    }

    @Override
    public void giveWater() {
        this.thirst -= 5;
        this.health += 5;
        this.happiness += 5;   
        tick();
    }

    @Override
    public void play() {
        this.hunger += 5;
        this.thirst += 5;
        this.boredom -= 5;
        this.health += 5;
        this.happiness += 5;
        tick();
    }
}
