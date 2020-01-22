import java.awt.*;

public class Road{
	private int x = 180;
	public Road(){
	}

	public void draw(Graphics page){
			page.setColor(Color.black);
			page.fillRect(0, 300, Final.APPLET_WIDTH, 100);
			page.setColor(Color.green);
			page.fillRect(0, 400, Final.APPLET_WIDTH, 500);
			page.setColor(Color.yellow);
			page.fillRect(x-180, 345, 70, 10);
			//page.setColor(Color.yellow);
			page.fillRect(x, 345, 70, 10);
			page.fillRect(2*x, 345, 70, 10);
			page.fillRect(3*x, 345, 70, 10);
			page.fillRect(4*x, 345, 70, 10);
			page.fillRect(5*x, 345, 70, 10);
			page.fillRect(6*x, 345, 70, 10);

	}
}