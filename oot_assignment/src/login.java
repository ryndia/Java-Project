import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.border.*;

public class login extends JFrame {

    public login() {
        initComponents();
    }
    
    private void initComponents() {

        jDesktopPane1 = new JDesktopPane();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jLabel4 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jCheckBox1 = new JCheckBox();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel2.setText("Login ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        jLabel3.setText("Username");

        jTextField1.setBorder(new LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); 
        jLabel4.setText("Password");

        jPasswordField1.setBorder(new LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jCheckBox1.setText("Remember me?");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jButton1.setText("Login");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, JLayeredPane.DEFAULT_LAYER);

        GroupLayout jDesktopPane1Layout = new GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(976, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2114, Short.MAX_VALUE))
        );

        pack();
        rememberMe();
    }                       
                                               
    private void jButton1ActionPerformed(ActionEvent evt) {                                         
    	String name = jTextField1.getText();
    	Boolean adminflag = true;
    	String password = new String(jPasswordField1.getPassword());
    	if(name.compareTo("")!= 0 && password.compareTo("")!=0)
    	{
    		String query = "select * from member where name= '" +name+"' AND password = '"+password+"'";
    		database_connection dc = new database_connection();
    		ArrayList<ArrayList<String>> record = dc.connect(query);
    		if(!record.isEmpty())
    		{
    			if(jCheckBox1.isSelected()) {
        			try {
        				FileWriter fw = new FileWriter("rememberMe.txt");
        				BufferedWriter bw = new BufferedWriter(fw);
        				String writefile = name +" "+ password;
        				bw.write(writefile);
        				bw.close();
        				fw.close();
        			}
        			catch(Exception e)
        			{
        				System.err.print(e);
        			}
        	 	}
    			
        		if(record.get(0).get(3).compareTo("admin")== 0) {

            		query = "select * from teacher";
            		record = dc.connect(query);
            		for(ArrayList<String> t : record)
            		{
            			int id = Integer.parseInt(t.get(0));
            			String Teachername = t.get(1);
            			query = "select * from faculty where facultyID = "+t.get(2);
            			ArrayList<ArrayList<String>>facRecord = dc.connect(query);
            			String faculty = facRecord.get(0).get(1);
            			query = "select * from module_teachBy where memberID = "+t.get(0);
            			ArrayList<ArrayList<String>>moduleTeach = dc.connect(query);
            			ArrayList<String> moduleteach = new ArrayList<String>();
            			for(ArrayList<String> mt:moduleTeach)
            			{
            				query = "select * from module where mID =" + mt.get(0);
            				ArrayList<ArrayList<String>> modu = new ArrayList<ArrayList<String>>();
            				modu = dc.connect(query);
            				for(ArrayList<String> m: modu) {
            					moduleteach.add(m.get(1));
            				}
            			}
            			Teacher ttemp = new Teacher(Teachername,id,faculty,moduleteach);
            			startApp.t.add(ttemp);
            		}	
        		}
        		else {
        			adminflag = false;
            		query = "select teacherID from member where name= \""+name+"\"";
            		String tid = dc.connect(query).get(0).get(0);
            		query = "select * from teacher where teacherID = \""+tid+"\"";
            		ArrayList<ArrayList<String>> teachertemp = dc.connect(query);
                	query = "select facultyName from faculty where facultyID = \""+teachertemp.get(0).get(2)+"\"";
                	String fac = dc.connect(query).get(0).get(0);
                	String teachername = teachertemp.get(0).get(1);
          			query = "select * from module_teachBy where memberID = "+teachertemp.get(0).get(0);
        			ArrayList<ArrayList<String>>moduleTeach = dc.connect(query);
        			ArrayList<String> moduleteach = new ArrayList<String>();
        			for(ArrayList<String> mt:moduleTeach)
        			{
        				query = "select * from module where mID =" + mt.get(0);
        				ArrayList<ArrayList<String>> modu = new ArrayList<ArrayList<String>>();
        				modu = dc.connect(query);
        				for(ArrayList<String> m: modu) {
        					moduleteach.add(m.get(1));
        				}
        			}
        			startApp.teacher = new Teacher(teachername,Integer.parseInt(tid),fac,moduleteach);
        			
        		}
    			record = dc.connect("select * from student");
        		for(ArrayList<String> s: record)
        		{
        			int sid = Integer.parseInt(s.get(0));
        			String nameStu = s.get(1);
        			query = "select * from faculty where facultyID = "+s.get(2);
        			ArrayList<ArrayList<String>>facRecord = dc.connect(query);
        			String facultyName = facRecord.get(0).get(1);
        			LocalDate entryd = LocalDate.parse(s.get(3));
        			Boolean g = false;
        			if(s.get(4).compareTo("M")== 0)
        			{
        				g = true;
        			}
        			String course = s.get(5);
        			int year = Integer.parseInt(s.get(6));
        			student temp = new student(nameStu,entryd,g,course,sid,year,facultyName);
        			query = "select * from studentModuleTaken where sID = " + s.get(0);
        			ArrayList<ArrayList<String>>moduletaken = dc.connect(query);
        			ArrayList<String> module = new ArrayList<String>();
        			for(ArrayList<String> sm: moduletaken) {
        				query = "select * from module where mID =" + sm.get(1);
        				ArrayList<ArrayList<String>> mod = new ArrayList<ArrayList<String>>();
        				mod = dc.connect(query);
        				for(ArrayList<String> m: mod) {
        					module.add(m.get(1));
        					System.out.print(m.get(1)+m.get(0));
        				}
        			} 
        			temp.setModule(module);
        			query = "select * from attendance where sID = " + s.get(0);
        			ArrayList<ArrayList<String>>att = new ArrayList<ArrayList<String>>();
        			att = dc.connect(query);
        			ArrayList<Attendance> Att = new ArrayList<Attendance>();
        			for(ArrayList<String> a: att)
        			{
        				String mod = null;
        				query = "select * from module where mID =" + a.get(1);
        				ArrayList<ArrayList<String>> mo = dc.connect(query);
        				for(ArrayList<String> m: mo) {
        					mod = m.get(1);
        				}
        				LocalDate entry = LocalDate.parse(a.get(2)); 
        				Boolean presence = false;
        				if(a.get(3).compareTo("P") == 0)
        				{
        					presence = true;
        				}
        				Attendance tempAtt = new Attendance(mod,entry,presence);
        				Att.add(tempAtt);
        			}
        			temp.setAttendance(Att);
        			startApp.s.add(temp);	
        		}
        		
        		if(adminflag
        				)
        		{
        			admin a = new admin();
        			a.setVisible(true);
        		}
        		else {
        			teacherpanel p = new teacherpanel();
        			p.setVisible(true);
        		}
        		
    			this.dispose();
    		}
    		else {
    			jTextField1.setText("");
    			jPasswordField1.setText("");
    			JOptionPane.showMessageDialog(this,
    				    "Login doesn't exist or wrong password input.",
    				    "Login error",
    				    JOptionPane.ERROR_MESSAGE);
    		}
    	}
    	
    }    


	public void rememberMe()
    {
    	try {
    	FileReader fr = new FileReader("rememberMe.txt");
    	BufferedReader bw = new BufferedReader(fr);
    	if(fr != null)
    	{
    		String[] outfile = (bw.readLine()).split(" ");
    		jTextField1.setText(outfile[0]);
    		jPasswordField1.setText(outfile[1]);
    	}
    	fr.close();
    	bw.close();
    	}
    	catch(Exception e)
    	{
    		System.out.print("no remember");
    	}
    	
    }
                
    private JButton jButton1;
    private JCheckBox jCheckBox1;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1; 
}

