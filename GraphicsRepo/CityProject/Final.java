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
		build1 = new Building(50, 200, 10, 4, Color.red);
		build2 = new Building(155, 200, 4, 6, Color.green);
		setSize (APPLET_WIDTH, APPLET_HEIGHT);

	}
	public void paint(Graphics page){
		build1.draw(page);
		build2.draw(page);
		try{
			//pause the program for a quarter second (millisecond)
			Thread.sleep(100);
			}
		catch(InterruptedException e) {}
		repaint();

	}


}