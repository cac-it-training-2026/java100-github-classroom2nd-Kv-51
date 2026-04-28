/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！");

		System.out.println("\n本日のおすすめ商品です。\n");

		double strnRest = 30; //intからdoubleに書き換えて0.1個から販売できるように
		double chocoRest = 30;
		double pisRest = 30;

		System.out.println("シトロン     \\250 ・・・ 残り" + (int) strnRest + "個"); //出力上ではintにキャストして小数点切り捨て
		System.out.println("ショコラ     \\280 ・・・ 残り" + (int) chocoRest + "個");
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + (int) pisRest + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン     >"); //改行したくないのでprintlnではなくprint
		String buyStr1 = reader.readLine();
		double strnBuy = Double.parseDouble(buyStr1); //intからdouble、IntegerからDouble版に書き換え

		System.out.print("ショコラ     >");
		String buyStr2 = reader.readLine();
		double chocoBuy = Double.parseDouble(buyStr2);

		System.out.print("ピスタージュ  >");
		String buyStr3 = reader.readLine();
		double pisBuy = Double.parseDouble(buyStr3);

		System.out.println("\nシトロン     " + strnBuy + "個");
		System.out.println("ショコラ     " + chocoBuy + "個");
		System.out.println("ピスタージュ  " + pisBuy + "個");

		double totalBuy = (strnBuy + chocoBuy + pisBuy); //intからdoubleに書き換え
		int totalPrice = (int) (strnBuy * 250) + (int) (chocoBuy * 280) + (int) (pisBuy * 320); //出力上ではintにキャストして小数点切り捨て

		System.out.println("\n合計個数    " + totalBuy + "個");
		System.out.println("合計金額  " + totalPrice + "円");

		System.out.println("\nをお買い上げですね。\n承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250 ・・・ 残り" + (int) (strnRest - strnBuy) + "個"); //出力上ではintにキャストして小数点切り捨て
		System.out.println("ショコラ     \\280 ・・・ 残り" + (int) (chocoRest - chocoBuy) + "個");
		System.out.println("ピスタージュ  \\320 ・・・ 残り" + (int) (pisRest - pisBuy) + "個");
	}
}
