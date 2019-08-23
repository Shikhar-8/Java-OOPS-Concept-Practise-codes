import java.awt.*;
import java.applet.*;
public class DemoApp extends Applet//called by java.applet.* // public is important
{
	public void paint(Graphics gh)// called by java.awt.*
	{
	gh.drawLine(10,10,200,200);// drawline is a function of class Graphics and gh is an object.
	}   // (starting x, starting y , end x, end y)
}
/*
<applet code="DemoApp.java" height="400" width="700">
</applet>
*/