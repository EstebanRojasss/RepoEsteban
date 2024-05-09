
package snakegame;

import javax.swing.JFrame;

public class SnakeGame extends JFrame{
int widht = 640;
int height = 480;
    public SnakeGame(){
        setTitle("Snake");
        setSize(widht, height);
        setVisible(true);
        
    }
    
    public static void main(String []args){
        SnakeGame snake = new SnakeGame();
    }
    
}
