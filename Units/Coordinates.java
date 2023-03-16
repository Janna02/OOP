package Units;

public class Coordinates {
    protected int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Coordinates CoordinatesOfUnit) {
        return Math.sqrt(Math.pow(this.x - CoordinatesOfUnit.x, 2) + Math.pow(this.y - CoordinatesOfUnit.y, 2));
    }

}
