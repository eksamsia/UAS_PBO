// 
// Decompiled by Procyon v0.5.36
// 

package uaskambing;

import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import MasterKambing.Kambing;
import javax.swing.JFrame;

public class UIDetailKambing extends JFrame
{
    Kambing k;
    private JButton jButtonSimpan;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField jTextFieldBobot;
    private JTextField jTextFieldDahi;
    private JTextField jTextFieldTelinga;
    private JTextField jTextFieldTinggi;
    
    public UIDetailKambing(final Kambing k) {
        this.initComponents();
        this.k = k;
        this.setIsian();
    }
    
    private void setIsian() {
        this.jTextFieldDahi.setText(this.k.getDahiHidung());
        this.jTextFieldTelinga.setText(this.k.getBentukTelinga());
        this.jTextFieldTinggi.setText(String.valueOf(this.k.getTinggi()));
        this.jTextFieldBobot.setText(String.valueOf(this.k.getBobot()));
    }
    
    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jTextFieldDahi = new JTextField();
        this.jTextFieldTelinga = new JTextField();
        this.jTextFieldTinggi = new JTextField();
        this.jTextFieldBobot = new JTextField();
        this.jButtonSimpan = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 0, 24));
        this.jLabel1.setText("Detail Kambing");
        this.jLabel2.setText("Bentuk Dahi dan Hidung");
        this.jLabel3.setText("Bentuk Telinga");
        this.jLabel4.setText("Tinggi");
        this.jLabel5.setText("Bobot");
        this.jButtonSimpan.setText("Simpan");
        this.jButtonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent evt) {
                UIDetailKambing.this.jButtonSimpanActionPerformed(evt);
            }
        });
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1, -2, 228, -2).addGap(41, 41, 41)).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButtonSimpan, -2, 73, -2).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel5, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel4, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel3, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextFieldTelinga).addComponent(this.jTextFieldTinggi).addComponent(this.jTextFieldBobot).addComponent(this.jTextFieldDahi, -1, 136, 32767)))).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextFieldDahi, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jTextFieldTelinga, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextFieldTinggi, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.jTextFieldBobot, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButtonSimpan).addContainerGap(-1, 32767)));
        this.pack();
    }
    
    private void jButtonSimpanActionPerformed(final ActionEvent evt) {
        boolean ambilData = false;
        String dahi = this.k.getDahiHidung();
        String telinga = this.k.getBentukTelinga();
        int tinggi = this.k.getTinggi();
        int berat = this.k.getBobot();
        try {
            dahi = this.jTextFieldDahi.getText();
            telinga = this.jTextFieldTelinga.getText();
            tinggi = Integer.parseInt(this.jTextFieldTinggi.getText());
            berat = Integer.parseInt(this.jTextFieldBobot.getText());
            ambilData = true;
            if (tinggi <= 0 || tinggi > this.k.maxTinggi()) {
                JOptionPane.showMessageDialog((Component)null, invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, this.k.maxTinggi()));
                ambilData = false;
            }
            if (berat <= 0 || berat > this.k.maxBobot()) {
                JOptionPane.showMessageDialog((Component)null, invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, this.k.maxBobot()));
                ambilData = false;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input Salah, perubahan data tidak disimpan");
        }
        if (ambilData) {
            this.k.setDahiHidung(dahi);
            this.k.setBentukTelinga(telinga);
            this.k.setTinggi(tinggi);
            this.k.setBobot(berat);
            JOptionPane.showMessageDialog(null, "perubahan data berhasil disimpan");
            this.setVisible(false);
        }
    }
}
