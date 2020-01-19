package jp.ac.uryukyu.ie.e195762;

/**
 * this class check up for Board of state.
 */
public class PreparedBoard extends Board {
    boolean gameSet;
    String color;
    //コンストラクタ
    public PreparedBoard() {

    }

    public void Check(){
        gameSet = true;
    }

    /**
     * boolean型になっている変数Blackから色を出力させる。
     * @return 文字列の色
     */
    public String WhatColor(){
        if (getIsBlack() == true){
            color = "黒";
        }
        if (getIsBlack() == false){
            color = "白";
        }
        return color;
    }
}
