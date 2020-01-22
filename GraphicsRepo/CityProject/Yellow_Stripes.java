import java.awt.*;
public class Yellow_Stripes{
	Road s1, s2, s3, s4, s5, s6, s7;
	public Yellow_Stripes(){
		s1 = new Road(0);
		s2 = new Road(180);
		s3 = new Road(360);
		s4 = new Road(540);
		s5 = new Road(720);
		s6 = new Road(900);
		s7 = new Road(1080);

	}

	public void draw(Graphics page){
		s1.draw(page);
		s2.draw(page);
		s3.draw(page);
		s4.draw(page);
		s5.draw(page);
		s6.draw(page);
		s7.draw(page);

		s1.setX(s1.getX()-3);
		s2.setX(s2.getX()-3);
		s3.setX(s3.getX()-3);
		s4.setX(s4.getX()-3);
		s5.setX(s5.getX()-3);
		s6.setX(s6.getX()-3);
		s7.setX(s7.getX()-3);


	}

}