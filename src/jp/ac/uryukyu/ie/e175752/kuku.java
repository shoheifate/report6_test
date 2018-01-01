package jp.ac.uryukyu.ie.e175752;
//九九の表を出力できるコードを有効活用して、九九の段を学べるコードを描きたい。
public class kuku {
    public static void main(String args[]){
        System.out.println("九九の表");
        System.out.println("この表を参考にして、九九の問題を解いてみよう！！");

        for( int i=1; i<=9; i++ ){
            for (int j=1; j<=9; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }


    //public static void take(String args[]){
        double rand = Math.random() * 9 + 1;
        double rand_2 = Math.random() * 9 + 1;
        System.out.println((int)rand);
        System.out.println((int)rand_2);//どの数字でかけているのかを出力

        int number = (int)rand;
        int number_2 = (int)rand_2;
        System.out.println(number * number_2);//答え

    }
}
