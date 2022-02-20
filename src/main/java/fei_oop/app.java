package fei_oop;

public class app {
    public static void main(String[] args) {
        //System.out.println("Yeet");
        int x=9;
        int y=6;
        app.comp(x,y);
    }
    public static int comp(int a, int b){
        //int a,b;
        //a = Integer.parseInt(args[0]);
        //b = Integer.parseInt(args[1]);
        if (a>b) {
            System.out.println("cislo" + a + "je vacsie ako cislo" + b);
            return 1;
        }
        if (a==b) return 0;
        if (a<b) return -1;
        return 5;
    }
}
