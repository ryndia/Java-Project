package algo;
import java.util.Scanner;

public class teststudent {
	
    static Scanner input=new Scanner(System.in);
	
    public static void main(String[] args) {
		Student1[] studRecord=new Student1[5];
		int numRecords=0;
		numRecords = addStud(studRecord, numRecords);
		dispAll(studRecord);
		delStud(studRecord,numRecords);
		System.out.println(numRecords);
		dispAll(studRecord);	
	}
	
    public static int addStud(Student1[] studRecord, int numRecords) {
		 
	   if (numRecords==studRecord.length) {
		   System.out.println("Student records is full!!");
   }
    
   else {
	 
	    double[] marks= new double[4];
		System.out.print("Enter student id: ");
		int stud_id=input.nextInt();
		input.nextLine();
		System.out.print("Enter surname: ");
		String surname=input.nextLine();
		System.out.print("Enter other name: ");
		String othername=input.nextLine();
		System.out.println("Enter marks:");
		for(int i=0;i<4;i++) {
			System.out.print("marks " + (i+1) + ": ");
				    marks[i]=input.nextDouble();
				}
		studRecord[numRecords]=new Student1(stud_id, surname, othername,marks);
   }//end of adding records
		return ++numRecords;  
 }//end of addStud method
  
 
 public static int search(Student1[] studRecord, int stud_id,int numRecords) {
	 int i;
	 
	 for(i=0;i<numRecords;i++) {
		 if(studRecord[i].getSID()==stud_id) {
			 System.out.println("Records found");
			 return i;
		 }
	 }
	 return -1;
 }
 
 public static int delStud(Student1[] studRecord, int numRecords) {
	 System.out.println("Enter Student id:");
 int stud_id=input.nextInt();
 
 int index=search(studRecord, stud_id, numRecords);
	if (index!=-1) {
		for(int j=index;j<numRecords;j++) {
			studRecord[j]= null;
			System.out.println("records deleted");
			}
		numRecords--;
		}
	 return numRecords;
 }
 
 public static void dispStud(Student1[] studRecord) {
	 System.out.println("Enter student id: ");
		 int stud_id=input.nextInt();
		 for(Student1 std: studRecord) {
			 if(std.getSID()==stud_id) {
				 System.out.println(std);
			 }
		 }
	 }
	 
	 public static void dispAll(Student1[] studRecord) {
		 if(studRecord[0] == null)
		 {
			 System.out.print("Empty\n");
		 }
		 for(Student1 std: studRecord) {
			 if(std != null) {
				 System.out.println(std);
			 }
		 }
	 } 
}

