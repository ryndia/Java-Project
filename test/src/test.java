import javax.swing.*;
import java.awt.*;


class test extends JFrame{
	public test() {
		initComponent();
	}
	
	public void initComponent() {
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("Center");
		JButton btn3 = new JButton("South");
		JButton btn4 = new JButton("East");
		JButton btn5 = new JButton("West");
		
		BorderLayout b = new BorderLayout(30,0);
		setLayout(b);
		b.setVgap(30); // set Gap between component, if only 1 component no gap is set V == vertical H == horizontal
		
		
		//BorderLayout.PAGE_START top of panel
		//BorderLayout.PAGE_END bottom of panel
		//BorderLayout.LINE_START leftmost of panel
		//BorderLayout.LINE_END rightmost of panel
		
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.CENTER);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.WEST);
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
/*
class test1{
	public static void main(String[] args)
	{
		test t = new test();
	}
}
*/
