package repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practicaa {
    public static void main(String []args){
        List<Integer> gradesRounding = new ArrayList<>();
        List<Integer> grades = new ArrayList<>();
        Collections.sort(grades);
        boolean multiple = false;
        int numberMultiple;
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        int multipleFounder;
       for(int i = 0; i < grades.size(); i++){
           if(grades.get(i) >= 38){
                   numberMultiple = grades.get(i);
                   if (numberMultiple % 5 != 0) {
                       while(numberMultiple % 5 != 0){
                           numberMultiple += 1;
                       }
                       if(numberMultiple - grades.get(i) < 3){
                           gradesRounding.add(numberMultiple);
                       }else{
                           gradesRounding.add(grades.get(i));
                       }
                   }
           }else{
               gradesRounding.add(grades.get(i));
           }
       }
        System.out.println(gradesRounding);
    }

}
