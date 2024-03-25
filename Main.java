public class Main {
    public static void main(String[] args) {

        Kucing kucing1 = new Kucing("Tom", 2, "American Shorthair","suka berantam dengan kucing luar");
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