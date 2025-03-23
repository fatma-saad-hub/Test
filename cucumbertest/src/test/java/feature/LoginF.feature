Feature: tester la connexion Login
  Scenario: Login data valides
    Given ouvrir site Automation Test Store
    When click sur le bouton login or registre
    And je saisie loginname
    And je saisie  Password
    And je clique sur le boutton Login
    Then redirection vers le dashb
