package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import com.app.pageexe.LoginPage_PageExe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_Exe extends LoginPage_PageExe{
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	   browserlaunch("https://www.facebook.com");
	}
	@Given("Enter the URL")
	public void enter_the_url() {
	   System.out.println("URL");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String user) {
	    username(user);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	   passeword(pass);
	}
	@When("Enter the loginbutton")
	public void enter_the_loginbutton() {
	    System.out.println("loginbutton");
	}
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	    System.out.println("HOmepage");
	}

	//aslist
	@When("Enter the userdata")
	public void enter_the_userdata(DataTable user) {
		List<String> asList = user.asList();
		System.out.println(asList.get(1));

	}
	//aslist
	@When("Enter the passdata")
	public void enter_the_passdata(DataTable pass) {
		List<String> asList = pass.asList();
		System.out.println(asList.get(1));
	}
	
	//aslists
	@When("Enter the userdata for lists")
	public void enter_the_userdata_for_lists(DataTable user) {
		List<List<String>> asLists = user.asLists();
		System.out.println(asLists.get(0).get(0));
		System.out.println(asLists.get(2).get(0));
	}
	//asMap
	@When("Enter the userdata for Map")
	public void enter_the_userdata_for_map(DataTable user) {
	   Map<String, String> asMap = user.asMap();
	   System.out.println(asMap.get("username1"));
	   
	}



}
