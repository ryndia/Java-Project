import java.time.LocalDate;
import java.util.ArrayList;

public class student {
	private String  name;
	private int sID;
	private String faculty;
	private int year;
	private String course;
	private LocalDate dob;
	private Boolean gender;
	private ArrayList<String> module;
	private ArrayList<Attendance> attendance;

	student(String n,LocalDate d,Boolean g,String c,int s,int y, String f)
	{
		this.course = c;
		this.year = y;
		this.dob = (d);
		this.gender = (g);
		this.name = n;
		this.sID = s;
		this.faculty = f;
	}

	public String getName() {
		return name;
	}

	public int getsID() {
		return sID;
	}

	public String getFaculty() {
		return faculty;
	}
	
	public ArrayList<Attendance> getPresenceByModule(String module)
	{
		ArrayList<Attendance> pByModule = new ArrayList<Attendance>();
		for(Attendance a: attendance)
		{
			if(a.getModule().compareTo(module)== 1)
			{
				pByModule.add(a);
			}
		}
		return pByModule;
	}
	
	public ArrayList<Attendance> getAttendance()
	{
		return attendance;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void setModule(ArrayList<String> module) {
		this.module = module;
	}
	
	public ArrayList<String> getModule()
	{
		return this.module;
	}

	public void setAttendance(ArrayList<Attendance> attendance) {
		this.attendance = attendance;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}
}


