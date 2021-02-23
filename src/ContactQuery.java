
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ContactQuery {
    public boolean insertContact(Contact cont){
        
        boolean contactIsCreated=true;
        Connection con = MyConnection.getInstance();
        PreparedStatement ps;
        
        try {
            ps=con.prepareStatement("insert into mycontact(fname, lname, groupc, phone, email, address, pic, userid) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroup());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAddress());
            ps.setBytes(7, cont.getPic());
            ps.setInt(8, cont.getUid());
             if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null, "New Contact Created");
                 contactIsCreated=true;
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Something Wrong");
                 contactIsCreated=false;
               
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contactIsCreated;
        
        
    }
    
    public void UpdateContact(Contact cont, boolean withImage){
        
        
        Connection con = MyConnection.getInstance();
        PreparedStatement ps;
        String sql="";
        
        if(withImage==true){
            sql="update mycontact set fname=?, lname=?, groupc=?, phone=?, email=?, address=?, pic=? where id=? ";
            try {
            ps=con.prepareStatement(sql);
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroup());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAddress());
            ps.setBytes(7, cont.getPic());
            ps.setInt(8, cont.getCid());
             if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null, "Contact Data Edited");
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Something Wrong");
                 
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }else{
             sql="update mycontact set fname=?, lname=?, groupc=?, phone=?, email=?, address=? where id=? ";
             
             try {
            ps=con.prepareStatement(sql);
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroup());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAddress());
            ps.setInt(7, cont.getCid());
            
            
             if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null, "Contact Data Edited");
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Something Wrong");
                 
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
    }
    
     public void deleteContact(int cid){
        
        
        Connection con = MyConnection.getInstance();
        PreparedStatement ps;
        
        try {
            ps=con.prepareStatement("delete from mycontact where id=?");
           ps.setInt(1, cid);
             if(ps.executeUpdate()!=0){
                 JOptionPane.showMessageDialog(null, "Contact Deleted");
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Something Wrong");
               
             }
            
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
  public ArrayList<Contact> contactList(int userId){
      ArrayList<Contact> clist=new ArrayList<Contact>();
      Connection con = MyConnection.getInstance();
        Statement st;
        ResultSet rs;
        try {
            st=con.createStatement();
            rs=st.executeQuery("select id, fname, lname, groupc, phone, email, address, pic from mycontact WHERE userid= "+userId);
            Contact ct;
            while(rs.next()){
                ct=new Contact(rs.getInt("id"),
                               rs.getString("fname"), 
                               rs.getString("lname"), 
                               rs.getString("groupc"), 
                               rs.getString("phone"),
                               rs.getString("email"), 
                               rs.getString("address"),
                               rs.getBytes("pic"), 
                               userId);
                
                clist.add(ct);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clist;
  }  
}
