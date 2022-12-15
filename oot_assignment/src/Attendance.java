import java.time.LocalDate;

class Attendance{
	String Module;
	LocalDate date;
	Boolean presence;
	
	Attendance(String m, LocalDate d, Boolean p)
	{
		this.Module = m;
		this.date = d;
		this.presence = p;
	}

	public String getModule() {
		return Module;
	}

	public void setModule(String module) {
		Module = module;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getPresence() {
		return presence;
	}

	public void setPresence(Boolean presence) {
		this.presence = presence;
	}
}