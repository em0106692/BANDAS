/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelMusica extends AbstractTableModel {

    private List<Musica> dados = new ArrayList<>();
    private String[] colunas = {"Nº", "Nome", "Cifra", "Letra"};

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
                return dados.get(row).getMUS_ID();
            case 1:
                return dados.get(row).getMUS_VNOME();
            case 2:
                return dados.get(row).getMUS_VCIFRA();
            case 3:
                return dados.get(row).getMUS_VLETRA();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int row, int column) {
        switch (column) {
            
            case 0:
                dados.get(row).setMUS_ID((int) valor);
                break;
            case 1:
                dados.get(row).setMUS_VNOME((String) valor);
                break;
            case 2:
                dados.get(row).setMUS_VCIFRA((String) valor);
                break;
            case 3:
                dados.get(row).setMUS_VLETRA((String) valor);
                break;
        }
        
        this.fireTableRowsUpdated(row, row);
    }

    /*Adiciona os registros*/
    public void addrow(Musica c) {
        System.out.println("Table: " + c);
        this.dados.add(c);
        this.fireTableDataChanged();

    }

    /*Remove os registros*/
    public void removerow(int row) {
        this.dados.remove(row);
        this.fireTableRowsDeleted(row, row);
    }      

//    public void setNumRows(int row) {
//        this.dados.set(row, dados.get(row));
//        this.fireTableRowsDeleted(row, row);
//    } 
}
