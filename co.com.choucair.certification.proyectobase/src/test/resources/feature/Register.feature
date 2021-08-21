#Autor: Maria Carlina
@stories
Feature: Register new user account
  As a user, I want the system to allow me to register new accounts on the platform, to be able to enter the system with credentials for each user

  @scenario
  Scenario: Register user
    Given that Brandon wants to register on the uTest platform
    When fill in all your personal data from the form
      | firstName | lastName   | email   | birthMonth      | birthDay        | birthYear       | languages |
      | TuNombre  | TuApellido | TuEmail | MesDeNacimiento | DíaDeNacimiento | AñoDeNacimiento | Italian |
    Then the system allows you to create a unique password to enter the platform
      | password     | confirmPassword |
      | TuContraseña | TuContraseña    |