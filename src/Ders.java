public class Ders {
    Ogretmen dersOgretmen;
    String isim;
    String numara;
    String kod;
    int not
            ;
    public Ders(String isim, String numara, String kod){
        this.isim=isim;
        this.numara=numara;
        this.kod=kod;
        this.not=not;
    }
    public void ogretmenEkle(Ogretmen o){
        if(this.kod.equals(o.brans)){
            this.dersOgretmen = o;
            System.out.println("işlem başarılı");
        }
        else{
            System.out.println(o.adi + "Akademisyen dersi veremez");
        }
    }
    public void printOgretmen(){
        if(dersOgretmen!=null){
            System.out.println(this.isim + "dersinin Ogretmeni " + dersOgretmen.adi);
        }
        else {System.out.println(this.isim + "dersine Ogretmen atanmıştıor " );

        }
    }


}
