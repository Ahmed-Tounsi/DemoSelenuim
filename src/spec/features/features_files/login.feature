
@login
Feature: test de la fonctionnalite de l authentification de l appli swaglabs
 Autant que utlisateur je souhaite teste la page de la coonexion de l appli swaglabs
 
 @login-cas-passant 
  
  Scenario: Je souhaite tetste la page de connexion avec un cas passant
    Given Je me coonecte sur l appli swaglabs
    When Je saisie le username "standard_user"
    And Je saisie le MDP "secret_sauce"
    And Je clique sur le bouton login
    Then Je me redirige vers la page d acceuil "Products"
    
    
     @login-cas-non_passant 
  
  Scenario: Je souhaite tetste la page de connexion avec un cas passant
    Given Je me coonecte sur l appli swaglabs
    When Je saisie le username "ahmed"
    And Je saisie le MDP "ahmed123"
    And Je clique sur le bouton login
    Then un message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
    
    @login-config-file
     Scenario: Je souhaite tetste la page de connexion avec un cas passant
    Given Je me coonecte sur l appli swaglabs
    When Je saisie le username
    And Je saisie le MDP
    And Je clique sur le bouton login
    Then Je me redirige vers la page d acceuil "Products"

  