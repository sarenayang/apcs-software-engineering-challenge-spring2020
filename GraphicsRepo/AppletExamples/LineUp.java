//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class LineUp extends Applet
{

	//setting up applet window dimensions
   private final int APPLET_WIDTH = 400;
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 40;

   private StickFigure figure1, figure2, fig3, fig4;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   //constructor happens only once when started
   public void init ()
   {
      int h1, h2, h3, h4;  // heights of stick figures
      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);

		//sets the starting point of the stick figure (x,y), color, and height
      figure1 = new StickFigure (100, 150, Color.red, h1);
	  figure2 = new StickFigure (150, 150, Color.green, h2);
	  fig3 = new StickFigure (200, 150, Color.cyan, h3);
	  fig4 = new StickFigure (250, 150, Color.pink, h4);

      //setBackground (Color.black);
      //sets the appelet size
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   //runs all the time as opposed to init
   public void paint (Graphics page)
   {
      figure1.draw (page);
	  figure2.draw(page);
	  fig3.draw(page);
	  fig4.draw(page);

		Random generator = new Random();

		int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
		int newHeight2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
		figure1.setHeight(newHeight);
		figure2.setHeight(newHeight2);

		try{
			//pause the program for a quarter second (millisecond)
			Thread.sleep(250);
		}
		catch(InterruptedException e) {}
		repaint();
   }
}
