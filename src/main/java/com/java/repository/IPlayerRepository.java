package com.java.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.model.Player;

public interface IPlayerRepository {
	public void save(Player pl,Connection con) throws SQLException;
	public void updateNameAndRANK(String name,int rank,int id,Connection con);
	public void updateCountry(String country,int id,Connection con);
	public List<Player> findAll(Connection con);
	public Player findById(int id,Connection con);
	public void deleteById(int id,Connection con);
	public void deleteAll(Connection con);
}