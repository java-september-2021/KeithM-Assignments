public class Bat extends Mammal{

    public Bat(){
        super(300);
    }


    public void fly(){
        System.out.println("Woosh, the bat flies away.");
        this.setEnergyLevel(-50);
    }

    public void eatHumans(){
        System.out.println("... Let's not talk about it");
        this.setEnergyLevel(25);
    }

    public void attackTown(){
        System.out.println("Crash! The Bat is destorying the city!");
        this.setEnergyLevel(-100);
    }
}
