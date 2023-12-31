package DbOperations;

import static DbOperations.DbConnection.metaData;
import static DbOperations.DbConnection.result;
import static DbOperations.DbConnection.statement;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserManagement extends DbConnection{
    private final Component component;
    
    public UserManagement(Component component){
        this.component = component;
    }
    
    public void DisplayUserData(JTable table) {
        String[] columnsToDisplay = DbColumns.USERSCOLUMNS.getValues();

        String query = "SELECT " + String.join(", ", columnsToDisplay) + " FROM " + DbTables.USERTABLE.getValue();
        try {
            prepare = connection.prepareStatement(query);

            result = prepare.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            model.setRowCount(0);

            while (result.next()) {
                Object[] row = new Object[columnsToDisplay.length];
                for (int i = 0; i < columnsToDisplay.length; i++) {
                    row[i] = result.getObject(columnsToDisplay[i]);
                }
                model.addRow(row);
            }

            result.close();
            prepare.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getUserId(String u_name,String u_pass){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[0]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[3] + " = ? AND "+DbColumns.USERSCOLUMNS.getValues()[4]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, u_name);
            prepare.setString(2, u_pass);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[0]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }    
    
    public String getFName(String _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[1]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);          
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[1]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }        
        
    public String getLName(String _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[2]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[2]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }    
    
    public String getUName(String _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[3]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[3]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }    
    
    public String getBday(int _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[5]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setInt(1, _id);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[5]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }
    
    public String getGender(String _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[6]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[6]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }
    
    public String getImagePath(String _id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[7]+" FROM "+DbTables.USERTABLE.getValue()+" WHERE "
                + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(DbColumns.USERSCOLUMNS.getValues()[7]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return null;        
    }
    
    public short getUserType(String id){
        String query = "SELECT "+DbColumns.USERSCOLUMNS.getValues()[8]+" FROM "+DbTables.USERTABLE.getValue()+
                " WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, id);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getShort(DbColumns.USERSCOLUMNS.getValues()[8]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return 0;        
    } 
    
    
    
    public void updateFname(String newVal,int _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[1]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setInt(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }    

    public void updateLname(String newVal,int _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[2]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setInt(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }   
      
    public void updateUsername(String newVal,String _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[3]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setString(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public void updatePassword(String newVal,int _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[4]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setInt(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateGender(String newVal,String _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[6]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setString(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public void changeImageFileName(String newVal,String _id){
        String query = "UPDATE "+DbTables.USERTABLE.getValue()+" SET "+DbColumns.USERSCOLUMNS.getValues()[7]+" = ? WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, newVal);
            prepare.setString(2, _id);
            
            prepare.executeUpdate();
            
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public short checkUserCredentials(String u_n, String u_p) {
        String query = "SELECT * FROM " + DbTables.USERTABLE.getValue();
        try {
            prepare = connection.prepareStatement(query);
            result = prepare.executeQuery();

            while (result.next()) {
                String username = result.getString(DbColumns.USERSCOLUMNS.getValues()[3]);
                String password = result.getString(DbColumns.USERSCOLUMNS.getValues()[4]);

                if (u_n.equals(username) && u_p.equals(password)) {
                    prepare.close();
                    result.close();
                    return 1;
                } else if (u_n.equals(username)) {
                    prepare.close();
                    result.close();
                    return 2; 
                } else if (u_p.equals(password)) {
                    prepare.close();
                    result.close();
                    return 3; 
                }
            }

            prepare.close();
            result.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        } catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0; 
    }
    
    public void addUserValue(String[] values){
        String query = "INSERT INTO "+DbTables.USERTABLE.getValue()+
                " ("+DbColumns.USERSCOLUMNS.getValues()[1]+","+DbColumns.USERSCOLUMNS.getValues()[2]+","+DbColumns.USERSCOLUMNS.getValues()[3]+
                ","+DbColumns.USERSCOLUMNS.getValues()[4]+","+DbColumns.USERSCOLUMNS.getValues()[5]+","+DbColumns.USERSCOLUMNS.getValues()[6]+
                ","+DbColumns.USERSCOLUMNS.getValues()[7]+","+DbColumns.USERSCOLUMNS.getValues()[8]+") VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, values[0]);
            prepare.setObject(2, values[1]);
            prepare.setObject(3, values[2]); 
            prepare.setObject(4, values[3]); 
            prepare.setObject(5, values[4]); 
            prepare.setObject(6, values[5]);
            prepare.setObject(7, values[6]);
            prepare.setObject(8, values[7]);

            prepare.executeUpdate();
            prepare.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void EditUserData(Object newVal, int colIdx, Object p_n){
        String query = "UPDATE " + DbTables.USERTABLE.getValue() + " SET " + DbColumns.USERSCOLUMNS.getValues()[colIdx] + " = ? WHERE " + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";

        try {
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, newVal);
            prepare.setObject(2, p_n);

            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean checkCurrentUser(String value) {
        String query = "SELECT " + DbColumns.USERSCOLUMNS.getValues()[0] + " FROM " + DbTables.USERTABLE.getValue() +
                       " WHERE " + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";

        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, value);
            result = prepare.executeQuery();

            if (result.next()) {
                prepare.close();
                return true;
            }

            prepare.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
    
    public short promoteUser(String id) {
        short currentValue = getUserType(id);
        if (currentValue <= 0) {
            return 3;
        }
        String query = "UPDATE " + DbTables.USERTABLE.getValue() + " SET " + DbColumns.USERSCOLUMNS.getValues()[8] +
                " = " + DbColumns.USERSCOLUMNS.getValues()[8] + " - 1 WHERE " + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, id);
            int rowsUpdated = prepare.executeUpdate();
            prepare.close();

            if (rowsUpdated > 0) {
                return 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return 2;
    }

    public short demoteUser(String id) {
        short currentValue = getUserType(id);
        if (currentValue >= 4) {
            return 3;
        }
        String query = "UPDATE " + DbTables.USERTABLE.getValue() + " SET " + DbColumns.USERSCOLUMNS.getValues()[8] +
                " = " + DbColumns.USERSCOLUMNS.getValues()[8] + " + 1 WHERE " + DbColumns.USERSCOLUMNS.getValues()[0] + " = ?";
        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, id);
            int rowsUpdated = prepare.executeUpdate();
            prepare.close();

            if (rowsUpdated > 0) {
                return 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return 2;
    }
    
    public void DeleteUser(Object ID) {
        String query = "DELETE FROM "+DbTables.USERTABLE.getValue()+" WHERE "+DbColumns.USERSCOLUMNS.getValues()[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, ID);
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
    }   
    
    public int getHowManyUsers() {
        String query = "SELECT COUNT(*) FROM " + DbTables.USERTABLE.getValue();
        int userCount = 0;

        try {
            prepare = connection.prepareStatement(query);
            result = prepare.executeQuery();

            if (result.next()) {
                userCount = result.getInt(1);
            }

            prepare.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }
        return userCount;
    }

    public boolean addUser(Object[] values){
        boolean isSuccessful = true;
        String query = "INSERT INTO "+DbTables.USERTABLE.getValue()+" ("+DbColumns.USERSCOLUMNS.getValues()[0]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[1]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[2]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[3]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[4]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[5]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[6]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[7]+
                ", "+DbColumns.USERSCOLUMNS.getValues()[8]+") " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            prepare = connection.prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                prepare.setObject(i + 1, values[i]);
            }
            prepare.executeUpdate();
            prepare.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(component, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
            isSuccessful = false;
        }        
        return isSuccessful;
    }

}
