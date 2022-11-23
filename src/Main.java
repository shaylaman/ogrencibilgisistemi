public class Main {
    public static void main(String[] args) {

        Ders mat = new Ders("Matematik", "MAT101", "MAT");
        Ders fzk = new Ders("Fizik", "FZK101", "FZK");
        Ders kmy = new Ders("Kimya", "KMY101", "KMY");

        Ogretmen o1 = new Ogretmen("Ali Hoca", "90552445510", "MAT");
        Ogretmen o2 = new Ogretmen("Ebru Hoca", "90550000001", "FZK");
        Ogretmen o3 = new Ogretmen("Pakize Sultan", "90501500", "KMY");

        mat.ogretmenEkle(o1);
        fzk.ogretmenEkle(o2);
        kmy.ogretmenEkle(o3);

        Ogrenci s1 = new Ogrenci("Ali İhsan", 4, "201", mat, fzk, kmy);
        s1.dersNotuEkleme(20, 60, 80);
        s1.gecti();
        Ogrenci s2 = new Ogrenci("Veli İkram", 4, "301", mat, fzk, kmy);
        s2.dersNotuEkleme(50, 20, 40);
        s2.gecti();
        Ogrenci s3 = new Ogrenci("Deli İzvan", 4, "401", mat, fzk, kmy);
        s3.dersNotuEkleme(75, 50, 45);
        s3.gecti();
    }
}