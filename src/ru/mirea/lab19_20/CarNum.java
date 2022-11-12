package ru.mirea.lab19_20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class CarNum {

    private String letters = "АВЕКМНOPCTYX"; //алфавит для рандома
    private int lettersAmount = letters.length(); //длина алфавита

    private ArrayList<String> numbers = new ArrayList<>(); //прямой перебор
    private HashSet<String> hashSet = new HashSet<>();
    private TreeSet<String> treeSet = new TreeSet<>();

    private void addLetter(StringBuffer sb) { //добавить рандомную букву
        sb.append(letters.charAt(RandomFunc.random(0, lettersAmount)));
    }

    public String generate() {
        StringBuffer strBuff = new StringBuffer();

        addLetter(strBuff); //X

        int randInt = RandomFunc.random(0, 9);
        strBuff.append(randInt).append(randInt).append(randInt); //NNN

        addLetter(strBuff); //Y
        addLetter(strBuff); //Z

        int randReg = RandomFunc.random(1, 199);
        strBuff.append(RandomFunc.addZero(randReg)); //R

        String res = strBuff.toString();
        numbers.add(res);
        hashSet.add(res);
        treeSet.add(res);
        return res;
    }

    public boolean straightSearch(String str) {
        return numbers.contains(str);
    }

    public boolean binarySearch(String str) {
        return Collections.binarySearch(numbers, str) >= 0;
    }

    public boolean hashSetSearch(String str) {
        return hashSet.contains(str);
    }

    public boolean treeSetSearch(String str) {
        return treeSet.contains(str);
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public String getLetters() {
        return letters;
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public TreeSet<String> getTreeSet() {
        return treeSet;
    }
}