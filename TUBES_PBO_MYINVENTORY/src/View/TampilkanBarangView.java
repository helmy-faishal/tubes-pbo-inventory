package View;

import java.awt.event.ActionListener;

public class TampilkanBarangView extends javax.swing.JFrame {

    public TampilkanBarangView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelJudul = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelDeskripsi = new javax.swing.JLabel();
        LabelJumlah = new javax.swing.JLabel();
        LabelKategori = new javax.swing.JLabel();
        ButtonKembali = new javax.swing.JButton();
        FieldNama = new javax.swing.JLabel();
        FieldDeskripsi = new javax.swing.JLabel();
        FieldJumlah = new javax.swing.JLabel();
        FieldKategori = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detail Barang");
        setResizable(false);

        LabelJudul.setText("Data Barang");

        LabelNama.setText("Nama: ");

        LabelDeskripsi.setText("Deskripsi:");

        LabelJumlah.setText("Jumlah:");

        LabelKategori.setText("Kategori:");

        ButtonKembali.setText("Tutup");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNama)
                                .addGap(36, 36, 36)
                                .addComponent(FieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDeskripsi)
                                    .addComponent(LabelJumlah)
                                    .addComponent(LabelKategori))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FieldKategori)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(FieldDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(LabelJudul)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(ButtonKembali)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(FieldNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FieldDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelJumlah)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelKategori)
                            .addComponent(FieldKategori)))
                    .addComponent(FieldJumlah))
                .addGap(49, 49, 49)
                .addComponent(ButtonKembali)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilkanBarangView().setVisible(true);
            }
        });
    }
    
    public void addKembaliListener(ActionListener kembaliListener){
        this.ButtonKembali.addActionListener(kembaliListener);
    }

    public void setFieldDeskripsi(String deskripsi) {
        this.FieldDeskripsi.setText(deskripsi);
    }

    public void setFieldJumlah(String jumlah) {
        this.FieldJumlah.setText(jumlah);
    }

    public void setFieldKategori(String kategori) {
        this.FieldKategori.setText(kategori);
    }

    public void setFieldNama(String nama) {
        this.FieldNama.setText(nama);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKembali;
    private javax.swing.JLabel FieldDeskripsi;
    private javax.swing.JLabel FieldJumlah;
    private javax.swing.JLabel FieldKategori;
    private javax.swing.JLabel FieldNama;
    private javax.swing.JLabel LabelDeskripsi;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelKategori;
    private javax.swing.JLabel LabelNama;
    // End of variables declaration//GEN-END:variables
}
