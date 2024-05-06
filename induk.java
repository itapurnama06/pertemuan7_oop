package pertemuan7;

/**
 *
 * @author LAB F
 * TGL : 2024-05-06
 */
public class induk {
    private String nama;
    public int nilai=0;
    
    public induk(String nm, int nl) {
        nama = nm;
        nilai = nl;
  }
    public void setNAMA(String nVAL){
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = "Siapaa ya?";
    }
    public String getNAMA(){
        return this.nama;
    }
  public void cetakNAMA(){
       System.out.printf("Isi dari variabel nama: %s dengan tinggi badan %d \n\n",this.nama,this.nilai);
    }
}