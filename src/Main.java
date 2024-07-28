import java.util.Scanner;
/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
 */
public class Main {
    public static void main(String[] args){

        double amountToBePaid, distanceTraveled, perKm = 2.2, startPrice = 10;
        Scanner inp = new Scanner(System.in);

        System.out.print("How many km do you want to go? : ");
        distanceTraveled = inp.nextDouble();

        amountToBePaid = startPrice + (distanceTraveled * perKm);
        amountToBePaid = (amountToBePaid < 20) ? 20 : amountToBePaid;

        System.out.println("The amount to be paid is "+amountToBePaid+"tl");


    }
}
