Feature: Tester la fonctionnalité login
  Scenario: verifier la connexion avec des données valides
    Given utilisateur dans la page connexion
    When utilistaeur saisie "standard_user"
    And utilistaeur saisie un pass "secret_sauce"
    And utilistaeur clique sur le bouton Login
    Then utilistaeur rediriger vers son compte