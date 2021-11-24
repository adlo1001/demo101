package et.demo.service;

import org.springframework.data.repository.CrudRepository;

import et.demo.model.Friend;

public interface FriendService extends CrudRepository<Friend, Integer>{

}
