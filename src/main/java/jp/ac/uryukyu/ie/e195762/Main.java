package jp.ac.uryukyu.ie.e195762;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String inputX,inputY;
        System.out.println("start");
        Scanner in = new Scanner(System.in);
        Board board = new Board();
        board.showBoard();
        board.Black = true;

        while (board.gameSet == false){
            System.out.println("今は"+board.printColor()+"の番です。");
            System.out.println("x座標を入力してください<<<");
            inputX = in.nextLine();
            System.out.println("y座標を入力してください<<<");
            inputY = in.nextLine();
            board.gameSet = true;
        }
    }
}
