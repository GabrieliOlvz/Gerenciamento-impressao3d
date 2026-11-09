package view;

import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Gabrieli
 */
public class BotoesAcoes extends JPanel implements TableCellRenderer {

    private final JButton jButtonEditar = new JButton("Editar");
    private final JButton jButtonExcluir = new JButton("Excluir");

    public BotoesAcoes() {

        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

        add(jButtonEditar);
        add(jButtonExcluir);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {

        if (isSelected) {
            setBackground(table.getSelectionBackground());
        } else {
            setBackground(table.getBackground());
        }

        return this;
    }
}