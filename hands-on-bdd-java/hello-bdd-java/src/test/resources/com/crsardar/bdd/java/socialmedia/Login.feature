Feature: User login on social networking site

  The user should be able to login into the social networking site when the username and the password are correct.

  The user should be shown an error message when the username and the password are incorrect.

  The user should be navigated to the home page if the username and the password are correct.

  Scenario Outline: Login functionality for a social networking site.
                    The given user navigates to Facebook.
    When I enter Username as "<username>" and Password as "<password>".
    Then login should be unsuccessful.
    Examples:
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |
      | username3 | password3 |
