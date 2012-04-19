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
public class Piece5 {
    JLabel label;
    String color;
    public Piece5(){
        label = new JLabel();
        color="";
    }
    public boolean validateMove(Location destinationPosition)
    {
        int x=label.getLocation().x/90+1;
        int y=label.getLocation().y/90+1;
        int X=destinationPosition.x/90+1;
        int Y=destinationPosition.y/90+1;
        if(X>0 && Y>0 && X<9 && Y<9)
        {
            if(x==X && y!=Y && (Y-y==1 || Y-y==-1))
                return true;
            else if(x!=X && y==Y &&(X-x==1 || X-x==-1))
                return true;
            else if(x!=X && y!=Y && X-x==1 && (Y-y==1 || Y-y==-1))
                return true;
            else if(x!=X && y!=Y && X-x==-1 && (Y-y==1 || Y-y==-1))
                return true;
            else
                return false;
        }
        else
            return false;
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
    void kill(JLabel loser, JLabel winner)
    {
        winner.setLocation(loser.getLocation().x,loser.getLocation().y);
        winner.setBackground(Color.red);
        winner.setOpaque(false);
        loser.setLocation(-100,-100);
    }
    
}
