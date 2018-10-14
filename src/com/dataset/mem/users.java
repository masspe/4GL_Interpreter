package com.dataset.mem;

import javax.swing.table.AbstractTableModel;

public class users extends AbstractTableModel
{
	 String[] columnNames = {"UserID","Password","FirstName","LastName","Title"};
	 Object[][] rowData= {{"jsmith","pwd123","John","Smith","President"}
	 ,{"jdoe","pwd321","John","Doe","Employee"}};
	 public int getColumnCount()
	    {
	        return columnNames.length;
	    }

	    public int getRowCount()
	    {
	        return rowData.length;
	    }

	    public String getColumnName(int col)
	    {
	        return columnNames[col];
	    }

	    public Object getValueAt(int row, int col)
	    {
	        return rowData[row][col];
	    }

}
