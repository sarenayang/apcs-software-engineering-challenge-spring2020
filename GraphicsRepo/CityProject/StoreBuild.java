
import java.awt.*;
import java.util.Random;

public class StoreBuild{
	private Building build1, build2, build3, build4, build5, build6, build7, build8, build9;
	Random gen = new Random();

	public StoreBuild(){

		//when moving buildings over, do #of windows of previous building * 20 + 10 to be next to each other
		//(start x, start y, num of windows across, number of windows down, color)

		build1 = new Building(0, 300, 6, 9, Color.red);
		build2 = new Building(132, 300, 6, 6, Color.green);
		build3 = new Building(262, 300, 6, 10, Color.blue);
		build4 = new Building(392, 300, 6, 6, Color.yellow);
		build5 = new Building(522, 300, 6, 13, Color.pink);
		build6 = new Building(652, 300, 6, 11, Color.gray);
		build7 = new Building(782, 300, 6, 5, Color.lightGray);
		build8 = new Building(912, 300, 6, 8, Color.magenta);
		build9 = new Building(1042, 300, 6, 14, Color.darkGray);

		//makes better colors haha
		build1.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build2.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build3.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build4.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build5.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build6.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build7.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build8.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
		build9.setNewColor(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
	}


	public void draw(Graphics page){

		//draws buildings
		build1.draw(page);
		build2.draw(page);
		build3.draw(page);
		build4.draw(page);
		build5.draw(page);
		build6.draw(page);
		build7.draw(page);
		build8.draw(page);
		build9.draw(page);

		//moves buildings to the right
		build1.setX(build1.getXPoint()-3);
		build2.setX(build2.getXPoint()-3);
		build3.setX(build3.getXPoint()-3);
		build4.setX(build4.getXPoint()-3);
		build5.setX(build5.getXPoint()-3);
		build6.setX(build6.getXPoint()-3);
		build7.setX(build7.getXPoint()-3);
		build8.setX(build8.getXPoint()-3);
		build9.setX(build9.getXPoint()-3);



	}

}