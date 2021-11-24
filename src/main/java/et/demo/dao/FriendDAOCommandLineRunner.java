package et.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import et.demo.model.Address;
import et.demo.model.Friend;
import et.demo.service.FriendService;

public class FriendDAOCommandLineRunner implements CommandLineRunner{

	@Autowired 
	FriendService friendService;
	@Override
	public void run(String... args) throws Exception {
	
		Address address = new Address("Bole", "AA","");
		Friend friend = new Friend("kk","JJ","",address);
		friendService.save(friend);
		
	}

}
