import java.util.List;

public class Main {
    String simulation() {
        Simulation sim = new Simulation();
        List<Item> itemsPhase1 = sim.loadItems("items-phase-1.txt");
        List<Item> itemsPhase2 = sim.loadItems("items-phase-2.txt");
        List<Rocket> U1LoadedPhase1 = sim.loadU1(itemsPhase1);
        List<Rocket> U1LoadedPhase2 = sim.loadU1(itemsPhase2);
        int U1TotalCostPhase1 = sim.runSimulation(U1LoadedPhase1);
        int U1TotalCostPhase2 = sim.runSimulation(U1LoadedPhase2);
        int U1TotalCost = U1TotalCostPhase1 + U1TotalCostPhase2;

        List<Rocket> U2LoadedPhase1 = sim.loadU2(itemsPhase1);
        List<Rocket> U2LoadedPhase2 = sim.loadU2(itemsPhase2);
        int U2TotalCostPhase1 = sim.runSimulation(U2LoadedPhase1);
        int U2TotalCostPhase2 = sim.runSimulation(U2LoadedPhase2);
        int U2TotalCost = U2TotalCostPhase1 + U2TotalCostPhase2;

        return "Total cost for Phase 1 and 2 using U1 rocket: " + U1TotalCost + " millions\n " +
                "Total cost for Phase 1 and 2 using U2 rocket: " + U2TotalCost + " millions";
    }

}
