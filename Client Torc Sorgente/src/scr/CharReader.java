package scr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

public class CharReader {

    private final SimpleDriver sd;
    private final Set<Integer> pressedKeys = new HashSet<>();
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean rightPressed = false;
    private boolean leftPressed = false;
    private boolean shiftPressed = false;
    
    public CharReader(SimpleDriver sd){
        this.sd = sd;
        takeTrainingCommands();
    }

    private void takeTrainingCommands(){
        // Imposta la finestra per catturare gli input da tastiera
        JFrame frame = new JFrame("Continuous Character Reader");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JTextField inputField = new JTextField(20);
        frame.add(inputField);
        inputField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                pressedKeys.add(e.getKeyCode());
                sd.ch = e.getKeyCode();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        upPressed = true;
                        sd.trainingAction.accelerate = 1.0;  
                        break;
                    case KeyEvent.VK_DOWN:
                        downPressed = true;
                        sd.trainingAction.brake = 1.0;
                        break;
                    case KeyEvent.VK_LEFT:
                        leftPressed = true;
                        sd.trainingAction.steering = +0.5;
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightPressed = true;
                        sd.trainingAction.steering = -0.5;
                        break;
                    case KeyEvent.VK_SHIFT: //shift for reverse
                        shiftPressed = true;
                        sd.trainingAction.gear = -1;
                        break;
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                pressedKeys.remove(e.getKeyCode());

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        upPressed = false;
                        sd.trainingAction.accelerate = 0.0;
                        break;
                    case KeyEvent.VK_DOWN:
                        downPressed = false;
                        sd.trainingAction.brake = 0.0;
                        break;
                    case KeyEvent.VK_LEFT:
                        leftPressed = false;
                        sd.trainingAction.steering = 0.0;
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightPressed = false;
                        sd.trainingAction.steering = 0.0;
                        break;
                    case KeyEvent.VK_SHIFT:
                        shiftPressed = false;
                        sd.trainingAction.gear = 1;
                        sd.trainingAction.accelerate = 0.0;
                        break;
                }

                if (pressedKeys.isEmpty()) {
                    sd.ch = -1;
                } else {
                    updateLastPressedKey();
                }
            }

            private void updateLastPressedKey() {
                if (upPressed) {
                    sd.ch = KeyEvent.VK_UP;
                } else if (downPressed) {
                    sd.ch = KeyEvent.VK_DOWN;
                } else if (leftPressed) {
                    sd.ch = KeyEvent.VK_LEFT;
                } else if (rightPressed) {
                    sd.ch = KeyEvent.VK_RIGHT;
                } else if (shiftPressed) {
                    sd.ch = KeyEvent.VK_SHIFT;
                }
            }

        });
        frame.setVisible(true);
    }

}
