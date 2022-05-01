package com.LSAutomation.lsProject;

import java.util.ArrayList;
import java.util.List;

public class Authorization {

	  public List<Permission> permissions;
	  public List<User> users;
	
	  public Authorization(List<Permission> permissions, List<User> users) {
	    this.permissions = permissions;
	    this.users = users;
	  }
	  
	  public ArrayList<String> listPermissions(int userId) {
		    // TODO: fill this out!
		    //If user does not exists then retun empty list
		    ArrayList<String> list = new ArrayList<String>();
		    
		    for (User user:users){
		      if (user.id == userId){
		        for (String role:user.roles){
		          for (Permission perm:permissions){
		            if (role.equals(perm.role) && (perm.active == true)){
		              list.add(perm.name);
		            }
		          }
		        }
		      }
		    }
		    return list;
		  }

		  public boolean checkPermitted(String permissionName, int userId) {
		    // TODO: fill this out!
		    ArrayList<String> list = listPermissions(userId);
		    
		    return list.contains(permissionName);
		    //throw new RuntimeException("Please remove this when you //implement this function");
		  }
}
