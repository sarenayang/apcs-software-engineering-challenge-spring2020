import java.awt.*;

public class Moon implements Runnable{

	private int x=0, y=0;
	private Thread thread;
	public Moon(){
		thread = new Thread(this);
		thread.start();
	}

	public void draw(Graphics page){
		//moon course = (x-521)^2/1000 + (y-250)^2/500 = 1
		page.setColor(Color.gray);
		page.fillOval(xcoordinate(), 50, 50, 50);

	}
	public void run(){
		while (true) {
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}

	}
	}
	public int xcoordinate(){

		x+=5;
		x%= Final.APPLET_WIDTH;
		return x;
	}
	public  int ycoordinate(){
		y++;
		y%= Final.APPLET_HEIGHT;
		return y;
	}

}
