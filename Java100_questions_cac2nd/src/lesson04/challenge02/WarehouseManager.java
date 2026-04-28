/**
 * 第4章 倉庫番のお仕事
 *
 * 問題2  倉庫管理の基礎②
 *
 * XO商事に入社して2日目を迎えたYさん。
 * 研修は徐々に難しくなります。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Z先輩：
 *  それではこれより新人研修の第2回目を始めます。
 *
 *  Yさん：
 *  はい、よろしくお願いします。
 *
 *  Z先輩：
 *  今回の研修では、配列の要素を予め決めておくことはせず、
 *  お客様のご要望にお答えする形にします。
 *
 *  Yさん：
 *  はい、わかりました。
 *
 *  Z先輩：
 *  あ、お客様がご来店だ!
 *
 *  Z先輩：
 *  いらっしゃいませ、ご要望をどうぞ。
 *
 *  データ型を選んでください（1...文字、2...文字列、3...数値）＞○
 *
 *  要素数を選んでください（1...1個、2...2個、3...3個）＞○
 *
 *  Z先輩：
 *  中に入れる値はおまかせという事でよろしいですね。
 *  ご注文を承りました。
 *
 *  Z先輩：
 *  Yさん、作成をお願いしてもいいかな？
 *
 *  Yさん：
 *  はい、作成させていただきます。
 *
 *  Yさん：
 *  ...出来ました。
 *
 *  Z先輩：
 *  試しに最後の値を見せてください。
 *
 *  Yさん：
 *  【※ここに値を出力】です。
 *
 *  Z先輩：
 *  はい、ありがとう。ちゃんと出来てますね。
 *
 *
 * <範囲外の数値を入力された場合の実行例>
 *
 *  Z先輩：
 *  そのような選択肢はありません。
 *
 */

package lesson04.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		System.out.println("Z先輩：");
		System.out.println("それではこれより新人研修の第2回目を始めます。\n");
		System.out.println("Yさん：");
		System.out.println("はい、よろしくお願いします。\n");

		System.out.println("Z先輩：");
		System.out.println("今回の研修では、配列の要素を予め決めておくことはせず、");
		System.out.println("お客様のご要望にお答えする形にします。\n");

		System.out.println("Yさん：");
		System.out.println("はい,わかりました。\n");

		System.out.println("Z先輩：");
		System.out.println("あ、お客様がご来店だ!\n");

		System.out.println("Z先輩：");
		System.out.println("いらっしゃいませ、ご要望をどうぞ。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("データ型を選んでください（1...文字、2...文字列、3...数値）＞");

		int data = Integer.parseInt(br.readLine()); //入力

		System.out.print("\n要素数を選んでください（1...1個、2...2個、3...3個）＞");

		int lengthNum = Integer.parseInt(br.readLine()); //入力

		boolean errFlag = false;
		//errFlag＝エラーになる入力
		//これをfalseにすることで、初期状態（スタート時点）ではエラーではないということにしてる
		//↑ trueにもfalseにも意味はないので、こっち側で意味を持たせる

		if (data > 3 || data < 0 || lengthNum > 3 || lengthNum < 0) {
			errFlag = true;
			//このifに該当する入力はエラーになる
		}

		if (!errFlag) { //エラーになる入力ではなかったら。
			System.out.println("\nZ先輩：");
			System.out.println("中に入れる値はおまかせという事でよろしいですね。");
			System.out.println("ご注文を承りました。\n");

			System.out.println("Z先輩：");
			System.out.println("Yさん、作成をお願いしてもいいかな？\n");

			System.out.println("Yさん：");
			System.out.println("はい、作成させていただきます。\n");

			char[] charArray = null;
			String[] strArray = null;
			int[] intArray = null;

			//以下の分岐で条件に合った配列を作成する
			if (data == 1) { //char[]が入力されたら。
				if (lengthNum == 1) {
					charArray = new char[lengthNum]; //ここでnewして配列の実体を作らないとこの後代入しても意味ない
					charArray[0] = 'a';
				} else if (lengthNum == 2) {
					charArray = new char[lengthNum];
					charArray[0] = 'a';
					charArray[1] = 'b';
				} else if (lengthNum == 3) {
					charArray = new char[lengthNum];
					charArray[0] = 'a';
					charArray[1] = 'b';
					charArray[2] = 'c';
				}
			} else if (data == 2) {
				if (lengthNum == 1) {
					strArray = new String[lengthNum];
					strArray[0] = "あ";
				} else if (lengthNum == 2) {
					strArray = new String[lengthNum];
					strArray[0] = "あ";
					strArray[1] = "い";
				} else if (lengthNum == 3) {
					strArray = new String[lengthNum];
					strArray[0] = "あ";
					strArray[1] = "い";
					strArray[2] = "う";
				}
			} else if (data == 3) {
				if (lengthNum == 1) {
					intArray = new int[lengthNum];
					intArray[0] = 1;
				} else if (lengthNum == 2) {
					intArray = new int[lengthNum];
					intArray[0] = 1;
					intArray[1] = 2;
				} else if (lengthNum == 3) {
					intArray = new int[lengthNum];
					intArray[0] = 1;
					intArray[1] = 2;
					intArray[2] = 3;
				}
			}

			System.out.println("Yさん：");
			System.out.println("...出来ました。\n");

			System.out.println("Z先輩：");
			System.out.println("試しに最後の値を見せてください。\n");

			System.out.println("Yさん：");

			//最後の値を見せろと言われているのでlengthから-1すればいい
			if (data == 1) {
				System.out.println(charArray[charArray.length - 1]);
			} else if (data == 2) {
				System.out.println(strArray[strArray.length - 1]);
			} else if (data == 3) {
				System.out.println(intArray[intArray.length - 1]);
			}

			System.out.println("です。\n");

			System.out.println("Z先輩：");
			System.out.println("はい、ありがとう。ちゃんと出来てますね。\n");
		} else {
			System.out.println("\nZ先輩：");
			System.out.println("そのような選択肢はありません。");
		}
	}
}
