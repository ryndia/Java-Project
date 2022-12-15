import java.util.ArrayList;


public class startApp {
	
	static public ArrayList<student> s = new ArrayList<student>();
	static public ArrayList<Teacher> t = new ArrayList<Teacher>();
	static public Teacher teacher = null;

    public static void main(String args[]) {
    	login lg = new login();
    	lg.setVisible(true);
    }
}
