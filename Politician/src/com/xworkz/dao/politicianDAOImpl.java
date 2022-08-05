package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.constant.Dbcredentials;
import com.xworkz.politician.dto.PoliticianDTO;

public class politicianDAOImpl implements PoliticianDAO{
  
	private static final String President = null;
	private static final Integer Name1 = null;

	@Override
	public void save(PoliticianDTO dto) {
		try {
			Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			String sql = "insert into politician.ploiticiandetails values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement prestat = connection.prepareStatement(sql);
			prestat.setInt(1,dto.getId());
			prestat.setString(2, dto.getName());
			prestat.setString(3, dto.getPresident());
			prestat.setDouble(4, dto.getTotalMembers());
			prestat.setString(5, dto.getPartySymbol());
			prestat.setString(6, dto.getPartyLocation());
			prestat.setString(7, dto.getPartyColor());
			prestat.setString(8, dto.getPartyState());
		   	prestat.setInt(9, dto.getPartyBudget());
			int noOfRowsAffected = prestat.executeUpdate();
			if(noOfRowsAffected > 0 ) {
				System.out.println("The Values Inserted Are :" + sql);
				System.out.println(noOfRowsAffected);
				} 
				else {
				System.out.println("Unable to insert Data..!!");
				}
			}	
			catch (SQLException e) {

				e.printStackTrace();
			}
	// return rowsaffected == 1 ? true:false;p0
			}		
		

	@Override
	public PoliticianDTO findById(int id) {
		 try {
			 Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			    String query = "select * from politician.ploiticiandetails where id=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name=rs.getString(2);
			    	String president = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	double pb = rs.getInt(9);
			       System.out.println(id1+" "+name);
			       
			       PoliticianDTO pdto = new PoliticianDTO(id1, ps, ps, id1, ps, ps, ps, ps, id1);
			       pdto.setId(id);
			       pdto.setPresident(president);
			       pdto.setTotalMembers(id);
			       pdto.setPartyColor(pc);
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setPartyBudget((int) pb);
			       return pdto;
			    }
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}


	@Override
	public PoliticianDTO findByIdAndPresident(int id, String name) {
		    try {
		    	 Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
				    String query = "select * politician from ploiticiandetails where id=? and President=?";
				    PreparedStatement statement = connection.prepareStatement(query);
				    statement.setInt(1, id);
				    statement.setString(2, President);
				    ResultSet rs = statement.executeQuery();
				    while(rs.next()) {
				    	Integer id1 = rs.getInt(1);
				    	String name1=rs.getString(2);
				    	String president1 = rs.getString(3);
				    	double tm = rs.getDouble(4);
				    	String psl = rs.getString(5);
				    	String pc = rs.getString(6);
				    	String pl = rs.getString(7);
				    	String ps = rs.getString(8);
				    	int pb = rs.getInt(9);
				       System.out.println(id1+" "+Name1);
				       
				       PoliticianDTO pdto = new PoliticianDTO(id1, ps, ps, id1, ps, ps, ps, ps, id1);
				       pdto.setId(id);
				       pdto.setPresident(president1);;
				       pdto.setTotalMembers(id);
				       pdto.setPartyColor(pc);
				       pdto.setPartyLocation(pl);
				       pdto.setPartyState(ps);
				       pdto.setPartyBudget(pb);
				       return pdto;
				    }
		    } catch (SQLException e) {

				e.printStackTrace();
				    }
			return null;
		}

	@Override
	public PoliticianDTO findByIdAndAndName(int id, String name, String president) {
		  try {
			  Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			    String query = "select * from politician from ploiticiandetails where id=? and President=? and Name=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    statement.setString(2, president);
			    statement.setString(3, name);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name1=rs.getString(2);
			    	String president1 = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	int pb = rs.getInt(9);
			       System.out.println(id1+" "+Name1);
			       
			       PoliticianDTO pdto = new PoliticianDTO(id1, ps, ps, id1, ps, ps, ps, ps, id1);
			       pdto.setId(id);
			       pdto.setPresident(president);
			       pdto.setTotalMembers(id);
			       pdto.setPartyColor(pc);
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setPartyBudget(pb);
			       return pdto;
			    }
	    } catch (SQLException e) {

			e.printStackTrace();
			    }
		return null;
	}
	@Override
	public PoliticianDTO findByIdName(int id, String name) {
		  try {
			  Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			    String query = "select *  politician from ploiticiandetails where id=?  and Name=?";
			    PreparedStatement statement = connection.prepareStatement(query);
			    statement.setInt(1, id);
			    statement.setString(2, name);
			    ResultSet rs = statement.executeQuery();
			    while(rs.next()) {
			    	Integer id1 = rs.getInt(1);
			    	String name1=rs.getString(2);
			    	String president1 = rs.getString(3);
			    	double tm = rs.getDouble(4);
			    	String psl = rs.getString(5);
			    	String pc = rs.getString(6);
			    	String pl = rs.getString(7);
			    	String ps = rs.getString(8);
			    	int pb = rs.getInt(9);
			       System.out.println(id1+" "+name);
			       
			       PoliticianDTO pdto = new PoliticianDTO(pb, ps, ps, pb, ps, ps, ps, ps, pb);
			       pdto.setId(id);
			       pdto.setPresident(president1);
			       pdto.setTotalMembers(id);
			       pdto.setPartyColor(pc);
			       pdto.setPartyLocation(pl);
			       pdto.setPartyState(ps);
			       pdto.setPartyBudget(pb);
			       return pdto;
			    }
	    } catch (SQLException e) {

			e.printStackTrace();
			    }
		return null;
	}


	@Override
	public String findNameById(int id) {
		try {
			 Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
		    String query = "select Name from politician from ploiticiandetails where "+" id ="+id;
		   Statement statement =connection.createStatement();
		 //   PreparedStatement statement = connection.prepareStatement(query);
		   // statement.setInt(1, id);
		    ResultSet resultset = statement.executeQuery(query);
		    while(resultset.next()) {
		    String fresh =resultset.getString(1);
		    return fresh;
		    }
		    

		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return "No data found";
	}


	@Override
	public String friendPresidentByIdAndName(String name, int id) {
		  try {
			  Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
			    String query = "select President from politician from ploiticiandetails where "+" id ="+id +"Name ="+ name;
//			    PreparedStatement statement = connection.prepareStatement(query);
//			    statement.setInt(1, id);
//			    statement.setString(2, name);
			    Statement statement = connection.createStatement();
			    ResultSet rs = statement.executeQuery(query);
			    while(rs.next()) {
			    	System.out.println("hgsxxjhvxs");
			    	//Integer id1 = rs.getInt(1);
			    	String name1 = rs.getString(2);
			    	return   name1;
			    }
			    } catch (SQLException e) {

					e.printStackTrace();
					    }
			    	return null;
	}
	@Override
	public int getTotal() {
	   try {
		   Connection connection=DriverManager.getConnection(Dbcredentials.URL.getValue(),Dbcredentials.USERNAME.getValue(),Dbcredentials.SECRET.getValue());
				    String query = "politician from ploiticiandetails ";
				    PreparedStatement statement = connection.prepareStatement(query);
				    ResultSet rs =  statement.executeQuery();
				    AtomicInteger auto = new AtomicInteger();
				    while(rs.next()) {
				    	auto.incrementAndGet();
				    	}
				    System.out.println("No of rows in Database :"+auto);
			       } catch (SQLException e) {
					e.printStackTrace();
				}
			return 0;
		}

	@Override
	public PoliticianDTO findPartyByMaxMembers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	


