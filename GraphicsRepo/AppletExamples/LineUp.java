//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class LineUp extends JApplet
{

	//setting up applet window dimensions
   private final int APPLET_WIDTH = 400;
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 40;

   private StickFigure figure1, figure2;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   //constructor happens only once when started
   public void init ()
   {
      int h1, h2;  // heights of stick figures
      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);

		//sets the starting point of the stick figure (x,y)
      figure1 = new StickFigure (100, 150, Color.red, h1);
	  figure2 = new StickFigure (150, 150, Color.green, h2);

      setBackground (Color.black);
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

   }
}
