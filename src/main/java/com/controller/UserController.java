package com.controller;

public class UserController {
	public String getAllByList(){
		return "getAllByList";
	}
	
	public String addUI(){
		System.out.println("addUI");
		return "addUI";
	}
	
	public String add(){
		return "add";
	}
	
	public String editUI(){
		return "editUI";
	}
	
	public String edit(){
		return "edit";
	}
	
	public String del(){
		System.out.println("del");
		return "del";
	}
}
