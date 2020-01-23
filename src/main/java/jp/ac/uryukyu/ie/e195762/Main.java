package jp.ac.uryukyu.ie.e195762;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String inputX,inputY;
        System.out.println("game start");
        System.out.println("横並びの数字がx座標、縦並びの座標がy座標となります!!!");
        Scanner in = new Scanner(System.in);
        CheckedBoard cb = new CheckedBoard();
        cb.board.showBoard();
        cb.board.Black = true;

        while (!(cb.board.gameSet)){
            System.out.println("今は"+cb.board.printColor()+"の番です。");
            Pattern p = Pattern.compile("[0-9]");
            while (true){
                System.out.println("x座標を入力してください<<<");
                inputX = in.nextLine();
                Matcher m = p.matcher(inputX);
                if (m.find()){
                    break;
                }else{
                    System.out.println("０〜９までの数字を入力してください");
                }
            }
            while (true){
                System.out.println("y座標を入力してください<<<");
                inputY = in.nextLine();
                Matcher m = p.matcher(inputY);
                if (m.find()){
                    break;
                }else {
                    System.out.println("０〜９までの数字を入力してください");
                }
            }
            cb.totalCheck(cb.board.printColor(), Integer.parseInt(inputX), Integer.parseInt(inputY));
            cb.board.showBoard();

        }
    }
}
