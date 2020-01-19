package jp.ac.uryukyu.ie.e195762;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String inputX,inputY;
        System.out.println("start");
        Scanner in = new Scanner(System.in);
        PreparedBoard pb = new PreparedBoard();
        pb.printBoard();
        pb.setIsBlack("Black");

        while (pb.gameSet == false){
            System.out.println("今は"+pb.WhatColor()+"の番です。");
            System.out.println("x座標を入力してください<<<");
            inputX = in.nextLine();
            System.out.println("y座標を入力してください<<<");
            inputY = in.nextLine();
            pb.Check();
        }
    }
}
