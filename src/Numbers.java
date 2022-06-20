public class Numbers {
    public static int NumToArab(String elem){
        if(elem.equals("1")) return 1;
        else if(elem.equals("2")) return 2;
        else if(elem.equals("3")) return 3;
        else if(elem.equals("4")) return 4;
        else if(elem.equals("5")) return 5;
        else if(elem.equals("6")) return 6;
        else if(elem.equals("7")) return 7;
        else if(elem.equals("8")) return 8;
        else if(elem.equals("9")) return 9;
        else if(elem.equals("10"))return 10;
        else return -1;
    }
    public static int NumToRim(String elem){
        if(elem.equals("I")) return 1;
        else if(elem.equals("II")) return 2;
        else if(elem.equals("III")) return 3;
        else if(elem.equals("IV")) return 4;
        else if(elem.equals("V")) return 5;
        else if(elem.equals("VI")) return 6;
        else if(elem.equals("VII")) return 7;
        else if(elem.equals("VIII")) return 8;
        else if(elem.equals("IX")) return 9;
        else if(elem.equals("X"))return 10;
        else return -1;
    }
}
