package pekan7_2511533005;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SortingGUI_2511533005 extends JFrame {

	private static final long serialVersionUID = 1L;

	// ArrayList mahasiswa
	private ArrayList<Mahasiswa_2511533005> listMahasiswa_3005 = new ArrayList<>();

	// Komponen GUI
	private JTextField txtNama_3005;
	private JTextField txtNim_3005;
	private JTextField txtProdi_3005;
	private JButton btnTambah_3005;
	private JButton btnHapus_3005;
	private JButton btnSorting_3005;

	private JComboBox<String> comboSorting_3005;

	private JTable tableMahasiswa_3005;
	private DefaultTableModel modelTable_3005;

	private JTextArea txtArea_3005;

	// Constructor
	public SortingGUI_2511533005() {

		setTitle("Program Sorting Mahasiswa");
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		JPanel panelInput_3005 = new JPanel(new FlowLayout());
		panelInput_3005.add(new JLabel("Nama"));
		txtNama_3005 = new JTextField(10);
		panelInput_3005.add(txtNama_3005);

		panelInput_3005.add(new JLabel("NIM"));
		txtNim_3005 = new JTextField(10);
		panelInput_3005.add(txtNim_3005);

		panelInput_3005.add(new JLabel("Prodi"));
		txtProdi_3005 = new JTextField(10);
		panelInput_3005.add(txtProdi_3005);

		btnTambah_3005 = new JButton("Tambah Data");
		panelInput_3005.add(btnTambah_3005);

		btnHapus_3005 = new JButton("Hapus Data");
		panelInput_3005.add(btnHapus_3005);

		add(panelInput_3005, BorderLayout.NORTH);

		String[] kolom_3005 = {"Nama", "NIM", "Prodi"};
		modelTable_3005 = new DefaultTableModel(kolom_3005, 0);
		tableMahasiswa_3005 = new JTable(modelTable_3005);
		JScrollPane scrollTable_3005 = new JScrollPane(tableMahasiswa_3005);

		add(scrollTable_3005, BorderLayout.CENTER);

		JPanel panelBawah_3005 = new JPanel(new FlowLayout());
		
		comboSorting_3005 = new JComboBox<>();
		comboSorting_3005.addItem("Insertion Sort");
		comboSorting_3005.addItem("Selection Sort");
		comboSorting_3005.addItem("Bubble Sort");

		panelBawah_3005.add(new JLabel("Pilih Sorting"));
		panelBawah_3005.add(comboSorting_3005);

		btnSorting_3005 = new JButton("Mulai Sorting");
		panelBawah_3005.add(btnSorting_3005);

		add(panelBawah_3005, BorderLayout.SOUTH);

		txtArea_3005 = new JTextArea(20, 40);
		txtArea_3005.setEditable(false);
		txtArea_3005.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtArea_3005.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

		JScrollPane scrollText_3005 = new JScrollPane(txtArea_3005);

		add(scrollText_3005, BorderLayout.EAST);

		btnTambah_3005.addActionListener(e_3005 -> tambahData_2511533005());
		
		btnHapus_3005.addActionListener(e_3005 -> hapusData_2511533005());
		
		btnSorting_3005.addActionListener(e_3005 -> prosesSorting_2511533005());
	}
	private void tambahData_2511533005() {

		String nama_3005 = txtNama_3005.getText();
		String nim_3005 = txtNim_3005.getText();
		String prodi_3005 = txtProdi_3005.getText();

		if (nama_3005.isEmpty() || nim_3005.isEmpty() || prodi_3005.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
			return;
		}
		Mahasiswa_2511533005 mhs_3005 =
				new Mahasiswa_2511533005(nama_3005, nim_3005, prodi_3005);
		listMahasiswa_3005.add(mhs_3005);

		modelTable_3005.addRow(new Object[] {
				nama_3005,
				nim_3005,
				prodi_3005
		});

		txtNama_3005.setText("");
		txtNim_3005.setText("");
		txtProdi_3005.setText("");
	}
	private void hapusData_2511533005() {
		int index_3005 = tableMahasiswa_3005.getSelectedRow();
		if (index_3005 != -1) {
			listMahasiswa_3005.remove(index_3005);
			modelTable_3005.removeRow(index_3005);
		} else {
			JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
		}
	}
	private void prosesSorting_2511533005() {
		String pilihan_3005 =
				comboSorting_3005.getSelectedItem().toString();
		txtArea_3005.setText("");
		if (pilihan_3005.equals("Insertion Sort")) {
			insertionSort_2511533005();
		} else if (pilihan_3005.equals("Selection Sort")) {
			selectionSort_2511533005();
		} else {
			bubbleSort_2511533005();
		}
		updateTable_2511533005();
	}
	private void insertionSort_2511533005() {
		txtArea_3005.append("=== INSERTION SORT ===\n");
		for (int i_3005 = 1; i_3005 < listMahasiswa_3005.size(); i_3005++) {
			Mahasiswa_2511533005 key_3005 =
					listMahasiswa_3005.get(i_3005);
			int j_3005 = i_3005 - 1;
			while (j_3005 >= 0 &&
					listMahasiswa_3005.get(j_3005)
					.getNama_3005()
					.compareToIgnoreCase(key_3005.getNama_3005()) > 0) {
				listMahasiswa_3005.set(
						j_3005 + 1,
						listMahasiswa_3005.get(j_3005));
				j_3005--;
			}
			listMahasiswa_3005.set(j_3005 + 1, key_3005);
			txtArea_3005.append(
					"Langkah " + i_3005 + " : "
					+ listToString_2511533005() + "\n");
		}
	}
	private void selectionSort_2511533005() {
		txtArea_3005.append("=== SELECTION SORT ===\n");
		for (int i_3005 = 0;
				i_3005 < listMahasiswa_3005.size() - 1;
				i_3005++) {
			int minIndex_3005 = i_3005;
			for (int j_3005 = i_3005 + 1;
					j_3005 < listMahasiswa_3005.size();
					j_3005++) {
				if (listMahasiswa_3005.get(j_3005)
						.getNama_3005()
						.compareToIgnoreCase(
								listMahasiswa_3005.get(minIndex_3005)
								.getNama_3005()) < 0) {
					minIndex_3005 = j_3005;
				}
			}
			Mahasiswa_2511533005 temp_3005 =
					listMahasiswa_3005.get(i_3005);
			listMahasiswa_3005.set(
					i_3005,
					listMahasiswa_3005.get(minIndex_3005));
			listMahasiswa_3005.set(minIndex_3005, temp_3005);
			
			txtArea_3005.append(
					"Pass " + (i_3005 + 1) + " : "
					+ listToString_2511533005() + "\n");
		}
	}
	private void bubbleSort_2511533005() {

		txtArea_3005.append("=== BUBBLE SORT ===\n");

		for (int i_3005 = 0;
				i_3005 < listMahasiswa_3005.size() - 1;
				i_3005++) {

			for (int j_3005 = 0;
					j_3005 < listMahasiswa_3005.size() - i_3005 - 1;
					j_3005++) {

				if (listMahasiswa_3005.get(j_3005)
						.getNama_3005()
						.compareToIgnoreCase(
								listMahasiswa_3005.get(j_3005 + 1)
								.getNama_3005()) > 0) {

					Mahasiswa_2511533005 temp_3005 =
							listMahasiswa_3005.get(j_3005);
					listMahasiswa_3005.set(
							j_3005,
							listMahasiswa_3005.get(j_3005 + 1));
					listMahasiswa_3005.set(
							j_3005 + 1,
							temp_3005);
				}
			}
			txtArea_3005.append(
					"Pass " + (i_3005 + 1) + " : "
					+ listToString_2511533005() + "\n");
		}
	}
	private void updateTable_2511533005() {

		modelTable_3005.setRowCount(0);

		for (Mahasiswa_2511533005 mhs_3005 : listMahasiswa_3005) {

			modelTable_3005.addRow(new Object[] {

					mhs_3005.getNama_3005(),
					mhs_3005.getNim_3005(),
					mhs_3005.getProdi_3005()

			});
		}
	}
	private String listToString_2511533005() {
		String hasil_3005 = "[";
		for (int i_3005 = 0;
				i_3005 < listMahasiswa_3005.size();
				i_3005++) {
			hasil_3005 +=
					listMahasiswa_3005.get(i_3005)
					.getNama_3005();
			if (i_3005 != listMahasiswa_3005.size() - 1) {
				hasil_3005 += ", ";
			}
		}
		hasil_3005 += "]";
		return hasil_3005;
	}
	public static void main(String[] args) {
		new SortingGUI_2511533005().setVisible(true);
	}
}

