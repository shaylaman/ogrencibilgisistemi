public class Ogrenci {
    String isim, ogrNo;
    int siniflar;
    Ders mat;
    Ders fzk;
    Ders kmy;
    double ortalama;
    boolean gecti;

    Ogrenci(String isim, int siniflar, String ogrNo, Ders mat, Ders fizik, Ders kimya) {
        this.isim = isim;
        this.siniflar = siniflar;
        this.ogrNo = ogrNo;
        this.mat = mat;
        this.fzk = fzk;
        this.kmy = kmy;
        calcAvarage();
        this.gecti = false;
    }
    public void calcAvarage() {
        this.ortalama = (this.fzk.not + this.kmy.not + this.mat.not) / 3.0;
    }

    public void dersNotuEkleme(int mat, int fzk, int kmy) {

        if (mat >= 0 && mat <= 100) {
            this.mat.not = mat;
        }

        if (fzk >= 0 && fzk <= 100) {
            this.fzk.not = fzk;
        }

        if (kmy >= 0 && kmy <= 100) {
            this.kmy.not = kmy;
        }
    }

    public void gecti () {
            if (this.mat.not == 0 || this.fzk.not == 0 || this.kmy.not == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
            } else {
                this.gecti = gecmesarti();
                printNote();
                System.out.println("Ortalama : " + this.ortalama);
                if (this.gecti) {
                    System.out.println("Sınıfı Geçti. ");
                } else {
                    System.out.println("Sınıfta Kaldı.");
                }
            }

    }

        public boolean gecmesarti() {
            calcAvarage();
            return this.ortalama > 55;

    }

        public void printNote(){
            System.out.println("=========================");
            System.out.println("Öğrenci : " + this.isim);
            System.out.println("Matematik Notu : " + this.mat.not);
            System.out.println("Fizik Notu : " + this.fzk.not);
            System.out.println("Kimya Notu : " + this.kmy.not);
        }

    }



