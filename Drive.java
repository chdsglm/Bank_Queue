
package vya_odev_2;

import java.util.Scanner;

public class Driver {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Musteri eklemek icin 0.");
         System.out.println("Musteri islemek icin 1.");
         System.out.println("Musteri sayisi icin 2.");
         System.out.println("Ilk musteri icin 3.");
         System.out.println("Tum musteri sirasi icin 4.");
         System.out.println("Banka kapatmak icin -1.");
         
         Queue Q = new Queue();
         
         int command, clientID = 0;
         do {
             command = scanner.nextInt();
             if (command == 0) {
                 System.out.println("Musteri ismini giriniz:");
                 String name = scanner.next();
                 
                 Client client = new Client(name, clientID);
                 Q.enqueue(client);
                 
                 System.out.println("Yeni musterimiz, " + name + ", eklendi. ID = " + clientID);
                 clientID++;
             } else
             if (command == 1) {
                 if (Q.isEmpty()) {
                     System.out.println("Musterimizin hepsi islendi. Siramiz bos.");
                 } else {
                    Client client = Q.dequeue();
                    System.out.println("Musteri, " + client.getName() + ", islenildi. ID = " + client.getID());
                 }
             } else 
             if (command == 2) {
                 System.out.println("Sirada " + Q.size() + " musterimiz var.");
             } else
             if (command == 3) {
                 Client client = Q.peek();
                 System.out.println("Sira basindaki musterimiz: " + client.getName() + ". ID = " + client.getID());
             } else
             if (command == 4) {
                 Q.listClients();
             }
         } while (command != -1);
         System.out.println("Tesekkur ederiz. Banka kapandi.");
     }  
}
