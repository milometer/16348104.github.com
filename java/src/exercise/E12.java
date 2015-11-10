package exercise;

import java.util.Scanner;

/**
 * Created by dell on 2015/10/28.
 * 企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
 * 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，
 * 求应发放奖金总数？
 */
public class E12 {

    public static void main(String[] args) {
        double sum = 0.0;
        System.out.println("请输入利润：");

        Scanner s = new Scanner(System.in);

        double i = s.nextInt();
        if (i <= 100000) {
            sum = i * 0.1;
        } else if ((i > 100000) && (i < 200000)) {
            sum = 100000 * 0.1;
            sum += (i - 100000) * 0.075;
        } else if ((i >= 200000) && (i < 400000)) {
            sum = 100000 * 0.1;
            sum += 0.075 * (i - 100000);
            sum += (i - 200000) * 0.05;
        } else if ((i >= 400000) && (i < 600000)) {
            sum = 10000;
            sum += (i - 100000) * 0.075;
            sum += (i - 200000) * 0.05;
            sum += (i - 400000) * 0.03;
        } else if ((i >= 600000) && (i < 1000000)) {
            sum += (i - 600000) * 0.015;
        } else {
            sum += (i - 1000000) * 0.01;
        }
        System.out.print("应发放奖金总额：" + sum);
    }
}
