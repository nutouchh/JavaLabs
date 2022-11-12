package ru.mirea.lab7;

import java.util.*;



public class App {
    public static <T> Stack<T> reverseStack(Stack<T> old){
        Stack<T> n = new Stack<T>();
        while (!old.empty())
        {
            n.push(old.pop());
        }
        return n;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack<Integer> temp = new Stack<>();

        //заполнение первой колоды
        System.out.println("Введите 5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            temp.push(scan.nextInt());
        }
        Stack<Integer> deck1 = App.reverseStack(temp);
        temp.clear();

        //заполнение второй  колоды
        System.out.println("Введите 5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            temp.push(scan.nextInt());
        }
        Stack<Integer> deck2 = App.reverseStack(temp);
        temp.clear();
        scan.close();

        System.out.println(deck1);
        System.out.println(deck2);

        int card1, card2, win;
        for(int move = 1; move <= 106; move++) {
            card1 = deck1.pop();
            card2 = deck2.pop();

            if ((card1 > card2) && (card1!=9 & card2!=0) || (card1==0 & card2==9)){
                temp.push(card1);
                temp.push(card2);
                win = 1;
            }
            else{
                temp.push(card2);
                temp.push(card1);
                win = 2;
            }

//            System.out.println("Колоды: " + deck1 + "   " + deck2);
//            System.out.println("Победитель: " + win);
//            System.out.println("Карты победителю: " + temp);

            if (deck1.size() == 0){
                if (win == 1)
                {
                    deck1 = App.reverseStack(deck1);
                    deck1.push(temp.pop());
                    deck1.push(temp.pop());
                    deck1 = App.reverseStack(deck1);
                }
                else{
                    System.out.println("second" + " " + move);
                    return;
                }
            }

            if (deck2.size() == 0){
                if (win == 2)
                {
                    deck2 = App.reverseStack(deck2);
                    deck2.push(temp.pop());
                    deck2.push(temp.pop());
                    deck2 = App.reverseStack(deck2);
                }
                else{
                    System.out.println("first" + " " + move);
                    return;
                }
            }

            temp.clear();
        }

        System.out.println("botva");

    }
}
