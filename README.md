TicTacToe

Spring Boot Application for TicTacToe game with two players of 3*3 board size.

Spring Boot 2.0.5 RELEASE go to
http://docs.spring.io/spring-boot/docs/2.0.5.RELEASE/reference/htmlsingle/
to learn more about spring boot

To build and run the application:

Build the application: Run As->maven clean and Run As->maven install.

Once build is successful,Run the application as "Spring Boot App".

The application can be hosted on tomcat server with port number 8080 by default.

To test the application:

Go to http://localhost:8080/tictactoe

Once click on the above URL, it will redirect to the application.

In this application, all inputs and gaming probabilities of two users are in  3*3 board size, can be displayed in the console, not from UI.

Tictactoe game is played from the console,with two players of board size of 3*3. 

While giving the input positions for any player can given as 0 0,0 1,0 2,1 0,1 1,1 2,2 0 etc as it taking as x y values from code and also restricting positions up to 2 2 as it is 3*3 size.