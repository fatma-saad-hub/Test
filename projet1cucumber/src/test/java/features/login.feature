Feature: Tester la fonctionnalité login
  Scenario: verifier la connexion utilisateur avec des données valides
    Given user dans la page connexion
    When user saisie un username valide
    And user saisie un password valide
    And user clique sur le bouton Login
    Then user rediriger vers son compte