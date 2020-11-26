
public class Main {
    //project_name is =score_keeping :)
    public static void skorhesapla(String isim,int puan){
        System.out.println(isim +" adlı oyuncunun "+puan +" puanı vardır.");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim+" adı belirtilen oyucunun puanı belirtilmemiştir...");
    }
    public static void skorhesapla(int puan){
        System.out.println("ismi belirtilmemiş oyuncunun puanı" +puan);
    }
    public static void main(String[] args) {
        skorhesapla("@prince");
        skorhesapla(85);
        skorhesapla("hDoublelbr", 58);
        
    }
    
}
