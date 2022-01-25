import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class tugas4 extends javax.swing.JFrame {
DefaultTableModel model = new DefaultTableModel();
String kdmatkul=””;
int nilai;
public tugas4() {
initComponents();
model.addColumn(“NPM”);
model.addColumn(“Nama”);
model.addColumn(“Mata Kuliah”);
model.addColumn(“Nilai”);
model.addColumn(“Huruf”);
model.addColumn(“Keterangan”);

jTable1.setModel(model);

}
private void cb(){
kdmatkul=String.valueOf(cbkdmatkul.getSelectedItem());
txtnamamatkul.setText(kdmatkul);
}
private void hitung(){
int nilai=Integer.parseInt(txtnilai.getText());
if(nilai>=90)
{
txthuruf.setText(“A”);
txtket.setText(“LULUS”);
}
else
if(nilai>=80)
{
txthuruf.setText(“B”);
txtket.setText(“LULUS”);
}
else
if(nilai>=70)
{
txthuruf.setText(“C”);
txtket.setText(“LULUS”);
}
else
if(nilai>=60)
{
txthuruf.setText(“D”);
txtket.setText(“GAGAL”);
}
else if (nilai<60){
txthuruf.setText(“E”);
txtket.setText(“GAGAL”);
}

}
private void add(){
String npm = txtnpm.getText();
String nama = txtnama.getText();
String matkul = txtnamamatkul.getText();
String nilai2 = txtnilai.getText();
String huruf = txthuruf.getText();
String ket = txtket.getText();

if(npm.equals(“”)|| nama.equals(“”)|matkul.equals(“”)|nilai2.equals(“”)|huruf.equals(“”)|ket.equals(“”)){
JOptionPane.showMessageDialog(null, “Masukkan data dengan benar !”,”Error”,JOptionPane.ERROR_MESSAGE);
return;
}
Object [] data = {npm,nama,matkul,nilai2,huruf,ket};
model.addRow(data);
}

private void initComponents() {

jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
txtnama = new javax.swing.JTextField();
txtnamamatkul = new javax.swing.JTextField();
txtnpm = new javax.swing.JTextField();
cbkdmatkul = new javax.swing.JComboBox();
txtdosen = new javax.swing.JTextField();
txtket = new javax.swing.JTextField();
jLabel6 = new javax.swing.JLabel();
txtnilai = new javax.swing.JTextField();
jLabel7 = new javax.swing.JLabel();
txthuruf = new javax.swing.JTextField();
btnsimpan = new javax.swing.JButton();
jScrollPane1 = new javax.swing.JScrollPane();
jTable1 = new javax.swing.JTable();

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

jLabel1.setText(“NPM”);

jLabel2.setText(“Nama Mahasiswa”);

jLabel3.setText(“Kode Matakuliah”);

jLabel4.setText(“Dosen”);

jLabel5.setText(“Keterangan”);

cbkdmatkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { “MKK-C614 Pemrograman Visual”, “MKK-C615 Pemrograman Web”, “MKK-C616 Pemrograman Grafik”, “MKK-C617 Pemrograman Objek” }));
cbkdmatkul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
cbkdmatkul.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
cbkdmatkulActionPerformed(evt);
}
});

jLabel6.setText(“Nilai”);
txtnilai.addKeyListener(new java.awt.event.KeyAdapter() {

public void keyReleased(java.awt.event.KeyEvent evt) {
txtnilaiKeyReleased(evt);
}

});

jLabel7.setText(“Nilai Huruf”);

btnsimpan.setText(“Simpan”);
btnsimpan.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
add();

}
});

jTable1.setModel(new javax.swing.table.DefaultTableModel(
new Object [][] {
{null, null, null, null},
{null, null, null, null},
{null, null, null, null},
{null, null, null, null}
},
new String [] {
“Title 1”, “Title 2”, “Title 3”, “Title 4”
}
));
jScrollPane1.setViewportView(jTable1);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
.addContainerGap()
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(0, 0, Short.MAX_VALUE)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(89, 89, 89)
.addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel2)
.addGap(28, 28, 28)
.addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel3)
.addGap(28, 28, 28)
.addComponent(cbkdmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(10, 10, 10)
.addComponent(txtnamamatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel4)
.addGap(80, 80, 80)
.addComponent(txtdosen, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(layout.createSequentialGroup()
.addComponent(jLabel6)
.addGap(91, 91, 91)
.addComponent(txtnilai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(50, 50, 50)
.addComponent(jLabel7)
.addGap(51, 51, 51)
.addComponent(txthuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(50, 50, 50)
.addComponent(jLabel5)
.addGap(44, 44, 44)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtket, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
.addContainerGap())
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addGap(44, 44, 44)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(10, 10, 10)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(10, 10, 10)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(cbkdmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtnamamatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(10, 10, 10)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtdosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(10, 10, 10)
.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtnilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txthuruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(txtket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(btnsimpan)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);

pack();
}// </editor-fold>

private void cbkdmatkulActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
cb();

}

private void txtnilaiKeyReleased(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
hitung();

}

public static void main(String args[]) {

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if (“Nimbus”.equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(tugas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(tugas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(tugas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(tugas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>

/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new tugas4().setVisible(true);
}
});
}

// Variables declaration – do not modify
private javax.swing.JButton btnsimpan;
private javax.swing.JComboBox cbkdmatkul;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable jTable1;
private javax.swing.JTextField txtdosen;
private javax.swing.JTextField txthuruf;
private javax.swing.JTextField txtket;
private javax.swing.JTextField txtnama;
private javax.swing.JTextField txtnamamatkul;
private javax.swing.JTextField txtnilai;
private javax.swing.JTextField txtnpm;
// End of variables declaration
}