/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題9 Stringクラス①（equals）
 *
 * 宇宙船が最初の目的地α星に到着しました。
 * α星は不思議な星です。この星を訪れる人は、
 * 無作為に抽出された10人のα星人のうち、
 * 1人でも名前を言い当てることができれば、
 * 星に降り立つことができ、名前を言い当てられなければ
 * 降り立つことができません。
 * α星人の名前はA～Eのアルファベット大文字1字のみです。
 *
 * α星人クラスAlphalianを新たに作成してください。
 * Alphalianの名前はA～Eのうちからランダムに決定されます。
 * 実行例と同じメッセージを表示しください。
 *
 * <実行例1>
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：1人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：2人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：3人目
 * 当たったアルファ。α星にようこそアルファ。
 *
 * <実行例2>
 *
 * 名前を入れてください（A～E）＞○
 *
 * α星人：10人目
 * おら、そんな名前じゃないアルファ！
 * 【ランダムに決定した名前】が正解だアルファ！
 *
 * って言うか、お前やる気ないアルファ！
 * とっとと出て行けアルファ！
 *
 */

package lesson06.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//ここにAlphalianクラスを記述する
class Alphalian {

	public static String randomName() {
		Random random = new Random();
		char randomNames = (char) ('A' + random.nextInt(5)); //一旦char型でランダム排出する
		return String.valueOf(randomNames); //Stringに戻してリターン
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		boolean hitFlag = false;

		//ここに適切な処理を記述する。
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;

		for (int i = 0; i < 10; i++) { //今回のループは最大10回まで
			System.out.print("名前を入れて下さい（A～E）＞");
			String name = reader.readLine();
			String rnName = Alphalian.randomName();

			System.out.println("\na星人:" + (num++) + "人目");

			if (name.equals(rnName)) { //文字列と文字列の比較は～.equals(～) もし入力値nameとランダムrnNameが一致したら。
				hitFlag = true; //下のifにジャンプできるように
				break;
			} else {
				System.out.println("おら、そんな名前じゃないアルファ！");
				System.out.println(rnName + "が正解だアルファ！\n");
			}
		}

		if (hitFlag) {
			System.out.println("当たったアルファ。α星にようこそアルファ。");
		} else {
			System.out.println("って言うか、お前やる気ないアルファ！");
			System.out.println("とっとと出て行けアルファ！");
		}
	}

}
