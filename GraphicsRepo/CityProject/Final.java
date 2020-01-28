import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Final extends JApplet implements MouseListener{
	private Random gen = new Random();

	private StoreBuild building;
	private Sky sky;
	private Yellow_Stripes road;
	private Cat cat;
	private Snowman snowman;
	private int num = 0;
	public static final int APPLET_WIDTH = 1042;
	public static final int APPLET_HEIGHT = 500;

	Image offscreen;
	Graphics bufferGraphics;
	public void init(){

		building = new StoreBuild();
		sky = new Sky();
		road = new Yellow_Stripes();
		cat = new Cat(num);
		snowman = new Snowman(300);
		offscreen = createImage(APPLET_WIDTH, APPLET_HEIGHT);
		bufferGraphics = offscreen.getGraphics();
		setSize (APPLET_WIDTH, APPLET_HEIGHT);
		addMouseListener(this);
	}
	public void paint(Graphics page){
			bufferGraphics.clearRect(0, 0, APPLET_WIDTH, APPLET_HEIGHT);

			sky.draw(bufferGraphics);

			//focuses on making and moving only the buildings
			building.draw(bufferGraphics);
			//road.draw(bufferGraphics);

			//the road
			bufferGraphics.setColor(Color.black);
			bufferGraphics.fillRect(0, 300, APPLET_WIDTH, 100);
			bufferGraphics.setColor(Color.white);
			bufferGraphics.fillRect(0, 400, APPLET_WIDTH, 100);
			road.draw(bufferGraphics);
			cat.draw(bufferGraphics);
			snowman.draw(bufferGraphics);
			page.drawImage(offscreen, 0, 0, this);
			try{
				//pause the program for a quarter second (millisecond)
				Thread.sleep(50);
			}
			catch(InterruptedException e) {}

		repaint();

	}
public void mousePressed(MouseEvent e)
  {}
  public void mouseReleased(MouseEvent e)
  {}
  public void mouseClicked(MouseEvent e)
  {
	 num++;
	 num %= 2;
	 cat.setNum(num);
	 repaint();
	  }
  public void mouseEntered(MouseEvent e)
  {}
  public void mouseExited(MouseEvent e)
  {}
}