
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tksml
 */
public class ERP_User extends javax.swing.JFrame {
    static javax.swing.JFrame User;
    static javax.swing.JFrame Salary;
    static javax.swing.JFrame Transaction;
    static javax.swing.JFrame Goods;
    DBMan DBM = new DBMan();
    String strSQL = "Select * From Employee ";
    int iCntRow = 0;

    /**
     * Creates new form ERP
     */
    public ERP_User() {
        initComponents();
        try{
            DBM.dbOpen();
            getDBData(strSQL);
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }
    public void getDBData(String strQuery){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setNumRows(0);
        model.setNumRows(31);
        iCntRow = 0;
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                 jTable1.setValueAt(DBM.DB_rs.getString("emp_code"), iCntRow, 0);
                 jTable1.setValueAt(2020-Integer.parseInt(DBM.DB_rs.getString("emp_hiredate").substring(0, 4)), iCntRow, 1);
                 jTable1.setValueAt(DBM.DB_rs.getString("emp_rank"), iCntRow, 2);
                 jTable1.setValueAt(DBM.DB_rs.getString("dept_no"), iCntRow, 3);
                 //jTable1.setValueAt("dept_name", iCntRow, 4);
                 jTable1.setValueAt(DBM.DB_rs.getString("dept_Name"), iCntRow, 4);
                 jTable1.setValueAt(DBM.DB_rs.getString("emp_hiredate"), iCntRow, 5);
                 jTable1.setValueAt(DBM.DB_rs.getString("emp_gender"), iCntRow, 6);
                 jTable1.setValueAt(DBM.DB_rs.getString("emp_name"), iCntRow, 7);
                 jTable1.setValueAt(DBM.DB_rs.getString("password"), iCntRow, 8);
                 jTable1.setValueAt(DBM.DB_rs.getString("is_admin"), iCntRow, 9);
                 iCntRow++;
            }
            DBM.DB_rs.close();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtempno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtrank = new javax.swing.JTextField();
        txtdeptno = new javax.swing.JTextField();
        txtdetpname = new javax.swing.JTextField();
        txtempname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        rbadmin = new javax.swing.JRadioButton();
        rbnormal = new javax.swing.JRadioButton();
        txtgender = new javax.swing.JTextField();
        rbtnSal = new javax.swing.JRadioButton();
        rbtnTrans = new javax.swing.JRadioButton();
        rbtnEmp = new javax.swing.JRadioButton();
        rbtnGoods = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "사원코드", "연차", "직급", "부서코드", "부서명", "입사일자", "성별", "이름", "비밀번호", "관리자여부"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnDelete.setText("사원 제거");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("사원코드");

        jLabel2.setText("직급");

        jLabel3.setText("부서코드");

        jLabel4.setText("부서명");

        jLabel6.setText("성별");

        jLabel7.setText("이름");

        jLabel8.setText("관리자여부");

        jLabel9.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel9.setText("사원관리 테이블");

        btnRefresh.setText("새로고침");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbadmin);
        rbadmin.setText("관리자");

        buttonGroup2.add(rbnormal);
        rbnormal.setText("일반사원");

        buttonGroup1.add(rbtnSal);
        rbtnSal.setText("급여");
        rbtnSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnTrans);
        rbtnTrans.setText("거래");
        rbtnTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTransActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnEmp);
        rbtnEmp.setText("사원");
        rbtnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEmpActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnGoods);
        rbtnGoods.setText("상품");
        rbtnGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGoodsActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel5)
                        .addGap(314, 562, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(rbtnEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnSal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnTrans)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnGoods)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdetpname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addComponent(txtrank, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtempname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbadmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbnormal)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSal)
                    .addComponent(rbtnTrans)
                    .addComponent(rbtnEmp)
                    .addComponent(rbtnGoods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtrank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtempname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(rbadmin)
                    .addComponent(rbnormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdetpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int jCntRow = 0;
        jCntRow = jTable1.getSelectedRow();
        
        String empno = jTable1.getValueAt(jCntRow, 1).toString();
        String strQuery = "Delete From user Where emp_code= "+empno;
        
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strQuery);
            getDBData(strSQL);
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        try{
            DBM.dbOpen();
            getDBData(strSQL);
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int jCntRow = 0;
        jCntRow = jTable1.getSelectedRow();
        
        txtempno.setText(jTable1.getValueAt(jCntRow, 0).toString());
        txtrank.setText(jTable1.getValueAt(jCntRow, 2).toString());
        txtdeptno.setText(jTable1.getValueAt(jCntRow, 3).toString());
        txtdetpname.setText(jTable1.getValueAt(jCntRow, 4).toString());
        txtgender.setText(jTable1.getValueAt(jCntRow, 6).toString());
        txtempname.setText(jTable1.getValueAt(jCntRow, 7).toString());
        String rbcheck = jTable1.getValueAt(jCntRow, 9).toString();
        if(rbcheck.equals("T")){
            rbadmin.setSelected(true);
        }else{
            rbnormal.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void rbtnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmpActionPerformed
            User.setVisible(true);
            Salary.setVisible(false);
            Transaction.setVisible(false);
            Goods.setVisible(false);
    }//GEN-LAST:event_rbtnEmpActionPerformed

    private void rbtnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSalActionPerformed
            User.setVisible(false);
            Salary.setVisible(true);
            Transaction.setVisible(false);        
            Goods.setVisible(false);
    }//GEN-LAST:event_rbtnSalActionPerformed

    private void rbtnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTransActionPerformed
            User.setVisible(false);
            Salary.setVisible(false);
            Transaction.setVisible(true);
            Goods.setVisible(false);
    }//GEN-LAST:event_rbtnTransActionPerformed

    private void rbtnGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGoodsActionPerformed
            User.setVisible(false);
            Salary.setVisible(false);
            Transaction.setVisible(false);
            Goods.setVisible(true);
    }//GEN-LAST:event_rbtnGoodsActionPerformed

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
            java.util.logging.Logger.getLogger(ERP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERP_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User = new ERP_User();
                Salary = new ERP_Salary();
                Transaction = new ERP_Transaction();
                Goods = new ERP_Goods();
                User.setVisible(true);
                Salary.setVisible(false);
                Transaction.setVisible(false);
                Goods.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbadmin;
    private javax.swing.JRadioButton rbnormal;
    private javax.swing.JRadioButton rbtnEmp;
    private javax.swing.JRadioButton rbtnGoods;
    private javax.swing.JRadioButton rbtnSal;
    private javax.swing.JRadioButton rbtnTrans;
    private javax.swing.JTextField txtdeptno;
    private javax.swing.JTextField txtdetpname;
    private javax.swing.JTextField txtempname;
    private javax.swing.JTextField txtempno;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtrank;
    // End of variables declaration//GEN-END:variables
}
