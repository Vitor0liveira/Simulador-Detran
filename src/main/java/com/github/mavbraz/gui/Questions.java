package com.github.mavbraz.gui;

import com.github.mavbraz.hibernate.DetranFactory;
import com.github.mavbraz.hibernate.basic.Category;
import com.github.mavbraz.hibernate.basic.Question;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mavbraz
 */
public class Questions extends javax.swing.JFrame {

    private final Main main;
    private List<Question> questions;

    /**
     * Creates new form Questions
     *
     * @param main
     */
    public Questions(Main main) {
        this.main = main;

        initComponents();
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblFilter = new javax.swing.JLabel();
        rbtnPergunta = new javax.swing.JRadioButton();
        txtPergunta = new javax.swing.JTextField();
        rbtnCategoria = new javax.swing.JRadioButton();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnMenuPrincipal = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnTodasQuestoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulado Detran/PE - Ver Perguntas");
        setIconImage(new ImageIcon(getClass().getResource("/detran-icon.png")).getImage());

        lblFilter.setText("Filtrar por:");

        buttonGroup1.add(rbtnPergunta);
        rbtnPergunta.setSelected(true);
        rbtnPergunta.setText("Pergunta");
        rbtnPergunta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnPerguntaItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtnCategoria);
        rbtnCategoria.setText("Categoria");
        rbtnCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnCategoriaItemStateChanged(evt);
            }
        });

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new Object[]{Category.CIDADANIA_MEIO_AMBIENTE, Category.DIRECAO_DEFENSIVA, Category.LEGISLACAO_TRANSITO, Category.MECANICA_BASICA, Category.PRIMEIROS_SOCORROS, Category.REGRAS_CIRCULACAO, Category.SINALIZACAO}));
        cbxCategoria.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pergunta", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar questão");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnTodasQuestoes.setText("Mostrar todas as questões");
        btnTodasQuestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasQuestoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnCategoria)
                            .addComponent(rbtnPergunta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPergunta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTodasQuestoes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnPergunta)
                            .addComponent(lblFilter)
                            .addComponent(txtPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnCategoria)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuPrincipal)
                    .addComponent(btnVisualizar)
                    .addComponent(btnTodasQuestoes))
                .addGap(6, 6, 6))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnPerguntaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnPerguntaItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            txtPergunta.setEnabled(true);
        } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            txtPergunta.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnPerguntaItemStateChanged

    private void rbtnCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnCategoriaItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            cbxCategoria.setEnabled(true);
        } else if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            cbxCategoria.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnCategoriaItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (rbtnPergunta.isSelected()) {
            carregarTabela(txtPergunta.getText());
        } else if (rbtnCategoria.isSelected()) {
            carregarTabela((Category) cbxCategoria.getModel().getSelectedItem());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTodasQuestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasQuestoesActionPerformed
        carregarTabela();
    }//GEN-LAST:event_btnTodasQuestoesActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        this.setVisible(false);
        main.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            Question question = questions.get(jTable1.getSelectedRow());

            String message = "<html><body><center><h2>Informações:</h2></center><br>";
            message += "Código: " + question.getId() + "<br>";
            message += "Pergunta: " + question.getQuestion() + "<br>";

            message += "Categoria: " + question.getCategory() + "<br>";
            message += "Resposta correta: " + (question.getAnswer() == 1 ? "A"
                    : question.getAnswer() == 2 ? "B"
                    : question.getAnswer() == 3 ? "C" : "D");
            message += "<br>Resposta A: " + question.getAnswers().get(0).getAnswer() + "<br>";
            message += "Resposta B: " + question.getAnswers().get(1).getAnswer() + "<br>";
            message += "Resposta C: " + question.getAnswers().get(2).getAnswer() + "<br>";
            message += "Resposta D: " + question.getAnswers().get(3).getAnswer() + "<br>";
            message += "</body></html>";
            if (question.getImage() != null && !question.getImage().equals("")) {
                ImageIcon placa = new ImageIcon(getClass().getResource("/placas/" + question.getImage()));

                JOptionPane.showMessageDialog(this, message, "Informações", JOptionPane.PLAIN_MESSAGE, placa);
            } else {
                JOptionPane.showMessageDialog(this, message, "Informações", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pergunta da tabela para ver suas informações.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void carregarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DetranFactory database = new DetranFactory();
        questions = database.getAllQuestions();

        model.setRowCount(0);

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            model.addRow(createTableRow(question));
        }
    }

    private void carregarTabela(String text) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DetranFactory database = new DetranFactory();
        questions = database.getQuestionsByQuestion(text);

        model.setRowCount(0);

        if (questions != null) {
            for (int i = 0; i < questions.size(); i++) {
                Question question = questions.get(i);

                model.addRow(createTableRow(question));
            }
        }
    }

    /*private void carregarTabela(int id) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DetranFactory database = new DetranFactory();
        Question question = null;
        try {
            question = database.getQuestion(id);
        } finally {
            model.setRowCount(0);
            if (question != null) {
                model.addRow(createTableRow(question));
                questions = Arrays.asList(question);
            }
        }
    }*/
    private void carregarTabela(Category category) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DetranFactory database = new DetranFactory();
        questions = database.getQuestionsByCategory(category);

        model.setRowCount(0);

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            model.addRow(createTableRow(question));
        }
    }

    private Object[] createTableRow(Question question) {
        Object[] data = new Object[2];

        data[0] = question.getQuestion();
        data[1] = question.getCategory();

        return data;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnTodasQuestoes;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JRadioButton rbtnCategoria;
    private javax.swing.JRadioButton rbtnPergunta;
    private javax.swing.JTextField txtPergunta;
    // End of variables declaration//GEN-END:variables
}
