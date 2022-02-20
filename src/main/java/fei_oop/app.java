package fei_oop;

public class app {
    public static void main(String[] args) {
        //System.out.println("Yeet");
        int x=5;
        int y=5;
        int rtn;
        rtn = app.comp(x,y);
        System.out.println(rtn);
    }
    public static int comp(int a, int b){
        //int a,b;
        //a = Integer.parseInt(args[0]);
        //b = Integer.parseInt(args[1]);
        int rtn = 5;
        if (a>b) {
            System.out.println("cislo " + a + "je vacsie ako cislo" + b);
            rtn = 1;
        }
        if (a==b) {
            System.out.println("cisla su rovnake");
            rtn = 0;
        }
        if (a<b) {
            System.out.println("cislo " + a + "je mensie ako cislo" + b);
            rtn = -1;
        }
        return rtn;
    }
}
