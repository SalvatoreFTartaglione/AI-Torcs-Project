package scr;

public class DrivingData {

    private final double speed;
    private final double trackPos;
    private final double trackedgeSensors0;
    private final double trackedgeSensors1;
    private final double trackedgeSensors2;
    private final double trackedgeSensors3;
    private final double trackedgeSensors4;
    private final double trackedgeSensors5;
    private final double trackedgeSensors6;
    private final double trackedgeSensors7;
    private final double trackedgeSensors8;
    private final double trackedgeSensors9;
    private final double trackedgeSensors10;
    private final double trackedgeSensors11;
    private final double trackedgeSensors12;
    private final double trackedgeSensors13;
    private final double trackedgeSensors14;
    private final double trackedgeSensors15;
    private final double trackedgeSensors16;
    private final double trackedgeSensors17;
    private final double trackedgeSensors18;
    private final double trackedgeSensors19;
    private final double angle;
    public int cls;

    
    public DrivingData(double speed, double trackPos, double trackedgeSensors0, double trackedgeSensors1, double trackedgeSensors2,
    double trackedgeSensors3, double trackedgeSensors4, double trackedgeSensors5, double trackedgeSensors6, double trackedgeSensors7,
    double trackedgeSensors8, double trackedgeSensors9, double trackedgeSensors10, double trackedgeSensors11, double trackedgeSensors12,
    double trackedgeSensors13, double trackedgeSensors14, double trackedgeSensors15, double trackedgeSensors16, double trackedgeSensors17,
    double trackedgeSensors18, double trackedgeSensors19,  double angle) {
        this.speed = speed;
        this.trackPos = trackPos;
        this.trackedgeSensors0 = TrackEdgeSensors0;
        this.trackedgeSensors1 = TrackEdgeSensors1;
        this.trackedgeSensors2 = trackedgeSensors2;
        this.trackedgeSensors3 = trackedgeSensors3;
        this.trackedgeSensors4 = trackedgeSensors4;
        this.trackedgeSensors5 = trackedgeSensors5;
        this.trackedgeSensors6 = trackedgeSensors6;
        this.trackedgeSensors7 = trackedgeSensors7;
        this.trackedgeSensors8 = trackedgeSensors8;
        this.trackedgeSensors9 = trackedgeSensors9;
        this.trackedgeSensors10 = trackedgeSensors10;
        this.trackedgeSensors11 = trackedgeSensors11;
        this.trackedgeSensors12 = trackedgeSensors12;
        this.trackedgeSensors13 = trackedgeSensors13;
        this.trackedgeSensors14 = trackedgeSensors14;
        this.trackedgeSensors15 = trackedgeSensors15;
        this.trackedgeSensors16 = trackedgeSensors16;
        this.trackedgeSensors17 = trackedgeSensors17;
        this.trackedgeSensors18 = trackedgeSensors18;
        this.trackedgeSensors19 = trackedgeSensors19;
        this.angle = angle;
    }

    public DrivingData(double speed, double trackPos, double trackedgeSensors0, double trackedgeSensors1, double trackedgeSensors2,
    double trackedgeSensors3, double trackedgeSensors4, double trackedgeSensors5, double trackedgeSensors6, double trackedgeSensors7,
    double trackedgeSensors8, double trackedgeSensors9, double trackedgeSensors10, double trackedgeSensors11, double trackedgeSensors12,
    double trackedgeSensors13, double trackedgeSensors14, double trackedgeSensors15, double trackedgeSensors16, double trackedgeSensors17,
    double trackedgeSensors18, double trackedgeSensors19,  double angle, int cls) {
        this.speed = speed;
        this.trackPos = trackPos;
        this.trackedgeSensors0 = TrackEdgeSensors0;
        this.trackedgeSensors1 = TrackEdgeSensors1;
        this.trackedgeSensors2 = trackedgeSensors2;
        this.trackedgeSensors3 = trackedgeSensors3;
        this.trackedgeSensors4 = trackedgeSensors4;
        this.trackedgeSensors5 = trackedgeSensors5;
        this.trackedgeSensors6 = trackedgeSensors6;
        this.trackedgeSensors7 = trackedgeSensors7;
        this.trackedgeSensors8 = trackedgeSensors8;
        this.trackedgeSensors9 = trackedgeSensors9;
        this.trackedgeSensors10 = trackedgeSensors10;
        this.trackedgeSensors11 = trackedgeSensors11;
        this.trackedgeSensors12 = trackedgeSensors12;
        this.trackedgeSensors13 = trackedgeSensors13;
        this.trackedgeSensors14 = trackedgeSensors14;
        this.trackedgeSensors15 = trackedgeSensors15;
        this.trackedgeSensors16 = trackedgeSensors16;
        this.trackedgeSensors17 = trackedgeSensors17;
        this.trackedgeSensors18 = trackedgeSensors18;
        this.trackedgeSensors19 = trackedgeSensors19;
        this.angle = angle;
        this.cls = cls; // Assign class correctly
    }

