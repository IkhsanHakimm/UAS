import java.util.ArrayList;
import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {
        int jum=4;
        UAS1D myMessage = new UAS1D();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine());
        myMessage.setMessageName(sc.nextLine());
        ArrayList<String> context = new ArrayList<>();
        for(int index=0;index<jum;index++){
            context.add(sc.nextLine());
        }
        myMessage.setContext(context);
        System.out.println("Kata yang dicari : ");
        String cari = sc.nextLine();
        System.out.println(myMessage.FindWords(context,cari));
    }
}
