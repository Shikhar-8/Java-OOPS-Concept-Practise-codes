import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class DemoCalculatorr extends Applet implements ActionListener
{
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	Button b12;
	Button b13;
	Button b14;	
	Button b15;
	Button b16;
	Button b17;
	Button b18;
	TextField t1;
	public void init()
	{
	b1=new Button("1");
	b2=new Button("4");
	b3=new Button("7");
	b4=new Button("clr");
	b5=new Button("Power");
	b6=new Button("2");
	b7=new Button("5");
	b8=new Button("8");
	b9=new Button("0");
	b10=new Button(".");
	b11=new Button("3");
	b12=new Button("6");
	b13=new Button("9");
	b14=new Button("=");
	b15=new Button("+");
	b16=new Button("-");
	b17=new Button("/");
	b18=new Button("*");
	t1=new TextField();	

	setLayout(null);
	t1.setBounds(50,160,140,30);
	b1.setBounds(50,200,30,30);
	b2.setBounds(50,235,30,30);
	b3.setBounds(50,270,30,30);
	b4.setBounds(50,305,30,30);
	b5.setBounds(50,340,30,30);
	b6.setBounds(85,200,30,30);
	b7.setBounds(85,235,30,30);
	b8.setBounds(85,270,30,30);
	b9.setBounds(85,305,30,30);
	b10.setBounds(85,340,30,30);
	b11.setBounds(120,200,30,30);
	b12.setBounds(120,235,30,30);
	b13.setBounds(120,270,30,30);
	b14.setBounds(120,305,30,30);
	b15.setBounds(155,200,30,30);
	b16.setBounds(155,235,30,30);
	b17.setBounds(155,270,30,30);
	b18.setBounds(155,305,30,30);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
	
	add(t1);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);
	add(b10);
	add(b11);
	add(b12);
	add(b13);
	add(b14);
	add(b15);
	add(b16);
	add(b17);
	add(b18);
	}
	public void actionperformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText(t1.getText()+"1");

		}
		else if(ae.getSource()==b2)
		{
			t1.setText(t1.getText()+"2");

		}
		else if(ae.getSource()==b3)
		{
			t1.setText(t1.getText()+"3");

		}
		else if(ae.getSource()==b4)
		{
			t1.setText(t1.getText()+"4");

		}
		else if(ae.getSource()==b5)
		{
			t1.setText(t1.getText()+"5");

		}
		else if(ae.getSource()==b6)
		{
			t1.setText(t1.getText()+"6");

		}
		else if(ae.getSource()==b7)
		{
			t1.setText(t1.getText()+"7");

		}
		else if(ae.getSource()==b8)
		{
			t1.setText(t1.getText()+"8");

		}
		else if(ae.getSource()==b9)
		{t1.setText(t1.getText()+"9");

		}
		else if(ae.getSource()==b10)
		{


		}
		else if(ae.getSource()==b11)
		{

		}
		else if(ae.getSource()==b12)
		{

		}
		else if(ae.getSource()==b13)
		{

		}
		else if(ae.getSource()==b14)
		{

		}
		else if(ae.getSource()==b15)
		{

		}
		else if(ae.getSource()==b16)
		{

		}
		else if(ae.getSource()==b17)
		{

		}
		else if(ae.getSource()==b18)
		{

		}
		

	}
}
/*<applet Code="DemoCalculatorr.java" height="1500" width = "1500">
</applet>*/