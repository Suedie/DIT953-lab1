import java.awt.*;

public class Saab95 extends ACar {

    /**
     * Turbo is a unique feature of the Saab95 and influences its speedFactor
     */
    private boolean turboOn;

    /**
     * Base constructor for the Saab95
     */
    public Saab95(){
        super(2,125,Color.red,"Saab95");
	    turboOn = false;
        stopEngine();
    }

    /**
     * Sets the turboOn variable to true
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Sets the turboOn variable to false
     */
    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * Used to determine the increase and decrease of speed
     * Influenced by the turboOn boolean
     * @return a factor that is used to multiply the speed in other methods
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return super.getEnginePower() * 0.01 * turbo;
    }
}
