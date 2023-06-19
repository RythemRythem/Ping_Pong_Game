
import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{
// Declare instance variables
	Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
// Constructor that takes initial coordinates, width, and height as arguments	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
			// Initialize a random number generator
		random = new Random();
			// Generate a random x direction
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
			// Generate a random y direction
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
			// Set the x velocity based on the random x direction and initial speed
		setYDirection(randomYDirection*initialSpeed);
		
	}
	
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
