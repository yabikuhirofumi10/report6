package jp.ac.uryukyu.ie.e195762;

/**
 *プレイヤーから入力された出力をチェックしてboardへ反映させるクラス。
 */
public class CheckedBoard {

    Board board = new Board();

    public void totalCheck(){

    }

    public void firstCheck(){

    }
    /**
     *左斜め上の石の色をチェックする。
     * @param color 直前に石を置いたプレイヤーの石の色
     * @param x　ひっくり返す石のx座標
     * @param y　ひっくり返す石のy座標
     */
    public void upperLeft(String color, int x, int y){
        if (x-2>0 && y-2>0){
            //最低でもx-2,y-2が存在しないと石がひっくりかえることはない
            if(!(board.list[y-1][x-1].equals(color))){
                //x-1,y-1が打ち手の石と違う色でないと石がひっくりかえることはない
                for (int i1=2; x-i1>0 && y-i1>0; i1++){
                    if (board.list[y-i1][x-i1].equals(color)){
                        //打ち手の色と同色の色を見つけた際にfor文によってそれまでの座標までの石をひっくり返す
                        for (int i2=0; i2<i1;i2++ ){
                            board.putOrTurnStone(color, x-i2,y-i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void upper(String color, int x, int y){
        if (y-2>0){
            if (!(board.list[y-1][x].equals(color))){
                for (int i1=2; y-i1>0; i1++){
                    if (board.list[y-i1][x].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x,y-i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void upperRight(String color, int x, int y){
        if (x+2<9 && y-2>0){
            if (!(board.list[y-1][x+1].equals(color))){
                for (int i1=2; x+i1<9 && y-i1>0; i1++){
                    if (board.list[y-i1][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y-i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void Right(String color, int x, int y){
        if (x+2<9){
            if (!(board.list[y][x+1].equals(color))){
                for (int i1=2; x+i1<9; i1++){
                    if (board.list[y][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void lowerRight(String color, int x, int y){
        if (x+2<9 && y+2<9){
            if (!(board.list[y+1][x+1].equals(color))){
                for (int i1=2; x+i1<9 && y+i1<9; i1++){
                    if (board.list[y+i1][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y+i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void lower(String color, int x, int y){
        if (y+2>0){
            if (!(board.list[y+1][x].equals(color))){
                for (int i1=2; y+i1<9; i1++){
                    if (board.list[y+i1][x].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x,y+i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void lowerLeft(String color, int x, int y){
        if (x-2>0 && y+2<9){
            if (!(board.list[y+1][x-1].equals(color))){
                for (int i1=2; x-i1>0 && y+i1<9; i1++){
                    if (board.list[y+i1][x-i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x-i2,y+i2);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
    public void left(String color, int x, int y){
        if (x-2>0){
            if (!(board.list[y][x-1].equals(color))){
                for (int i1=2; x-i1>0; i1++){
                    if (board.list[y][x-i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x-i2,y);
                        }
                        break;
                    }else {
                    }
                }
            }else {
            }
        }else {
        }
    }
}
