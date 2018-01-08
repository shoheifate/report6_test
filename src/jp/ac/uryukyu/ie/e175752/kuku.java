package jp.ac.uryukyu.ie.e175752;
import java.util.Scanner;
//九九の表を出力できるコードを有効活用して、九九の段を学べるコードを書きたい。

public class kuku {
    public static void main(String args[]) {
        System.out.println("九九の表（ひょう）");
        System.out.println("この表を参考（さんこう）にして、九九の問題（もんだい）を解（と）いてみよう！！");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        //掛け算の表を出力して、よりわかりやすく問題を解かせる。


        double rand = Math.random() * 9 + 1;
        double rand_2 = Math.random() * 9 + 1;
        System.out.println((int) rand);
        System.out.println((int) rand_2);
        //どの数字でかけているのかを出力させる。

        int number = (int) rand;
        int number_2 = (int) rand_2;
        //System.out.println(number * number_2);//答え
        int ns = (int) rand * (int) rand_2;
        //System.out.println(ns);

        Scanner in = new Scanner(System.in);
        int k =0;
        //問題は最大五回まで答えることができるようにする。
        while(k<5){
            int i = in.nextInt();
            if (i == ns) {
                System.out.println("正解！！（せいかい）");
                break;
            }else{
                System.out.println("まちがい！");
                k++;
            }
        }
        System.out.println("第二問！！");

        double rand_3 = Math.random() * 9 + 1;
        double rand_4 = Math.random() * 9 + 1;
        System.out.println((int) rand_3);
        System.out.println((int) rand_4);
        //どの数字でかけているのかを出力させる。

        int number_1 = (int) rand_3;
        int number_3 = (int) rand_4;
        //System.out.println(number * number_2);//答え
        int nj = (int) rand_3 * (int) rand_4;
        //System.out.println(ns);

        Scanner out = new Scanner(System.in);
        int j =0;
        //問題は最大五回まで答えることができるようにする。
        while(j<5){
            int i = in.nextInt();
            if (i == nj) {
                System.out.println("正解！！（せいかい）");
                break;
            }else{
                System.out.println("まちがい！");
                j++;
            }
        }
    }
}




