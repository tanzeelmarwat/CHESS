/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mybackgroundapp;

/**
 *
 * @author 13100177
 */
public interface ChessPieceInterface {
    boolean validateMove(Location destinationPosition);
    boolean makeMove(Location newLocation);
    boolean hasCheckOnOpposingKing(Location positionOfOpposingKing);
    boolean isActive();
    boolean isWhite();
    boolean isBlack();
    ChessPieceInterface kill(ChessPieceInterface a);
    
    
}
