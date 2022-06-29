public class U1 extends Rocket {


    public U1() {
        super(100, 10000, 18000, 5, 1);
    }

    @Override
    public boolean land() {
        boolean landedSafetly = Math.random() > ((this.chanceOfLandingCrash / 100.0) * this.cargoCarried / this.cargoLimit);
        return landedSafetly;
    }

    @Override
    public boolean launch() {
        boolean launchedSafetly = Math.random() > ((this.chanceOfLaunchExplosion / 100.0) * this.cargoCarried / this.cargoLimit);
        return launchedSafetly;
    }
}
