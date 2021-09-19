public class Mammal {
    private int energyLevel = 100;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    //energyLevel
    //getter
    public int getEnergyLevel(){
        return energyLevel;
    }   
    //setter
    public void setEnergyLevel(int energy){
        this.energyLevel += energy;
    }

    //Display Energy
    public int displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;
    }

}
