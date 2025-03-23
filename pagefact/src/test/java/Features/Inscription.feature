Feature: tester la fonctionnalité inscription
  Scenario: inscrit avec des données valides
   Given je suis  naviguer sur le site Automation Test Store
   When je clique sur le bouton loginregistre
    And je clique sur le bouton continue
    And je saisie un First Name
    And je saisie un Last Name
    And je saisie un E-Mail
    And je saisie un Telephone
    And je saisie un Fax
    And je saisie un Company
    And je saisie un Address
    And je saisie un seconde address
    And je saisie un City
    And je saisie un Country
    And je saisie un RegionState
    And je saisie un ZIP Code
    And je saisie un Login name
    And je saisie un Password
    And je saisie un Password Confirm
    And je choisie un Subscribe
    And je check un privacy
    And je clique sur le bouton inscription
   Then redirection vers la page succes