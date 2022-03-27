// 
// Decompiled by Procyon v0.5.36
// 

package MasterKambing;

public class Kacang extends Kambing
{
    public Kacang(final String jk, final int tinggi, final int bobot) {
        super("tegak dan pendek", jk, tinggi, bobot);
    }
    
    @Override
    public void makan() {
        final int berat = this.getBobot() + 3;
        final int tinggi = this.getTinggi() + 5;
        if (this.getJk().equals("jantan")) {
            if (berat > 25) {
                this.setBobot(25);
            }
            else {
                this.setBobot(berat);
            }
            if (tinggi > 65) {
                this.setTinggi(65);
            }
            else {
                this.setTinggi(tinggi);
            }
        }
        else {
            if (berat > 20) {
                this.setBobot(20);
            }
            else {
                this.setBobot(berat);
            }
            if (tinggi > 56) {
                this.setTinggi(56);
            }
            else {
                this.setTinggi(tinggi);
            }
        }
    }
}
