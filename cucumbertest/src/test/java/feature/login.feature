Feature: tester la fonctionnalité Login
Scenario: Login avec des données valides
 Given je suis dans le site Automation Test Store
 When je clique sur le bouton login or registre
    And je saisie un username
    And je saisie un password
    And je clique sur le bouton Login
 Then redirection vers le dashboard
