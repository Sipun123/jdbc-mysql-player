package com.java.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Player;
import com.java.repository.IPlayerRepository;
import com.java.utils.ConnectionUtils;

public class PlayerServiceImpl implements IPlayerService {

	private IPlayerRepository repository;
	public PlayerServiceImpl(IPlayerRepository repository) {
		this.repository=repository;
	}
	

	public void save(Player pl) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=ConnectionUtils.getConnection1(); // create connection
			repository.save(pl, con); // save
			con.commit();// commit
			System.out.println("**** saved player: "+pl.id);
		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback(); // rollback
				System.out.println("**** failed to save player: "+pl.id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			try {
				ConnectionUtils.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateNameAndRank(String name, Double rank, int id) {
		// TODO Auto-generated method stub

	}

	public void updateCountry(String country, int id) {
		// TODO Auto-generated method stub

	}

	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Player findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
