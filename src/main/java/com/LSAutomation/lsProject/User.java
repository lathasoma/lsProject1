package com.LSAutomation.lsProject;

import java.util.List;

public class User {
	  public User() {}
	  public User(int id, String name, List<String> roles) {
	    this.id = id;
	    this.name = name;
	    this.roles = roles;
	  }
	  public int id;
	  public String name;
	  public List<String> roles;


}
