import java.awt.*;
public class Snowman{

	private int x_start, y, command =0 ;
	public Snowman(int value, int some){
		x_start = value;
		y = some;
	}

	public void setX(int value){
		x_start = value;

	}
	public void setY(int value){
		y = value;
	}
	public void setCommand(int value){
		command = value;
	}
	public void draw(Graphics page){

		page.setColor(Color.white);
		page.fillOval(x_start, 250, 40, 40);
		page.fillOval(x_start-7, 280, 55, 55);
		page.fillOval(x_start-20, 310, 80, 80);
		page.setColor(Color.black);
		page.fillOval(x_start+10, 263, 5,5);
		page.fillOval(x_start+25, 263, 5, 5);
	}
}