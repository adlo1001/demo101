package et.demo;



import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import et.demo.service.FriendService;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired 
	FriendService friendService;
	
	@Test
	void contextLoads() {
		Assert.assertNotNull(friendService);
		
	}

}
