import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    List<Item> loadItems(String fileName) {
        ArrayList<Item> itemList = new ArrayList<>();
        File file = new File(fileName);

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String[] item = scan.nextLine().split("=");
                itemList.add(new Item(item[0], Integer.parseInt(item[1])));
            }

        } catch (FileNotFoundException e) {
            System.err.println("file not found: " + fileName);
        }
        return itemList;
    }

    List<Rocket> loadU1(List<Item> items) {
        List<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U1();
        int noOfRockets = 1;

        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U1();
                noOfRockets++;
                if (rocket.canCarry(item)) {
                    rocket.carry(item);
                }

            }
        }
        if (rockets.size() != noOfRockets) {
            rockets.add(rocket);
        }
        return rockets;

    }

    List<Rocket> loadU2(List<Item> items) {
        List<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U2();
        int noOfRockets = 1;

        for (Item item : items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U2();
                noOfRockets++;
                if (rocket.canCarry(item)) {
                    rocket.carry(item);
                }

            }
        }
        if (rockets.size() != noOfRockets) {
            rockets.add(rocket);
        }
        return rockets;

    }

    int runSimulation(List<Rocket> rockets){
        int totalBudget = 0;

        for (int i = 0; i < rockets.size(); i++) {
            if (rockets.get(i).launch() && rockets.get(i).land()){
                totalBudget += rockets.get(i).getRocketCost();
            } else {
                totalBudget += rockets.get(i).getRocketCost();
                i--;
            }

        }

        return totalBudget;
    }
}








