/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_pro;

import java.awt.Color;

/**
 *
 * @author user
 */
public class admin_manager extends javax.swing.JFrame {

    /**
     * Creates new form admin_manager
     */
    public admin_manager() {
        initComponents();
         //jPanel2.setBackground(new Color(255,255,255,80));
    }
    
    int fc=0;
      public admin_manager(String us) {
        initComponents();

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        fc=0;
    
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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jInternalFrame6 = new javax.swing.JInternalFrame();
        jInternalFrame7 = new javax.swing.JInternalFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        left = new javax.swing.JMenuItem();
        right = new javax.swing.JMenuItem();
        up = new javax.swing.JMenuItem();
        down = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN - MANAGER");
        setLocation(new java.awt.Point(300, 150));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame1.setTitle("Add Manager");
        jInternalFrame1.setVisible(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 750, 490));

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setTitle("Delete Manager");
        jInternalFrame2.setVisible(false);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 750, 500));

        jInternalFrame3.setClosable(true);
        jInternalFrame3.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame3.setTitle("Update Manager");
        jInternalFrame3.setVisible(false);

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 750, 510));

        jInternalFrame4.setClosable(true);
        jInternalFrame4.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame4.setTitle("Search Manager");
        jInternalFrame4.setVisible(false);

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jInternalFrame5.setClosable(true);
        jInternalFrame5.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame5.setTitle("Attendence");
        jInternalFrame5.setVisible(false);

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 750, 500));

        jInternalFrame6.setClosable(true);
        jInternalFrame6.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame6.setTitle("Salary");
        jInternalFrame6.setVisible(false);

        javax.swing.GroupLayout jInternalFrame6Layout = new javax.swing.GroupLayout(jInternalFrame6.getContentPane());
        jInternalFrame6.getContentPane().setLayout(jInternalFrame6Layout);
        jInternalFrame6Layout.setHorizontalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame6Layout.setVerticalGroup(
            jInternalFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 750, 500));

        jInternalFrame7.setClosable(true);
        jInternalFrame7.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame7.setTitle("View Manager");
        jInternalFrame7.setVisible(false);

        javax.swing.GroupLayout jInternalFrame7Layout = new javax.swing.GroupLayout(jInternalFrame7.getContentPane());
        jInternalFrame7.getContentPane().setLayout(jInternalFrame7Layout);
        jInternalFrame7Layout.setHorizontalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame7Layout.setVerticalGroup(
            jInternalFrame7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 750, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-delete-user-male-filled-100.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-update-filled-100.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-eye-filled-100.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-add-user-male-filled-100.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-search-filled-100.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-attendance-filled-100.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-cash-in-hand-filled-100.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 30)); // NOI18N
        jLabel2.setText("WELCOME ADMIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/keybo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        jMenu1.setText("File");

        left.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0));
        left.setText("Left");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        jMenu1.add(left);

        right.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, 0));
        right.setText("right");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        jMenu1.add(right);

        up.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0));
        up.setText("up");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jMenu1.add(up);

        down.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, 0));
        down.setText("down");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        jMenu1.add(down);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        jMenuItem5.setText("enter");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem6.setText("escape");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
   jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "ADD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(0,0,0)));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
jLabel3.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "DELETE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(0,0,0)));     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
     jLabel4.setBorder(null);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
          jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "UPDATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(255, 255, 255)));  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
     jLabel5.setBorder(null);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
           jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(255, 255, 255))); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
    jLabel7.setBorder(null);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
         jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "VIEW", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(0,0,0)));   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
    jLabel6.setBorder(null);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
         jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "ATTENDENCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(255, 255, 255)));   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
     jLabel8.setBorder(null);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
     jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,  0,  0), 2), "SALARY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("OCR A Extended", 1, 15), new java.awt.Color(0,0,0)));       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
      jLabel9.setBorder(null);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
for(int i=0;i<=0;i++)
  {
        if(fc==0)
      {
        break;
      }
 
   if(fc==1)
      {
    break;
      }if(fc==2)
      {
     break;
      }if(fc==3)
      {
      break;
      }if(fc==4)
      {
       break;  
      }if(fc==5)
      {
       break; 
      }if(fc==6)
      {
       break; 
      }  }  
    
        
    }//GEN-LAST:event_downActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
jInternalFrame1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      jInternalFrame2.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
jInternalFrame3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
jInternalFrame4.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
jInternalFrame5.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
jInternalFrame6.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
jInternalFrame7.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
if(fc==0)
      {
      jInternalFrame1.setVisible(true);
      }if(fc==1)
      {
      jInternalFrame2.setVisible(true); 
      }if(fc==2)
      {
      jInternalFrame3.setVisible(true);
      }if(fc==3)
      {
      jInternalFrame4.setVisible(true);
      }if(fc==4)
      {
        jInternalFrame5.setVisible(true);  
      }if(fc==5)
      {
       jInternalFrame6.setVisible(true);   
      }if(fc==6)
      {
        jInternalFrame7.setVisible(true);  
      }    
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
this.setVisible(false);
new admin().setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
  for(int i=0;i<=0;i++)
  {
        if(fc==0)
      {
        break;
      }
 
   if(fc==1)
      {
    break;
      }if(fc==2)
      {
     break;
      }if(fc==3)
      {
      break;
      }if(fc==4)
      {
       break;  
      }if(fc==5)
      {
       break; 
      }if(fc==6)
      {
       break; 
      }  }  
    
        
        
        
    }//GEN-LAST:event_leftActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
      for(int i=0;i<=0;i++)
  {
        if(fc==0)
      {
        break;
      }
 
   if(fc==1)
      {
    break;
      }if(fc==2)
      {
     break;
      }if(fc==3)
      {
      break;
      }if(fc==4)
      {
       break;  
      }if(fc==5)
      {
       break; 
      }if(fc==6)
      {
       break; 
      }  }  
    
        
    }//GEN-LAST:event_rightActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
for(int i=0;i<=0;i++)
  {
        if(fc==0)
      {
        break;
      }
 
   if(fc==1)
      {
    break;
      }if(fc==2)
      {
     break;
      }if(fc==3)
      {
      break;
      }if(fc==4)
      {
       break;  
      }if(fc==5)
      {
       break; 
      }if(fc==6)
      {
       break; 
      }  }  
    
        
    }//GEN-LAST:event_upActionPerformed

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
            java.util.logging.Logger.getLogger(admin_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem down;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JInternalFrame jInternalFrame6;
    private javax.swing.JInternalFrame jInternalFrame7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem left;
    private javax.swing.JMenuItem right;
    private javax.swing.JMenuItem up;
    // End of variables declaration//GEN-END:variables
}
