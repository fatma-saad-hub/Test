Feature: tester la fonctionnalité ajouter produit
  Scenario: ajouter un nouveau produit
  Given je suis sur le site Automation Test Store
  When je clique sur le bouton login
    And je choisie un username
    And je choisie un password
    And je clique sur login
    And redirection vers le dash
    And je clique sur le bouton Cart
    And je clique sur le bouton continue shop
    And  je choisie et ajouter  un produit
    Then produits ajouter dans la cart
    And je clique sur le bouton checkout un produit
    And je clique sur le bouton Confirmer ordre
  Then je suis dans la page confirmation ordre




