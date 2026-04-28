/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！");

		System.out.println("\n本日のおすすめ商品です。\n");

		int strnRest = 30;
		int chocoRest = 30;
		int pisRest = 30;

		System.out.println("シトロン     \\250 ・・・ 残り" + strnRest + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + chocoRest + "個");
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + pisRest + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >"); //改行したくないのでprintlnではなくprint
		String buyStr1 = reader.readLine();
		int strnBuy = Integer.parseInt(buyStr1);

		System.out.print("ショコラ     >");
		String buyStr2 = reader.readLine();
		int chocoBuy = Integer.parseInt(buyStr2);

		System.out.print("ピスタージュ  >");
		String buyStr3 = reader.readLine();
		int pisBuy = Integer.parseInt(buyStr3);

		System.out.println("\nシトロン     " + strnBuy + "個");
		System.out.println("ショコラ     " + chocoBuy + "個");
		System.out.println("ピスタージュ  " + pisBuy + "個");

		System.out.println("\nをお買い上げですね。\n承りました。");
	}
}
