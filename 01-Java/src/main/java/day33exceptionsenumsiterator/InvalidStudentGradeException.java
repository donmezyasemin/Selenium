package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception{

    public InvalidStudentGradeException(String message){
        super(message);
    }

    /*
    1) Custom Exception Class olusturmak icin Exception Class a extend etmeliyiz
        Exception Class'a extend ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
        Eger Runtime Exception uretmek istersek RuntimeException Class'a extend etmeliyiz

    2) Custom Exception Class olustururken constructor olusturmaliyiz ve bu constructor parent taki constructor'i cagirmalidir
        Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir

    3)  Custom Exception Class olusturdugunuzda ismin sonunda Exception kelimesini kullanmalisiniz.

     */


}
