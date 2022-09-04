/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Additional modifications by A. Burgos 2022
 */

public class Fan {
	/** Main method */
	public void main(String[] args) {
		 final int STOPPED = 0;	// Fan speed is stopped
         final int SLOW = 1;		// Fan speed is slow
		 final int MEDIUM = 2;	// Fan speed is medium
		 final int FAST = 3;		// Fan speed is fast

        private int speed
        private boolean on
        private double radius
        private String color

    // No-argument constructor that creates the default fan.
		public Fan() {
            speed = STOPPED;
            on = false;
            radius = 6;
            color = "white";
        }

	// Sets the speed of the fan.
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	// Sets the fan on.
	public void turnOn() {
			on = true;
	}

	// Sets the fan off.
	public void turnOff() {
			on = false;
	}

	// Sets the color of the fan.
	public void setColor(String newColor) {
		color = newColor;
	}

	// Sets the radius of the fan.
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	// Accessor methods.
	// Return speed.
	public String getSpeed() {
		return speed;
	}

    // Set speed.
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

	// Return on.
	public boolean isOn() {
		return on;
	}

    // Set on.
	public void turnOn() {
		on = true;
	}

    // Set off.
	public void turnOff() {
		on = false;
	}

	// Return radius.
	public double getRadius() {
		return radius;
	}

    // Set radius.
	public double setRadius(double newRadius) {
		radius = newRadius;
	}

	// Return color.
	public String getColor() {
		return color;
	}

    // Set color.
	public double getRadius(String newColor) {
		color = newColor;
	}

	// Override of the toString method which returns a string description of the fan.
	public String toString() {
		if (on == true) {
			return "The fan speed is set to ="+speed+" with a color of ="+color+"\n and a radius of ="+radius;
		}
		else{
			return "The fan is =" + color + "with a radius of =" + radius +"and the fan is off.";
		}
	    }
    }
}