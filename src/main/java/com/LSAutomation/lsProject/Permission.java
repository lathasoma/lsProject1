package com.LSAutomation.lsProject;
import java.util.*;

public class Permission {
	
	  public Permission() {}
	  public Permission(String role, String name, boolean active) {
	    this.role = role;
	    this.name = name;
	    this.active = active;
	  }
	
	  public String role;
	  public String name;
	  public boolean active;
}
