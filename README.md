Getting started:

1) Forward to the http//localhost:8080/login to login or use Postman for it.
2) Any wrong credentials would provide custom UserNotFoundException with custom message.
3) Also, we have correct username and password for the authentication in the application.yml file.
4) Input correct username and password from the application.yml file to access 
   the secured welcome page.
5) Each time user trying to access the application, it would redirect to the login page by default.

Application consist of next classes:
1) WebSecurityConfig is simple spring security configuration
2) TestController is a simple controller with post method to the /welcome url.
3) UserNotFoundException is a custom RuntimeException with default message.
4) CustomAuthenticationProvider is the custom AuthenticationProvider.
5) SpringSecurityTestTaskApplication is the main application class.

Application also have integration tests in the test directory. 
