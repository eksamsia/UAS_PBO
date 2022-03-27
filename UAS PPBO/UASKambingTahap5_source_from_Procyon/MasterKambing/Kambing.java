// 
// Decompiled by Procyon v0.5.36
// 

package MasterKambing;

public abstract class Kambing
{
    private String dahiHidung;
    private String bentukTelinga;
    private String jk;
    private int tinggi;
    private int bobot;
    
    public Kambing(final String bentukTelinga, final String jk, final int tinggi, final int bobot) {
        this.dahiHidung = "cembung";
        this.bentukTelinga = bentukTelinga;
        this.jk = jk;
        this.tinggi = tinggi;
        this.bobot = bobot;
    }
    
    public String getDahiHidung() {
        return this.dahiHidung;
    }
    
    public void setDahiHidung(final String dahiHidung) {
        this.dahiHidung = dahiHidung;
    }
    
    public String getBentukTelinga() {
        return this.bentukTelinga;
    }
    
    public void setBentukTelinga(final String bentukTelinga) {
        this.bentukTelinga = bentukTelinga;
    }
    
    public String getJk() {
        return this.jk;
    }
    
    public void setJk(final String jk) {
        this.jk = jk;
    }
    
    public int getTinggi() {
        return this.tinggi;
    }
    
    public void setTinggi(final int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getBobot() {
        return this.bobot;
    }
    
    public void setBobot(final int bobot) {
        this.bobot = bobot;
    }
    
    public abstract void makan();
    
    public abstract int maxTinggi();
    
    public abstract int maxBobot();
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;, this.dahiHidung, this.bentukTelinga, this.jk, this.tinggi, this.bobot);
    }
}
