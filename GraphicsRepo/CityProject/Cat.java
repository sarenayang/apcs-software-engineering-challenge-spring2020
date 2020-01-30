import java.awt.*;

public class Cat{
	private int x, y;
	//color of a bush
	Color bush = new Color(45, 100, 20);

	//x = mouse click tracker
	public Cat(int a){
		x = a;
	}

	public void draw(Graphics page){

		//colors change to blend cat in or "disappear" on mouse click

		//wheels
		page.setColor(Color.white);
		page.fillOval(460, 355, 30, 30);
		page.fillOval(525, 355, 30, 30);
		//bush
		page.setColor(bush);
		page.fillRect(490, 310, 40, 40);
		page.fillRect(480, 320, 60, 40);
		page.fillRect(470, 330, 80, 40);
		page.fillRect(460, 340, 100,30);
		page.fillRect(450, 350, 120,20);

		//mouse was not clicked/alternating colors
		if (x == 0)
			page.setColor(Color.black);

		//mouse was clicked
		else
			page.setColor(bush);

		//head
		page.fillRect(500, 330, 20, 20);
		//left ears
		page.fillRect(500, 325, 4, 23);
		page.fillRect(496, 322, 4, 24);
		//left whiskers
		page.fillRect(490, 335, 23, 3);
		page.fillRect(490, 340, 23, 3);
		//right ears
		page.fillRect(516, 325, 4, 23);
		page.fillRect(520, 322, 4, 24);
		//right whiskers
		page.fillRect(507, 335, 23, 3);
		page.fillRect(507, 340, 23, 3);

		//since eyes are different colors, needs a separate color change
		//eyes
		if (x == 0)
			page.setColor(Color.yellow);
		else
			page.setColor(bush);
		page.fillRect(502, 335, 4, 4);
		page.fillRect(515, 335, 4, 4);



	}
	public void setNum(int a){
		x = a;
	}
}