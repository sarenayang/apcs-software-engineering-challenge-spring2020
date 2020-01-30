import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Final extends JApplet implements MouseListener{
	private Random gen = new Random();

	//objects created to make the animation
	private StoreBuild building;
	private Sky sky;
	private Yellow_Stripes road;
	private Cat cat;
	private Snowman snowman;

	//used as a counter for the mouseListener
	private int num = 0;

	//applet window size, made public so numbers can be accessed in other classes
	public static final int APPLET_WIDTH = 1042;
	public static final int APPLET_HEIGHT = 500;

	//buffer graphics, helps in less choppy animation
	Image offscreen;
	Graphics bufferGraphics;

	public void init(){

		//initiating new objects
		building = new StoreBuild();
		sky = new Sky();
		road = new Yellow_Stripes();
		cat = new Cat(num);
		snowman = new Snowman(300, 250);

		//buffer graphics
		offscreen = createImage(APPLET_WIDTH, APPLET_HEIGHT);
		bufferGraphics = offscreen.getGraphics();
		setSize (APPLET_WIDTH, APPLET_HEIGHT);

		//mouseListener
		addMouseListener(this);
	}
	public void paint(Graphics page){

			//clears last image, afterwards draws new image
			bufferGraphics.clearRect(0, 0, APPLET_WIDTH, APPLET_HEIGHT);

			//animates the sky color change and moon and sun change
			sky.draw(bufferGraphics);

			//focuses on making and moving only the buildings
			building.draw(bufferGraphics);

			//the road
			bufferGraphics.setColor(Color.black);
			bufferGraphics.fillRect(0, 300, APPLET_WIDTH, 100);
			bufferGraphics.setColor(Color.white);
			bufferGraphics.fillRect(0, 400, APPLET_WIDTH, 100);
			road.draw(bufferGraphics);

			//cat and snowman, animated based on mouse click
			cat.draw(bufferGraphics);
			snowman.draw(bufferGraphics);

			//draws everything above
			page.drawImage(offscreen, 0, 0, this);

			try{
				//pause the program
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
	  //num tracks how many times the mouse was clicked to change the position of the cat and snowman
	  //resets to 0 when it reaches 2
	 num++;
	 num %= 2;
	 cat.setNum(num);
	 snowman.setNum(num);
	 repaint();
	  }
  public void mouseEntered(MouseEvent e)
  {}
  public void mouseExited(MouseEvent e)
  {}
}