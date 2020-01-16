import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends Applet{
	private Random gen = new Random();

	private Building build1, build2, build3, build4, build5, build6;

	private final int APPLET_WIDTH = 1000;
	private final int APPLET_HEIGHT = 500;

	public void init(){

		//when moving buildings over, do #of windows of previous building * 20 + 10 to be next to each other
		//(start x, start y, num of windows across, number of windows down, color)

		build1 = new Building(50, 300, 4, 9, Color.red);
		build2 = new Building(150, 300, 4, 6, Color.green);
		build3 = new Building(250, 300, 9, 10, Color.blue);
		build4 = new Building(450, 300, 2, 6, Color.yellow);
		build5 = new Building(510, 300, 11, 13, Color.pink);
		build6 = new Building(750, 300, 9, 11, Color.gray);

		setSize (APPLET_WIDTH, APPLET_HEIGHT);
		setBackground(Color.cyan);

	}
	public void paint(Graphics page){

			build1.draw(page);
			build2.draw(page);
			build3.draw(page);
			build4.draw(page);
			build5.draw(page);
			build6.draw(page);

			page.fillRect(0, 300, 1000, 50);

			try{
				//pause the program for a quarter second (millisecond)
				Thread.sleep(100);
			}
			catch(InterruptedException e) {}



		repaint();

	}


}