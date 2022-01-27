import java.awt.*;

public class Volvo240 extends ACar {

    /**
     * Unique to the Volvo240. Used to determine speedFactor
     */
    private final static double trimFactor = 1.25;

    /**
     * Base constructor for the Volvo240
     */
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
        stopEngine();
    }

    /**
     * Factor used to determine amount the speed changes
     * @return Value is used to determine speed in other methods
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
