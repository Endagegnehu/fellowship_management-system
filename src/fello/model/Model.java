package fello.model;

import fello.pojo.Member;
import fello.view.view_home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Model {
    Member member = new Member();
    private Connection connection = null;
    public static Model _instance;
     Statement st;
     String sql;
     PreparedStatement preparedStatement;
     ResultSet resultSet;
    Model(){
        try {
            connection = Jdbc.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Model getInstance(){
        if (_instance == null){
            _instance = new Model();
        }
        return _instance;
    } 
    public void insert(String table, String columns, String values) throws SQLException{
        st =connection.createStatement(); 
        sql="INSERT INTO"+table+"("+columns+")"+" VALUES "+"("+values+")";    
        st.executeUpdate(sql);
    }
    public void select(String columns,String table,String values) throws SQLException{
        st = connection.createStatement();
        sql="SELECT "+columns+" FROM "+table+" WHERE "+values;
        resultSet = st.executeQuery(sql);
        System.out.println(resultSet);
    }
    public void update(String table, String columns, String values) throws SQLException{
        st = connection.createStatement();
//        sql="UPDATE "+table+" SET "+columns+" WHERE `idmember` ="+"\""+tafesse+"\"" ;
        st.executeUpdate(sql);
    }
    public void loginSelectAll(String tabele,String values, String values1) throws SQLException{
         sql = "SELECT * FROM "+tabele+" WHERE username=? and password=?";
         try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,values);
            preparedStatement.setString(2, values1);
            resultSet = preparedStatement.executeQuery();
             if (resultSet.next()) {
                view_home home = new view_home();
                 home.setVisible(true);
                 home.setDefaultCloseOperation(view_home.DISPOSE_ON_CLOSE);
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Username or password incorect");  
             }
        } catch (SQLException e) {
           
        }
    }
    public void delete(String table,String values) throws SQLException{
         st = connection.createStatement();
    }

    public void selectAll(String tableMember) throws SQLException {
      String frist_name = null;
      sql ="SELECT * FROM "+tableMember;
      preparedStatement = connection.prepareStatement(sql);
      resultSet=preparedStatement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }
        
        System.out.println((String)resultSet.getString(1));
    }
}
