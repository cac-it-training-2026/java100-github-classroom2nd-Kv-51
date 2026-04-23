/**
 * 第4章 倉庫番のお仕事
 *
 * 問題10 荷物の作成（ランダムに要素を詰める）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 箱の中にはいくつかの空き箱があります。
 * （空きは数値の0で表現します）
 * どの箱が空き箱になるのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例1>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 * <実行例2>
 *  E主任：
 *  MQ運送から預かった荷物の確認をお願いします。
 *
 *  Yさん：
 *  はい、
 *
 *  C...5,0,0,0,9
 *
 *  D...0,6,0,3,7
 *
 *  E...2,5,0,6,10
 *
 *  です。
 *
 *  E主任：
 *  ご苦労さまでした。
 */

package lesson04.challenge10;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] listC = new int[5];
		int[] listD = new int[5];
		int[] listE = new int[5];

		int num = 0;

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < 5; i++) {
			if (Math.random() < 0.25) { //0.1~1.0の4分の1が出たら。
				listC[i] = 0;
			} else {
				num = (int) (Math.random() * 10) + 1;
				listC[i] = num;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (Math.random() < 0.25) {
				listD[i] = 0;
			} else {
				num = (int) (Math.random() * 10) + 1;
				listD[i] = num;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (Math.random() < 0.25) {
				listE[i] = 0;
			} else {
				num = (int) (Math.random() * 10) + 1;
				listE[i] = num;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送から預かった荷物の確認をお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < listC.length; i++) { //すべて出力
			System.out.print(listC[i]);
			if (i < listC.length - 1) { // 5-1=4 ＝ つまり最後のインデックスよりiが小さかったら。
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < listD.length; i++) { //すべて出力
			System.out.print(listC[i]);
			if (i < listD.length - 1) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < listE.length; i++) { //すべて出力
			System.out.print(listE[i]);
			if (i < listE.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nです。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
