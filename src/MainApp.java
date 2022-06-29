public class MainApp {

    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 1; i < 6 ; i++) {
            System.out.println("Simulation no: " + i);
            String simulation = main.simulation();
            System.out.println(simulation);
        }
    }
}
