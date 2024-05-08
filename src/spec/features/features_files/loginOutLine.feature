@loginOutLine
Feature: je souhaite me connecter avec plusieurs comptes a l appli

  Scenario Outline: je souhaite me connecter avec plusieurs comptes a l appli SWAGLABS
    Given Je me coonecte sur l appli swaglabs
    When Je saisie le username "<username>"
    When Je saisie le MDP "<password>"
    And Je clique sur le bouton login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
