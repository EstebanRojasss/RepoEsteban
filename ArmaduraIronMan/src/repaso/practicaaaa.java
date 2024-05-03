package repaso;

public class practicaaaa {
    public static void main(String[] args) {
        String s = "OOSSSSSQSSOR";
        System.out.println(exploringMars(s));

    }

    public static int exploringMars(String s){
        int countLetter = 0;
        for(int i = 0; i < s.length(); i+=3){
            String sos = s.substring(i, i+3);
            for(int j = 0; j < 3; j++){
                if (j == 0 || j == 2) {
                    if(sos.charAt(j) != 'S'){
                        countLetter++;
                    }
                }else{
                    if(sos.charAt(j) != 'O'){
                        countLetter++;
                    }
                }
            }
        }
        return countLetter;
    }
}

