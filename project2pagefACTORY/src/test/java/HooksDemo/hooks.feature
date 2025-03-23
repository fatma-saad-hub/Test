Feature: Tester la fonctionnalité login

  Scenario: verifier la connexion utilisateur avec des données valides
    Given user dans la page login
    When user saisie un username and password valide
    And user clique sur Login button
    Then user rediriger vers son page

  Scenario: verifier la connexion utilisateur avec des données valides
    Given user dans la page login
    When user saisie un username and password valide
    And user clique sur Login button
    Then user rediriger vers son page