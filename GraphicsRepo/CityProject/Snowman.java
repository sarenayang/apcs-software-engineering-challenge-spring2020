import java.awt.*;
public class Snowman{

	//x_start and y_start are coordinate values, command is mouseListener tracker
	private int x_start, y_start, command = 0;
	public Snowman(int x, int y){
		x_start = x;
		y_start = y;
	}

	//sets new x coordinate value
	public void setX(int value){
		x_start = value;

	}

	//sets new y coordinate value
	public void setY(int value){
		y_start = value;
	}

	//sets new command value
	public void setNum(int value){
		command = value;
	}
	public void draw(Graphics page){
		//if mouse is clicked, the snowman jumps/moves up a little
		if(command == 1){
			y_start-= 40;

			//reset back to 0 so the snowman comes back down rather than having
			//to click repeatedly
			command = 0;
			}
			page.setColor(Color.white);
			page.fillOval(x_start, y_start, 40, 40);
			page.fillOval(x_start-7, y_start+30, 55, 55);
			page.fillOval(x_start-20, y_start+60, 80, 80);
			page.setColor(Color.black);
			page.fillOval(x_start+10, y_start+13, 5,5);
			page.fillOval(x_start+25, y_start+13, 5, 5);

			//changes y_start back to 250 or else snowman keeps going up
			y_start = 250;

		}
	}

