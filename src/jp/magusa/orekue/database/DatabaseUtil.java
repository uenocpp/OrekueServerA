package jp.magusa.orekue.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import jp.magusa.orekue.model.User;

public class DatabaseUtil {
	public static final String DATABASE_FILENAME = "E:\\server\\orekue.db";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static User selectUser( long user_id ){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = new User();
		
		try{
			Class.forName( "org.sqlite.JDBC" );
			conn = DriverManager.getConnection( "jdbc:sqlite:" + DATABASE_FILENAME );
			
			String sql = "SELECT * FROM user_table WHERE _id = ?";
			
			pstmt = conn.prepareStatement( sql );
			pstmt.setLong( 1,  user_id );
			
			rs = pstmt.executeQuery();
			user.setTimeStamp( rs.getLong( "time_stamp" ) );
			user.setDeletedTime( rs.getLong( "deleted_time" ) );
			user.setDeviceId( rs.getString( "device_id" ) );
			user.setAccountName( rs.getString( "account_name" ) );
			user.setName( rs.getString( "name" ) );
			user.setIcon( rs.getString( "icon" ) );
			user.setTitleId( rs.getLong( "title_id" ) );
			user.setPrefixId( rs.getLong( "prefix_id" ) );
			user.setParamStudy( rs.getLong( "param_study" ) );
			user.setParamExercise( rs.getLong( "param_exercise" ) );
			user.setParamCommunication( rs.getLong( "param_communication" ) );
			user.setParamFashion( rs.getLong( "param_society" ) );
			user.setParamSociety( rs.getLong( "param_society" ) );
			user.setParamArt( rs.getLong( "param_art" ) );
		} catch( Exception e ){
			e.printStackTrace();
		} finally {
			if( conn != null ){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( pstmt != null ){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( rs != null ){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return user;
		
	}
	public static void insertUser( String device_id,String account_name,String hashed_password,String name){
		Connection conn = null;
		PreparedStatement pstmt = null;
		final long time_stamp = Calendar.getInstance().getTimeInMillis();
		
		try{
			Class.forName( "org.sqlite.JDBC" );
			conn = DriverManager.getConnection( "jdbc:sqlite:" + DATABASE_FILENAME );
			
			String sql = "INSERT INTO user_table(time_stamp,device_id,account_name,hashed_password,name) VALUES(?,?,?,?,?);";
		
			pstmt = conn.prepareStatement( sql );
			pstmt.setLong(1,time_stamp );
			pstmt.setString(2,device_id );
			pstmt.setString(3,account_name );
			pstmt.setString(4,hashed_password );
			pstmt.setString(5,name );
			
			pstmt.executeUpdate();
			
		} catch( Exception e ){
			e.printStackTrace();
		} finally{
			if( conn != null ){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if( pstmt != null ){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
