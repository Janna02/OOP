package Units;

public class Coordinates {

    public int x;
    public int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected int getCoordinateX() {
        return x;
    }

    protected int getCoordinateY() {
        return y;
    }

    protected boolean isLeft(Coordinates CoordinatesOfUnit) {
        return x < CoordinatesOfUnit.x;
    }

    public double getDistance(Coordinates CoordinatesOfUnit) {
        return Math.sqrt(Math.pow(this.x - CoordinatesOfUnit.x, 2) + Math.pow(this.y - CoordinatesOfUnit.y, 2));
    }

    public Coordinates chooseWay(Coordinates CoordinatesOfUnit) {
        return new Coordinates(x - CoordinatesOfUnit.x, y - CoordinatesOfUnit.y);
    }
}
