package iteカフェ1;

import java.util.Scanner;

public class Iteカフェ1 {

    public static void main(String[] args) {
        //割引　変数
        double q = new java.util.Random().nextInt(4);

        Item HotCoffee = new Item(1, "ホットコーヒー", 280);
        Item Tea = new Item(2, "紅茶", 260);
        Item IceCoffee = new Item(3, "アイスコーヒー", 200);
        Item IceTea = new Item(4, "アイスティー", 260);

        Item[] items = new Item[20];
        items[0] = HotCoffee;
        items[1] = Tea;
        items[2] = IceCoffee;
        items[3] = IceTea;

        Size[] size = new Size[10];

        Scanner scan = new Scanner(System.in);

        int inputNum;
        //商品名表示
        System.out.println("■■■■ITECafeシステム■■■■");
        System.out.println("No" + HotCoffee.getNo() + ":" + HotCoffee.getname() + ":" + HotCoffee.getprice() + "円");
        System.out.println("No" + Tea.getNo() + ":" + Tea.getname() + ":" + Tea.getprice() + "円");
        System.out.println("No" + IceCoffee.getNo() + ":" + IceCoffee.getname() + ":" + IceCoffee.getprice() + "円");
        System.out.println("No" + IceTea.getNo() + ":" + IceTea.getname() + ":" + IceTea.getprice() + "円");

        //商品番号入力
        System.out.println("商品番号を1~4で入力してください");

        try {
            String inputStr;
            inputStr = scan.next();
            inputNum = Integer.parseInt(inputStr);

            System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getname() + "：" + items[inputNum - 1].getprice() + "円入力されました");
            System.out.println();
            System.out.println("個数を入力してください");
            int k = new java.util.Scanner(System.in).nextInt();
            System.out.println();
            
            //割引
            System.out.println("割引券は持っていますか？");
            System.out.println("持っている：0を入力してください");
            System.out.println("持っていない：1を入力してください");
            System.out.println();
            int e = new java.util.Scanner(System.in).nextInt();
            switch (e) {
                case 0:
                    double x = q * 1 / 10 + 0.1;
                    int w = (int) (x * 10);
                    System.out.print(w);
                    System.out.println("割引になります");
                    System.out.println();

                    //割引合計
                    double a = (items[inputNum - 1].getprice()) * k * (1 - x);
                    double b = a * 108 / 100;
                    int f = (int) b;
                    System.out.println("合計で" + f + "円になります");
                    System.out.println("お金を入れてください");

                    //お預かり金額
                    int o = new java.util.Scanner(System.in).nextInt();
                    if (o == f) {
                        System.out.println(o +"円丁度お預かりいたします");
                        System.out.println("こちらが商品になります");
                        System.out.println("ありがとうございました！");
                    } else {
                        //お釣り
                        int m = (int) (o - f);
                        if (f < o) {
                            System.out.println(m + "円のお釣りです");
                            System.out.println("こちらが商品になります");
                            System.out.println("ありがとうございました！");
                        } else {
                            int g = m * -1;
                            System.out.println(g + "円足りません");
                        }
                    }
                    break;
                case 1:
                    double u = (items[inputNum - 1].getprice()) * k;
                    double j = u * 108 / 100;
                    int c = (int) j;
                    System.out.println("合計で" + c + "円になります");
                    System.out.println("お金を入れてください");

                    //お預かり金額
                    while (true) {
                        int s = new java.util.Scanner(System.in).nextInt();
                        if (s == c) {
                            System.out.println(s +"円丁度お預かりいたします");
                            System.out.println("こちらが商品になります");
                            System.out.println("ありがとうございました！");
                        } else {
                            //お釣り
                            int m = (int) (s - c);
                            if (c < s) {
                                System.out.println(m + "円のお釣りです");
                                System.out.println("こちらが商品になります");
                                System.out.println("ありがとうございました！");
                            } else {
                                int g = m * -1;
                                System.out.println(g + "円足りません");
                            }
                        }
                        break;
                    }
            }

        } catch (NumberFormatException e) {
            System.out.println("『エラー：数値を入力してください』");
        }
    }
}
