/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int totalBuy = (strnBuy + chocoBuy + pisBuy);
		int totalPrice = (strnBuy * 250) + (chocoBuy * 280) + (pisBuy * 320);

		System.out.println("\n合計個数    " + totalBuy + "個");
		System.out.println("合計金額  " + totalPrice + "円");

		System.out.println("\nをお買い上げですね。\n承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250 ・・・ 残り" + (strnRest - strnBuy) + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + (chocoRest - chocoBuy) + "個");
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + (pisRest - pisBuy) + "個");
	}
}
