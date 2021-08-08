public class Khoangcach {
    public static void Motdong(){
     System.out.println("");
    }
    public static void Haidong(){
        Motdong();
        Motdong();
    }
    public static void main(String args[]){
        System.out.println(Math.pow(2.0,10.0));
        System.out.println("Dong thu nhat");
        Haidong();Haidong();
        System.out.println("Dong thu sau");
    }
}
