package gui;
import java.awt.*;
import java.awt.event.*;
import java.awt.Polygon;


public class Poly extends Frame{
	
	int sideSize;
	int inputInt = 5;
	int x = 800;
	int y = 800;
	drawpoly dp;
	public Poly() {
		//renderGUI();
	}
	void renderGUI() {
		
		new Frame("polygon drawing");
		setSize(x,y);
		setVisible(true);
		setBackground(Color.gray);
		setLayout(new GridLayout(8, 8));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		Label out = new Label();
		Label out2 = new Label();
		Label fieldText = new Label("Enter the number of side of polygon");
		Label fieldSideSize = new Label("Enter the size(px)");
		TextField in = new TextField(100);

		TextField in2 = new TextField(100);

		Button enter = new Button("ENTER"); 
		Button enter2 = new Button("ENTER"); 

		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String input = in.getText();
				System.out.println(input);
				inputInt = Integer.parseInt(input);
				out.setText(input);
			}
		});
		
		enter2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String input = in2.getText();
				out2.setText(input);
				sideSize = Integer.parseInt(input);
				dp = new drawpoly(inputInt,sideSize);
				add(dp);
			}
			
		});
		Panel controlpanel = new Panel();
		controlpanel.setLayout(new FlowLayout());
		Panel controlpanel2 = new Panel();
		controlpanel2.setLayout(new FlowLayout());

		controlpanel.add(fieldText);
		controlpanel.add(in);
		controlpanel.add(enter);
		controlpanel2.add(fieldSideSize);
		controlpanel2.add(in2);
		controlpanel2.add(enter2);
		add(controlpanel);
		add(controlpanel2);
		//add(out);
		//add(out2);	
	}

}

class drawpoly extends Panel{
	
	int inputInt;
	int sideSize;
	int x = 600, y = 400;
	public drawpoly(int i, int s){
		inputInt = i;
		sideSize = s;
	}
	
	@Override
	public void paint(Graphics g)
	{
		double angle = 360/inputInt;
		double radius = sideSize/2;
		int coordx = x/2;
		int coordy = (int) ((y/2) + radius);
		
		Graphics2D ga = (Graphics2D)g;
		Polygon p = new Polygon();
		p.addPoint(coordx,coordy);
		
		for(int i = 1; i< inputInt; i++)
		{
			coordx = (int)(radius *(Math.sin(angle)));
			coordy = (int)(radius *(Math.sin(90 - angle)));
			double anglePhase = angle *i;
			if(anglePhase >= 0 && anglePhase <= 90)
			{
				coordx+=(x/2);
				coordy-=(y/2);
				p.addPoint(coordx,coordy);
			}
			else if(anglePhase > 90 && anglePhase <= 180)
			{
				coordx+=(x/2);
				coordy+=(y/2);
				p.addPoint(coordx,coordy);
			}
			else if(anglePhase > 180 && anglePhase <= 270)
			{
				coordx-=(x/2);
				coordy+=(y/2);
				p.addPoint(coordx,coordy);
			}
			else
			{
				coordx-=(x/2);
				coordy-=(y/2);
				p.addPoint(coordx,coordy);
			}
		}	
		ga.setColor(Color.red);
		ga.drawPolygon(p);
		ga.fillPolygon(p);
	}
}