/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mybackgroundapp;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author 13100177
 */
public class Piece6 {
    JLabel label;
    String color;
    boolean first=false;
    public Piece6(){
        label = new JLabel();
        color="";
    }
    public boolean validateMove(Location destinationPosition)
    {
        int x=label.getLocation().x;
        int y=label.getLocation().y;
        int X=destinationPosition.x;
        int Y=destinationPosition.y;
        if(color.equals("black"))
        {
            if(first)
            {
                if(x-12<X && x+78>X && y+78<Y && y+78+180>Y && X>0 && Y>0 && X<720 && Y<720)
                    return true;
                else
                    return false;
                
            }
            else
            {
                if(x-12<X && x+78>X && y+78<Y && y+78+90>Y && X>0 && Y>0 && X<720 && Y<720)
                    return true;
                else
                    return false;
            }
        }
        else
        {
            if(first)
            {
                if(x-12<X && x+78>X && y-12>Y && y-12-180<Y && X>0 && Y>0 && X<720 && Y<720)
                    return true;
                else
                    return false;
                
            }
            else
            {
                if(x-12<X && x+78>X && y-12>Y && y-12-90<Y && X>0 && Y>0 && X<720 && Y<720)
                    return true;
                else
                    return false;
            }
        }
    }
    public boolean makeMove(Location newLocation)
    {
        label.setLocation(newLocation.x,newLocation.y);
        label.setBackground(Color.RED);
        label.setOpaque(false);
        System.out.println("Yes moved");
        return true;
    }
    public void setLabel(JLabel label){
        this.label = label;
    }
    boolean hasCheckOnOpposingKing(Location positionOfOpposingKing)
    {
        return false;
    }
    boolean isActive()
    {
        return false;
    }
    boolean isWhite()
    {
        return false;
    }
    boolean isBlack()
    {
        return false;
    }
    void setcolor(int i)
    {
        if(i==0)
            color="black";
        else
            color="white";
    }
    void first()
    {
        first=true;
    }
    void kill(JLabel loser, JLabel winner)
    {
        winner.setLocation(loser.getLocation().x,loser.getLocation().y);
        winner.setBackground(Color.red);
        winner.setOpaque(false);
        loser.setLocation(-100,-100);
    }
    
}
