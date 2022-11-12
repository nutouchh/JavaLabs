package ru.mirea.lab8;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {


        System.out.println("WaitList");

        ArrayList<Student> st = new ArrayList<Student>();
        Student testSt = new Student("NNN");
        st.add(testSt);
        st.add(new Student("HHH"));
        st.add(new Student("AAA"));
        st.add(new Student("EEE"));
        st.add(new Student("MMM"));

        WaitList<Student> waitList = new WaitList<>(st);
        System.out.println(waitList);
        waitList.add(new Student("Im new student"));
        System.out.println(waitList.contains(testSt));
        System.out.println(waitList);

        System.out.println("boundedWL");

        BoundedWaitList<Student> boundedWL = new BoundedWaitList<>(4);
        boundedWL.add(new Student("HHH"));
        boundedWL.add(new Student("MMM"));
        boundedWL.add(new Student("FFF"));
        boundedWL.add(new Student("KKK"));
        boundedWL.add(new Student("AAA"));
        boundedWL.add(new Student("AAA"));
        boundedWL.add(new Student("AAA"));
        System.out.println(boundedWL);

        System.out.println("UnfairWaitList");

        UnfairWaitList<Student> UnfairWL = new UnfairWaitList<>();
        Student testU = new Student("NNN");
        UnfairWL.add(testU);
        UnfairWL.add(new Student("FFF"));
        UnfairWL.add(new Student("KKK"));
        UnfairWL.add(new Student("MMM"));
        UnfairWL.add(new Student("AAA"));

        System.out.println(UnfairWL);
        UnfairWL.moveToBack(testU);
        System.out.println(UnfairWL);

    }
}
