package algo;

import java.util.Arrays;

class Student1{
		private int stud_id;
		private String surN;
		private String otherN;
	    double[] marks;
	    
	    
	public Student1() {
		stud_id=0;
		surN="Bassa";
		otherN="Usaaaaaaaaamaaaaaaaa";
		marks=new double[] {0,0,0,0};
		
		}
	
	public Student1(int stud_id,String surN,String otherN,double[] marks) {
		this.stud_id=stud_id;
		this.surN=surN;
		this.otherN=otherN;
		this.marks=marks;
		}
	
	public int getSID() {
		return stud_id;
		
	}
	
	public void setSID(int stud_id)
	{
	  this.stud_id=stud_id;	
		
	}
	
	public String getsurN() {
		return surN;
	}
		
	public void surN(String surname) {
		surN=surname;
			
	}
	
	public String otherN() {
		return otherN;
	}
		
	public void otherN(String othername) {
		otherN=othername;
			
	}
	
	public double[] getmarks() {
		return marks;
		
		
	}
	
	public void setMarksd(double[] mark) {
		
		marks=mark;
		
	}
	
	public String toString() {
		return "Student id:\t" + stud_id + "\nSurname:\t" + surN + "\nOther Name:\t" + otherN + "\nmarks: " + Arrays.toString(marks);
	}
	

	}