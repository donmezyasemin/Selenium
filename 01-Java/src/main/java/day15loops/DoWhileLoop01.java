package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //while
      /*  baslangic degeri

        while(Loop calisma kurali){
            calisacak kodlar
            artirma/azaltma
        }

        //do while
        baslangic degeri

         do{
             calisacak kodlar
             artirma/azaltma
         }while (Loop calisma kurali);
        */
        //Ornek 1: 5 (dahil) den 3 (dahil) e kadar tum tamsayilari console a yazdirinz

        int a = 5;
        do {
            System.out.println(a);
            a--;
        } while (a > 2);

        //1 while-loop

        int i = 1;
        while (i < 1) {
            System.out.println("Sen bir while loopsun...");
            i++;
        }
        //while loop ta zero execution mumkundur


        //2 do while loop
        int k = 1;
        do {
            System.out.println("Sen bir do while loopsun...");
            k++;
        } while (k < 1);
        //do while kullanildiginda loop body en az 1 kere calisir, zero execution mumkun degildir.


    }

}
