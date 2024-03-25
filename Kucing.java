public class Kucing {
    private String nama;
    private int umur;
    private String jenis;
    private String hobi;

    public Kucing(String nama, int umur, String jenis, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
        this.hobi = hobi;
    }

    public void meong() {
        System.out.println(nama + " : Meongg!");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis: " + jenis);
        System.out.println("hobi: " + hobi);
    }

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom", 2, "American Shorthair", "suka berantam dengan kucing luar");
        Kucing kucing2 = new Kucing("Jerry", 3, "Scottish Fold","suka kawin sembarangan tempat");
        Kucing kucing3 = new Kucing("Boy", 4, "Turkish Angora","malas gerak");

        kucing1.info();
        kucing1.meong();
        System.out.println();

        kucing2.info();
        kucing2.meong();
        System.out.println();

        kucing3.info();
        kucing3.meong();
    }
}