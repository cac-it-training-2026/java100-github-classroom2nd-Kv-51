/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n明日の三食マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味     ・・・ " + (int) strnPercent + "%");
		System.out.println("ショコラの味     ・・・ " + (int) chocoPercent + "%");
		System.out.println("ピスタージュの味  ・・・ " + (int) pisPercent + "%");

		System.out.println("\nが楽しめます！");

		int avePrice = ((int) (strnBuy * 250) + (int) (chocoBuy * 280) + (int) (pisBuy * 320)) / (int) totalBuy;

		System.out.println("\n値段は\\" + (avePrice / 10 * 10) + "です。");
		//例えば123を/10すると12.3になる
		//avePraiceはint型なので、小数点以下が切り捨てされて12になる
		//今度は*10をして桁を戻してやると120になる＝一の位が切り捨てできる

		//十の位を切り捨てたいときは/100*100
		//百の位を切り捨てたいときは/1000*1000
	}
}
