package pekan8_2511533005;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BubbleSortGUI_2511533005 extends JFrame {

	private static final long serialVersionUID = 1L;

	private int[] array_3005;
	private JLabel[] labelArray_3005;

	private JButton stepButton_3005;
	private JButton resetButton_3005;
	private JButton setButton_3005;

	private JTextField inputField_3005;

	private JPanel panelArray_3005;

	private JTextArea stepArea_3005;

	private int i_3005 = 1;
	private int j_3005 = 0;

	private boolean sorting_3005 = false;

	private int stepCount_3005 = 1;

	public BubbleSortGUI_2511533005() {

		setTitle("Bubble Sort Langkah per Langkah");

		setSize(900, 450);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		// PANEL INPUT
		JPanel inputPanel_3005 =
				new JPanel(new FlowLayout());

		inputField_3005 =
				new JTextField(30);

		setButton_3005 =
				new JButton("Set Array");

		inputPanel_3005.add(
				new JLabel(
				"Masukkan angka (pisahkan dengan koma): "));

		inputPanel_3005.add(inputField_3005);

		inputPanel_3005.add(setButton_3005);

		// PANEL ARRAY
		panelArray_3005 =
				new JPanel(new FlowLayout());

		// PANEL CONTROL
		JPanel controlPanel_3005 =
				new JPanel();

		stepButton_3005 =
				new JButton("Langkah Selanjutnya");

		resetButton_3005 =
				new JButton("Reset");

		stepButton_3005.setEnabled(false);

		controlPanel_3005.add(stepButton_3005);

		controlPanel_3005.add(resetButton_3005);

		// TEXT AREA
		stepArea_3005 =
				new JTextArea(10, 57);

		stepArea_3005.setEditable(false);

		stepArea_3005.setFont(
				new Font(
				"Monospaced",
				Font.PLAIN,
				14));

		JScrollPane scrollPane_3005 =
				new JScrollPane(stepArea_3005);

		// TAMBAHKAN KE FRAME
		add(inputPanel_3005,
				BorderLayout.NORTH);

		add(panelArray_3005,
				BorderLayout.CENTER);

		add(controlPanel_3005,
				BorderLayout.SOUTH);

		add(scrollPane_3005,
				BorderLayout.EAST);

		// EVENT
		setButton_3005.addActionListener(
				e_3005 ->
				setArrayFromInput_2511533005());

		stepButton_3005.addActionListener(
				e_3005 ->
				performStep_2511533005());

		resetButton_3005.addActionListener(
				e_3005 ->
				reset_2511533005());
	}

	private void setArrayFromInput_2511533005() {

		String text_3005 =
				inputField_3005.getText().trim();

		if (text_3005.isEmpty()) {

			return;
		}

		String[] parts_3005 =
				text_3005.split(",");

		array_3005 =
				new int[parts_3005.length];

		try {

			for (int k_3005 = 0;
					k_3005 < parts_3005.length;
					k_3005++) {

				array_3005[k_3005] =
						Integer.parseInt(
						parts_3005[k_3005].trim());
			}

		} catch (NumberFormatException e_3005) {

			JOptionPane.showMessageDialog(
					this,
					"Masukkan hanya angka yang dipisahkan koma!",
					"Error",
					JOptionPane.ERROR_MESSAGE);

			return;
		}

		i_3005 = 1;

		j_3005 = 0;

		stepCount_3005 = 1;

		sorting_3005 = true;

		stepButton_3005.setEnabled(true);

		stepArea_3005.setText("");

		panelArray_3005.removeAll();

		labelArray_3005 =
				new JLabel[array_3005.length];

		for (int k_3005 = 0;
				k_3005 < array_3005.length;
				k_3005++) {

			labelArray_3005[k_3005] =
					new JLabel(
					String.valueOf(array_3005[k_3005]));

			labelArray_3005[k_3005].setFont(
					new Font(
					"Arial",
					Font.BOLD,
					24));

			labelArray_3005[k_3005].setOpaque(true);

			labelArray_3005[k_3005]
					.setBackground(Color.WHITE);

			labelArray_3005[k_3005].setBorder(
					BorderFactory.createLineBorder(
					Color.BLACK));

			labelArray_3005[k_3005]
					.setPreferredSize(
					new Dimension(50, 50));

			labelArray_3005[k_3005]
					.setHorizontalAlignment(
					SwingConstants.CENTER);

			panelArray_3005.add(
					labelArray_3005[k_3005]);
		}

		panelArray_3005.revalidate();

		panelArray_3005.repaint();
	}

	private void performStep_2511533005() {

		if (!sorting_3005 ||
				i_3005 >= array_3005.length) {

			sorting_3005 = false;

			stepButton_3005.setEnabled(false);

			JOptionPane.showMessageDialog(
					this,
					"Sorting selesai!");

			return;
		}

		resetHighlights_2511533005();

		StringBuilder stepLog_3005 =
				new StringBuilder();

		labelArray_3005[j_3005]
				.setBackground(Color.CYAN);

		labelArray_3005[j_3005 + 1]
				.setBackground(Color.CYAN);

		if (array_3005[j_3005] >
				array_3005[j_3005 + 1]) {

			int temp_3005 =
					array_3005[j_3005];

			array_3005[j_3005] =
					array_3005[j_3005 + 1];

			array_3005[j_3005 + 1] =
					temp_3005;

			labelArray_3005[j_3005]
					.setBackground(Color.RED);

			labelArray_3005[j_3005 + 1]
					.setBackground(Color.RED);

			stepLog_3005.append("Langkah ")
					.append(stepCount_3005)
					.append(": Menukar elemen ke-")
					.append(j_3005)
					.append(" (")
					.append(array_3005[j_3005 + 1])
					.append(") dengan elemen ke-")
					.append(j_3005 + 1)
					.append(" (")
					.append(array_3005[j_3005])
					.append(")\n");

		} else {

			stepLog_3005.append("Langkah ")
					.append(stepCount_3005)
					.append(": Tidak ada pertukaran antara ke-")
					.append(j_3005)
					.append(" dan ke-")
					.append(j_3005 + 1)
					.append("\n");
		}

		updateLabels_2511533005();

		stepLog_3005.append("Hasil: ")
				.append(arrayToString_2511533005(array_3005))
				.append("\n\n");

		stepArea_3005.append(
				stepLog_3005.toString());

		j_3005++;

		if (j_3005 >=
				array_3005.length - i_3005 - 1) {

			j_3005 = 0;

			i_3005++;
		}

		stepCount_3005++;
	}

	private void updateLabels_2511533005() {

		for (int k_3005 = 0;
				k_3005 < array_3005.length;
				k_3005++) {

			labelArray_3005[k_3005]
					.setText(
					String.valueOf(array_3005[k_3005]));
		}
	}

	private void resetHighlights_2511533005() {

		for (JLabel label_3005 : labelArray_3005) {

			label_3005.setBackground(Color.WHITE);
		}
	}

	private void reset_2511533005() {

		inputField_3005.setText("");

		panelArray_3005.removeAll();

		panelArray_3005.revalidate();

		panelArray_3005.repaint();

		stepArea_3005.setText("");

		stepButton_3005.setEnabled(false);

		sorting_3005 = false;

		i_3005 = 1;

		j_3005 = 0;

		stepCount_3005 = 1;
	}

	private String arrayToString_2511533005(
			int[] arr_3005) {

		StringBuilder sb_3005 =
				new StringBuilder();

		for (int k_3005 = 0;
				k_3005 < arr_3005.length;
				k_3005++) {

			sb_3005.append(arr_3005[k_3005]);

			if (k_3005 <
					arr_3005.length - 1) {

				sb_3005.append(", ");
			}
		}

		return sb_3005.toString();
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {

			BubbleSortGUI_2511533005 gui_3005 =
					new BubbleSortGUI_2511533005();

			gui_3005.setVisible(true);
		});
	}
}