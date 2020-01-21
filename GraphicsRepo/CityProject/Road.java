import java.awt.*;

public class Road{
	public Road(){
	}

	public void draw(Graphics page){
			page.setColor(Color.black);
			page.fillRect(0, 300, Final.APPLET_WIDTH, 100);
			page.setColor(Color.yellow);
			page.fillRect(10, 345, 70, 10);
			page.setColor(Color.yellow);
			page.fillRect(90, 345, 70, 10);

	}
}