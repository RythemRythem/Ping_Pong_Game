Ping Pong:
A local two-player Pong game built with Java Swing as a college team project. Both players share a keyboard and try to hit the ball past the opposing paddle.

Run the game
Install a Java Development Kit (JDK). From the repository folder, run:

javac Ball.java GameFrame.java GamePanel.java Paddle.java PongGame.java Score.java
java PongGame

Controls
| Player | Move up | Move down |
| --- | --- | --- |
| Player 1 (left) | W | S |
| Player 2 (right) | Up arrow | Down arrow |


The ball speeds up after paddle hits. When it gets past a paddle, the opposing player scores and the ball and paddles reset.

Source files
| File | Role |
| --- | --- |
| `PongGame.java` | Starts the game. |
| `GameFrame.java` | Creates the game window. |
| `GamePanel.java` | Runs the game loop, checks collisions, and handles scoring. |
| `Paddle.java`, `Ball.java`, `Score.java` | Handle movement and drawing for the paddles, ball, and scoreboard. |

Credits
Built by Rythem and teammates as a college project.
