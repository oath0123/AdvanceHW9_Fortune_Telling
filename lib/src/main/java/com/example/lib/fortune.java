package com.example.lib;

import java.util.Scanner;

public class fortune {

    Scanner scanner = new Scanner(System.in);

    int M = 0, D = 0, S = 0;

    public fortune() {
        while (true) {
            System.out.println("請輸入幾月幾日以計算運勢:");

            try {

                M = scanner.nextInt();
                D = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("只能輸入整數!");
            }


            if (M <= 0 || M > 12) {
                System.out.println("不存在這種月份");
            }
            switch (M) {
                case 1:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 2:

                    if (D < 1 || D > 28) {
                        System.out.println("不存在這種日期");

                    } else {
                        if (D < 1 || D > 28) {
                            System.out.println("不存在這種日期");
                        }
                    }
                    break;
                case 3:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 4:
                    if (D < 1 || D > 30) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 5:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 6:
                    if (D < 1 || D > 30) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 7:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 8:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 9:
                    if (D < 1 || D > 30) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 10:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 11:
                    if (D < 1 || D > 30) {
                        System.out.println("不存在這種日期");
                    }
                    break;
                case 12:
                    if (D < 1 || D > 31) {
                        System.out.println("不存在這種日期");
                    }
                    break;
            }
            S = (M * 2 + D) % 3;
            switch (S) {
                case 0:
                    System.out.println("普通");
                    break;
                case 1:
                    System.out.println("吉");
                    break;
                case 2:
                    System.out.println("大吉");
                    break;
            }

        }
    }
}