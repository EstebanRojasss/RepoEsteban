package repaso;

import java.util.ArrayList;
import java.util.List;

public class practicaaa {
    public static void main(String[]args){
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangram(s));
    }
    public static String pangram(String s ) {
        List<Character> abecedario = new ArrayList<>();
        for(char letter = 'A'; letter <= 'Z'; letter++){
            abecedario.add(letter);
        }
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            if(abecedario.contains(s.charAt(i))){
                abecedario.remove(abecedario.indexOf(s.charAt(i)));
            }
        }
        if(abecedario.isEmpty()) {
            return "pangram";
        }
        return "not pangram";
    }
}
