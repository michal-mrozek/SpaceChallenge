import java.util.ArrayList;
import java.util.List;

public class Rocket implements SpaceShip{
protected int rocketCost;
protected int rocketWeight;
protected int maxWeight;
protected int chanceOfLaunchExplosion;
protected int chanceOfLandingCrash;
protected int cargoCarried;
protected int cargoLimit;
protected List<Item> carriedItems;

    public Rocket(int rocketCost, int rocketWeight, int maxWeight, int chanceOfLaunchExplosion, int chanceOfLandingCrash) {
        this.rocketCost = rocketCost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
        this.chanceOfLandingCrash = chanceOfLandingCrash;
        carriedItems = new ArrayList<>();
        cargoLimit = maxWeight - rocketWeight;
        cargoCarried = 0;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {
        return (item.getWeight() + this.cargoCarried <= this.cargoLimit);

    }

    @Override
    public final void carry(Item item) {
        carriedItems.add(item);
        cargoCarried += item.getWeight();
    }

    public int getRocketCost() {
        return rocketCost;
    }
}
