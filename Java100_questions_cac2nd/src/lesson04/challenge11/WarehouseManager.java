/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

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
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < listC.length; i++) { //すべて出力
			System.out.print(listC[i]);
			if (i < listC.length - 1) { // 5-1=4 ＝ つまり最後のインデックスより小さかったら。
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < listD.length; i++) { //すべて出力
			System.out.print(listD[i]);
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

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する
		int[] listAll = new int[15];
		int j = 0;

		//listAllに一旦全ての配列の値を代入する
		for (int i = 0; i < 5; i++) {
			listAll[j++] = listC[i]; //listAll[0,1,2,3,4]に代入
		}
		for (int i = 0; i < 5; i++) {
			listAll[j++] = listD[i]; //listAll[5,6,7,8,9]に代入
		}
		for (int i = 0; i < 5; i++) {
			listAll[j++] = listE[i]; //listAll[10,11,12,13,14]に代入
		}

		int[] packed = new int[15];
		int index = 0;

		//packedにlistAllのうち0でない値のみ代入する
		//これにより0でない値だけ順に詰められ、packedの余ったところは0になる
		for (int i = 0; i < listAll.length; i++) {
			if (listAll[i] != 0) {
				packed[index++] = listAll[i]; //list[]のインデックスをiにすると、値が0＝ifをスキップしてもiのカウントはすすむ
												//→packedは初期値がすべて0なので、スキップされた部分はそのまま0になる
												//→packed[index++]で順番に代入させてそれを回避する
			}
		}

		//packedの値を各配列に詰めなおす
		for (int i = 0; i < 5; i++) {
			listC[i] = packed[i];
			listD[i] = packed[i + 5];
			listE[i] = packed[i + 10];
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

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
			System.out.print(listD[i]);
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

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
