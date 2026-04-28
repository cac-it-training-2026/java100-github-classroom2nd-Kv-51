/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する

		int intputNum = 0;
		boolean loopFlag = false;

		for (int i = 0; i < ABKosanArray.length; i++) {

			do {
				loopFlag = false; //ここでfalseにし直さないと、下のifでtrueになったらその後無限ループになる
				intputNum = (int) (Math.random() * 5) + 1;

				for (int k = 0; k < i; k++) { //k<iにすることで既存の値をチェックできる
												//既存の値のうち、新しいランダム数字と一致するもの＝重複がないか
												//既存の値が入れられた回数分＝iだけループしてチェックする
					if (ABKosanArray[k] == intputNum) { //重複があったら。
						loopFlag = true;
						break; //重複見つけた時点でforループから抜けてdo～whileに戻る
					}
				}

			} while (loopFlag); //重複があったのでもっかい数字引き直しますよ～のループ条件

			ABKosanArray[i] = intputNum;//重複が見つからなかったら、ここで初めてABK～[i]にランダム数字を入れる
		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		for (int i = 0; i < ABKosanArray.length; i++) {
			if (ABKosanArray[i] == 1)
				ABKosanArray[i] = 3;
			else if (ABKosanArray[i] == 3)
				ABKosanArray[i] = 1;
			else if (ABKosanArray[i] == 2)
				ABKosanArray[i] = 4;
			else if (ABKosanArray[i] == 4)
				ABKosanArray[i] = 2;
		}
		//入れ替えるのではなく、直接代入している
		//forループが見ているのは“同じ1回の値”だけで、書き換え後に戻って見直す仕組みになっていない
		//だからループ中に書き換えが起きてもその分は更新されない＝再判定されない

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
