# SpringAuthenticatedStarter
Simple Starter Project That uses Spring Security With Thymeleaf and API endpoints.

See /security/SecurityCustomConfig.java to configure user store / public / private routes etc
/security/ApiAuthenticationEntryPoint.java Will  return a 401 for unauthenticated api calls
/webapp/MainController.java contains routes to serve thymeleaf templates - including login page.
/webapp/ErrorController.java will show a generic error page for any exception thrown.
/api/DemoApiResource.java holds a demo API enpoint exposed as api/now to test security

/resources/templates/homepage.html is a thymeleaf template, showing different page elements based on login role
/resources/templates/login.html thymeleaf template for login screen.
/resources/templates/error.html thymeleaf template for generic error screen - served by /webapp/ErrorController.exception() method
