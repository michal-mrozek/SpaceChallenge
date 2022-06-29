public class U2 extends Rocket {

    public U2() {
        super(120, 18000, 29000, 4, 8);
    }

    @Override
    public boolean land() {
        boolean landedSafetly = Math.random() > ((chanceOfLandingCrash / 100.0) * this.cargoCarried/this.cargoLimit);
        return landedSafetly;
    }

    @Override
    public boolean launch() {
        boolean launchedSafetly = Math.random() > ((chanceOfLaunchExplosion / 100.0) * this.cargoCarried/this.cargoLimit);
        return launchedSafetly;
    }
}
