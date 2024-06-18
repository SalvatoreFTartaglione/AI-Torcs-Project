package scr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearestNeighbor {

    private final List<DrivingData> trainingData;
    private KDTree kdtree;
    private final int[] classCounts; // VERIFICA NEI COSTRUTTORI CHE QUESTO SIA CONFORME CON QUELLO CHE STAI IPOTIZZANDO!
    private final String firstLineOfTheFile; // VERIFICA  NEI COSTRUTTORI CHE QUESTO SIA CONFORME CON QUELLO CHE STAI IPOTIZZANDO!

    public NearestNeighbor(String filename) {
        this.trainingData = new ArrayList<>();
        this.kdtree = null;
        this.firstLineOfTheFile = "Velocità;DistanzaLineaCentrale;TrackEdgeSensors[0];TrackEdgeSensors[1];TrackEdgeSensors[2];TrackEdgeSensors[3];TrackEdgeSensors[4];TrackEdgeSensors[5];TrackEdgeSensors[6];TrackEdgeSensors[7];TrackEdgeSensors[8];TrackEdgeSensors[9];TrackEdgeSensors[10];TrackEdgeSensors[11];TrackEdgeSensors[12];TrackEdgeSensors[13];TrackEdgeSensors[14];TrackEdgeSensors[15];TrackEdgeSensors[16];TrackEdgeSensors[17];TrackEdgeSensors[18];TrackEdgeSensors[19];AngoloTraccia";
        this.classCounts = new int[7];              //le classi sono 7
        this.readPointsFromCSV(filename);
        this.printClassDistribution();              //Stampa la distribuzione delle classi
    }

    private void readPointsFromCSV(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(firstLineOfTheFile)) {
                    continue; // Skip header
                }
                // Aggiungo il campione richiamando il costruttore che prende come input la stringa letta
                try{
                    //per bypassare errori di formattazione nel training set
                    DrivingData data = new DrivingData(line);
                    trainingData.add(data);
                }catch(NumberFormatException ex){
                    System.out.println(line);
                }
                
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.kdtree = new KDTree(trainingData); // Inizializza il KDTree utilizzando i punti letti
    }
 
    public List<DrivingData> findKNearestNeighbors(DrivingData testPoint, int k) {
        //kdtree.printTree();
        return kdtree.kNearestNeighbors(testPoint, k);
    }

    public int classify(DrivingData testPoint, int k) {

        Arrays.fill(classCounts, 0); // Azzera i conteggi delle classi
        List<DrivingData> kNearestNeighbors = findKNearestNeighbors(testPoint, k);

        // Count the occurrences of each class in the k nearest neighbors
        for (DrivingData neighbor : kNearestNeighbors) {
            classCounts[neighbor.cls]++;
        }

        // Find the class with the maximum count
        int maxCount = -1;
        int predictedClass = -1;
        for (int i = 0; i < classCounts.length; i++) {
            if (classCounts[i] > maxCount) {
                maxCount = classCounts[i];
                predictedClass = i;
            }
        }

        return predictedClass;
    }

       
    public List<DrivingData> getTrainingData() {
        return trainingData;
    }


    public void printClassDistribution() {
        for (DrivingData data : trainingData) {
            classCounts[data.cls]++;
        }
        for (int i = 0; i < classCounts.length; i++) {
            System.out.println("Class " + i + ": " + classCounts[i]);
        }
    }

}