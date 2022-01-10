package View;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TambahBarangView extends javax.swing.JFrame {

    public TambahBarangView() {
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
        ButtonTambahBarang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Barang");
        setResizable(false);

        LabelJudul.setText("Tambah Barang");

        LabelNama.setText("Nama");

        LabelDeskripsi.setText("Deskripsi");

        TextAreaDeskripsi.setColumns(20);
        TextAreaDeskripsi.setRows(5);
        jScrollPane1.setViewportView(TextAreaDeskripsi);

        LabelJumlah.setText("Jumlah");

        LabelKategori.setText("Kategori");

        ComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Pakaian", "Furnitur", "Elektronik" }));

        ButtonKembali.setText("Kembali");

        ButtonTambahBarang.setText("Tambah Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelJudul)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonTambahBarang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelNama)
                        .addGap(36, 36, 36)
                        .addComponent(TextFieldNama))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelKategori)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDeskripsi)
                            .addComponent(LabelJumlah))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldJumlah)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonTambahBarang)
                    .addComponent(ButtonKembali))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBarangView().setVisible(true);
            }
        });
    }
    
    public void addKembaliListener(ActionListener kembaliListener){
        this.ButtonKembali.addActionListener(kembaliListener);
    }
    public void addTambahListener(ActionListener tambahListener){
        this.ButtonTambahBarang.addActionListener(tambahListener);
    }
    public String getKategori() {
        return (String) ComboBoxKategori.getSelectedItem();
    }
    public String getDeskripsi() {
        return TextAreaDeskripsi.getText();
    }
    public String getJumlah() {
        return TextFieldJumlah.getText();
    }
    public String getNama() {
        return TextFieldNama.getText();
    }
    public void clearData(){
        this.TextFieldNama.setText("");
        this.TextAreaDeskripsi.setText("");
        this.TextFieldJumlah.setText("");
        this.ComboBoxKategori.setSelectedIndex(0);
    }
    public void showError(){
        JOptionPane.showMessageDialog(this, "Data tidak boleh ada yang kosong");
    }
    public void showSuccess(){
        JOptionPane.showMessageDialog(this, "Berhasil tambah barang!");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKembali;
    private javax.swing.JButton ButtonTambahBarang;
    private javax.swing.JComboBox<String> ComboBoxKategori;
    private javax.swing.JLabel LabelDeskripsi;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelKategori;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JTextArea TextAreaDeskripsi;
    private javax.swing.JTextField TextFieldJumlah;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
