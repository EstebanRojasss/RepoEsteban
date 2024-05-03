package repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String p1 = sc.nextLine();
//        System.out.println();
        //S;M;plasticCup()
        String aux;
        char c;
        String p1 = "S;M;sweatTea()";
        if (p1.contains("S;")) {
            if(p1.contains("M;")){
                p1 = p1.substring(4, p1.length()-2);
                for(int i = 1; i < p1.length();i++){
                    c = p1.charAt(i);
                    if(Character.isUpperCase(c)){
                        aux = p1.substring(i);
                        p1 = p1.replace(c,' ');
                        p1 = p1.replace(p1.substring(i+1), aux);
                        p1 = p1.toLowerCase();
                    }
                }
                p1 = p1.substring(3);
                String palabra = "sw";
                p1 = palabra + p1;
            }
//            //S;C;LargeSoftwareBook
//            if(palabra1.contains("C;")){
//                palabra1 = palabra1.substring(4);
//                for(int i = 1; i < palabra1.length(); i++){
//                    char c = palabra1.charAt(i);
//                    if(Character.isUpperCase(c)){
//                        if(Character.isUpperCase(0)){
//                            palabra1 = palabra1.replace(c, Character.toLowerCase(c));
//                        }else{
//                            aux = palabra1.substring(i);
//                            palabra1 = palabra1.replace(c, ' ');
//                            palabra1 = palabra1.replace(palabra1.substring(i+1), aux);
//                            i++;
//                        }
//                    }
//                }
//
//
//                palabra1 = palabra1.toLowerCase();
//            }
//        }
//C;M;white sheet of paper
//        if(p1.contains("C;")){
//            if(p1.contains("M;")){
//                p1 = p1.substring(4);
//                for(int i = 1 ; i < p1.length(); i++){
//                    char c = p1.charAt(i);
//                    if(c == ' '){
//                        char letraMayusc = Character.toUpperCase(p1.charAt(i+1));
//                        p1 = p1.replace(p1.charAt(i+1), letraMayusc);
//                        aux = p1.substring(i+1);
//                        p1 = p1.replace(p1.substring(i), aux);
//                    }
//
//                }
//            }
//        }

            System.out.println(p1);
        }
    }
}