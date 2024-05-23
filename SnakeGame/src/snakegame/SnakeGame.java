package snakegame;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.*; // Controlar con el teclado diversas funciones del juego.
import java.awt.Toolkit; // tamanho de las ventnas. Especificar como lo queremos.
import java.awt.Point; // Permite tener el punto en el plano.
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class SnakeGame extends JFrame {

    int widht = 640;
    int height = 480;
    int whidthPoint = 10, heightPoint = 10;
    Point snake;
    ImagenSnake imagenSnake;
    int direccion = KeyEvent.VK_LEFT;
    public SnakeGame() {
        setTitle("Snake");
        setSize(widht, height);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - widht / 2, dim.height / 2 - height / 2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Teclas teclas = new Teclas();
        this.addKeyListener(teclas);
        
        snake = new Point(widht/2, height/2);
        ImagenSnake imagenSnake = new ImagenSnake();
        this.getContentPane().add(imagenSnake);
    }

    public static void main(String[] args) throws Exception {
        SnakeGame snake = new SnakeGame();
    }

    public class ImagenSnake extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(new Color(0, 0, 255));
            g.fillRect(snake.x, snake.y, whidthPoint, heightPoint);
        }
    }

    public class Teclas extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }else if(e.getKeyCode() == KeyEvent.VK_UP){
                
            }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                
            }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                
            }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                
            }
        }
    }

}
