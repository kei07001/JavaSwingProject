
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tksml
 */
public class ERP_Salary extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From userpay";
    int iCntRow = 0;
    ArrayList pay = new ArrayList();
    SimpleDateFormat format = new SimpleDateFormat ( "yyyyMMdd");
		
    Date time1 = new Date();
		
    String time = format.format(time1);
    /**
     * Creates new form ERP
     */
    public ERP_Salary() {
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
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                jTable1.setValueAt(DBM.DB_rs.getString("empno"), iCntRow, 0);
                jTable1.setValueAt(DBM.DB_rs.getString("year"), iCntRow, 1);
                jTable1.setValueAt(DBM.DB_rs.getString("emprank"), iCntRow, 2);
                jTable1.setValueAt(DBM.DB_rs.getString("deptno"), iCntRow, 3);
                jTable1.setValueAt(DBM.DB_rs.getString("paymentdate"), iCntRow, 4);
                jTable1.setValueAt(DBM.DB_rs.getString("payment"), iCntRow, 5);
                iCntRow++;
            }
            DBM.DB_rs.close();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }
    public void calcul(){ //급여 계산해서 pay 리스트에 넣어줌
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery("Select * From user");
            while(DBM.DB_rs.next()){
                int salary = 0;
                int ranksal = 0;
                salary = Integer.parseInt(DBM.DB_rs.getString("year"));
                if(DBM.DB_rs.getString("emprank") == "PRESIDENT")
                    ranksal = 10000000;
                if(DBM.DB_rs.getString("emprank") == "MANAGER")
                    ranksal = 5000000;
                if(DBM.DB_rs.getString("emprank") == "ANALYST")
                    ranksal = 4000000;
                if(DBM.DB_rs.getString("emprank") == "SALESMAN")
                    ranksal = 3000000;
                if(DBM.DB_rs.getString("emprank") == "CLERK")
                    ranksal = 2000000;
                pay.add((salary * 1000000) + ranksal);  
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnPayroll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtempno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "사원코드", "연차", "직급", "부서코드", "지급일", "급여"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        btnPayroll.setText("급여 지급");
        btnPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayrollActionPerformed(evt);
            }
        });

        jLabel1.setText("사원코드");

        jLabel9.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel9.setText("급여관리 테이블");

        btnRefresh.setText("새로고침");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(271, 271, 271)
                        .addComponent(btnPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        try{
            DBM.dbOpen();
            getDBData("Select * From userpay");
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayrollActionPerformed
        // TODO add your handling code here: 
        
        //자본금에서 payroll을 시행하면 자본금을 -한다. ※추가해야함※
        //지급대장에 지급한 데이터를 입력한다.
        

        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery("Select * From user");
            while(DBM.DB_rs.next()){
                int i = 0;
                String empno = DBM.DB_rs.getString("empNo");
                String empyear = DBM.DB_rs.getString("year");
                String emprank = DBM.DB_rs.getString("emprank");
                String deptno = DBM.DB_rs.getString("deptno");
                String strQuery = "Insert into userpay (empno,empyear,emprank,deptno,paymentdate,payment) Values('"
                    +empno+"','"+empyear+"','"+emprank+"','"+deptno+"',"+time+"',"+pay.get(i)+");";
                DBM.DB_stmt.executeUpdate(strQuery);
            }
            getDBData(strSQL);
            DBM.dbClose();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnPayrollActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int jCntRow = 0;
        jCntRow = jTable1.getSelectedRow();
        
        txtempno.setText(jTable1.getValueAt(jCntRow, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
                new ERP_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayroll;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtempno;
    // End of variables declaration//GEN-END:variables
}
