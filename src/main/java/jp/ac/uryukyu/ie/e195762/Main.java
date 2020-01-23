package jp.ac.uryukyu.ie.e195762;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int inputX,inputY;
        System.out.println("game start");
        System.out.println("横並びの数字がx座標、縦並びの座標がy座標となります!!!");
        Scanner in = new Scanner(System.in);
        CheckedBoard cb = new CheckedBoard();
        cb.board.showBoard();
        cb.board.Black = true;

        while (!(cb.board.gameSet)){
            System.out.println("今は"+cb.board.printColor()+"の番です。");
            try {
                System.out.println("x座標を入力してください<<<");
                inputX = in.nextInt();
                System.out.println("y座標を入力してください<<<");
                inputY = in.nextInt();
                cb.totalCheck(cb.board.printColor(), inputX, inputY);
                cb.board.showBoard();
            }catch (InputMismatchException e){
                System.out.println("半角数字でお願いします");
                break;
            }
        }
    }
}
