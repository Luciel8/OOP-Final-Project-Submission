/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku.problemdomain;

import java.io.Serializable;
import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

/**
 *
 * @author Administrator
 */
public class SudokuGame implements Serializable{
    private final GameState gameState;
    private final int[][] gridState;
    
    public static final int GRID_BOUNDARY = 9;
    
    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }
    
    public GameState getGameState() {
        return gameState;
    }
    
    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
