package homeworklesonthree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - 'Угадай число'");
        System.out.println("2 - 'Угадай слово'");
        int chose = sc.nextInt();
        switch (chose){
            case (1):
                GuessNumber();
                break;

            case (2):
                GuessWord();
                break;

            default:
                System.out.println("Такого варианта нет :(");
        }


    }
    public static void GuessWord (){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        char [] guess = new char[15];
        Arrays.fill(guess, '#');
        boolean next = true;
        String[] words = {"apple",  "orange",     "lemon",   "banana",
                        "apricot", "avocado",  "broccoli",   "carrot",
                         "cherry",  "garlic",     "grape",    "melon",
                           "leak",    "kiwi",     "mango", "mushroom",
                            "nut",   "olive",       "pea",   "peanut",
                           "pear",  "pepper", "pineapple", "pumpkin",
                         "potato"}; // 25 words
        String answer = words [rn.nextInt(25)];
        System.out.println("Слово загадано. Введите Ваш вариант.");
        String userAnswer = sc.next();
        int rightWord = 0;
        sc.nextLine();
        while (next) {
            rightWord = 0;
            for (int i = 0; i < answer.length(); i++) {
                if (i < answer.length() && i < userAnswer.length()) {
                    char a = answer.charAt(i);
                    char b = userAnswer.charAt(i);
                    if (a == b) {
                        guess[i] = a;
                        rightWord++;
                    }
                }
            }

            if (rightWord < answer.length()) {
                System.out.print("Ответ не полный. Совпавшие буквы открыты: ");
                for (int j = 0; j < guess.length; j++) {
                    System.out.print(guess[j]);
                }
                System.out.println();
                System.out.println("Введите новый вариант: ");
                userAnswer = sc.next();
            } else {
                next = false;
            }
        }
        System.out.println("Поздравляю!!! Вы угадали!!!");
        sc.close();
        }



    public static void GuessNumber (){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int maxTryCount = 3;
        int answer;
        boolean repeat = true;
        int userAnswer = 10;
        while (repeat) {
            answer = rn.nextInt(10);
            System.out.println("Угадай число от 0 до 9. У Вас три попытки.");
            while (!sc.hasNextInt()){
                if (sc.hasNextInt()){
                    userAnswer = sc.nextInt();
                } else {
                    sc.nextLine();
                    System.out.println("Вы ввели не число. Введите число от 0 до 9");
                }
            }
            userAnswer = sc.nextInt();
            for (int tryCount = 1; tryCount < maxTryCount; tryCount++) {
                sc.nextLine();
                while(userAnswer < 0 || userAnswer > 9){
                    System.out.println("Вы ввели не корректное число. Введите число от 0 до 9:");
                    if (sc.hasNextInt()){
                        userAnswer = sc.nextInt();
                    }
                }
                    if (userAnswer == answer) {
                    break;
                } else if (userAnswer > answer) {
                    System.out.println("Вы ввели слишком большое число. Осталось попыток: " + (maxTryCount - tryCount));
                } else if (userAnswer < answer) {
                    System.out.println("Вы ввели слишком маленькое число. Осталось попыток: " + (maxTryCount - tryCount));
                }
                userAnswer = sc.nextInt();
            }
            if (userAnswer == answer) {
                System.out.println("Поздравляю, Вы угадали!!!");
            } else {
                System.out.println("Вы не угадали. Правильный ответ: " + answer);
            }
            System.out.println("Хотите попробовать ещё раз? 1 – да / 0 – нет");
            userAnswer = sc.nextInt();
            if (userAnswer == 0) {
                repeat = false;
                System.out.println("Игра завершена");
                sc.close();
            }
        }
        }

    }
