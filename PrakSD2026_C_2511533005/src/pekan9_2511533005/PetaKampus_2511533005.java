package pekan9_2511533005;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PetaKampus_2511533005 extends JFrame {
    private final Map<String, List<String>> adjList_3005 = new HashMap<>();
    private final Map<String, Point> positions_3005 = new HashMap<>();
    private JComboBox<String> cbStart_3005;
    private JComboBox<String> cbGoal_3005;
    private JTextArea txtResult_3005;
    private GraphPanel_3005 panelGraph_3005;
    private List<String> visitedNodes_3005 = new ArrayList<>();
    private List<String> pathNodes_3005 = new ArrayList<>();

    public PetaKampus_2511533005() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS STEI ITB");
        setSize(900, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel_3005 = new JPanel(new BorderLayout());
        mainPanel_3005.setBackground(new Color(235, 240, 245));
        setContentPane(mainPanel_3005);
        
        initGraph_3005();
        
        JPanel northContainer = new JPanel(new BorderLayout());
        northContainer.setOpaque(false);

        JPanel banner_3005 = new JPanel(new BorderLayout());
        banner_3005.setBackground(new Color(27, 79, 114));
        banner_3005.setPreferredSize(new Dimension(900, 45));
        
        JLabel lblTitle_3005 = new JLabel("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS STEI ITB", JLabel.CENTER);
        lblTitle_3005.setFont(new Font("SansSerif", Font.BOLD, 16));
        lblTitle_3005.setForeground(Color.WHITE);
        banner_3005.add(lblTitle_3005, BorderLayout.CENTER);
        
        northContainer.add(banner_3005, BorderLayout.NORTH);

        JPanel topPanel_3005 = new JPanel(new GridBagLayout());
        topPanel_3005.setOpaque(false); 
        topPanel_3005.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        GridBagConstraints gbc_3005 = new GridBagConstraints();
        gbc_3005.insets = new Insets(5, 5, 5, 5);
        gbc_3005.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblStart_3005 = new JLabel("Lokasi Awal  : [");
        lblStart_3005.setFont(new Font("SansSerif", Font.BOLD, 14));
        gbc_3005.gridx = 0; gbc_3005.gridy = 0;
        topPanel_3005.add(lblStart_3005, gbc_3005);

        String[] nodesArray_3005 = adjList_3005.keySet().toArray(new String[0]);
        Arrays.sort(nodesArray_3005);
        cbStart_3005 = new JComboBox<>(nodesArray_3005);
        cbStart_3005.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc_3005.gridx = 1; gbc_3005.gridy = 0;
        topPanel_3005.add(cbStart_3005, gbc_3005);

        JLabel lblClose1_3005 = new JLabel("]");
        lblClose1_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 2; gbc_3005.gridy = 0;
        topPanel_3005.add(lblClose1_3005, gbc_3005);

        JLabel lblGoal_3005 = new JLabel("Lokasi Tujuan : [");
        lblGoal_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 0; gbc_3005.gridy = 1;
        topPanel_3005.add(lblGoal_3005, gbc_3005);

        cbGoal_3005 = new JComboBox<>(nodesArray_3005);
        cbGoal_3005.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc_3005.gridx = 1; gbc_3005.gridy = 1;
        topPanel_3005.add(cbGoal_3005, gbc_3005);

        JLabel lblClose2_3005 = new JLabel("]");
        lblClose2_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 2; gbc_3005.gridy = 1;
        topPanel_3005.add(lblClose2_3005, gbc_3005);

        JButton btnBfs_3005 = new JButton("[ BFS ]");
        btnBfs_3005.setBackground(new Color(144, 238, 144));
        btnBfs_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 3; gbc_3005.gridy = 0; gbc_3005.gridheight = 2;
        gbc_3005.ipadx = 20; gbc_3005.ipady = 10;
        topPanel_3005.add(btnBfs_3005, gbc_3005);

        JButton btnDfs_3005 = new JButton("[ DFS ]");
        btnDfs_3005.setBackground(new Color(255, 203, 114));
        btnDfs_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 4; gbc_3005.gridy = 0;
        topPanel_3005.add(btnDfs_3005, gbc_3005);

        JButton btnReset_3005 = new JButton("[ RESET ]");
        btnReset_3005.setBackground(new Color(240, 128, 128));
        btnReset_3005.setFont(new Font("Arial", Font.BOLD, 14));
        gbc_3005.gridx = 5; gbc_3005.gridy = 0;
        topPanel_3005.add(btnReset_3005, gbc_3005);
        
        northContainer.add(topPanel_3005, BorderLayout.CENTER);
        mainPanel_3005.add(northContainer, BorderLayout.NORTH);

        JPanel centerWrapper = new JPanel(new BorderLayout());
        centerWrapper.setOpaque(false);
        centerWrapper.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));
        
        panelGraph_3005 = new GraphPanel_3005();
        centerWrapper.add(panelGraph_3005, BorderLayout.CENTER);
        mainPanel_3005.add(centerWrapper, BorderLayout.CENTER);

        JPanel southPanel_3005 = new JPanel(new BorderLayout());
        southPanel_3005.setOpaque(false);
        southPanel_3005.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        txtResult_3005 = new JTextArea(4, 50);
        txtResult_3005.setEditable(false);
        txtResult_3005.setOpaque(false); 
        txtResult_3005.setFont(new Font("Monospaced", Font.BOLD, 16));
        resetGraph_3005(); 

        southPanel_3005.add(txtResult_3005, BorderLayout.CENTER);
        mainPanel_3005.add(southPanel_3005, BorderLayout.SOUTH);

        btnBfs_3005.addActionListener(e -> BFS_3005());
        btnDfs_3005.addActionListener(e -> DFS_3005());
        btnReset_3005.addActionListener(e -> resetGraph_3005());
    }
    
    private void initGraph_3005() {
        positions_3005.put("LabDasar", new Point(220, 120));
        positions_3005.put("STEILab", new Point(450, 120));
        positions_3005.put("LabAI", new Point(680, 120));
        positions_3005.put("LabSinyal", new Point(220, 230));
        positions_3005.put("RuangDosen", new Point(450, 230));
        positions_3005.put("LabJaringan", new Point(680, 230));   
        positions_3005.put("PerpusSTEI", new Point(220, 340));
        positions_3005.put("TataUsaha", new Point(450, 340));
        positions_3005.put("AulaTimur", new Point(680, 340));      
        positions_3005.put("LabRobotik", new Point(450, 440)); 
        for (String node : positions_3005.keySet()) {
            adjList_3005.put(node, new ArrayList<>());
        }
        addEdge_3005("LabDasar", "STEILab");
        addEdge_3005("LabDasar", "LabSinyal");
        addEdge_3005("STEILab", "LabAI");
        addEdge_3005("STEILab", "RuangDosen");
        addEdge_3005("LabAI", "LabJaringan");
        addEdge_3005("LabSinyal", "RuangDosen");
        addEdge_3005("LabSinyal", "PerpusSTEI");
        addEdge_3005("RuangDosen", "LabJaringan");
        addEdge_3005("RuangDosen", "TataUsaha");
        addEdge_3005("LabJaringan", "AulaTimur");
        addEdge_3005("PerpusSTEI", "TataUsaha");
        addEdge_3005("TataUsaha", "AulaTimur");
        addEdge_3005("PerpusSTEI", "LabRobotik");
        addEdge_3005("TataUsaha", "LabRobotik");
        addEdge_3005("AulaTimur", "LabRobotik");
    }
    
    private void addEdge_3005(String u, String v) {
        adjList_3005.get(u).add(v);
        adjList_3005.get(v).add(u);
    }
    
    public void BFS_3005() {
        visitedNodes_3005.clear();
        pathNodes_3005.clear();
        String start_3005 = (String) cbStart_3005.getSelectedItem();
        String goal_3005 = (String) cbGoal_3005.getSelectedItem();
        Queue<String> queue_3005 = new LinkedList<>();
        Map<String, String> parentMap_3005 = new HashMap<>();

        queue_3005.add(start_3005);
        visitedNodes_3005.add(start_3005);
        boolean found_3005 = false;
        while (!queue_3005.isEmpty()) {
            String current_3005 = queue_3005.poll();
            if (current_3005.equals(goal_3005)) {
                found_3005 = true;
                break;
            }
            List<String> neighbors_3005 = new ArrayList<>(adjList_3005.get(current_3005));
            Collections.sort(neighbors_3005);
            for (String neighbor_3005 : neighbors_3005) {
                if (!visitedNodes_3005.contains(neighbor_3005)) {
                    visitedNodes_3005.add(neighbor_3005);
                    parentMap_3005.put(neighbor_3005, current_3005);
                    queue_3005.add(neighbor_3005);
                }
            }
        }
        if (found_3005) {
            displayPath_3005(parentMap_3005, start_3005, goal_3005, "BFS");
        } else {
            txtResult_3005.setText("Hasil Pencarian : BFS\nJalur : Tidak Ditemukan\nNode Dikunjungi : " + visitedNodes_3005 + "\nJumlah Node Dikunjungi : " + visitedNodes_3005.size());
        }
        panelGraph_3005.repaint();
    }
    
    public void DFS_3005() {
        visitedNodes_3005.clear();
        pathNodes_3005.clear();
        String start_3005 = (String) cbStart_3005.getSelectedItem();
        String goal_3005 = (String) cbGoal_3005.getSelectedItem();
        Stack<String> stack_3005 = new Stack<>();
        Map<String, String> parentMap_3005 = new HashMap<>();
        stack_3005.push(start_3005);
        boolean found_3005 = false;

        while (!stack_3005.isEmpty()) {
            String current_3005 = stack_3005.pop();
            if (!visitedNodes_3005.contains(current_3005)) {
                visitedNodes_3005.add(current_3005);
            }
            if (current_3005.equals(goal_3005)) {
                found_3005 = true;
                break;
            }
            List<String> neighbors_3005 = new ArrayList<>(adjList_3005.get(current_3005));
            neighbors_3005.sort(Collections.reverseOrder());
            for (String neighbor_3005 : neighbors_3005) {
                if (!visitedNodes_3005.contains(neighbor_3005)) {
                    parentMap_3005.put(neighbor_3005, current_3005);
                    stack_3005.push(neighbor_3005);
                }
            }
        }
        if (found_3005) {
            displayPath_3005(parentMap_3005, start_3005, goal_3005, "DFS");
        } else {
            txtResult_3005.setText("Hasil Pencarian : DFS\nJalur : Tidak Ditemukan\nNode Dikunjungi : " + visitedNodes_3005 + "\nJumlah Node Dikunjungi : " + visitedNodes_3005.size());
        }
        panelGraph_3005.repaint();
    }    
    
    public void displayPath_3005(Map<String, String> parentMap, String start, String goal, String method) {
        String curr_3005 = goal;
        while (curr_3005 != null) {
            pathNodes_3005.add(0, curr_3005);
            curr_3005 = parentMap.get(curr_3005);
        }
        StringBuilder sb_3005 = new StringBuilder();
        sb_3005.append("Hasil Pencarian : ").append(method).append("\n");
        sb_3005.append("Jalur : ");
        for (int i = 0; i < pathNodes_3005.size(); i++) {
            sb_3005.append(pathNodes_3005.get(i));
            if (i < pathNodes_3005.size() - 1) sb_3005.append(" -> ");
        }
        sb_3005.append("\nNode Dikunjungi : ");
        for (int i = 0; i < visitedNodes_3005.size(); i++) {
            sb_3005.append(visitedNodes_3005.get(i));
            if (i < visitedNodes_3005.size() - 1) sb_3005.append(", ");
        }
        sb_3005.append("\nJumlah Node Dikunjungi : ").append(visitedNodes_3005.size());
        txtResult_3005.setText(sb_3005.toString());
    }  
    
    public void resetGraph_3005() {
        visitedNodes_3005.clear();
        pathNodes_3005.clear();
        txtResult_3005.setText("Hasil Pencarian : \nJalur : \nNode Dikunjungi : \nJumlah Node Dikunjungi : 0");
        if (panelGraph_3005 != null) panelGraph_3005.repaint();
    }   
    
    private class GraphPanel_3005 extends JPanel {
        public GraphPanel_3005() {
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d_3005 = (Graphics2D) g;
            g2d_3005.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            g2d_3005.setColor(new Color(200, 200, 200));
            g2d_3005.setStroke(new BasicStroke(1.5f));
            g2d_3005.drawRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 15, 15);
            
            g2d_3005.setColor(Color.BLACK);
            g2d_3005.setFont(new Font("Monospaced", Font.BOLD, 16));
            g2d_3005.drawString("VISUALISASI GRAPH", 20, 30);

            Set<String> drawnEdges_3005 = new HashSet<>();
            float[] dashPattern_3005 = {10.0f, 6.0f}; 
            Stroke dashedStroke_3005 = new BasicStroke(1.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dashPattern_3005, 0.0f);
            Stroke solidStroke_3005 = new BasicStroke(3.0f);
            
            for (String u_3005 : adjList_3005.keySet()) {
                Point pU_3005 = positions_3005.get(u_3005);
                for (String v_3005 : adjList_3005.get(u_3005)) {
                    String edgeKey_3005 = u_3005.compareTo(v_3005) < 0 ? u_3005 + "-" + v_3005 : v_3005 + "-" + u_3005;
                    if (!drawnEdges_3005.contains(edgeKey_3005)) {
                        Point pV_3005 = positions_3005.get(v_3005);
                        boolean isEdgeInPath = false;
                        if (pathNodes_3005.contains(u_3005) && pathNodes_3005.contains(v_3005)) {
                            int idxU = pathNodes_3005.indexOf(u_3005);
                            int idxV = pathNodes_3005.indexOf(v_3005);
                            if (Math.abs(idxU - idxV) == 1) {
                                isEdgeInPath = true;
                            }
                        }

                        if (isEdgeInPath) {
                            g2d_3005.setColor(Color.BLUE);
                            g2d_3005.setStroke(solidStroke_3005);
                        } else {
                            g2d_3005.setColor(Color.BLACK);
                            g2d_3005.setStroke(dashedStroke_3005);
                        }
                        g2d_3005.drawLine(pU_3005.x, pU_3005.y, pV_3005.x, pV_3005.y);
                        drawnEdges_3005.add(edgeKey_3005);
                    }
                }
            }
            
            g2d_3005.setFont(new Font("Monospaced", Font.BOLD, 14));
            FontMetrics fm_3005 = g2d_3005.getFontMetrics();
            for (Map.Entry<String, Point> entry_3005 : positions_3005.entrySet()) {
                String nodeName_3005 = entry_3005.getKey();
                Point p_3005 = entry_3005.getValue();
                int textWidth = fm_3005.stringWidth(nodeName_3005);
                int textHeight = fm_3005.getHeight();
                int textX = p_3005.x - (textWidth / 2);
                int textY = p_3005.y + (textHeight / 4);
                
                if (pathNodes_3005.contains(nodeName_3005)) {
                    g2d_3005.setColor(new Color(144, 238, 144)); 
                    g2d_3005.fillRect(textX - 4, p_3005.y - (textHeight/2), textWidth + 8, textHeight);
                } else if (visitedNodes_3005.contains(nodeName_3005)) {
                    g2d_3005.setColor(new Color(255, 182, 193)); 
                    g2d_3005.fillRect(textX - 4, p_3005.y - (textHeight/2), textWidth + 8, textHeight);
                } else {
                    g2d_3005.setColor(Color.WHITE); 
                    g2d_3005.fillRect(textX - 4, p_3005.y - (textHeight/2), textWidth + 8, textHeight);
                }
                g2d_3005.setColor(Color.BLACK);
                g2d_3005.drawString(nodeName_3005, textX, textY);
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511533005().setVisible(true);
        });
    }
}