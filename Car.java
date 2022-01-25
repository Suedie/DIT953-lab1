import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    private int x; // The car's position in the x-axis
    private int y; // The car's position in the y-axis
    private Direction dir; // The direction the car is moving in

    //Base constructor
    public Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    // Setters and Getters
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    public Color getColor(){
        return color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Direction getDirection() { return dir;}

    public void setColor(Color clr){
        color = clr;
    }
    public void setCurrentSpeed(double speed) {
        currentSpeed = speed;
    }
    public void setX(int input) {
        x = input;
    }
    public void setY(int input) {
        y = input;
    }
    public void setDirection(Direction input) {
        dir = input;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }
    public void stopEngine(){
        currentSpeed = 0;
    }

    // Assumes a 2D top down representation where North = Up, East = Right etc.
    public void move() {
        switch (getDirection()) {
            case NORTH -> setY(getY()+(int)getCurrentSpeed());
            case SOUTH -> setY(getY()-(int)getCurrentSpeed());
            case EAST -> setX(getX()+(int)getCurrentSpeed());
            case WEST -> setX(getX()-(int)getCurrentSpeed());
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            case NORTH -> setDirection(Direction.EAST);
            case SOUTH -> setDirection(Direction.WEST);
            case EAST -> setDirection(Direction.SOUTH);
            case WEST -> setDirection(Direction.NORTH);
        }
    }

    public void turnLeft() {
        switch (getDirection()) {
            case NORTH -> setDirection(Direction.WEST);
            case SOUTH -> setDirection(Direction.EAST);
            case EAST -> setDirection(Direction.NORTH);
            case WEST -> setDirection(Direction.SOUTH);
        }
    }

    enum Direction {
        NORTH, SOUTH, WEST, EAST
    }
}
