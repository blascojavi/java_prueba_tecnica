package org.jblasco;

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



    public static void main(String[] args) {
    App app = new App();
    app.m1InvertString("prueba");

    app.m2IsCapicua(151);
     //   System.out.println("Hello world!");
        app.m3CounCharacterTimes("pascualin");
        app.m4RepeatedCharacter("pruebaaa");
        app.m5IsMultiple(1217);
    }

}