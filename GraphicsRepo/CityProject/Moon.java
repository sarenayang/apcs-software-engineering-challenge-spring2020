import java.awt.*;

public class Moon{

	private int x=0, y=0;
	private Thread thread;
	public Moon(){

	}

	public void draw(Graphics page){
		//moon course = (x-521)^2/1000 + (y-250)^2/500 = 1
		page.setColor(Color.gray);
		page.fillOval(xcoordinate(), (int) Math.sin(x), 50, 50);
		x+=5;
	}


	public int xcoordinate(){

		//x%= 2 * Final.APPLET_WIDTH;
		return x;
	}
	public int ycoordinate(){
		y = (int) Math.sin(x);
		//y%= Final.APPLET_HEIGHT;
		return y;
	}

}
