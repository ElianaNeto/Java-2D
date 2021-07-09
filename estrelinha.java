/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandeiraIsrael;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

/**
 *
 * @author eliananeto
 */
class estrelinha extends  JPanel implements Runnable {
    
    int [] X = {66,0,200,100,66,0,100,200,0}; 
    int [] Y = {50,150,150,0,50,50,200,50,50};
    int npont =9;
    double angulo = 0;
    Thread thread;
   


    AffineTransform tx;

    public estrelinha() {
        thread = new Thread(this);
        thread.start();
        
    }
    
    
    
    public void paint (Graphics g ) 
    {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(10)); // aumenta a largura da linha

       /* int[] xPoints = {100, 150, 200};
        int[] yPoints = {100, 200, 100};
        int[] yPoints2 = {175, 75, 175};
        g.drawPolygon (xPoints, yPoints, 3);
        g.drawPolygon (xPoints, yPoints2, 3);*/
       
       // desenhar a bandeira
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[] {0, 0,600, 600}, new int[] {0, 100,100, 0}, 4);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {0, 0,600, 600}, new int[] {100, 200,200, 100}, 4);
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[] {0, 0,600, 600}, new int[] {200, 400,400, 200}, 4);
        g.setColor(Color.BLUE);
        g.fillPolygon(new int[] {0, 0,600, 600}, new int[] {400, 500,500, 400}, 4);
        g.setColor(Color.WHITE);
        g.fillPolygon(new int[] {0, 0,600, 600}, new int[] {500, 600,600, 500}, 4);

          
    
       // desenhar a estrela
        tx = new AffineTransform();
        tx.translate(198,198);
        tx.rotate(Math.toRadians(angulo),100,100);//  x/2 y/2
        Polygon shape1 = new Polygon(X, Y, npont);
       

       g2d.setColor(Color.BLUE);
       g2d.setTransform(tx);
       g2d.draw(shape1);
       
  
    }
    
    
    @Override
    public void run()
    {
        try 
        {
            while(true) 
            {
                angulo = angulo + 1;
                repaint();
                Thread.sleep(20);
            }
        } catch (Exception e) {}
    }
    
}
