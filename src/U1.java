public class U1 extends Rocket {


    public U1(int rocketCost, int rocketWeight, int maxWeight, int chanceOfLaunchExplosion, int chanceOfLandingCrash) {
        super(100, 10000, 18000, 5, 1);
    }

    @Override
    public boolean land() {
        boolean landedSafetly = Math.random() > (chanceOfLandingCrash / 100) * (this.cargoCarried/this.cargoLimit);
        return landedSafetly;
    }

    @Override
    public boolean launch() {
        boolean launchedSafetly = Math.random() > (chanceOfLaunchExplosion / 100) * (this.cargoCarried/this.cargoLimit);
        return launchedSafetly;
    }
}
