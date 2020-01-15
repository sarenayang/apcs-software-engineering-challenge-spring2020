import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends Applet{
	private Random gen = new Random();
	private Building build1, build2, build3, build4;
	private int h1, h2, h3, h4, h5, base;
	private final int APPLET_WIDTH = 1000;
	private final int APPLET_HEIGHT = 500;
	private final int HEIGHT_MIN = 100;
	private final int VARIANCE = 40;

	public void init(){
		base = 150;

		h1 = gen.nextInt(100) + 150;
		h2 = gen.nextInt(100) + 150;
		h3 = gen.nextInt(100) + 150;
		h4 = gen.nextInt(100) + 150;

		//when moving buildings over, do #of windows of previous building * 20 + 10 to be next to each other
		//(start x, start y, num of windows across, number of windows down, color)

		build1 = new Building(50, 300, 4, 4, Color.red);
		build2 = new Building(140, 300, 4, 6, Color.green);
		build3 = new Building(230, 300, 5, 9, Color.blue);
		build4 = new Building(340, 300, 6, 3, Color.yellow);
		setSize (APPLET_WIDTH, APPLET_HEIGHT);

	}
	public void paint(Graphics page){
		build1.draw(page);
		build2.draw(page);
		build3.draw(page);
		build4.draw(page);
		try{
			//pause the program for a quarter second (millisecond)
			Thread.sleep(100);
			}
		catch(InterruptedException e) {}
		repaint();

	}


}