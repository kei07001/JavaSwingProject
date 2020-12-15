
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class ERP_Order extends javax.swing.JFrame {
    static javax.swing.JFrame User;
    static javax.swing.JFrame Salary;
    static javax.swing.JFrame Transaction;
    static javax.swing.JFrame Goods;
    static javax.swing.JFrame Order;
    DBMan DBM = new DBMan();
    String strSQL = "Select * From Goods ";
    int iCntRow = 0;
    ArrayList pay = new ArrayList();
    SimpleDateFormat format = new SimpleDateFormat ( "yyyyMMdd");
    SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy-MM-dd");
		
    Date time1 = new Date();
    String time = format.format(time1);
    String time2 = format2.format(time1);
    /**
     * Creates new form ERP
     */
    public ERP_Order() {
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
                jTable1.setValueAt(DBM.DB_rs.getString("goods_code"), iCntRow, 0);
                jTable1.setValueAt(DBM.DB_rs.getString("goods_name"), iCntRow, 1);
                jTable1.setValueAt(DBM.DB_rs.getString("goods_price"), iCntRow, 2);
                jTable1.setValueAt(DBM.DB_rs.getString("goods_stock"), iCntRow, 3);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtGoodsCodeCheck = new javax.swing.JLabel();
        txtGoodsNameCheck = new javax.swing.JLabel();
        txtGoodsPriceCheck = new javax.swing.JLabel();
        txtGoodsAmountCheck = new javax.swing.JLabel();
        txtGoodsStockCheck2 = new javax.swing.JLabel();
        txtPurchaseCheck2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPurchaseDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbtnSal = new javax.swing.JRadioButton();
        rbtnTrans = new javax.swing.JRadioButton();
        rbtnEmp = new javax.swing.JRadioButton();
        rbtnGoods = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtGoodsCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGoodsName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGoodsPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGoodsStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOrderAmount = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStock2 = new javax.swing.JTextField();
        btnPurchase = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel10.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel10.setText("발주 확인서");

        jLabel11.setText("상품코드 : ");

        jLabel12.setText("상품명 : ");

        jLabel13.setText("상품가격 : ");

        jLabel14.setText("주문수량 : ");

        jLabel15.setText("결제 후 재고 : ");

        jLabel16.setText("결제금액 : ");

        jButton1.setText("확인");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtGoodsCodeCheck.setText("00000000");

        txtGoodsNameCheck.setText("00000000");

        txtGoodsPriceCheck.setText("00000000");

        txtGoodsAmountCheck.setText("00000000");

        txtGoodsStockCheck2.setText("000000000");

        txtPurchaseCheck2.setText("00000000");

        jLabel17.setText("결제 일자 : ");

        txtPurchaseDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtPurchaseDate.setText("00000000");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGoodsCodeCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGoodsNameCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGoodsPriceCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGoodsAmountCheck, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtGoodsStockCheck2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPurchaseCheck2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(64, 64, 64))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGoodsCodeCheck))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGoodsNameCheck))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtGoodsPriceCheck))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtGoodsAmountCheck))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtGoodsStockCheck2))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPurchaseCheck2))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel9.setText("발주 양식");

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("발주");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "상품코드", "상품명", "상품가격", "상품재고"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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

        jLabel1.setText("상품코드");

        txtGoodsCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoodsCodeActionPerformed(evt);
            }
        });

        jLabel2.setText("상품명");

        txtGoodsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoodsNameActionPerformed(evt);
            }
        });

        jLabel3.setText("상품가격");

        txtGoodsPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGoodsPrice.setText("0");
        txtGoodsPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoodsPriceActionPerformed(evt);
            }
        });
        txtGoodsPrice.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGoodsPricePropertyChange(evt);
            }
        });

        jLabel4.setText("상품재고");

        txtGoodsStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGoodsStock.setText("0");
        txtGoodsStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoodsStockActionPerformed(evt);
            }
        });

        jLabel6.setText("주문수량");

        txtOrderAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txtOrderAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtOrderAmountStateChanged(evt);
            }
        });
        txtOrderAmount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtOrderAmountPropertyChange(evt);
            }
        });

        jLabel7.setText("결제금액");

        txtPrice2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice2.setText("0");
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });

        jLabel8.setText("결제 후 재고");

        txtStock2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock2.setText("0");
        txtStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock2ActionPerformed(evt);
            }
        });

        btnPurchase.setText("결제");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
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
                .addGap(394, 394, 394)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnSal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnTrans)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGoodsCode, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtOrderAmount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtGoodsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGoodsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(446, 446, 446)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSal)
                    .addComponent(rbtnTrans)
                    .addComponent(rbtnEmp)
                    .addComponent(rbtnGoods)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGoodsCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtGoodsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtGoodsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtOrderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchase))
                .addGap(51, 51, 51)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSalActionPerformed
        Login1.User.setVisible(false);
        Login1.Salary.setVisible(true);
        Login1.Transaction.setVisible(false);
        Login1.Goods.setVisible(false);
        Login1.Order.setVisible(false);
    }//GEN-LAST:event_rbtnSalActionPerformed

    private void rbtnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTransActionPerformed
        Login1.User.setVisible(false);
        Login1.Salary.setVisible(false);
        Login1.Transaction.setVisible(true);
        Login1.Goods.setVisible(false);
        Login1.Order.setVisible(false);
    }//GEN-LAST:event_rbtnTransActionPerformed

    private void rbtnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmpActionPerformed
        Login1.User.setVisible(true);
        Login1.Salary.setVisible(false);
        Login1.Transaction.setVisible(false);
        Login1.Goods.setVisible(false);
        Login1.Order.setVisible(false);
    }//GEN-LAST:event_rbtnEmpActionPerformed

    private void rbtnGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGoodsActionPerformed
       Login1.User.setVisible(false);
       Login1.Salary.setVisible(false);
       Login1.Transaction.setVisible(false);
       Login1.Goods.setVisible(true);
       Login1.Order.setVisible(false);
    }//GEN-LAST:event_rbtnGoodsActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int jCntRow = 0;
        jCntRow = jTable1.getSelectedRow();
        txtGoodsCode.setText(jTable1.getValueAt(jCntRow, 0).toString());
        txtGoodsName.setText(jTable1.getValueAt(jCntRow, 1).toString());
        txtGoodsPrice.setText(jTable1.getValueAt(jCntRow, 2).toString());
        txtGoodsStock.setText(jTable1.getValueAt(jCntRow, 3).toString());
        int orderAmount = (int)txtOrderAmount.getValue();
        int total = orderAmount * Integer.parseInt(txtGoodsPrice.getText());
        txtPrice2.setText(Integer.toString(total));
        int stock = Integer.parseInt(txtGoodsStock.getText()) + orderAmount;
        txtStock2.setText(Integer.toString(stock));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtGoodsCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoodsCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoodsCodeActionPerformed

    private void txtGoodsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoodsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoodsNameActionPerformed

    private void txtGoodsPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoodsPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoodsPriceActionPerformed

    private void txtGoodsStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoodsStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGoodsStockActionPerformed

    private void txtPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice2ActionPerformed

    private void txtStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock2ActionPerformed

    private void txtOrderAmountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtOrderAmountPropertyChange
       
    }//GEN-LAST:event_txtOrderAmountPropertyChange

    private void txtGoodsPricePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGoodsPricePropertyChange
        
    }//GEN-LAST:event_txtGoodsPricePropertyChange

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        String strSQL = "Insert into transaction(TRANSACTION_NO, GOODS_CODE, QUANTITY,"
                + "TRANSACTION_DATE, TRANSACTION_TYPE) Values(";
        strSQL += "transaction_increment.nextval, ";
        strSQL += txtGoodsCode.getText() + ", ";
        strSQL += Integer.toString((int)txtOrderAmount.getValue()) + ", ";
        strSQL += time + ", ";
        strSQL += "'P')";
        String strSQL2 = "Update Goods set Goods_Stock = Goods_Stock + ";
        strSQL2 += Integer.toString((int)txtOrderAmount.getValue());
        strSQL2 += " Where Goods_Code = ";
        strSQL2 += txtGoodsCode.getText();
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
            try{
                DBM.dbOpen();
                DBM.DB_stmt.executeUpdate(strSQL2);
                DBM.dbClose();
                int orderAmount = (int)txtOrderAmount.getValue();
                int stock = Integer.parseInt(txtGoodsStock.getText()) + orderAmount;
                int total = orderAmount * Integer.parseInt(txtGoodsPrice.getText());
                txtGoodsCodeCheck.setText(txtGoodsCode.getText());
                txtGoodsNameCheck.setText(txtGoodsName.getText());
                txtGoodsPriceCheck.setText(txtGoodsPrice.getText());
                txtGoodsAmountCheck.setText(Integer.toString((int)txtOrderAmount.getValue()));
                txtGoodsStockCheck2.setText(Integer.toString(stock));
                txtPurchaseCheck2.setText(Integer.toString(total));
                txtPurchaseDate.setText(time2);
                jDialog1.setSize(300, 400);
                jDialog1.show();
            }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
        
       
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialog1.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOrderAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtOrderAmountStateChanged
        int orderAmount = (int)txtOrderAmount.getValue();
        int total = orderAmount * Integer.parseInt(txtGoodsPrice.getText());
        txtPrice2.setText(Integer.toString(total));
        int stock = Integer.parseInt(txtGoodsStock.getText()) + orderAmount;
        txtStock2.setText(Integer.toString(stock));
    }//GEN-LAST:event_txtOrderAmountStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Login1.User.setVisible(false);
        Login1.Salary.setVisible(false);
        Login1.Transaction.setVisible(false);
        Login1.Goods.setVisible(false);
        Login1.Order.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
                User.setVisible(false);
                Salary.setVisible(false);
                Transaction.setVisible(false);
                Goods.setVisible(false);
                Order = new ERP_Order();
                Order.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbtnEmp;
    private javax.swing.JRadioButton rbtnGoods;
    private javax.swing.JRadioButton rbtnSal;
    private javax.swing.JRadioButton rbtnTrans;
    private javax.swing.JLabel txtGoodsAmountCheck;
    private javax.swing.JTextField txtGoodsCode;
    private javax.swing.JLabel txtGoodsCodeCheck;
    private javax.swing.JTextField txtGoodsName;
    private javax.swing.JLabel txtGoodsNameCheck;
    private javax.swing.JTextField txtGoodsPrice;
    private javax.swing.JLabel txtGoodsPriceCheck;
    private javax.swing.JTextField txtGoodsStock;
    private javax.swing.JLabel txtGoodsStockCheck2;
    private javax.swing.JSpinner txtOrderAmount;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JLabel txtPurchaseCheck2;
    private javax.swing.JLabel txtPurchaseDate;
    private javax.swing.JTextField txtStock2;
    // End of variables declaration//GEN-END:variables
}
