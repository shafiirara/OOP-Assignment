import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class DataMahasiswaFrame extends JFrame {

    private JTextField fieldNim;
    private JTextField fieldNama;
    private JComboBox<String> comboProdi;
    private JTextArea areaDaftar;
    private JButton tombolSimpan;
    private JButton tombolResetForm;
    private JButton tombolResetSemua;

    public DataMahasiswaFrame() {
        setTitle("Pendataan Mahasiswa");
        setSize(540, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panelUtama = new JPanel(new BorderLayout(10, 10));
        panelUtama.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        JPanel panelInput = new JPanel(new GridLayout(3, 2, 8, 8));
        panelInput.setBorder(BorderFactory.createTitledBorder("Form Input"));

        fieldNim = new JTextField();
        fieldNama = new JTextField();
        String[] prodi = {
            "Teknik Informatika",
            "Sistem Informasi",
            "Teknik Komputer",
            "Ilmu Komputer"
        };
        comboProdi = new JComboBox<>(prodi);

        panelInput.add(new JLabel("NIM"));
        panelInput.add(fieldNim);
        panelInput.add(new JLabel("Nama"));
        panelInput.add(fieldNama);
        panelInput.add(new JLabel("Program Studi"));
        panelInput.add(comboProdi);

        areaDaftar = new JTextArea();
        areaDaftar.setEditable(false);
        JPanel panelDaftar = new JPanel(new BorderLayout());
        panelDaftar.setBorder(BorderFactory.createTitledBorder("Daftar Mahasiswa"));
        panelDaftar.add(new JScrollPane(areaDaftar), BorderLayout.CENTER);

        tombolResetSemua = new JButton("Reset Semua");
        tombolResetForm = new JButton("Reset Form");
        tombolSimpan = new JButton("Simpan");

        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 4));
        panelTombol.add(tombolResetSemua);
        panelTombol.add(tombolResetForm);
        panelTombol.add(tombolSimpan);

        panelUtama.add(panelInput, BorderLayout.NORTH);
        panelUtama.add(panelDaftar, BorderLayout.CENTER);
        panelUtama.add(panelTombol, BorderLayout.SOUTH);
        add(panelUtama);

        tombolSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = fieldNim.getText().trim();
                String nama = fieldNama.getText().trim();
                String jurusan = (String) comboProdi.getSelectedItem();

                if (nim.isEmpty() || nama.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        DataMahasiswaFrame.this,
                        "NIM dan Nama tidak boleh kosong.",
                        "Peringatan",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                areaDaftar.append(nim + " | " + nama + " | " + jurusan + "\n");
                bersihkanInput();
            }
        });

        tombolResetForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bersihkanInput();
            }
        });

        tombolResetSemua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jawab = JOptionPane.showConfirmDialog(
                    DataMahasiswaFrame.this,
                    "Hapus semua data di daftar dan kosongkan form?",
                    "Konfirmasi Reset",
                    JOptionPane.YES_NO_OPTION
                );
                if (jawab == JOptionPane.YES_OPTION) {
                    bersihkanInput();
                    areaDaftar.setText("");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int keluar = JOptionPane.showConfirmDialog(
                    DataMahasiswaFrame.this,
                    "Tutup aplikasi?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION
                );
                if (keluar == JOptionPane.YES_OPTION) {
                    dispose();
                    System.exit(0);
                }
            }
        });
    }

    private void bersihkanInput() {
        fieldNim.setText("");
        fieldNama.setText("");
        comboProdi.setSelectedIndex(0);
        fieldNim.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataMahasiswaFrame().setVisible(true);
            }
        });
    }
}