
package com.java;

import com.java.model.Player;
import com.java.repository.PlayerRepositoryImpl;
import com.java.repository.IPlayerRepository;
import com.java.service.PlayerServiceImpl;
import com.java.service.IPlayerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IPlayerRepository repository=new PlayerRepositoryImpl();
    	IPlayerService service=new PlayerServiceImpl(repository);
    	// CREATE player
    	Player pl1=new Player();
    	pl1.id=1;
    	pl1.name="john";
    	pl1.country="India";
    	pl1.rank=500;
    	
    	service.save(pl1); // calling save
    	
    	Player pl2=new Player();
    	pl2.id=2;
    	pl2.name="Sohn";
    	pl2.country="Africa";
    	pl2.rank=510;
    	
    	service.save(pl2); // calling save
    	
    	Player pl3=new Player();
    	pl3.id=3;
    	pl3.name="Ronaldo";
    	pl3.country="America";
    	pl3.rank=567;
    	
    	service.save(pl3); // calling save
    	
}}

