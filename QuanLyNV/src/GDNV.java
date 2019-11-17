
import javax.swing.ButtonGroup;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trion
 */
public class GDNV extends javax.swing.JFrame {

    /**
     * Creates new form GDNV
     */
    public GDNV() {
        initComponents();
        this.jDateChooser_ngaySinh.setDateFormatString("dd/MM/yyyy");
        initbtG();
        loadComboBox();
        loadThongTinNV();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_hoTen = new javax.swing.JTextField();
        jDateChooser_ngaySinh = new com.toedter.calendar.JDateChooser();
        jComboBox_phongBan = new javax.swing.JComboBox<>();
        jRadioButton_nam = new javax.swing.JRadioButton();
        jRadioButton_nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ghiChu = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton_them = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();
        jButton_lamMoi = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_bangTT = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel_tong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Thông Tin");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Họ Tên");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Ngày Sinh");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Giới Tính");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Ghi Chú");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Phòng Ban");

        jRadioButton_nam.setText("Nam");

        jRadioButton_nu.setText("Nữ");

        jTextArea_ghiChu.setColumns(20);
        jTextArea_ghiChu.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ghiChu);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Thao Tác");

        jButton_them.setText("Thêm");
        jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themActionPerformed(evt);
            }
        });

        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoaActionPerformed(evt);
            }
        });

        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_suaActionPerformed(evt);
            }
        });

        jButton_lamMoi.setText("Làm mới");
        jButton_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lamMoiActionPerformed(evt);
            }
        });

        jButton_thoat.setText("Thoát");
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thoatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Danh Sách");

        jTable_bangTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Họ Tên", "Ngày Sinh", "Giới Tính", "Phòng Ban", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_bangTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_bangTTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_bangTT);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Tổng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(333, 333, 333))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_phongBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jDateChooser_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jRadioButton_nam)
                                .addGap(27, 27, 27)
                                .addComponent(jRadioButton_nu)))
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jButton_them)
                                    .addGap(73, 73, 73)
                                    .addComponent(jButton_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(jButton_lamMoi)
                                    .addGap(89, 89, 89)
                                    .addComponent(jButton_thoat))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(28, 28, 28)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel_tong)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_phongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton_nam)
                    .addComponent(jRadioButton_nu))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_them)
                    .addComponent(jButton_xoa)
                    .addComponent(jButton_sua)
                    .addComponent(jButton_lamMoi)
                    .addComponent(jButton_thoat))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel_tong))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themActionPerformed
        // TODO add your handling code here:
        if(jTextField_hoTen.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập họ tên", "Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(jTextArea_ghiChu.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập ghi chú", "Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            try {
                Connection ketNoi = KetNoiSQL.layKetNoi();
                PreparedStatement ps = ketNoi.prepareStatement("insert into SV values (?,?,?,?,?,?)");
                ps.setInt(1, maLonNhat()+1);
                ps.setString(2,this.jTextField_hoTen.getText());
                SimpleDateFormat data = new SimpleDateFormat("MM/dd/yyyy");
                ps.setString(3,data.format(this.jDateChooser_ngaySinh.getDate()));
                String gioiTinh="";
                if(this.jRadioButton_nam.isSelected()) gioiTinh = "Nam";
                else if(this.jRadioButton_nu.isSelected()) gioiTinh = "Nu";
                ps.setString(4,gioiTinh);
                ps.setInt(5, chuyenTenPBthanhMa());
                ps.setString(6, this.jTextArea_ghiChu.getText());
                ps.executeUpdate();
                loadThongTinNV();
                JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                System.out.println("Loi them nhan vien - "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_themActionPerformed

    private void jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoaActionPerformed
        // TODO add your handling code here:
        int chose = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa hay không","Thông báo",JOptionPane.YES_NO_OPTION);
        if(chose==JOptionPane.NO_OPTION) return;
        Connection ketNoi = KetNoiSQL.layKetNoi();
        try {
            PreparedStatement ps = ketNoi.prepareStatement("delete from SV where manhanvien = ?");
            ps.setInt(1, (int) this.jTable_bangTT.getValueAt(this.jTable_bangTT.getSelectedRow(),0));
            ps.executeUpdate();
            loadThongTinNV();
            JOptionPane.showMessageDialog(this, "Đã xóa thanh công", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Loi khong xoa duoc nhan vien - "+ex.getMessage());
        }
    }//GEN-LAST:event_jButton_xoaActionPerformed

    private void jButton_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_thoatActionPerformed

    private void jButton_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lamMoiActionPerformed
        // TODO add your handling code here:
        lammoi();
    }//GEN-LAST:event_jButton_lamMoiActionPerformed
    public void lammoi(){
        jTextField_hoTen.setText("");
        jDateChooser_ngaySinh.setDate(Calendar.getInstance().getTime());
        jComboBox_phongBan.setSelectedIndex(0);
        gioiTinh.clearSelection();
        jTextArea_ghiChu.setText("");
    }
    private void jTable_bangTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_bangTTMouseClicked
        // TODO add your handling code here:
        Connection ketNoi = KetNoiSQL.layKetNoi();
        PreparedStatement ps;
        try {
            ps = ketNoi.prepareStatement("select * from SV where manhanvien = ?");
            ps.setInt(1, (int) this.jTable_bangTT.getValueAt(this.jTable_bangTT.getSelectedRow(),0));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.jTextField_hoTen.setText(rs.getString(2));
                SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
                this.jDateChooser_ngaySinh.setDate(new java.util.Date(date.format(new java.util.Date(rs.getString(3)))));
                this.jComboBox_phongBan.setSelectedItem(chuyenMaThanhTen(rs.getInt(5)));
                if(rs.getString(4)==null) gioiTinh.clearSelection();
                else if(rs.getString(4).equalsIgnoreCase("nam")) this.jRadioButton_nam.setSelected(true);
                else this.jRadioButton_nu.setSelected(true);
                this.jTextArea_ghiChu.setText(rs.getString(6));
            }   
        } catch (NullPointerException | SQLException ex) {
            System.out.println("Loi load du lieu len khung - "+ex.getMessage());
        }
        
        
    }//GEN-LAST:event_jTable_bangTTMouseClicked

    private void jButton_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_suaActionPerformed
        if(jTextField_hoTen.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập họ tên", "Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(jTextArea_ghiChu.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa nhập ghi chú", "Thông báo",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int ma=-1;
            try{
                ma =(int) this.jTable_bangTT.getValueAt(this.jTable_bangTT.getSelectedRow(),0);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(this, "Mời chọn thông tin người cần sửa","Thông báo",JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                Connection ketNoi = KetNoiSQL.layKetNoi();
                PreparedStatement ps = ketNoi.prepareStatement("update SV set hoten=?,ngaysinh=?,gioitinh=?,maphongban=?,ghichu=? where manhanvien="+ma+"");
                ps.setString(1,this.jTextField_hoTen.getText());
                SimpleDateFormat data = new SimpleDateFormat("MM/dd/yyyy");
                ps.setString(2,data.format(this.jDateChooser_ngaySinh.getDate()));
                String gioiTinh="";
                if(this.jRadioButton_nam.isSelected()) gioiTinh = "Nam";
                else if(this.jRadioButton_nu.isSelected()) gioiTinh = "Nu";
                ps.setString(3,gioiTinh);
                ps.setInt(4, chuyenTenPBthanhMa());
                ps.setString(5, this.jTextArea_ghiChu.getText());
                ps.executeUpdate();
                loadThongTinNV();
                lammoi();
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
            } catch (ArrayIndexOutOfBoundsException|SQLException ex) {
                System.out.println(ma);
                System.out.println("Loi sửa nhan vien - "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_suaActionPerformed
    public void initbtG(){
        this.gioiTinh = new ButtonGroup();
        this.gioiTinh.add(jRadioButton_nam);
        this.gioiTinh.add(jRadioButton_nu);
    }
    public void loadComboBox(){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        try {
            PreparedStatement ps = ketNoi.prepareStatement("select tenphongban from phongban");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                this.jComboBox_phongBan.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu dua vao combobox: "+ex.getMessage());
        }
    }
    public void loadThongTinNV(){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        DefaultTableModel dtm = (DefaultTableModel) this.jTable_bangTT.getModel();
        for(int i=dtm.getRowCount();i>0;i--) dtm.removeRow(i-1);
        Vector vt;
        try {
            PreparedStatement ps = ketNoi.prepareStatement("select * from sv");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getInt(1));
                vt.add(rs.getString(2));
                SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
                String ngaySinh = date.format(new java.util.Date(rs.getString(3)));
                vt.add(ngaySinh);//ngay sinh
                vt.add(rs.getString(4));
                vt.add(rs.getString(5));
                vt.add(rs.getString(6));
                dtm.addRow(vt);
            }
            this.jTable_bangTT.setModel(dtm);
            this.jLabel_tong.setText(String.valueOf(jTable_bangTT.getRowCount()));
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu dua vao bang thong tin: "+ex.getMessage());
        }
    }
    public int maLonNhat(){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        int max= -1;
        boolean trong = true;
        try {
            PreparedStatement ps = ketNoi.prepareStatement("select manhanvien from SV");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                trong = false;
                if(rs.getInt(1)>max) max = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Loi tim ma lon nhat - "+ex.getMessage());
        }
        return (trong ? 1 : max);
    }
    public int chuyenTenPBthanhMa(){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String maPB = (String) this.jComboBox_phongBan.getSelectedItem();
        int ma=-1;
        try {
            PreparedStatement ps = ketNoi.prepareStatement("select maphongban from phongban where tenphongban=N'"+maPB+"'");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                ma=rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Loi chuyen ten phong ban thanh ma - "+ex.getMessage());
        }
        return ma;
    }
    public String chuyenMaThanhTen(int ma){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String tenPB ="";
        try {
            PreparedStatement ps = ketNoi.prepareStatement("select tenphongban from phongban where maphongban= "+ma+"");
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                tenPB=rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("Loi chuyen ma phong ban thanh ten - "+ex.getMessage());
        }
        return tenPB;
    }
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
            java.util.logging.Logger.getLogger(GDNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_lamMoi;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_them;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JComboBox<String> jComboBox_phongBan;
    private com.toedter.calendar.JDateChooser jDateChooser_ngaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_tong;
    private javax.swing.JRadioButton jRadioButton_nam;
    private javax.swing.JRadioButton jRadioButton_nu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_bangTT;
    private javax.swing.JTextArea jTextArea_ghiChu;
    private javax.swing.JTextField jTextField_hoTen;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup gioiTinh;
}
