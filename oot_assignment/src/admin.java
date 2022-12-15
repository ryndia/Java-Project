import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.*;
import java.awt.event.*;

public class admin extends JFrame {

    public admin() {  
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jButton10 = new JButton();
        jButton9 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(204, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new Color(204, 204, 255));

        jPanel3.setBackground(new Color(102, 102, 255));
        jPanel3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.black, Color.lightGray));

        jLabel2.setFont(new Font("DejaVu Sans Condensed", 1, 15));
        jLabel2.setText("Admin Panel ");

        jTextField1.setBackground(new Color(102, 102, 255));
        jTextField1.setText("Admin name ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton10.setBackground(new Color(102, 102, 255));
        jButton10.setFont(new Font("Liberation Sans", 0, 48)); 
        jButton10.setText("user");
        jButton10.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.darkGray, Color.white, Color.darkGray, Color.orange));
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new Color(102, 102, 255));
        jButton9.setFont(new Font("Liberation Sans", 0, 48));
        jButton9.setText("student");
        jButton9.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.darkGray, Color.darkGray, Color.darkGray, Color.darkGray));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
    	studentAdmin sa = new studentAdmin();
    	sa.setVisible(true);
    	this.dispose();
    }
 
    private void jButton10ActionPerformed(ActionEvent evt) {
        select s = new select();
        s.setVisible(true);
        this.dispose();
    }

    private JButton jButton10;
    private JButton jButton9;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JTextField jTextField1;
}