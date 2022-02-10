
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contactQuery {
    
    public void insertContact(contact cont)
    {
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `mycontact`(`fname`, `lname`, `groupc`, `phone`, `email`, `adress`, `pic`, `userid`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroupc());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdress());
            ps.setBytes(7, cont.getPic());
            ps.setInt(8, cont.getUserid());
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "New Contntact Add");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Somthing Wrong");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        public void updateContact(contact cont, boolean withImage)
        {
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";
        
        if (withImage == true) // if the user want to update the contact profile picture to
        {
            updateQuery = "UPDATE `mycontact` SET `fname`= ?,`lname`= ?,`groupc`= ?,`phone`= ?,`email`= ?,`adress`= ?,`pic`= ? WHERE `id`= ?";
            
            
            try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroupc());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdress());
            ps.setBytes(7, cont.getPic());
            ps.setInt(8, cont.getCid());
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "Contntact Data Edited");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Somthing Wrong");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        }
        else{ // the user want to keep the same Image [remove the image from the update
            
            updateQuery = "UPDATE `mycontact` SET `fname`= ?,`lname`= ?,`groupc`= ?,`phone`= ?,`email`= ?,`adress`= ? WHERE `id`= ?";
            
            try {
            ps = con.prepareStatement(updateQuery);
            ps.setString(1, cont.getFname());
            ps.setString(2, cont.getLname());
            ps.setString(3, cont.getGroupc());
            ps.setString(4, cont.getPhone());
            ps.setString(5, cont.getEmail());
            ps.setString(6, cont.getAdress());
            ps.setInt(7, cont.getCid());
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "Contntact Data Edited");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Somthing Wrong");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
   
    }
        
    public void deleteContact(int cid)
    {
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `mycontact` WHERE `id`= ?");
            ps.setInt(1, cid);
            
            if(ps.executeUpdate() !=0){
                JOptionPane.showMessageDialog(null, "Contntact Deleted");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Somthing Wrong");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    // creat a list of contact
    public ArrayList<contact> contactList(int userId){
        
        ArrayList<contact> clist = new ArrayList<contact>();
        
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `fname`, `lname`, `groupc`, `phone`, `email`, `adress`, `pic` FROM `mycontact` WHERE userid = " + userId);
            
            contact ct;
            
            while(rs.next()){
                ct = new contact(rs.getInt("id"), 
                                 rs.getString("fname"),
                                 rs.getString("lname"), 
                                 rs.getString("groupc"), 
                                 rs.getString("phone"), 
                                 rs.getString("email"), 
                                 rs.getString("adress"), 
                                 rs.getBytes("pic"), 
                                 userId);
                clist.add(ct);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clist;
        
    }
    
}
