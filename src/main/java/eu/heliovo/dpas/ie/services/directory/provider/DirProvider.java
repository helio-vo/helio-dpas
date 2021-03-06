package eu.heliovo.dpas.ie.services.directory.provider;

import java.util.List;
import uk.ac.starlink.table.StarTable;
import eu.heliovo.dpas.ie.services.cdaweb.dao.exception.DataNotFoundException;
import eu.heliovo.dpas.ie.services.cdaweb.service.org.ws.cdaw.CoordinatedDataAnalysisSystemBindingStub;
import eu.heliovo.dpas.ie.services.common.utils.DAOFactory;
import eu.heliovo.dpas.ie.services.directory.dao.interfaces.DirQueryDao;
import eu.heliovo.dpas.ie.services.directory.transfer.DirDataTO;
import eu.heliovo.dpas.ie.services.directory.utils.DPASResultItem;
import eu.heliovo.dpas.ie.services.directory.utils.DirInsAnlyFactory;
import eu.heliovo.dpas.ie.services.directory.utils.DpasUtilities;
import eu.heliovo.dpas.ie.services.directory.utils.PointsStarTable;


public class DirProvider
{
	private DpasUtilities dpasUtils = new DpasUtilities();

	public	void query(DirDataTO dirTO) throws DataNotFoundException {
		System.out.println(" : Directory structure : ");
		CoordinatedDataAnalysisSystemBindingStub binding;
		List<DPASResultItem> 		results 		= null;
		StarTable[] tables=null;
		int count=0;
		//Provider type
		String providerType=dirTO.getProviderType();
		String pvdrSrc=dirTO.getProviderSource();
		//Instrument name
		String instName=dirTO.getInstrument();
        try{
        	//Checking whether ftp directory archive.
        	if(providerType!=null && !providerType.trim().equals("") && providerType.trim().equalsIgnoreCase("ftp")){
        		dirTO.setInstrument(providerType.toUpperCase());
        		if(pvdrSrc!=null && !pvdrSrc.trim().equals("") && pvdrSrc.trim().equalsIgnoreCase("haf"))
        			dirTO.setVotableDescription(pvdrSrc.toUpperCase()+" archive query response");
        		else
        			dirTO.setVotableDescription("BASS2000 Archive query response");
        	}
        	DirQueryDao dpasDataProvider=(DirQueryDao) DirInsAnlyFactory.getDirProvider(dirTO);
        	//Setting Instrument
        	dirTO.setInstrument(instName);
        	//Getting results from Data Provider.
        	results=dpasDataProvider.query(dirTO.getInstrument(), dpasUtils.HELIOTimeToCalendar(dirTO.getDateFrom()), dpasUtils.HELIOTimeToCalendar(dirTO.getDateTo()), 2);
        	//
        	if(results!=null && results.size()>0){
        		tables=new StarTable[1];
        		tables[count]=new PointsStarTable(results,dirTO.getHelioInstrument(),dirTO.getDateTo(),dirTO.getProviderSource(),dirTO.getInstrument());
        		tables[count].setName(dirTO.getHelioInstrument());
        	}
        	dirTO.setStarTableArray(tables);
        	dirTO.setQuerystatus("OK");
        	DirQueryDao dirQueryDao=(DirQueryDao)DAOFactory.getDAOFactory(dirTO.getWhichProvider());
        	dirQueryDao.generateVOTable(dirTO); 
        }catch(Exception e){
        	e.printStackTrace();
        	throw new DataNotFoundException(e.getMessage());
        }

	}
      
}
