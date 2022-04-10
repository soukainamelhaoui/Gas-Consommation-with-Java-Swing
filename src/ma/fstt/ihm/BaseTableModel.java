package ma.fstt.ihm;


import javax.swing.table.AbstractTableModel;
import java.util.List;

public class BaseTableModel<T> extends AbstractTableModel {
    protected List<T> list;
    protected String[] columnNames ;

    public BaseTableModel(List<T> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return this.list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
      return null;

    }
}
