package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.*;


public class PolySwing extends JFrame{
	
	int side = 0;
	int point = 0;
	Color color;
	DrawPoly temp;
	int count = 0;
	ArrayList<DrawPoly> dpArr = new ArrayList<DrawPoly>();
	JComboBox<Integer> dropbox;
	
	public PolySwing()
	{
		renderFrame();
	}
	public void renderFrame()
	{
		new JFrame("Polygon Drawing");
		setBackground(Color.gray);
		setSize(800,600);
		setVisible(true);
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		dropbox = new JComboBox<Integer>();
		JPanel panel = new JPanel();
		JButton enter = new JButton("Enter");
		JButton chColor = new JButton("choose color");
		JLabel pointLabel = new JLabel("Enter Number of side:");
		JLabel sideSize = new JLabel("Enter size of polygon:");
		JTextField fieldPoint = new JTextField(3);
		JTextField fieldSide = new JTextField(3);
		
		enter.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String sideS = fieldSide.getText();
					String pointS = fieldPoint.getText();
					side = Integer.parseInt(sideS);
					point = Integer.parseInt(pointS);
					addpoly();
					dropbox.addItem(dpArr.size());
					dropbox.revalidate();
				}
			}
		);
		chColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    
				Color initialcolor=Color.RED;    
				color=JColorChooser.showDialog(new JFrame(),"Select a color",initialcolor);    
			} 
		});
		
		panel.add(pointLabel);
		panel.add(fieldPoint);
		panel.add(sideSize);
		panel.add(fieldSide);
		panel.add(enter);
		panel.add(chColor);
		panel.add(dropbox);
		add(panel);
	}
	
	public void addpoly()
	{
		temp = new DrawPoly(600,800,point,side,color);
		repaint();
		dpArr.add(temp);
	}
	
	
	@Override
	public void paint(Graphics g)
	{
		if(temp != null)
		{
			((DrawPoly) temp).draw(g);
		}
	}
}

