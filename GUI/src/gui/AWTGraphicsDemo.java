package gui;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class AWTGraphicsDemo extends Frame {
public AWTGraphicsDemo(){
super("Java AWT Examples");
prepareGUI();
}
public static void main(String[] args){
AWTGraphicsDemo awtGraphicsDemo = new AWTGraphicsDemo();
awtGraphicsDemo.setVisible(true);
}
private void prepareGUI(){
setSize(400,400);
setBackground(Color.gray);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent){
System.exit(0);
}
});
}
@Override
public void paint(Graphics g) {
Rectangle2D shape = new Rectangle2D.Float();
shape.setFrame(100, 150, 200,100);
Graphics2D g2 = (Graphics2D) g;
g2.draw (shape);
Font font = new Font("Serif", Font.PLAIN, 24);
g2.setFont(font);
g.drawString("Welcome to TutorialsPoint", 50, 70);
g2.drawString("Rectangle2D.Rectangle", 100, 120);
}

}