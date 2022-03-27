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
            return 65;
        }
        return 56;
    }
    
    @Override
    public int maxBobot() {
        if (this.getJk().equals("jantan")) {
            return 25;
        }
        return 20;
    }
}
