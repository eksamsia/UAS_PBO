// 
// Decompiled by Procyon v0.5.36
// 

package uaskambing;

import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import MasterKambing.Kambing;
import javax.swing.JFrame;

public class UIKambing extends JFrame
{
    Kambing[] ternak;
    private JButton jButtonMakan;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelBobotEtawaBetina;
    private JLabel jLabelBobotEtawaJantanBesar;
    private JLabel jLabelBobotEtawaJantanKecil;
    private JLabel jLabelBobotKacangBetina;
    private JLabel jLabelBobotKacangJantan;
    private JLabel jLabelTinggiEtawaBetina;
    private JLabel jLabelTinggiEtawaJantanBesar;
    private JLabel jLabelTinggiEtawaJantanKecil;
    private JLabel jLabelTinggiKacangBetina;
    private JLabel jLabelTinggiKacangJantan;
    
    public UIKambing(final Kambing[] ternak) {
        this.initComponents();
        this.ternak = ternak;
    }
    
    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabelTinggiEtawaJantanKecil = new JLabel();
        this.jLabelBobotEtawaJantanKecil = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabelTinggiEtawaBetina = new JLabel();
        this.jLabelBobotEtawaBetina = new JLabel();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jLabel15 = new JLabel();
        this.jLabelBobotKacangJantan = new JLabel();
        this.jLabelTinggiKacangJantan = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel17 = new JLabel();
        this.jLabel18 = new JLabel();
        this.jLabelBobotKacangBetina = new JLabel();
        this.jLabelTinggiKacangBetina = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel19 = new JLabel();
        this.jLabel20 = new JLabel();
        this.jLabelTinggiEtawaJantanBesar = new JLabel();
        this.jLabelBobotEtawaJantanBesar = new JLabel();
        this.jLabel21 = new JLabel();
        this.jButtonMakan = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel1.setText("Pembesaran Kambing Makmur Abadi Selalu Selamanya");
        this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/gambar/anakKambingEtawaJantan.jpg")));
        this.jLabel2.setText("jLabel2");
        this.jLabel4.setIcon(new ImageIcon(this.getClass().getResource("/gambar/kambingKacangJantan.jpg")));
        this.jLabel4.setText("jLabel4");
        this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/gambar/kambingKacangBetina.jpg")));
        this.jLabel5.setText("jLabel5");
        this.jLabel6.setIcon(new ImageIcon(this.getClass().getResource("/gambar/anakKambingEtawaBetina.jpg")));
        this.jLabel6.setText("jLabel6");
        this.jLabel7.setText("Kambing Etawa Jantan");
        this.jLabel8.setText("Kambing Etawa Betina");
        this.jLabel9.setText("Tinggi :");
        this.jLabel10.setText("Bobot :");
        this.jLabelTinggiEtawaJantanKecil.setText("jLabel11");
        this.jLabelBobotEtawaJantanKecil.setText("jLabel12");
        this.jLabel11.setText("Tinggi :");
        this.jLabel12.setText("Bobot :");
        this.jLabelTinggiEtawaBetina.setText("jLabel11");
        this.jLabelBobotEtawaBetina.setText("jLabel12");
        this.jLabel13.setText("Kambing Kacang Jantan");
        this.jLabel14.setText("Tinggi :");
        this.jLabel15.setText("Bobot :");
        this.jLabelBobotKacangJantan.setText("jLabel12");
        this.jLabelTinggiKacangJantan.setText("jLabel11");
        this.jLabel16.setText("Kambing Kacang Betina");
        this.jLabel17.setText("Tinggi :");
        this.jLabel18.setText("Bobot :");
        this.jLabelBobotKacangBetina.setText("jLabel12");
        this.jLabelTinggiKacangBetina.setText("jLabel11");
        this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/gambar/kambingEtawaBesar.jpg")));
        this.jLabel3.setText("jLabel3");
        this.jLabel19.setText("Kambing Etawa Jantan");
        this.jLabel20.setText("Tinggi :");
        this.jLabelTinggiEtawaJantanBesar.setText("jLabel11");
        this.jLabelBobotEtawaJantanBesar.setText("jLabel12");
        this.jLabel21.setText("Bobot :");
        this.jButtonMakan.setText("Beri Makan");
        this.jButtonMakan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                UIKambing.this.jButtonMakanActionPerformed(evt);
            }
        });
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(187, 187, 187)).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel7, -2, 134, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel10, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelBobotEtawaJantanKecil, -2, 40, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel9, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelTinggiEtawaJantanKecil, -2, 40, -2)).addComponent(this.jLabel2, -2, 248, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel6, -2, 248, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel3, -2, 208, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8, -2, 122, -2).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel12, -2, 46, -2).addComponent(this.jLabel11, -2, 46, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelBobotEtawaBetina, -2, 40, -2).addComponent(this.jLabelTinggiEtawaBetina, -2, 40, -2)))).addGap(132, 132, 132).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jLabel20, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelTinggiEtawaJantanBesar, -2, 40, -2)).addComponent(this.jLabel19, -2, 134, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel21, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelBobotEtawaJantanBesar, -2, 40, -2)))))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4, -2, 220, -2).addComponent(this.jLabel13, -2, 134, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel15, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelBobotKacangJantan, -2, 40, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel14, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelTinggiKacangJantan, -2, 40, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel16, -2, 134, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel18, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelBobotKacangBetina, -2, 40, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel17, -2, 46, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabelTinggiKacangBetina, -2, 40, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5, -2, 244, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonMakan, -1, -1, 32767))))).addGap(31, 31, 31)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6, -2, 172, -2).addComponent(this.jLabel3, -2, 0, 32767)).addComponent(this.jLabel2, -2, 167, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.jLabel8)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel19).addGap(6, 6, 6))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel9).addComponent(this.jLabelTinggiEtawaJantanKecil)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.jLabelBobotEtawaJantanKecil))).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelTinggiEtawaBetina).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel20).addComponent(this.jLabelTinggiEtawaJantanBesar))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabelBobotEtawaBetina).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel21).addComponent(this.jLabelBobotEtawaJantanBesar))))).addGroup(layout.createSequentialGroup().addComponent(this.jLabel11).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel12))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4, -2, 173, -2).addComponent(this.jLabel5))).addGroup(layout.createSequentialGroup().addGap(49, 49, 49).addComponent(this.jButtonMakan, -1, -1, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel13).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel14).addComponent(this.jLabelTinggiKacangJantan)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel15).addComponent(this.jLabelBobotKacangJantan))).addGroup(layout.createSequentialGroup().addComponent(this.jLabel16).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel17).addComponent(this.jLabelTinggiKacangBetina)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel18).addComponent(this.jLabelBobotKacangBetina)))).addContainerGap()));
        this.pack();
    }
    
    private void jButtonMakanActionPerformed(final ActionEvent evt) {
        for (int i = 0; i < 5; ++i) {
            this.ternak[i].makan();
        }
        this.jLabelBobotEtawaJantanKecil.setText(String.valueOf(this.ternak[0].getBobot()));
        this.jLabelBobotEtawaBetina.setText(String.valueOf(this.ternak[1].getBobot()));
        this.jLabelBobotEtawaJantanBesar.setText(String.valueOf(this.ternak[2].getBobot()));
        this.jLabelBobotKacangJantan.setText(String.valueOf(this.ternak[3].getBobot()));
        this.jLabelBobotKacangBetina.setText(String.valueOf(this.ternak[4].getBobot()));
        this.jLabelTinggiEtawaJantanKecil.setText(String.valueOf(this.ternak[0].getTinggi()));
        this.jLabelTinggiEtawaBetina.setText(String.valueOf(this.ternak[1].getTinggi()));
        this.jLabelTinggiEtawaJantanBesar.setText(String.valueOf(this.ternak[2].getTinggi()));
        this.jLabelTinggiKacangJantan.setText(String.valueOf(this.ternak[3].getTinggi()));
        this.jLabelTinggiKacangBetina.setText(String.valueOf(this.ternak[4].getTinggi()));
    }
}
