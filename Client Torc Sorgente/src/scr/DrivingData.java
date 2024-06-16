package scr;

public class DrivingData {

    private final double speed;
    private final double trackPos;
    private final double sensorSX1;
    private final double sensorSX2;
    private final double sensorC;
    private final double sensorDX1;
    private final double sensorDX2;
    private final double angle;
    public int cls;

    @Override
    public String toString() {
        return "DrivingData [speed=" + speed + ", trackPos=" + trackPos + ", sensorSX1=" + sensorSX1 + ", sensorSX2="
                + sensorSX2 + ", sensorC=" + sensorC + ", sensorDX1=" + sensorDX1 + ", sensorDX2=" + sensorDX2
                + ", angle=" + angle + ", cls=" + cls + "]" + '\n';
    }

    public DrivingData(double speed, double trackPos, double sensorSX1, double sensorSX2, double sensorC,
            double sensorDX1, double sensorDX2, double angle) {
        this.speed = speed;
        this.trackPos = trackPos;
        this.sensorSX1 = sensorSX1;
        this.sensorSX2 = sensorSX2;
        this.sensorC = sensorC;
        this.sensorDX1 = sensorDX1;
        this.sensorDX2 = sensorDX2;
        this.angle = angle;
    }

    public DrivingData(double speed, double trackPos, double sensorSX1, double sensorSX2, double sensorC,
            double sensorDX1, double sensorDX2, double angle, int cls) {
        this.speed = speed;
        this.trackPos = trackPos;
        this.sensorSX1 = sensorSX1;
        this.sensorSX2 = sensorSX2;
        this.sensorC = sensorC;
        this.sensorDX1 = sensorDX1;
        this.sensorDX2 = sensorDX2;
        this.angle = angle;
        this.cls = cls; // Assign class correctly
    }

    public DrivingData(String line) {
        String[] parts = line.split(";");
        this.speed = Double.parseDouble(parts[0].trim());
        this.trackPos = Double.parseDouble(parts[1].trim());
        this.sensorSX1 = Double.parseDouble(parts[2].trim());
        this.sensorSX2 = Double.parseDouble(parts[3].trim());
        this.sensorC = Double.parseDouble(parts[4].trim());
        this.sensorDX1 = Double.parseDouble(parts[5].trim());
        this.sensorDX2 = Double.parseDouble(parts[6].trim());
        this.angle = Double.parseDouble(parts[7].trim());
        this.cls = Integer.parseInt(parts[8].trim()); // Parse class correctly
    }

    public double distance(DrivingData other) {
        return Math.sqrt(
            Math.pow(this.speed - other.speed, 2) +
            Math.pow(this.trackPos - other.trackPos, 2) +
            Math.pow(this.sensorSX1 - other.sensorSX1, 2) +
            Math.pow(this.sensorSX2 - other.sensorSX2, 2) +
            Math.pow(this.sensorC - other.sensorC, 2) +
            Math.pow(this.sensorDX1 - other.sensorDX1, 2) +
            Math.pow(this.sensorDX2 - other.sensorDX2, 2) +
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
                return sensorSX1;
            }
            case 3 -> {
                return sensorSX2;
            }
            case 4 -> {
                return sensorC;
            }
            case 5 -> {
                return sensorDX1;
            }
            case 6 -> {
                return sensorDX2;
            }
            case 7 -> {
                return angle;
            }
            default -> throw new IllegalArgumentException("Invalid axis: "     + axis);
        }
    }
}
