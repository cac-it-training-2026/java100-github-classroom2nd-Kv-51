/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計   \\" + totalPrice);

		double strnPercent = (strnBuy * 250) / totalPrice * 100;
		double chocoPercent = (chocoBuy * 280) / totalPrice * 100;
		double pisPercent = (pisBuy * 320) / totalPrice * 100;
		//各フレーバーの売上割合＝各フレーバーの売上/全体の売上*100

		System.out.println("\n内訳");
		System.out.println("シトロン     \\" + (int) (strnBuy * 250) + "・・・ " + (int) strnPercent + "%"); //出力上ではintにキャストして小数点切り捨て
		System.out.println("ショコラ     \\" + (int) (chocoBuy * 280) + "・・・ " + (int) chocoPercent + "%");
		System.out.println("ピスタージュ  \\" + (int) (pisBuy * 320) + "・・・ " + (int) pisPercent + "%");
	}
}
