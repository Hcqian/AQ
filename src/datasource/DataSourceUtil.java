package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceUtil {
	
    /**
     * 注册数据库驱动
     */
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 获取数据源
     * 
     * @throws SQLException
     */
    public static Connection getConnection(String url, String user, String password) throws SQLException {
        System.out.println("连接数据库...");
        return DriverManager.getConnection(url, user, password);
    }
    
    /**
     * 关闭数据源
     * 
     * @throws SQLException
     */
    public static void closeConnection(Connection conn) throws SQLException {
        if (null != conn) {
            conn.close();
        }
    }

}
