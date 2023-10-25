public class subClass extends SuperClass {
    // Atribut
    private int usia;
    //Constructor
    public subClass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }
    //Getter
    public int getUsia() {
        return usia;
    }

    public subClass(String nama, String keterangan) {
        super(nama, keterangan);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKeterangan() {
        return super.getKeterangan();
    }
}
