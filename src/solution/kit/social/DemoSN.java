package solution.kit.social;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoSN {

	public static void main(String[] args) {
		
		SocialNetwork sn = SocialNetwork.generateDemoNetwork();
		
		for(User u : sn.getUsers()) {
			System.out.println(u);
		}
		
		for(User u : sn.getUsers()) {
			ArrayList<User> allFriends = sn.findAllFriends(u,1,2);
			System.out.println(u.getName() + " => " + allFriends);
			System.out.println("Anzahl Freunde von " + u.getName() + " bis zur 2. Ebene => " + allFriends.size());
		}
			
	}
	
	

}
