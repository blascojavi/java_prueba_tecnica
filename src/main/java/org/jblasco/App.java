package org.jblasco;

import java.time.LocalDate;
import java.util.*;

public class App {

    //Invertir una cadena
    private void m1InvertString(String text){

        /*
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length; i>0; i--){
            newText.append(array[i - 1]);
        }
        System.out.println(newText);
            */
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);

    }

    // Determinar si un numero es capicua
    private void m2IsCapicua(int number){
    String numberText = String.valueOf(number);
    String reverseNumber= new StringBuilder(numberText).reverse().toString();

    if (numberText.equals(reverseNumber)){

        System.out.println("Is capicua");
    }else{
        System.out.println("Not capicua");
    }
    }

    //Cantidad cada caracter
    private void m3CounCharacterTimes(String text){
        int i, length, counter[] = new int [256];

        length = text.length();
        for (i =0; i < length; i++){
            counter[text.charAt(i)] ++;

        }
        for (i=0; i <256; i++){
            if (counter[i] !=0){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    //Encuentra los caracteres repetidos
    private void m4RepeatedCharacter(String text){
        System.out.println("caracteres repetidos");
        int i, length, counter[] = new int [256];
        length = text.length();

        for (i =0; i < length; i++){
            counter[text.charAt(i)] ++;

        }
        for (i=0; i <256; i++){
            if (counter[i] >1){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }

    //Multiple de 2
    private void m5IsMultiple(int number){

        if (number %2 ==0) {
            System.out.println("Is multiple");
        }else{
            System.out.println("Not Multiple");
        }

    }

    //Comprobar si el año es bisiesto
public void m6IsLeapYear(int year){
    boolean isLeapYear = LocalDate.of(year, 1,1).isLeapYear();
    System.out.println(isLeapYear);

}

//re-ordenar de forma aleatoria
public void m7RandomOrderString(String text){
String[] array = text.split("");
    List<String> list = Arrays.asList(array);
    Collections.shuffle(list);
    list.forEach(System.out::println);

}
//Si esta duplicado solo lo imprime una vez
public void m8GetOnlyNotDuplicateList(List<Integer> list){
        Set<Integer> set =  new HashSet<>(list);
        set.forEach(System.out::println);
}


//Comprueba si existe una vocal dentro
public void m9CheckIsVocalIsPresent(String text){

        String[] array = text.split("");
        boolean isPresent = false;
        for (String s : array){
            if (s.equals("a")|| s.equals("e")|| s.equals("i")|| s.equals("o")|| s.equals("u")){
                isPresent = true;
                break;
            }
        }
    System.out.println(isPresent);

}

private boolean m10Palindrome(String text){
boolean result = true;
int lenght = text.length();
for (int i = 0; i<lenght/2;i++){
    if (text.charAt(i) != text.charAt(lenght -i -1)){
        result = false;
        break;
    }
}
return result;



}

    private void m11CountWords(String text) {
        int wordCount = contarPalabras(text);
        System.out.println("Número de palabras: " + wordCount);
    }


    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }



    public static void main(String[] args) {
    App app = new App();
    app.m1InvertString("prueba");

    app.m2IsCapicua(151);
     //   System.out.println("Hello world!");
        app.m3CounCharacterTimes("pascualin");
        app.m4RepeatedCharacter("pruebaaa");
        app.m5IsMultiple(1217);
        app.m6IsLeapYear(2024);
        app.m7RandomOrderString("prueba");
        app.m8GetOnlyNotDuplicateList(Arrays.asList(1,2,3,4,5,8,6,8,9));
        app.m9CheckIsVocalIsPresent("cola");
        System.out.println(app.m10Palindrome("calac"));;
        app.m11CountWords("Este es un ejemplo de una cadena de texto");

    }

}