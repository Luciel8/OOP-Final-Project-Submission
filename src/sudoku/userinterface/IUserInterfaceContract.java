/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

/**
 *
 * @author Administrator
 */
public interface IUserInterfaceContract {
    interface EventListener {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }



    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);

        void updateSquare(int x, int y, int input);


        void updateBoard(SudokuGame game);
        void showDialog(String message);
        void showError(String message);
    }
}
