package helloWorld;

public class Insan {
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    private static String isim;

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    private String soyisim;
    public int age;
    int luckynumber;

    public Insan(String insanismi) {
        this.isim = insanismi;
        adinisoyle();
    }

    public Insan(){


    }

    public  void adinisoyle(){
        System.out.println("benim adim"+isim);
    }

    public void selamver(){}

}
