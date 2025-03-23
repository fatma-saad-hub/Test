Feature: teste la fonctionnalité Login
  Scenario: Loging avec des données valides
   Given je suis navigué le site Automation Test Store
   When je clique sur le bouton log or registre
    And je saisie username "john12354"
    And je saisie password "secret"
    And je clique sur le bouton Loginn
   Then je redirige vers le dash


  Scenario: connexion avec un login name invalide
   Given je navigue sur le site Automation Test Store
   When je tape sur le bouton log or registre
    And je tape un username invalide "john1235"
    And je tape un  password "secret"
    And je tape sur le bouton Login
   Then je reste dans la page login

  Scenario: connexion avec un password invalide
   Given j'ouvre le site Automation Test Store
   When je tape sur le bouton login or registre
    And je tape valide username "john12354"
    And je tape invalide password "secret12"
    And je tape sur le bouton Loginn
   Then je peux pas rediriger vers le dash