import java.awt.*;

public class Sky implements Runnable{

	private int time = 0, dnlength = 200;
	Color day = new Color(135, 205, 235), night = new Color(25, 25, 112);

	public Sky(){
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run(){
		while (true) {
			try{
				Thread.sleep(100);
			}
			catch(Exception e){}

			time++;
			time %= dnlength;
		}
	}
	public void draw(Graphics page){
		double t_idx = ((double)time/dnlength);
		double mixRatio = 0.5+0.5*Math.pow(Math.abs(Math.sin(2*Math.PI*t_idx)), .2);
		if (Math.sin(2*Math.PI*t_idx)<0) mixRatio = 1.0-mixRatio;
		page.setColor(mix(day, night, mixRatio));
		page.fillRect(0,0,Final.APPLET_WIDTH, Final.APPLET_HEIGHT);
	}

	public static Color mix(Color c1, Color c2, double a) {
		System.out.println(a);
		double r = (1.0-a)*c1.getRed() + a*c2.getRed();
		double g = (1.0-a)*c1.getGreen() + a*c2.getGreen();
		double b = (1.0-a)*c1.getBlue() + a*c2.getBlue();
		if (r<0) r=0;
		if (r>255) r=255;
		if (g<0) g=0;
		if (g>255) g=255;
		if (b<0) b=0;
		if (b>255) b=255;

		return new Color((int)r, (int)g, (int)b);
	}
}