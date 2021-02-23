
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccp
 */
public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form SignupForm
     */
    String imagePath=null;
    
    
    public SignupForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtRetypePassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblLoginAccount = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Account ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(580, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(633, 310));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 240, 241));
        jLabel4.setText("Retype pass:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 270, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 240, 241));
        jLabel5.setText("Picture:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 330, 120, 30);

        txtUserName.setBackground(new java.awt.Color(108, 122, 137));
        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(txtUserName);
        txtUserName.setBounds(170, 160, 270, 30);

        txtRetypePassword.setBackground(new java.awt.Color(108, 122, 137));
        txtRetypePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRetypePassword.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(txtRetypePassword);
        txtRetypePassword.setBounds(170, 270, 270, 30);

        btnCancel.setBackground(new java.awt.Color(242, 38, 19));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);
        btnCancel.setBounds(190, 480, 120, 40);

        btnCreate.setBackground(new java.awt.Color(30, 140, 195));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate);
        btnCreate.setBounds(320, 480, 120, 40);

        lblLoginAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLoginAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginAccount.setText("Already have an account?  click here to login");
        lblLoginAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLoginAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginAccountMouseClicked(evt);
            }
        });
        jPanel2.add(lblLoginAccount);
        lblLoginAccount.setBounds(180, 530, 370, 14);

        txtPassword.setBackground(new java.awt.Color(108, 122, 137));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(txtPassword);
        txtPassword.setBounds(170, 210, 270, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 240, 241));
        jLabel6.setText("Last Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 100, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 240, 241));
        jLabel8.setText("Password:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 210, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 240, 241));
        jLabel7.setText("First Name:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 40, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 240, 241));
        jLabel9.setText("Username:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 160, 120, 30);

        lblPicture.setBackground(new java.awt.Color(108, 122, 137));
        lblPicture.setOpaque(true);
        jPanel2.add(lblPicture);
        lblPicture.setBounds(180, 340, 170, 110);

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        jPanel2.add(btnBrowse);
        btnBrowse.setBounds(360, 340, 73, 23);

        txtFirstName.setBackground(new java.awt.Color(108, 122, 137));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(txtFirstName);
        txtFirstName.setBounds(170, 40, 270, 30);

        txtLastName.setBackground(new java.awt.Color(108, 122, 137));
        txtLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(txtLastName);
        txtLastName.setBounds(170, 100, 270, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblLoginAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginAccountMouseClicked
        LoginForm login=new LoginForm();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblLoginAccountMouseClicked
public ImageIcon resizeImage(String picPath){
        ImageIcon myImage=new ImageIcon(picPath);
        Image img=myImage.getImage().getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon myPicture=new ImageIcon(img);
        
        return myPicture;
    
}
public boolean isUsernameExist(String str){
    boolean uExist=false;
    Connection con = MyConnection.getInstance();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.prepareStatement("select * from user where username=?");
            ps.setString(1, txtUserName.getText());
            
           rs=ps.executeQuery();
           if(rs.next()){
              uExist=true;
           }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return uExist;
    
}
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
       JFileChooser filec=new JFileChooser();
       filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fileFilter=new FileNameExtensionFilter("*.Images", ".jpg",".png",".gif");
        int fileState=filec.showSaveDialog(null);
        
        
        if(fileState==JFileChooser.APPROVE_OPTION){
            File selectedFile=filec.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            imagePath=path;
            lblPicture.setIcon(resizeImage(path));
           // lblPicture.setIcon(new ImageIcon(path));
        }else if(fileState==JFileChooser.CANCEL_OPTION){
            System.out.println("No image selected"); 
        }
        
        
    }//GEN-LAST:event_btnBrowseActionPerformed
    public boolean varifyData(){
        if(txtFirstName.equals("")&&txtLastName.equals("")&& txtUserName.equals("")&& txtPassword.equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        }else if(!String.valueOf(txtPassword.getPassword()).equals(String.valueOf(txtRetypePassword.getPassword()))){
             JOptionPane.showMessageDialog(null, "Password doesn't match");
             return false;
        }else if(imagePath==null){
            JOptionPane.showMessageDialog(null, "No image selected");
            return false;
        }else{
           return true; 
        }
        
        
    }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      
       String fname=txtFirstName.getText().trim();
       String lname=txtLastName.getText().trim();
       String username=txtUserName.getText().trim();
       String pass=txtPassword.getText().trim();
       String repass=txtRetypePassword.getText().trim();
       //validation
       if(fname.isEmpty()){
           JOptionPane.showMessageDialog(null, "Enter your First Name");
       }else if(lname.isEmpty()){
           JOptionPane.showMessageDialog(null, "Enter your Last Name");
       }else if(username.isEmpty()){
           JOptionPane.showMessageDialog(null, "Enter an User Name");
       }else if(pass.isEmpty()){
           JOptionPane.showMessageDialog(null, "Enter A Password");
       }else if(repass.isEmpty()){
           JOptionPane.showMessageDialog(null, "Retype Password");
       }else if(!pass.equals(repass)){
           JOptionPane.showMessageDialog(null, "Password Not Mached");
       }else if(imagePath==null){
           JOptionPane.showMessageDialog(null, "Select A Picture");
       }else{
            Connection con=MyConnection.getInstance();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("insert into user(fname, lname, username, pass, pic) values(?,?,?,?,?)");
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, username);
            ps.setString(4, pass);
            
             InputStream img =new FileInputStream(new File(imagePath));
             ps.setBlob(5, img);
             
             if(isUsernameExist(txtUserName.getText().trim())){
                  JOptionPane.showMessageDialog(null, "Username Already exist");
             }else{
                  if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null, "Account Created");
             }else{
                 JOptionPane.showMessageDialog(null, "Something Wrong");
             }
             }
            
             
        } catch (Exception ex) {
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
       
        
        
        
       
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLoginAccount;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
