class RomanNumerals{
    public static int romanToInt(String s) {
        //find length of string
        int length = s.length();
        int number = 0;
        for (int i = 0; i < length; i++){
            int num = numeral(s.get(i));
            
        }
        //for first letter, if I X or C check if V/X, L/C or D/M
        //
    }
    
    public int numerals(char c){
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
        System.out.println(romanToInt("III"));
    }
}