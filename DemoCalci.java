import java.applet.*;
import java.awt.*;

public class DemoCalci extends Applet
{
	Button b1;
	Label l1;
	Label l2;
	Label l3;
	TextField t1;
	TextField t2;
	TextField t3;
	public void init()
	{
	b1=new Button("ok");
	l1=new Label("Enter 1st number");
	l2=new Label("Enter 2nd number");
	l3=new Label("Result");
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();

	setLayout(null);
	l1.setBounds(50,100,150,25);
	t1.setBounds(205,100,150,25);
	l2.setBounds(50,130,150,25);
	t2.setBounds(205,130,150,25);
	l3.setBounds(50,160,150,25);
	t3.setBounds(205,160,150,25);
	b1.setBounds(100,200,150,25);
	add(l1);
	add(t1);
	add(b1);
	add(l2);
	add(l3);
	add(t2);
	add(t3);

	}
}
/*<applet Code="DemoCalci.java" height="1500" width = "1500">
</applet>*/