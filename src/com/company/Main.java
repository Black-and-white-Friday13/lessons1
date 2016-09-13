package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Вася = reader.readLine();
        Cat catDed = new Cat(Вася);

        String Мурка = reader.readLine();
        Cat catBabka = new Cat(Мурка);

        String Василиса = reader.readLine();
        Cat catMother = new Cat(Василиса, catBabka, null);

        String Котофей = reader.readLine();
        Cat catFather = new Cat(Котофей, null, catDed);

        String Мурчик = reader.readLine();
        Cat catSon = new Cat(Мурчик, catMother, catFather);

        String Пушинка = reader.readLine();
        Cat catDaughter = new Cat(Пушинка, catMother, catFather);



        System.out.println(catDed);
        System.out.println(catBabka);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mam;
        private Cat pap;

        Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, Cat mam, Cat pap)
        {
            this.name = name;
            this.mam = mam;
            this.pap = pap;
        }

        @Override
        public String toString()
        {
            if (mam == null && pap == null)
                return "Cat name is " + name + ", no mother"  + ", no father ";
            else if (pap == null)
                return "Cat name is " + name + ", mother is " + mam.name;
            else if (mam == null)
                return "Cat name is " + name + ", father is " + pap.name;
            else
                return "Cat name is " + name + ", mother is " + mam.name + ", father is " + pap.name;
        }
    }

}


