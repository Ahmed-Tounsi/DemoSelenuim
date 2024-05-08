package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	private LoginPageObject loginPageObject;
	
	public LoginStepDefinition() {
		loginPageObject=new LoginPageObject();
	}
	

	@Given("Je me coonecte sur l appli swaglabs")
	public void jeMeCoonecteSurLAppliSwaglabs() {
		loginPageObject.connectToApp();	
	    
	}
	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String usr) {
		loginPageObject.saisieUserName(usr);
	}
	@When("Je saisie le MDP {string}")
	public void jeSaisieLeMDP(String pwd){
		loginPageObject.saisiePassword (pwd);
	    
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPageObject.clickBtn();
	    
	}
	@Then("Je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String attendu) {
	String obtenu=LoginPageObject.title.getText();
	Assert.assertEquals(obtenu, attendu);
	   
	}
	

	@Then("un message d erreur s affiche {string}")
	public void unMessageDErreurSAffiche(String msgAttendu) {
	 String msgobtenu=LoginPageObject.messageErreur.getText() ;
	 Assert.assertEquals(msgobtenu, msgAttendu);
	}

	

	@When("Je saisie le username")
	public void jeSaisieLeUsername() {
	   loginPageObject.fillUsername(); 
	}
	@When("Je saisie le MDP")
	public void jeSaisieLeMDP() {
	 loginPageObject.fillPassword();   
	}







}
