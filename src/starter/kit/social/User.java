package starter.kit.social;

import java.util.ArrayList;

public class User {
	
	private Integer id;
	private String name;
	private Integer age;
	private ArrayList<User> friends = new ArrayList<>();
	
	public User(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public ArrayList<User> getFriends() {
		return new ArrayList<>(friends);
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

}