    public DrivingData(String line) {
        String[] parts = line.split(";");
        this.speed = Double.parseDouble(parts[0].trim());
        this.trackPos = Double.parseDouble(parts[1].trim());
        this.trackedgeSensors0 = Double.parseDouble(parts[2].trim());
        this.trackedgeSensors1 = Double.parseDouble(parts[3].trim());
        this.trackedgeSensors2 = Double.parseDouble(parts[4].trim());
        this.trackedgeSensors3 = Double.parseDouble(parts[5].trim());
        this.trackedgeSensors4 = Double.parseDouble(parts[6].trim());
        this.trackedgeSensors5 = Double.parseDouble(parts[7].trim());
        this.trackedgeSensors6 = Double.parseDouble(parts[8].trim());
        this.trackedgeSensors7 = Double.parseDouble(parts[9].trim());
        this.trackedgeSensors8 = Double.parseDouble(parts[10].trim());
        this.trackedgeSensors9 = Double.parseDouble(parts[11].trim());
        this.trackedgeSensors10 = Double.parseDouble(parts[12].trim());
        this.trackedgeSensors11 = Double.parseDouble(parts[13].trim());
        this.trackedgeSensors12 = Double.parseDouble(parts[14].trim());
        this.trackedgeSensors13 = Double.parseDouble(parts[15].trim());
        this.trackedgeSensors14 = Double.parseDouble(parts[16].trim());
        this.trackedgeSensors15 = Double.parseDouble(parts[17].trim());
        this.trackedgeSensors16 = Double.parseDouble(parts[18].trim());
        this.trackedgeSensors17 = Double.parseDouble(parts[19].trim());
        this.trackedgeSensors18 = Double.parseDouble(parts[20].trim());
        this.trackedgeSensors19 = Double.parseDouble(parts[21].trim());
        this.angle = Double.parseDouble(parts[22].trim());
        this.cls = Integer.parseInt(parts[23].trim()); // Parse class correctly
    }

    public double distance(DrivingData other) {
        return Math.sqrt(
            Math.pow(this.speed - other.speed, 2) +
            Math.pow(this.trackPos - other.trackPos, 2) +
            Math.pow(this.trackedgeSensors0 - other.trackedgeSensors0, 2) +
            Math.pow(this.trackedgeSensors1 - other.trackedgeSensors1, 2) +
            Math.pow(this.trackedgeSensors2 - other.trackedgeSensors2, 2) +
            Math.pow(this.trackedgeSensors3 - other.trackedgeSensors3, 2) +
            Math.pow(this.trackedgeSensors4 - other.trackedgeSensors4, 2) +
            Math.pow(this.trackedgeSensors5 - other.trackedgeSensors5, 2) +
            Math.pow(this.trackedgeSensors6 - other.trackedgeSensors6, 2) +
            Math.pow(this.trackedgeSensors7 - other.trackedgeSensors7, 2) +
            Math.pow(this.trackedgeSensors8 - other.trackedgeSensors8, 2) +
            Math.pow(this.trackedgeSensors9 - other.trackedgeSensors9, 2) +
            Math.pow(this.trackedgeSensors10 - other.trackedgeSensors10, 2) +
            Math.pow(this.trackedgeSensors11 - other.trackedgeSensors11, 2) +
            Math.pow(this.trackedgeSensors12 - other.trackedgeSensors12, 2) +
            Math.pow(this.trackedgeSensors13 - other.trackedgeSensors13, 2) +
            Math.pow(this.trackedgeSensors14 - other.trackedgeSensors14, 2) +
            Math.pow(this.trackedgeSensors15 - other.trackedgeSensors15, 2) +
            Math.pow(this.trackedgeSensors16 - other.trackedgeSensors16, 2) +
            Math.pow(this.trackedgeSensors17 - other.trackedgeSensors17, 2) +
            Math.pow(this.trackedgeSensors18 - other.trackedgeSensors18, 2) +
            Math.pow(this.trackedgeSensors19 - other.trackedgeSensors19, 2) +
            Math.pow(this.angle - other.angle, 2)
        );
    }

    public double getCoordinate(int axis) {
        switch (axis) {
            case 0 -> {
                return speed;
            }
            case 1 -> {
                return trackPos;
            }
            case 2 -> {
                return trackedgeSensors0;
            }
            case 3 -> {
                return trackedgeSensors1;
            }
            case 4 -> {
                return trackedgeSensors2;
            }
            case 5 -> {
                return trackedgeSensors3;
            }
            case 6 -> {
                return trackedgeSensors4;
            }
           case 7 -> {
                return trackedgeSensors5;
            }
            case 8 -> {
                return trackedgeSensors6;
            }
            case 9 -> {
                return trackedgeSensors7;
            }
            case 10 -> {
                return trackedgeSensors8;
            }
            case 11 -> {
                return trackedgeSensors9;
            }
            case 12 -> {
                return trackedgeSensors10;
            }
            case 13 -> {
                return trackedgeSensors11;
            }
            case 14 -> {
                return trackedgeSensors12;
            }
            case 15 -> {
                return trackedgeSensors13;
            }
            case 16 -> {
                return trackedgeSensors14;
            }
            case 17 -> {
                return trackedgeSensors15;
            }
            case 18 -> {
                return trackedgeSensors16;
            }
            case 19 -> {
                return trackedgeSensors17;
            }
            case 20 -> {
                return trackedgeSensors18;
            }
            case 21 -> {
                return trackedgeSensors19;
            }
            case 22 -> {
                return angle;
            }
            default -> throw new IllegalArgumentException("Invalid axis: "  + axis);
        }
    }
}
