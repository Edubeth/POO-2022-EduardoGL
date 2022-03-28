import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JTextField;

public class MyTextField extends JTextField {
    public MyTextField(int columns) {
        super.setColumns(columns);
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '(' || e.getKeyChar() == ')' || e.getKeyChar() == ' ')
                        || (e.getKeyChar() == '(' && MyTextField.this.getText().contains("(")) || (e.getKeyChar() == ')' && MyTextField.this.getText().contains(")"))
                        || (e.getKeyChar() == ' ' && MyTextField.this.getText().contains(" ")) || MyTextField.this.getText().length() == 13) {
                    e.consume();
                }
                if (!MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{7}")) {
                    MyTextField.this.setBackground(Color.RED);
                }
                if (MyTextField.this.getText().length() == 12 && MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{6}")) {
                    MyTextField.this.setBackground(Color.GREEN);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}

/*
    @Override
    public void keyTyped(KeyEvent e) {
        if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '(' || e.getKeyChar() == ')' || e.getKeyChar() == ' ')
                || (e.getKeyChar() == '(' && MyTextField.this.getText().contains("(")) || (e.getKeyChar() == ')' && MyTextField.this.getText().contains(")"))
                || (e.getKeyChar() == ' ' && MyTextField.this.getText().contains(" ")) || MyTextField.this.getText().length() == 13) {
            e.consume();
        }
        if (!MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{7}")) {
            MyTextField.this.setBackground(Color.RED);
            MyTextField.this.setForeground(Color.WHITE);
        }
        if (MyTextField.this.getText().length() == 12 && MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{6}")) {
            MyTextField.this.setBackground(Color.WHITE);
            MyTextField.this.setForeground(Color.RED);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


    @Override
    public void paint (Graphics g) {
        super.paint (g);

//        g.setColor (Color.red);
//        g.drawRect (getSize ().width - 25, getSize ().height - 30, 20, 20);
//
//        g.setColor(Color.red);
//        g.fillRect (getSize ().width - 25, getSize ().height - 30, 20, 20);
//
//        g.dispose ();

        try {
            URL url = getClass ().getResource ("/images/ico.png");
            File file = new File (url.getPath ());
            BufferedImage img = ImageIO.read (file);
            g.drawImage (img, getSize ().width - 30, getSize ().height - 30, null);
        }
        catch (IOException ex) {
            System.out.println (ex.getMessage ());
        }
    }
    */

