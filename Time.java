public class Time
{
    public static void main(String args[])
    {
        int gio, phut, giay;
        gio = 10;
        phut = 44;
        giay = 50;
        int z;
        z = gio*3600 + phut*60 + giay;
        System.out.println(" So giay tu nua dem : " + z + " s");
        System.out.println(" So giay con lai trong ngay : " + (86400 - z ) + " s");
        System.out.print(" Phan tram thoi gian troi qua trong ngay : " + (z*100/86400) + " %");
    }
}
