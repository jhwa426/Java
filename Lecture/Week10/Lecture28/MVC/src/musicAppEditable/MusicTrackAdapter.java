package musicAppEditable;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

import javax.swing.table.AbstractTableModel;

public class MusicTrackAdapter extends AbstractTableModel {

	List<MusicTrack> _trackList = null;
	
	private static final String[] _columnNames = {"Title", "Artist", "Album"};
	
	public MusicTrackAdapter() {
		_trackList = new ArrayList<MusicTrack>();		
	}
	
	@Override
	public String getColumnName(int col) {
		return _columnNames[col];
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return _trackList.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return _columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String cellValue = null;
		switch(columnIndex) {
		case 0:
			cellValue = _trackList.get(rowIndex).getTitle();
			break;
		case 1:
			cellValue = _trackList.get(rowIndex).getArtist();
			break;
		case 2:
			cellValue = _trackList.get(rowIndex).getAlbum();
			break;
		}
		return cellValue;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	{
	    MusicTrack row = _trackList.get(rowIndex);
	    
	    if(0 == columnIndex) {
	        row.setTitle((String) aValue);
	    }
	    else if(1 == columnIndex) {
	        row.setArtist((String) aValue);
	    }
	    else if(2 == columnIndex) {
	        row.setAlbum((String) aValue);
	    }	    
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
	    return true;
	}
	
	public void addTrack(MusicTrack track) {
		_trackList.add(track);
	}

}
