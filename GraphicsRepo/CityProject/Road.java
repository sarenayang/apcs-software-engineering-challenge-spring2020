import java.awt.*;

public class Road{
	private int x_start, y_start;
	public Road(int x){
		x_start = x;
	}

	//changes the x position of the yellow_stripes
	public void setX(int z){

		//once the stripes are off screen, it resets back to the end of the applet
		if (z < -70)
			x_start = Final.APPLET_WIDTH;
		else
			x_start = z;
	}

	//returns x coordinate
	public int getX(){
		return x_start;
	}
	public void draw(Graphics page){
			page.setColor(Color.yellow);
			page.fillRect(x_start, 345, 70, 10);


	}
}