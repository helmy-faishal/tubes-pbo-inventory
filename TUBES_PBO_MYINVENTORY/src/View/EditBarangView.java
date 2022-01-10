package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EditBarangView extends javax.swing.JFrame {

    public EditBarangView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelJudul = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelDeskripsi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDeskripsi = new javax.swing.JTextArea();
        TextFieldNama = new javax.swing.JTextField();
        LabelJumlah = new javax.swing.JLabel();
        TextFieldJumlah = new javax.swing.JTextField();
        LabelKategori = new javax.swing.JLabel();
        ComboBoxKategori = new javax.swing.JComboBox<>();
        ButtonKembali = new javax.swing.JButton();
        ButtonEditBarang = new javax.swing.JButton();
        TextFieldCariBarang = new javax.swing.JTextField();
        ButtonCariBarang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Barang");
        setResizable(false);

        LabelJudul.setText("Edit Barang");

        LabelNama.setText("Nama");

        LabelDeskripsi.setText("Deskripsi");

        TextAreaDeskripsi.setColumns(20);
        TextAreaDeskripsi.setRows(5);
        jScrollPane1.setViewportView(TextAreaDeskripsi);

        LabelJumlah.setText("Jumlah");

        LabelKategori.setText("Kategori");

        ComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Pakaian", "Furnitur", "Elektronik" }));

        ButtonKembali.setText("Kembali");

        ButtonEditBarang.setText("Edit Barang");

        ButtonCariBarang.setText("Cari Barang");

        jLabel1.setText("Hasil Pencarian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDeskripsi)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonKembali)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonEditBarang))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNama)
                                .addGap(36, 36, 36)
                                .addComponent(TextFieldNama))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextFieldCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCariBarang))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(LabelJudul)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelJumlah)
                                .addGap(29, 29, 29)
                                .addComponent(TextFieldJumlah))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelKategori)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCariBarang))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDeskripsi)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJumlah)
                    .addComponent(TextFieldJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelKategori)
                    .addComponent(ComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonKembali)
                    .addComponent(ButtonEditBarang))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBarangView().setVisible(true);
            }
        });
    }
    public void setKategori(String kategori) {
        this.ComboBoxKategori.setSelectedItem(kategori);
    }
    public void setDeskripsi(String deskripsi) {
        this.TextAreaDeskripsi.setText(deskripsi);
    }
    public void setJumlah(String jumlah) {
        this.TextFieldJumlah.setText(jumlah);
    }
    public void setNama(String nama) {
        this.TextFieldNama.setText(nama);
    }

    public String getKategori() {
        return (String) ComboBoxKategori.getSelectedItem();
    }
    public String getDeskripsi() {
        return TextAreaDeskripsi.getText();
    }
    public String getCariBarang() {
        return TextFieldCariBarang.getText();
    }
    public String getJumlah() {
        return TextFieldJumlah.getText();
    }
    public String getNama() {
        return TextFieldNama.getText();
    }
    public void addKembaliListener(ActionListener kembaliListener){
        this.ButtonKembali.addActionListener(kembaliListener);
    }
    public void addEditListener(ActionListener editListener){
        this.ButtonEditBarang.addActionListener(editListener);
    }
    public void addCariListener(ActionListener cariListener){
        this.ButtonCariBarang.addActionListener(cariListener);
    }
    public void showErrorNotFound(){
        JOptionPane.showMessageDialog(this, "Data tidak tidak ditemukan");
    }
    public void showSuccess(){
        JOptionPane.showMessageDialog(this, "Berhasil ubah barang!");
    }
    public void showError(){
        JOptionPane.showMessageDialog(this, "Data tidak boleh ada yang kosong");
    }
    public void showWarning(){
        JOptionPane.showMessageDialog(this, "Silahkan cari barang yang ingin diedit terlebih dahulu!");
    }
    public void clearData(){
        this.TextFieldNama.setText("");
        this.TextAreaDeskripsi.setText("");
        this.TextFieldJumlah.setText("");
        this.ComboBoxKategori.setSelectedIndex(0);
        this.TextFieldCariBarang.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCariBarang;
    private javax.swing.JButton ButtonEditBarang;
    private javax.swing.JButton ButtonKembali;
    private javax.swing.JComboBox<String> ComboBoxKategori;
    private javax.swing.JLabel LabelDeskripsi;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelKategori;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JTextArea TextAreaDeskripsi;
    private javax.swing.JTextField TextFieldCariBarang;
    private javax.swing.JTextField TextFieldJumlah;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
