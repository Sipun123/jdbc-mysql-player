


package com.java.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Player;
import com.java.utils.PlayerQueries;

public class PlayerRepositoryImpl implements IPlayerRepository {

	public void save(Player pl, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement ps=con.prepareStatement(PlayerQueries.INSERT);
		ps.setInt(1, pl.id);
		ps.setString(2, pl.name);
		ps.setString(3, pl.country);
		ps.setInt(4, pl.rank);
		
		ps.executeUpdate();
		
	}

	public void updateNameAndrank(String name, int rank, int id, Connection con) {
		// TODO Auto-generated method stub

	}
	
	public void updateCountry(String country, int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public List<Player> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;}
	

	public Player findById(int id, Connection con) { 
		return null;}
		// TODO Auto-generated method stub
		

	public void deleteById(int id, Connection con) {
		// TODO Auto-generated method stub

	}

	public void deleteAll(Connection con) {
		// TODO Auto-generated method stub

	}

	public void updateNameAndRANK(String name, int rank, int id, Connection con) {
		// TODO Auto-generated method stub
		
	}


		
	}


