import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends JApplet{
	private Random gen = new Random();

	private StoreBuild building;
	private Sky sky;
	private Moon moon;
	public static final int APPLET_WIDTH = 1042;
	public static final int APPLET_HEIGHT = 500;

	Image offscreen;
	Graphics bufferGraphics;
	public void init(){

		building = new StoreBuild();
		sky = new Sky();
		moon = new Moon();
		offscreen = createImage(APPLET_WIDTH, APPLET_HEIGHT);
		bufferGraphics = offscreen.getGraphics();
		setSize (APPLET_WIDTH, APPLET_HEIGHT);
	}
	public void paint(Graphics page){
			bufferGraphics.clearRect(0, 0, APPLET_WIDTH, APPLET_HEIGHT);

			sky.draw(bufferGraphics);
			moon.draw(bufferGraphics);
			//focuses on making and moving only the buildings
			building.draw(bufferGraphics);

			page.drawImage(offscreen, 0, 0, this);
			try{
				//pause the program for a quarter second (millisecond)
				Thread.sleep(100);
			}
			catch(InterruptedException e) {}

		repaint();

	}


}