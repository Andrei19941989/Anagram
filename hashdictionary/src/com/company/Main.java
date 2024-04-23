package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
     System.out.println(inograma("live","evil"));
    }

    public static boolean inograma(String s ,String st)//созадем фукнция является ли оба слова анограмами(принимаем два слова)
    {
        HashMap<Character,Integer> key =new HashMap<Character,Integer>();//записываем все буквы первого слова и колличество
        for(int i =0;i<s.length();i++)//проовходим цикл по перворому слову
        {
            if(key.containsKey(s.charAt(i)))//был ли у на суже такой ключ-доабыляли такую букву в словарь или нет
            {
                key.put(s.charAt(i),key.get(s.charAt(i))+1);//еслти добовляли букву перезаписываем згначение на то же самое +1
            }
            else//если такую букву не встречали то добовляем  со значением 1
            {
                key.put(s.charAt(i),1);
            }
        }
        HashMap<Character,Integer>keys=new HashMap<Character,Integer>();//тоже самое для второгот слова
        for(int j=0;j<st.length();j++)
        {
            if(keys.containsKey(st.charAt(j)))
            {
                keys.put(st.charAt(j),keys.get(st.charAt(j))+1);
            }
            else
            {
                keys.put(st.charAt(j),1);
            }
        }
        if(key.size()!=keys.size())//если размеры не совпали то точно не анограмы
        {
            return false;
        }
        else//если совпали сработает иначе и перебираем все ключи и сверяем все значения по ключам
        {
            for(Character i:key.keySet())
            {
                if(!keys.containsKey(i) || (keys.get(i)!=key.get(i)))
                {
                    return false;
                 }
            }
            return true;
        }
    }
}
