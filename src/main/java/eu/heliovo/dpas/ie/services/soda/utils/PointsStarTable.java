package eu.heliovo.dpas.ie.services.soda.utils;

import java.text.SimpleDateFormat;
import java.util.List;

import eu.heliovo.dpas.ie.services.common.utils.ConstantKeywords;
import eu.heliovo.dpas.ie.services.soda.service.eu.soteriaspace.schemas.query.RecordId;
import uk.ac.starlink.table.ColumnInfo;
import uk.ac.starlink.table.DescribedValue;
import uk.ac.starlink.table.RandomStarTable;
import uk.ac.starlink.votable.VOStarTable;

public class PointsStarTable extends RandomStarTable {

	//Start Date
	ColumnInfo colStartDate=new ColumnInfo( "time_start", String.class, "Start date");
	//End date
	ColumnInfo colEndDate=new ColumnInfo( "time_end", String.class, "End date" );
    // Define the metadata object for each of the columns.
    ColumnInfo[] colInfos_ = new ColumnInfo[] {
        new ColumnInfo( "instrument_name", String.class, "Instrument Name" ),
        new ColumnInfo( "url", String.class, "URL for the file" ),
        colStartDate,
        colEndDate,
    };

    // Member variables are arrays holding the actual data.
    List<RecordId>	resp_;
    int nRow_;
    String inst;
    SimpleDateFormat formatter = new SimpleDateFormat(ConstantKeywords.ORGINALDATEFORMAT.getDateFormat());
    /**
     * 
     * @param resp
     * @param url
     * @param provider
     * @param status
     */
    public PointsStarTable( List<RecordId>	resp ,String instruments) {
    	resp_=resp;
    	nRow_=(int) resp.size();
    	inst=instruments;
    	//
    	colStartDate.setAuxDatum( new DescribedValue( VOStarTable.XTYPE_INFO,"iso8601"));
    	//
    	colEndDate.setAuxDatum( new DescribedValue( VOStarTable.XTYPE_INFO,"iso8601"));
    }

    public int getColumnCount() {
        return 4;
    }
      
    public long getRowCount() {
        return nRow_;
    }

    public ColumnInfo getColumnInfo( int icol ) {
        return colInfos_[ icol ];
    }
    
  
    public Object getCell( long lrow, int icol ) {
        int irow = checkedLongToInt( lrow );
        if(resp_!=null && resp_.get(irow)!=null){
	        switch ( icol ) {
	        	case 0: return inst;
	            case 1: return null;
	            case 2: return null;
	            case 3: return null;
	            default: throw new IllegalArgumentException();
	        }
       }else{
        	return null;
       }
    }
}

