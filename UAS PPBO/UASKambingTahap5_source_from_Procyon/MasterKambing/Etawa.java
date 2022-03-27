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
        if (berat > this.maxBobot()) {
            this.setBobot(this.maxBobot());
        }
        else {
            this.setBobot(berat);
        }
        if (tinggi > this.maxTinggi()) {
            this.setTinggi(this.maxTinggi());
        }
        else {
            this.setTinggi(tinggi);
        }
    }
    
    @Override
    public int maxTinggi() {
        if (this.getJk().equals("jantan")) {
            return 127;
        }
        return 92;
    }
    
    @Override
    public int maxBobot() {
        if (this.getJk().equals("jantan")) {
            return 91;
        }
        return 63;
    }
}
