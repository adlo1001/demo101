package et.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import et.demo.service.FriendService;

@RestController
public class FriendController {
	@Autowired
	FriendService friendService;
}
