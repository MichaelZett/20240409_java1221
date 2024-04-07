package de.zettsystems.structured;

public class SyncApp {
    void sync() throws Exception {
        int[] planetIds = {1,2,3,4,5};
        for (int planetId : planetIds) {
            new PlanetService().getPlanet(planetId);
        }
    }
    public static void main(String[] args) {
        var myApp = new SyncApp();
        System.out.println("\n\r-- BEGIN Sync");
        try {
            myApp.sync();
        } catch (Exception e){
            System.err.println("Error: " + e);
        }
    }
}
