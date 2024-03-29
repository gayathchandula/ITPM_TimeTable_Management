/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itpm_timetable_management;

import com.mycompany.itpm_timetable_management.a5;
import com.mycompany.itpm_timetable_management.a6;
import com.mycompany.itpm_timetable_management.a7;
import com.mycompany.itpm_timetable_management.a8;
import com.mycompany.itpm_timetable_management.dbms;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class a18 extends javax.swing.JFrame {

    /**
     * Creates new form a18
     */
    public a18() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sessions & Not Allocations");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 543, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject", "Lecture", "Session", "Group ", "Students", "Duration"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 706, 276));

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("ADD SESSION");
        jButton13.setContentAreaFilled(false);
        jButton13.setOpaque(true);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, -1, -1));

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Consecutive");
        jButton14.setContentAreaFilled(false);
        jButton14.setOpaque(true);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 110, -1));

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Parallel");
        jButton15.setContentAreaFilled(false);
        jButton15.setOpaque(true);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, -1));

        jButton22.setBackground(new java.awt.Color(102, 102, 102));
        jButton22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Non Overlapping");
        jButton22.setContentAreaFilled(false);
        jButton22.setOpaque(true);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jButton23.setBackground(new java.awt.Color(102, 102, 102));
        jButton23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Not Avail. Times");
        jButton23.setContentAreaFilled(false);
        jButton23.setOpaque(true);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("ADD STUDENT GROUPS");
        jButton12.setContentAreaFilled(false);
        jButton12.setOpaque(true);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, -1));

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("MANAGE STUDENT GROUPS");
        jButton11.setContentAreaFilled(false);
        jButton11.setOpaque(true);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 250, -1));

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("ADD TAGS");
        jButton10.setContentAreaFilled(false);
        jButton10.setOpaque(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 250, -1));

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("MANAGE TAGS");
        jButton9.setContentAreaFilled(false);
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        a8 a=new a8();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        a7 a=new a7();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        a6 a=new a6();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        a5 a=new a5();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        TableModel tm2=jTable1.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tm2;
        dtm2.setRowCount(0);
        try {
            String a="not available times";
            ResultSet r=dbms.search("SELECT * FROM addses WHERE type = '"+a+"' ");
            if(r.next()){
                String b=r.getString("session");
                String b1=r.getString("addsession");
                ResultSet r1=dbms.search("SELECT * FROM session WHERE id = '"+b+"' ");
                r1.next();
                String id=r.getString("id");
                String a10=r.getString("st");
                String b10=r.getString("selec_lec");
                String c=r.getString("sg");
                String d=r.getString("ss");
                String e=r.getString("stu");
                String f=r.getString("d");
                Vector v=new Vector();
                v.add(id);
                v.add(a10);
                v.add(b10);
                v.add(c);
                v.add(d);
                v.add(e);
                v.add(f);
                TableModel tm=jTable1.getModel();
                DefaultTableModel dtm=(DefaultTableModel)tm;
                dtm.addRow(v);
                ResultSet r2=dbms.search("SELECT * FROM session WHERE id = '"+b1+"' ");
                r2.next();
                String id1=r.getString("id");
                String a11=r.getString("st");
                String b11=r.getString("selec_lec");
                String c1=r.getString("sg");
                String d1=r.getString("ss");
                String e1=r.getString("stu");
                String f1=r.getString("d");
                Vector v1=new Vector();
                v1.add(id1);
                v1.add(a11);
                v1.add(b11);
                v1.add(c1);
                v1.add(d1);
                v1.add(e1);
                v1.add(f1);
                TableModel tm1=jTable1.getModel();
                DefaultTableModel dtm1=(DefaultTableModel)tm1;
                dtm1.addRow(v1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        TableModel tm2=jTable1.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tm2;
        dtm2.setRowCount(0);
        try {
            String a="non overlapping";
            ResultSet r=dbms.search("SELECT * FROM addses WHERE type = '"+a+"' ");
            if(r.next()){
                String b=r.getString("session");
                String b1=r.getString("addsession");
                ResultSet r1=dbms.search("SELECT * FROM session WHERE id = '"+b+"' ");
                r1.next();
                String id=r.getString("id");
                String a10=r.getString("st");
                String b10=r.getString("selec_lec");
                String c=r.getString("sg");
                String d=r.getString("ss");
                String e=r.getString("stu");
                String f=r.getString("d");
                Vector v=new Vector();
                v.add(id);
                v.add(a10);
                v.add(b10);
                v.add(c);
                v.add(d);
                v.add(e);
                v.add(f);
                TableModel tm=jTable1.getModel();
                DefaultTableModel dtm=(DefaultTableModel)tm;
                dtm.addRow(v);
                ResultSet r2=dbms.search("SELECT * FROM session WHERE id = '"+b1+"' ");
                r2.next();
                String id1=r.getString("id");
                String a11=r.getString("st");
                String b11=r.getString("selec_lec");
                String c1=r.getString("sg");
                String d1=r.getString("ss");
                String e1=r.getString("stu");
                String f1=r.getString("d");
                Vector v1=new Vector();
                v1.add(id1);
                v1.add(a11);
                v1.add(b11);
                v1.add(c1);
                v1.add(d1);
                v1.add(e1);
                v1.add(f1);
                TableModel tm1=jTable1.getModel();
                DefaultTableModel dtm1=(DefaultTableModel)tm1;
                dtm1.addRow(v1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:

        TableModel tm2=jTable1.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tm2;
        dtm2.setRowCount(0);
        try {
            String a="parallel";
            ResultSet r=dbms.search("SELECT * FROM addses WHERE type = '"+a+"' ");
            if(r.next()){
                String b=r.getString("session");
                String b1=r.getString("addsession");
                ResultSet r1=dbms.search("SELECT * FROM session WHERE id = '"+b+"' ");
                r1.next();
                String id=r.getString("id");
                String a10=r.getString("st");
                String b10=r.getString("selec_lec");
                String c=r.getString("sg");
                String d=r.getString("ss");
                String e=r.getString("stu");
                String f=r.getString("d");
                Vector v=new Vector();
                v.add(id);
                v.add(a10);
                v.add(b10);
                v.add(c);
                v.add(d);
                v.add(e);
                v.add(f);
                TableModel tm=jTable1.getModel();
                DefaultTableModel dtm=(DefaultTableModel)tm;
                dtm.addRow(v);
                ResultSet r2=dbms.search("SELECT * FROM session WHERE id = '"+b1+"' ");
                r2.next();
                String id1=r.getString("id");
                String a11=r.getString("st");
                String b11=r.getString("selec_lec");
                String c1=r.getString("sg");
                String d1=r.getString("ss");
                String e1=r.getString("stu");
                String f1=r.getString("d");
                Vector v1=new Vector();
                v1.add(id1);
                v1.add(a11);
                v1.add(b11);
                v1.add(c1);
                v1.add(d1);
                v1.add(e1);
                v1.add(f1);
                TableModel tm1=jTable1.getModel();
                DefaultTableModel dtm1=(DefaultTableModel)tm1;
                dtm1.addRow(v1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        TableModel tm2=jTable1.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tm2;
        dtm2.setRowCount(0);
        
        try {
            String a="consecutive";
            ResultSet r=dbms.search("SELECT * FROM consecutive_session");
         
            if(r.next()){
                
                String id=r.getString("id");
                String a10=r.getString("subject");
                String b10=r.getString("lecturers");
                String c=r.getString("tags");
                String d=r.getString("groups");
                String e=r.getString("stdcount");
                String f=r.getString("hours");
                Vector v=new Vector();
                v.add(id);
                v.add(a10);
                v.add(b10);
                v.add(c);
                v.add(d);
                v.add(e);
                v.add(f);
                TableModel tm=jTable1.getModel();
                DefaultTableModel dtm=(DefaultTableModel)tm;
                dtm.addRow(v);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        a19 a=new a19();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
