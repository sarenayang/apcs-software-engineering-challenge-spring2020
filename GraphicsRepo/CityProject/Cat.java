import java.awt.*;

public class Cat{
	private int x, y;
	public Cat(int a, int b){
		x = a;
		y = b;
	}

	public static void draw(Graphics page){
		page.setColor(Color.black);
		//head
		page.fillRect(500, 410, 20, 20);
		//left ears
		page.fillRect(500, 405, 4, 23);
		page.fillRect(496, 402, 4, 24);
		//left whiskers
		page.fillRect(490, 415, 23, 3);
		page.fillRect(490, 420, 23, 3);

	}

}