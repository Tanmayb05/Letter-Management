
package Letter.Management;

import java.sql.*;  

public class ConnectionEstablish {
    
    Connection c;
    Statement s;
    public ConnectionEstablish(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///letter","root","149162536");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }    

}
