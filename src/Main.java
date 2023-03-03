import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       pizza obj=new pizza(false);
        obj.extracheese();
        obj.extratopping();
        obj.takeaway();
        obj.getbill();
        System.out.println();
        System.out.println("delux pizza");

        deal_pizza obj1=new deal_pizza(true);
        obj1.extracheese();

    }
}