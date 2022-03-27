// 
// Decompiled by Procyon v0.5.36
// 

package uaskambing;

import MasterKambing.Kacang;
import MasterKambing.Etawa;
import MasterKambing.Kambing;

public class UASKambing
{
    public static void main(final String[] args) {
        final Kambing[] ternak = { new Etawa("jantan", 8, 5), new Etawa("betina", 6, 4), new Etawa("jantan", 45, 30), new Kacang("jantan", 16, 13), new Kacang("betina", 15, 10) };
        final UIKambing ui = new UIKambing(ternak);
        ui.setVisible(true);
    }
}
