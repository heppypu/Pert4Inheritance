
//Class turunan atau warisan dari class person = sub class/ anak class
public class Customer extends Person{
    private String id;
    //Constructor
    public Customer(String n, String a, String id_cust) {
        super(n, a);
        id = id_cust;
    }
    // Getter
    public String getId() {
        return id;
    }
    // overriding method (alt + insert + pilih overriding method / ctrl + o)
    // untuk menggambil getter dari kelas person
    public Customer(String n, String a) {
        super(n, a);
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
