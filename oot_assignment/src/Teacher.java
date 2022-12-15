import java.util.ArrayList;

public class Teacher {
	String name;
	int id;
	String faculty;
	ArrayList<String> module;
	

	
	public Teacher(String name, int id, String faculty, ArrayList<String> module) {
		this.name = name;
		this.id = id;
		this.faculty = faculty;
		this.module = module;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public ArrayList<String> getModule() {
		return module;
	}

	public void setModule(ArrayList<String> module) {
		this.module = module;
	}
}
