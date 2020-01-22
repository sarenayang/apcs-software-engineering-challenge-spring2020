import java.awt.*;

public class Moon{

	private double x=0, y=0;
	private Thread thread;
	public Moon(){

	}

	public void draw(Graphics page){
		//moon course = (x-521)^2/1000 + (y-250)^2/500 = 1
		page.setColor(Color.gray);
		page.fillOval(xcoordinate(), ycoordinate(), 50, 50);
		x+=0.05;
		y+=0.05;
	}


	public int xcoordinate(){

		//x%= Final.APPLET_WIDTH;
		return (int)(1000* Math.cos(x));
	}
	public int ycoordinate(){
		y = (int) (10*Math.sin(y));
		//y%= Final.APPLET_HEIGHT;
		return (int)y;
	}

}
