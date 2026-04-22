/**
 * 第4章 倉庫番のお仕事
 *
 * 問題5  袋の中身を調べる【改訂版】
 *
 * AB興産から預かっている荷物を再び検査することになりました。
 * 荷物は全部で5袋あり、その中で数値の5が入っている袋が
 * 何袋目なのかを調べなければなりません。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらに今回はそれぞれの袋の値が重複しないものとします。
 * （つまり、5が入っている袋はただ一つだけ）
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の検査結果を教えてください。
 *
 *  Yさん：
 *  はい、
 *  【※ここに値を出力】袋目
 *  に入っていました。
 *
 */

package lesson04.challenge05;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに配列の宣言を記述する
		int[] bag = new int[5];

		int intputNum = 0;
		boolean loopFlag = false;

		for (int i = 0; i < bag.length; i++) {

			do {
				loopFlag = false; //ここでfalseにし直さないと、下のifでtrueになったらその後無限ループになる
				intputNum = (int) (Math.random() * 5) + 1;

				for (int k = 0; k < i; k++) { //k<iにすることで既存の値をチェックできる
												//既存の値のうち、新しいランダム数字と一致するもの＝重複がないか
												//既存の値が入れられた回数分＝iだけループしてチェックする
					if (bag[k] == intputNum) { //重複があったら。
						loopFlag = true;
						break; //重複見つけた時点でforループから抜けてdo～whileに戻る
					}
				}

			} while (loopFlag); //重複があったのでもっかい数字引き直しますよ～のループ条件

			bag[i] = intputNum;//重複が見つからなかったら、ここで初めてbag[i]にランダム数字を入れる
		}

		//iは代入したnumのインデックス、kは新しくランダムで出たnumのインデックス
		//途中のdo～whileで1つのintputNumと既存のintputNumの重複をチェック→代入(既に代入された回数分)
		//大枠のforで次のintputNumにうつってる（5回）

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の検査結果を教えてください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");

		//ここに要素の確認および何袋目かの出力処理を記述する
		for (int i = 0; i < bag.length; i++) {
			if (bag[i] == 5) {
				System.out.println((i + 1) + "袋目"); //+1しないと0袋目スタートになる
				loopFlag = true;
			}
		}

		System.out.println("に入っていました。");

	}
}
