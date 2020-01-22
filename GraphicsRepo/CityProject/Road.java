import java.awt.*;

public class Road{
	private int x_start, y_start;
	public Road(int x){
		x_start = x;
	}

	public void setX(int z){
		if (z < -70)
			x_start = Final.APPLET_WIDTH;
		else
			x_start = z;
	}
	public int getX(){
		return x_start;
	}
	public void draw(Graphics page){
			page.setColor(Color.yellow);
			page.fillRect(x_start, 345, 70, 10);


	}
}