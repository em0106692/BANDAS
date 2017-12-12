/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelComponentes extends AbstractTableModel {

    private List<Usuario> dados = new ArrayList<>();
    private String[] colunas = {"Nº", "Nome"};

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    /*Pega os registros*/
    public Object getValueAt(int row, int column) {
        switch (column) {
           
            case 0:
                return dados.get(row).getUSU_ID();
            case 1:
                return dados.get(row).getUSU_VNOME();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int row, int column) {
        switch (column) {
            
            case 0:
                dados.get(row).setUSU_ID((int) valor);
                break;
            case 1:
                dados.get(row).setUSU_VNOME((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(row, row);
    }

    /*Adiciona os registros*/
    public void addrow(Usuario c) {
        System.out.println("Table: " + c);
        this.dados.add(c);
        this.fireTableDataChanged();

    }

    /*Remove os registros*/
    public void removerow(int row) {
        this.dados.remove(row);
        this.fireTableRowsDeleted(row, row);

    }          
}
