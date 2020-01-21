package jp.ac.uryukyu.ie.e195762;

/**
 *プレイヤーから入力された出力をチェックしてboardへ反映させるクラス。
 */
public class CheckedBoard {

    Board board = new Board();
    /**
     *左斜め上の石の色をチェックする。
     * @param color 直前に石を置いたプレイヤーの石の色
     * @param x
     * @param y
     */
    public void upperLeft(String color, int x, int y){
        if (x-2>0 && y-2>0){
            //最低でもx-2,y-2が存在しないと石がひっくりかえることはない
            System.out.println("一段階クリア");
            if(!(board.list[y-1][x-1].equals(color))){
                //x-1,y-1が自分の石と違う色でないと石がひっくりかえることはない
                System.out.println("２段階クリア");
                for (int i1=2; x-i1>0 && y-i1>0; i1++){
                    if (board.list[y-i1][x-i1].equals(color)){
                        System.out.println("3段階クリア" );
                        System.out.println(i1);
                        for (int i2=0; i2<i1;i2++ ){
                            board.putOrTurnStone(color, x-i2,y-i2);
                        }
                        break;

                    }else {
                        System.out.println("filed");
                        System.out.println(board.list[y-i1][x-i1]);
                    }
                }
            }else {

            }
        }else {

        }
    }

}
