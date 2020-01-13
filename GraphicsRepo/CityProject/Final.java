import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;



public class Final extends Applet{

	private Building build1;

	private final int APPLET_WIDTH = 1000;
	private final int APPLET_HEIGHT = 1000;
	private final int HEIGHT_MIN = 1000;
	private final int VARIANCE = 40;

	public void init(){
		build1 = new Building(60, 60, Color.red);

	}
	public void paint(Graphics page){
		build1.draw(page);

	}


}