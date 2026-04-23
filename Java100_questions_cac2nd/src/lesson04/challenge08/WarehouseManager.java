/**
 * 第4章 倉庫番のお仕事
 *
 * 問題8 荷物の入れ替え（二つの配列の要素を入れ替える）
 *
 * AB興産から新たな荷物のセットを預かりました。
 * 5袋からなる荷物のセットで、それぞれ6～10の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定し、
 * それぞれの袋の値は重複しません。
 *
 * AB興産からの依頼は、以前から預かっている1～5の荷物と
 * 今回預かる6～10の荷物を再編し、奇数のみの配列と
 * 偶数のみの配列に分けるというものです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産から新たに預かった荷物と以前から預かっている荷物の
 *  中身を確認してください。
 *
 *  Yさん：
 *  はい、
 *  以前から預かっている荷物の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  今回預かった荷物の状態は、
 *  7,9,10,6,8
 *  です。
 *
 *  E主任：
 *  その二つの荷物を奇数群、偶数群で入れ替えてください。
 *
 *  Yさん：
 *  はい、入れ替えました。
 *  奇数群の荷物の状態は、
 *  3,5,1,9,7
 *  です。
 *
 *  偶数群の荷物の状態は、
 *  10,2,8,6,4
 *  です。
 *
 */

package lesson04.challenge08;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray1 = new int[5];
		int[] ABKosanArray2 = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する①(1～5)
		int intputNum = 0;
		boolean loopFlag = false;

		for (int i = 0; i < ABKosanArray1.length; i++) {

			do {
				loopFlag = false; //ここでfalseにし直さないと、下のifでtrueになったらその後無限ループになる
				intputNum = (int) (Math.random() * 5) + 1;

				for (int k = 0; k < i; k++) { //k<iにすることで既存の値をチェックできる
												//既存の値のうち、新しいランダム数字と一致するもの＝重複がないか
												//既存の値が入れられた回数分＝iだけループしてチェックする
					if (ABKosanArray1[k] == intputNum) { //重複があったら。
						loopFlag = true;
						break; //重複見つけた時点でforループから抜けてdo～whileに戻る
					}
				}

			} while (loopFlag); //重複があったのでもっかい数字引き直しますよ～のループ条件

			ABKosanArray1[i] = intputNum;//重複が見つからなかったら、ここで初めてABK～[i]にランダム数字を入れる
		}

		//ここに重複チェックおよび値の代入処理を記述する②(6～10)
		for (int i = 0; i < ABKosanArray2.length; i++) {

			do {
				loopFlag = false;
				intputNum = (int) (Math.random() * 5) + 6; //+1を+6に変更

				for (int k = 0; k < i; k++) {
					if (ABKosanArray2[k] == intputNum) { //重複があったら。
						loopFlag = true;
						break;
					}
				}

			} while (loopFlag);

			ABKosanArray2[i] = intputNum;
		}

		System.out.println("E主任：");
		System.out.println("AB興産から新たに預かった荷物と以前から預かっている荷物の");
		System.out.println("中身を確認してください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("以前から預かっている荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("今回預かった荷物の状態は、");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("E主任：");
		System.out.println("その二つの荷物を奇数群、偶数群で入れ替えてください。\n");

		//ここに奇数群(ABKosanArray1)と偶数群(ABKosanArray2)に振り分ける処理を記述する。

		int[] oddList = new int[5]; //奇数を一時的に入れる予定の配列
		int[] evenList = new int[5]; //偶数を一時的に入れる予定の配列

		int odd = 0; //奇数を入れる配列のインデックス用変数
		int even = 0; //偶数を入れる配列のインデックス用変数
		//初期値を0にして後に++していくことで0から順番に入れられる

		//ABKosanArray1配列の仕分け
		for (int i = 0; i < 5; i++) {
			if (ABKosanArray1[i] % 2 != 0) { //奇数なら。
				oddList[odd++] = ABKosanArray1[i]; //奇数の値をoddListに代入
			} else { //偶数なら。
				evenList[even++] = ABKosanArray1[i];
			}
		}

		//ABKosanArray2配列の仕分け
		for (int i = 0; i < 5; i++) {
			if (ABKosanArray2[i] % 2 != 0) {
				oddList[odd++] = ABKosanArray2[i];
			} else {
				evenList[even++] = ABKosanArray2[i];
			}
		}

		//++はその場で更新されていき、保存されてる

		//指示通りABKosan配列に仕分けた奇数と偶数を入れなおす
		for (int i = 0; i < 5; i++) {
			ABKosanArray1[i] = oddList[i];
			ABKosanArray2[i] = evenList[i];
		}

		System.out.println("Yさん：");
		System.out.println("はい、入れ替えました。");
		System.out.println("奇数群の荷物の状態は、");
		for (int i = 0; i < ABKosanArray1.length; i++) {
			System.out.print(ABKosanArray1[i]);
			if (i != (ABKosanArray1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("偶数群の荷物の状態は、");
		System.out.println("");
		for (int i = 0; i < ABKosanArray2.length; i++) {
			System.out.print(ABKosanArray2[i]);
			if (i != (ABKosanArray2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
