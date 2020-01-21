package jp.ac.uryukyu.ie.e195762;
/**
 * 初期のboardを作成、プリント、座標上のものを変換するクラス。
 * int stoneNum[] //石の数を色別に保存。stoneNum[0] = 黒、　stoneNum[1] = 白。
 * boolean Black; //黒石であるかどうか。true = 黒。
 */
public class Board {
     String list[][] = new String[9][9];
     String color;
     int stoneNum[] = new int[2];
     boolean Black;
     boolean gameSet;
    /**
     * コンストラクタ。ボードの初期配置を二次元配列の中に構築
     */
    public Board() {
        for (int i1 = 0; i1 < list.length; i1++) {
            for (int i2 = 0; i2 < list.length; i2++) {
                list[i1][i2] = "*";
            }
        }
        for (int i = 1; i < list.length; i++){
            list[i][0] = String.valueOf(i);
        }
        for (int i = 1; i < list.length; i++){
            list[0][i] = String.valueOf(i);
        }
        list[0][0] = " ";
        putOrTurnStone("●",5,4);
        putOrTurnStone("●",4,5);
        putOrTurnStone("○",4,4);
        putOrTurnStone("○",5,5);
        stoneNum[0] = 2;
        stoneNum[1] = 2;
    }
    /**
     * this method prints board of state.
     */
    public void showBoard(){
        for(int i1 = 0; i1 < list.length; i1++){
            for(int i2 = 0; i2 < list.length; i2++){
                System.out.print(list[i1][i2]+" ");
            }
            System.out.println("");

        }
    }

    /**
     * *を石(● or ○)へ変化させたり、石の色をひっくり返す。
     * @param color 変化後の色
     * @param x x座標
     * @param y y座標
     */
    public void putOrTurnStone(String color,int x, int y){
        if (list[y][x].equals("●")){
            list[y][x] = "○";
        }
        if (list[y][x].equals("○")){
            list[y][x] = "●";
        }
        if (list[y][x].equals("*")){
            list[y][x] = color;
        }
    }
    /**
     * boolean型になっている変数Blackから色を出力させる。
     * @return 文字列の色
     */
    public String printColor(){
        if (Black == true){
            color = "○";
        }
        if (Black == false){
            color = "●";
        }
        return color;
    }
}
