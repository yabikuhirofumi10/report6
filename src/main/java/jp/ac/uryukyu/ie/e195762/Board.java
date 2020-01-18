package jp.ac.uryukyu.ie.e195762;
/**
 * This class makes Board.
 *
 */
public class Board {
    private String list[][] = new String[8][8];

    //コンストラクタ
    public Board() {
        for (int i1 = 0; i1 < list.length; i1++) {
            for (int i2 = 0; i2 < list.length; i2++) {
                list[i1][i2] = "*";
            }
        }
        turnBlack(4,5);
        turnBlack(5,4);
        turnWhite(4,4);
        turnWhite(5,5);
    }

    /**
     * this method prints board of state.
     */
    public void printBoard(){
        for(int i1 = 0; i1 < list.length; i1++){
            for(int i2 = 0; i2 < list.length; i2++){
                System.out.print(list[i1][i2]+" ");
            }
            System.out.println("");
        }
    }

    /**
     * 指定した座標を黒に変える
     * @param x　横の座標
     * @param y　縦の座標
     */
    public void turnBlack(int x, int y){
        list[y-1][x-1] = "●";
    }

    public void turnWhite(int x, int y){
        list[y-1][x-1] = "○";
    }
}
