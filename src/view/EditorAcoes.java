package view;

import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Gabrieli
 */
public class EditorAcoes extends AbstractCellEditor implements TableCellEditor {

    private final JPanel painel = new JPanel();
    private final JButton jButtonEditar = new JButton("Editar");
    private final JButton jButtonExcluir = new JButton("Excluir");

    private final Impressoes tela;

    public EditorAcoes(Impressoes tela) {
        this.tela = tela;

        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

        painel.add(jButtonEditar);
        painel.add(jButtonExcluir);

        jButtonEditar.addActionListener(e -> {
            fireEditingStopped();
            tela.editarImpressao();
        });

        jButtonExcluir.addActionListener(e -> {
            fireEditingStopped();
            tela.excluirImpressao();
        });
    }

    @Override
    public Component getTableCellEditorComponent(
            JTable table,
            Object value,
            boolean isSelected,
            int row,
            int column) {

        table.setRowSelectionInterval(row, row);

        return painel;
    }

    @Override
    public Object getCellEditorValue() {
        return "";
    }
}