public WordCounter() {
    setTitle("Word Counter");
    setSize(600, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JLabel topLabel = new JLabel("Enter text below or upload a file:", JLabel.CENTER);
    topLabel.setFont(new Font("Arial", Font.BOLD, 16));
    add(topLabel, BorderLayout.NORTH);

    textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    add(scrollPane, BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    countButton = new JButton("Count Words");
    uploadButton = new JButton("Upload File");

    countButton.setBackground(Color.CYAN);
    uploadButton.setBackground(Color.PINK);

    countButton.addActionListener(this);
    uploadButton.addActionListener(this);

    buttonPanel.add(countButton);
    buttonPanel.add(uploadButton);
    add(buttonPanel, BorderLayout.SOUTH);

    JPanel statusPanel = new JPanel();
    wordLabel = new JLabel("Words: 0  ");
    charLabel = new JLabel("Characters: 0");
    statusPanel.add(wordLabel);
    statusPanel.add(charLabel);
    add(statusPanel, BorderLayout.PAGE_END);
}

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == countButton) {
        String text = textArea.getText().trim();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        int charCount = text.length();
        wordLabel.setText("Words: " + wordCount + "  ");
        charLabel.setText("Characters: " + charCount);
    } else if (e.getSource() == uploadButton) {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                String content = extractText(file);
                textArea.setText(content);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "File error: " + ex.getMessage());
            }
        }
    }
}

private String extractText(File file) throws Exception {
    String name = file.getName().toLowerCase();
    if (name.endsWith(".txt")) {
        return new String(Files.readAllBytes(file.toPath()));
    } else if (name.endsWith(".docx")) {
        try (FileInputStream fis = new FileInputStream(file);
             XWPFDocument doc = new XWPFDocument(fis)) {
            StringBuilder sb = new StringBuilder();
            for (XWPFParagraph p : doc.getParagraphs()) {
                sb.append(p.getText()).append("\n");
            }
            return sb.toString();
        }
    } else if (name.endsWith(".pdf")) {
        try (PDDocument doc = PDDocument.load(file)) {
            return new PDFTextStripper().getText(doc);
        }
    } else {
        throw new IllegalArgumentException("Unsupported file format: " + name);
    }
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new WordCounter().setVisible(true);
    });
}
