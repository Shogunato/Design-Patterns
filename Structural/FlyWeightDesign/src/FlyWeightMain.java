import Rectangle.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class FlyWeightMain extends JFrame {

    JButton startDrawing;

    int windowWidth = 800;
    int windowHeight = 700;

    Color[] shapeColor = {Color.orange, Color.red, Color.green, Color.blue, Color.black, Color.white,
                          Color.yellow, Color.pink, Color.cyan, Color.magenta, Color.gray};

    public static void main(String[] args) {

        new FlyWeightMain();

    }

    public FlyWeightMain() {

        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Start Drawing!");

        contentPanel.add(drawingPanel, BorderLayout.CENTER);
        contentPanel.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();

                long startTime = System.currentTimeMillis();

                for(int i=0; i<100000; i++) {

                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(),getRandY());

                }

                long endTime = System.currentTimeMillis();
                System.out.println("Time: "+(endTime-startTime));
                
            }
            
        });

        this.add(contentPanel);
        this.setVisible(true);

    }

    private Color getRandColor() {

        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(11);

        return shapeColor[randInt];

    }

    private int getRandX() { return (int)(Math.random()*windowWidth); }
    private int getRandY() { return (int)(Math.random()*windowHeight); }

}