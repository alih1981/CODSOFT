/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessnbgui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author AAHROI
 */
public class Drawings extends JComponent{
    
    private int tries;
    
    public Drawings(int t) {
       
            //setPreferredSize(new Dimension(300, 300));
            //setLocation(0,0);
            //setVisible(true);
        super();
        tries = t;
        
        setSize(new Dimension(200, 300));
        setPreferredSize(new Dimension(200, 300));
        //setBackground(colour);
        
    }
    
    public int getTries()
    {
        return tries;
    }
    
    @Override
    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        
        g.setColor(new Color(0,0,255));
        
        switch(tries){
            case 7 ->
                g.drawLine( 50, 25, 150, 25 );
            case 6 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
            }
            case 5 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
            }
            case 4 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
                g.drawLine( 100, 100, 100, 200);
            }
            case 3 ->
            {
                 g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
                g.drawLine( 100, 100, 100, 200);
                g.drawLine( 100, 125, 75, 150 );
            }
            case 2 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
                g.drawLine( 100, 100, 100, 200);
                g.drawLine( 100, 125, 75, 150 );
                g.drawLine( 100, 125, 125, 150 );
            }
            case 1 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
                g.drawLine( 100, 100, 100, 200);
                g.drawLine( 100, 125, 75, 150 );
                g.drawLine( 100, 125, 125, 150 );   
                g.drawLine( 100, 200, 75, 225 );
            }
            case 0 ->
            {
                g.drawLine( 50, 25, 150, 25 );
                g.drawLine( 100, 25, 100, 50 );
                g.drawOval(75, 50, 50, 50);
                g.drawLine( 100, 100, 100, 200);
                g.drawLine( 100, 125, 75, 150 );
                g.drawLine( 100, 125, 125, 150 );   
                g.drawLine( 100, 200, 75, 225 );
                g.drawLine( 100, 200, 125, 225 );
            }
            
        }
        
    }  
}
