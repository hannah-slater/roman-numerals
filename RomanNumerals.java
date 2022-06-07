class RomanNumerals{
    public static int romanToInt(String s) {
        //find length of string
        int length = s.length();
        int number = 0;
        int minus = 0;
        for (int i = 0; i < length; i++){
            int num = numeral(s.charAt(i));
            if (minus != 0){
                num -= minus;
                minus = 0;
            }
            if (i != length - 1){
                if (num == 1){
                    int nextNum = numeral(s.charAt(i+1));
                    if (nextNum == 5 || nextNum == 10){
                        minus = 1;
                    }
                    num = 0;
                }
                if (num == 10){
                    int nextNum = numeral(s.charAt(i+1));
                    if (nextNum == 50 || nextNum == 100){
                        minus = 10;
                    }
                    num = 0;
                }
                if (num == 100){
                    int nextNum = numeral(s.charAt(i+1));
                    if (nextNum == 500 || nextNum == 1000){
                        minus = 100;
                    }
                    num = 0;
                }
            }
            number += num;
        }
        //for first letter, if I X or C check if V/X, L/C or D/M
        //
        return number;
    }
    
    public static int numeral(char c){
        int num = 0;
        switch(c){
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            default:
                break;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}