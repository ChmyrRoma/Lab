package com.junit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3 {
  public static void main(String[] args)throws IOException {
    System.out.println("Лабораторна робота 5");
    System.out.println("модульне тестування");
    System.out.println("виконав студент Web-1911");


    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введіть номер місяця");
    String line=br.readLine();
    int mounth=Integer.parseInt(line);

    System.out.println("Введіть дійсне число");
    String line1=br.readLine();
    Double s=new Double(line1);

    String season;
    if(mounth==12 || mounth==1 || mounth==2){
      season="Зима";}

    if(mounth==3 || mounth==4 || mounth==5){
      season="Осінь";}

    if(mounth==6 || mounth==7 || mounth==8){
      season="Літо";
    }

    if(mounth==9 || mounth==10 || mounth==11){
      season="Весна";
    }
    else season =mounth+" Неіснуючий місяць";

    System.out.println(season);
    System.out.println("Число дійсного типу="+s);
    System.out.println("");

  }
}
