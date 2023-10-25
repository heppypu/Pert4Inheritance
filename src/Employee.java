public class Employee extends Person{
    // keyword nya inheritance adalah extends dan super
    //Atribut
    private String id_emp;

    // Constructor
    public Employee(String n, String a, String id_emp) {
        super(n, a);
        this.id_emp = id_emp;
    }

    //Getter
    public String getId_emp() {
        return id_emp;
    }

    public Employee(String n, String a) {
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
