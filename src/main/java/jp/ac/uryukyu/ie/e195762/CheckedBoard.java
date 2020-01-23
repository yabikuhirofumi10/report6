package jp.ac.uryukyu.ie.e195762;

/**
 *プレイヤーから入力された出力をチェックしてboardへ反映させるクラス。
 */
public class CheckedBoard {

    Board board = new Board();
    boolean upperLeft,upper,upperRight,right,lowerRight,lower,lowerLeft,left;
    public void totalCheck(String color, int x, int y){
        if (board.list[y][x].equals("*")) {
            //
            upperLeft(color, x, y);
            upper(color, x, y);
            upperRight(color, x, y);
            right(color, x, y);
            lowerRight(color, x, y);
            lower(color, x, y);
            lowerLeft(color, x, y);
            left(color, x, y);
            if (upperLeft == false && upper == false && upperRight == false && right == false && lowerRight == false && lower == false && lowerLeft == false && left == false) {
                System.out.println("そこに石は配置できません");
            } else {
                board.turnEnd();
            }
        }
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
            if(!(board.list[y-1][x-1].equals(color) | board.list[y-1][x-1].equals("*"))){
                //x-1,y-1が打ち手の石と違う色でないと石がひっくりかえることはない
                for (int i1=2; x-i1>0 && y-i1>0; i1++){
                    if (board.list[y-i1][x-i1].equals("*")){
                        upperLeft = false;
                        break;
                    }
                    if (board.list[y-i1][x-i1].equals(color)){
                        //打ち手の色と同色の色を見つけた際にfor文によってそれまでの座標までの石をひっくり返す
                        for (int i2=0; i2<i1;i2++ ){
                            board.putOrTurnStone(color, x-i2,y-i2);
                        }
                        upperLeft = true;
                        break;
                    }else {
                    }
                }
            }else {
                upperLeft = false;
            }
        }else {
            upperLeft = false;
        }
    }
    public void upper(String color, int x, int y){
        if (y-2>0){
            if (!(board.list[y-1][x].equals(color) | board.list[y-1][x].equals("*"))){
                for (int i1=2; y-i1>0; i1++){
                    if (board.list[y-i1][x].equals("*")){
                        upper = false;
                        break;
                    }
                    if (board.list[y-i1][x].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x,y-i2);
                        }
                        upper = true;
                        break;
                    }else {
                    }
                }
            }else {
                upper = false;
            }
        }else {
            upper  = false;
        }
    }
    public void upperRight(String color, int x, int y){
        if (x+2<9 && y-2>0){
            if (!(board.list[y-1][x+1].equals(color) | board.list[y-1][x+1].equals("*"))){
                for (int i1=2; x+i1<9 && y-i1>0; i1++){
                    if (board.list[y-i1][x+i1].equals("*")){
                        upperRight =false;
                        break;
                    }
                    if (board.list[y-i1][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y-i2);
                        }
                        upperRight = true;
                        break;
                    }else {
                    }
                }
            }else {
                upperRight = false;
            }
        }else {
            upperRight  =false;
        }
    }
    public void right(String color, int x, int y){
        if (x+2<9){
            if (!(board.list[y][x+1].equals(color) | board.list[y][x+1].equals("*"))){
                for (int i1=2; x+i1<9; i1++){
                    if (board.list[y][x+i1].equals("*")){
                        right = false;
                        break;
                    }
                    if (board.list[y][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y);
                        }
                        right = true;
                        break;
                    }else {
                    }
                }
            }else {
                right = false;
            }
        }else {
            right = false;
        }
    }
    public void lowerRight(String color, int x, int y){
        if (x+2<9 && y+2<9){
            if (!(board.list[y+1][x+1].equals(color) | board.list[y+1][x+1].equals("*"))){
                for (int i1=2; x+i1<9 && y+i1<9; i1++){
                    if (board.list[y+i1][x+i1].equals("*")){
                        lowerLeft  =false;
                        break;
                    }
                    if (board.list[y+i1][x+i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x+i2,y+i2);
                        }
                        lowerRight = true;
                        break;
                    }else {
                    }
                }
            }else {
                lowerRight = false;
            }
        }else {
            lowerRight = false;
        }
    }
    public void lower(String color, int x, int y){
        if (y+2>0){
            if (!(board.list[y+1][x].equals(color) | board.list[y+1][x].equals("*"))){
                for (int i1=2; y+i1<9; i1++){
                    if (board.list[y+i1][x].equals("*")){
                        lower = false;
                        break;
                    }
                    if (board.list[y+i1][x].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x,y+i2);
                        }
                        lower = true;
                        break;
                    }else {
                    }
                }
            }else {
                lower = false;
            }
        }else {
            lower  =false;
        }
    }
    public void lowerLeft(String color, int x, int y){
        if (x-2>0 && y+2<9){
            if (!(board.list[y+1][x-1].equals(color) | board.list[y+1][x-1].equals("*"))){
                for (int i1=2; x-i1>0 && y+i1<9; i1++){
                    if (board.list[y+i1][x-i1].equals("*")){
                        lowerLeft = false;
                        break;
                    }
                    if (board.list[y+i1][x-i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x-i2,y+i2);
                        }
                        lowerLeft =true;
                        break;
                    }else {
                    }
                }
            }else {
                lowerLeft = false;
            }
        }else {
            lowerLeft = false;
        }
    }
    public void left(String color, int x, int y){
        if (x-2>0){
            if (!(board.list[y][x-1].equals(color) | board.list[y][x-1].equals("*"))){
                for (int i1=2; x-i1>0; i1++){
                    if (board.list[y][x-i1].equals("*")){
                        left = false;
                        break;
                    }
                    if (board.list[y][x-i1].equals(color)){
                        for (int i2=0; i2<i1; i2++){
                            board.putOrTurnStone(color,x-i2,y);
                        }
                        left = true;
                        break;
                    }else {
                    }
                }
            }else {
                left = false;
            }
        }else {
            left  =false;
        }
    }
}
