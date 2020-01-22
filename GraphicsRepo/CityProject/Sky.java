import java.awt.*;

public class Sky implements Runnable{

	private int time = 0, dnlength = 1000;
	Color day = new Color(135, 205, 235), night = new Color(0, 0, 0);

	public Sky(){
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run(){
		//runs a multithread
		while (true) {
			try{
				Thread.sleep(20);
			}
			catch(Exception e){}

			//time keeps track of whether it's day or night
			time++;

			//makes sure that time stays within the set range
			time %= dnlength;
		}
	}
	public void draw(Graphics page){

		//x-value of the function
		double t_idx = ((double)time/dnlength);

		//y-value of the function aka "a" for mix()
		double mixRatio = 0.5+0.5*Math.pow(Math.abs(Math.sin(2*Math.PI*t_idx)), .2);

		//since Math.pow doesn't like negatives
		if (Math.sin(2*Math.PI*t_idx)<0)
			mixRatio = 1.0-mixRatio;

		//changes the color
		page.setColor(mix(day, night, mixRatio));
		page.fillRect(0,0,Final.APPLET_WIDTH, Final.APPLET_HEIGHT);


		double sun_x = Final.APPLET_WIDTH/2.0 + Final.APPLET_WIDTH/2.0*Math.cos(2.0*Math.PI*t_idx);
		double sun_y = Final.APPLET_HEIGHT/2.0 + Final.APPLET_HEIGHT/2.0*Math.sin(2.0*Math.PI*t_idx);
		double moon_x = Final.APPLET_WIDTH/2.0 + Final.APPLET_WIDTH/2.0*Math.cos(Math.PI+2.0*Math.PI*t_idx);
		double moon_y = Final.APPLET_HEIGHT/2.0 + Final.APPLET_HEIGHT/2.0*Math.sin(Math.PI+2.0*Math.PI*t_idx);
		page.setColor(Color.yellow);
		page.fillOval((int) sun_x, (int) sun_y, 50, 50);
		page.setColor(Color.gray);
		page.fillOval((int) moon_x, (int) moon_y, 50, 50);
	}

	//creates a new color for the sky, making a more radiant transition rather than
	//a sudden change in color
	public static Color mix(Color c1, Color c2, double a) {
		//System.out.println(a);

		//creates a shade that's a mixture of the day and night colors
		double r = (1.0-a)*c1.getRed() + a*c2.getRed();
		double g = (1.0-a)*c1.getGreen() + a*c2.getGreen();
		double b = (1.0-a)*c1.getBlue() + a*c2.getBlue();

		//rgb value fix so range is not out of bounds
		if (r<0)
			r=0;
		else if (r>255)
			r=255;
		if (g<0)
			g=0;
		else if (g>255)
			g=255;
		if (b<0)
			b=0;
		else if (b>255)
			b=255;

		return new Color((int)r, (int)g, (int)b);
	}
}