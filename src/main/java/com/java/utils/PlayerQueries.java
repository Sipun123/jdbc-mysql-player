package com.java.utils;

public class PlayerQueries {

	public static final String INSERT = "INSERT INTO TBL_PLAYER(ID,NAME,COUNTRY,RANK) VALUES(?,?,?,?)";
	
	public static final String SELECT_ALL ="SELECT *FROM TBL_PLAYER";
	 public static final String SELECT_BY_ID="SELECT * FROM TBL_PLAYER WHERE ID=?";
}
