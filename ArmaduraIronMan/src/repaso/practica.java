package repaso;

import java.util.*;

public class practica {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        int n = candles.size();
        int count = 0;
        Collections.sort(candles);
        for(int i = n-1; i >= 0; i--){
            if(candles.get(i).equals(candles.get(n-1))){
                count++;
            }
        }
        System.out.println(count);

//int mul = 0;
//for(int i = 1; i < 5; i++ ){
//    int aux = i+1;
//    mul += aux * i;
//}



//        for (int i = 0; i < 100; i++) {
//            grades.add(random.nextInt(1, 100));
//        }
//        for (int i = 0; i < grades.size(); i++) {
//            if (grades.get(i) > 40) {
//                numMultiple = grades.get(i);
//            while (numMultiple % 5 != 0) {
//                    numMultiple += 1;
//                }
//                if (numMultiple - grades.get(i) >= 3) {
//                    gradesRounds.add(grades.get(i));
//                } else {
//                    gradesRounds.add(numMultiple);
//                }
//            }
//        }
//            System.out.println(gradesRounds);

//    public static int minimo(String minimo) {
//        int min = Integer.parseInt(minimo);
//        int num;
//        for (int i = 0; i < minimo.length() - 2; i++) {
//            num = Integer.parseInt(minimo.substring(i, i + 3));
//            if (num < min && num >= 100) {
//                min = num;
//            }
//        }
//        return min;
//    }
// 1,1,3,3,5
//    public static int lonelyinteger(List<Integer> a) {
//        Collections.sort(a);
//        int num = 0;
//        int i = 0;
//        for(i = 0 ; i < a.size()-1; i+=2){
//            if(a.get(i) != a.get(i+1)){
//                num = a.get(i);
//                break;
//            }
//        }
//        if( i == a.size()-1){
//            num =   a.get(a.size()-1);
//        }
//        return num;
//
    }


}


