package com.example.lib;

import java.util.Scanner;

public class fortune {

    Scanner scanner = new Scanner(System.in);

    int M = 0, D = 0, S = 0;

    public fortune() {
        while (true) {
            System.out.println("�п�J�X��X��H�p��B��:");

            try {

                M = scanner.nextInt();
                D = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("�u���J���!");
            }


            if (M <= 0 || M > 12) {
                System.out.println("���s�b�o�ؤ��");
            }
            switch (M) {
                case 1:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 2:

                    if (D < 1 || D > 28) {
                        System.out.println("���s�b�o�ؤ��");

                    } else {
                        if (D < 1 || D > 28) {
                            System.out.println("���s�b�o�ؤ��");
                        }
                    }
                    break;
                case 3:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 4:
                    if (D < 1 || D > 30) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 5:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 6:
                    if (D < 1 || D > 30) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 7:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 8:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 9:
                    if (D < 1 || D > 30) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 10:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 11:
                    if (D < 1 || D > 30) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
                case 12:
                    if (D < 1 || D > 31) {
                        System.out.println("���s�b�o�ؤ��");
                    }
                    break;
            }
            S = (M * 2 + D) % 3;
            switch (S) {
                case 0:
                    System.out.println("���q");
                    break;
                case 1:
                    System.out.println("�N");
                    break;
                case 2:
                    System.out.println("�j�N");
                    break;
            }

        }
    }
}