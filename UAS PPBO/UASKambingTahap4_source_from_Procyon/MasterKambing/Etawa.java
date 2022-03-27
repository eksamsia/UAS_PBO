// 
// Decompiled by Procyon v0.5.36
// 

package MasterKambing;

public class Etawa extends Kambing
{
    public Etawa(final String jk, final int tinggi, final int bobot) {
        super("panjang dan terkulai ke bawah", jk, tinggi, bobot);
    }
    
    @Override
    public void makan() {
        final int berat = this.getBobot() + 5;
        final int tinggi = this.getTinggi() + 7;
        if (this.getJk().equals("jantan")) {
            if (berat > 91) {
                this.setBobot(91);
            }
            else {
                this.setBobot(berat);
            }
            if (tinggi > 127) {
                this.setTinggi(127);
            }
            else {
                this.setTinggi(tinggi);
            }
        }
        else {
            if (berat > 63) {
                this.setBobot(63);
            }
            else {
                this.setBobot(berat);
            }
            if (tinggi > 92) {
                this.setTinggi(92);
            }
            else {
                this.setTinggi(tinggi);
            }
        }
    }
}
