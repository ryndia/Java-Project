package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;

import javax.swing.border.StrokeBorder;

class DrawPoly {
	
	Polygon p;
	int inputInt;
	int sideSize;
	int x,y;
	Color color;
	
	public DrawPoly(int h, int w,int in, int s, Color c){
		
		p  = new Polygon();
		color = c;
		inputInt = in;
		sideSize = s;
		x = w;
		y = h;
		
		double anglePhase = 0;
		double angle = 360/inputInt;
		double radius = sideSize/2;
		int coordx = (int) (x/2);
		int coordy = (int) ((y/2) - radius);
		
		angle = ((2*Math.PI)/360)*angle;


		p.addPoint(coordx,coordy);
		
		for(int i = 1; i< inputInt; i++)
		{
			anglePhase = angle *i;
			
			if(anglePhase >= 0 && anglePhase <= Math.PI/2)
			{
				coordx = (int)(radius *(Math.sin(anglePhase)));
				coordy = (int)(radius *(Math.sin((Math.PI/2) - anglePhase)));
				coordx = coordx + (x/2);
				coordy = (y/2) - coordy;
				p.addPoint(coordx,coordy);
			}
			else if(anglePhase > (Math.PI)/2 && anglePhase <= Math.PI)
			{
				anglePhase = Math.PI - anglePhase;
				coordx = (int)(radius *(Math.sin(anglePhase)));
				coordy = (int)(radius *(Math.sin((Math.PI/2) - anglePhase)));
				coordx+=(x/2);
				coordy+=(y/2);
				p.addPoint(coordx,coordy);
			}
			else if(anglePhase > Math.PI && anglePhase <= (3*Math.PI)/2)
			{
				anglePhase = anglePhase - Math.PI;
				coordx = (int)(radius *(Math.sin(anglePhase)));
				coordy = (int)(radius *(Math.sin((Math.PI/2) - anglePhase)));
				coordx = (x/2) - coordx;
				coordy+=(y/2);
				p.addPoint(coordx,coordy);
			}
			else
			{
				anglePhase = (2*Math.PI) - anglePhase;
				coordx = (int)(radius *(Math.sin(anglePhase)));
				coordy = (int)(radius *(Math.sin((Math.PI/2) - anglePhase)));
				coordx =(x/2) - coordx;
				coordy =(y/2) - coordy;
				p.addPoint(coordx,coordy);
			}
		}	
	}
	
	public void draw(Graphics g)
	{
		Graphics2D ga = (Graphics2D)g;
		ga.setColor(color);
		ga.setStroke(new BasicStroke(3));
		ga.drawPolygon(p);
		ga.fillPolygon(p);
	}
}