Feature: Tester la fonctionnalité login

  Scenario Outline: verifier la connexion avec des données invalides
    Given utilisateur naviguer vers la page connexion
    When utilisateurs saisie <username>
    And utilistaeurs saisie <password>
    And utilisateur clique sur Login
    Then utilistaeur reste dans la page login
    Examples:
      | username         | password        |
      | "standard_user"  | "secret_sauce1" |
      | "standard_user1" | "secret_sauce"  |
      | ""               | "secret_sauce"  |
      | "standard_user"  | ""              |

