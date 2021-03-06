/* #ident	"%W%" */
package eu.heliovo.dpas.ie.services;

import eu.heliovo.dpas.ie.services.cdaweb.dao.impl.CdaWebQueryDaoImpl;
import eu.heliovo.dpas.ie.services.cdaweb.dao.interfaces.CdaWebQueryDao;
import eu.heliovo.dpas.ie.services.common.dao.impl.LongRunningQueryDaoImpl;
import eu.heliovo.dpas.ie.services.common.dao.impl.ShortNameQueryDaoImpl;
import eu.heliovo.dpas.ie.services.common.dao.interfaces.LongRunningQueryDao;
import eu.heliovo.dpas.ie.services.common.dao.interfaces.ShortNameQueryDao;
import eu.heliovo.dpas.ie.services.common.utils.DAOFactory;
import eu.heliovo.dpas.ie.services.soda.dao.impl.SoteriaQueryDaoImpl;
import eu.heliovo.dpas.ie.services.soda.dao.interfaces.SoteriaQueryDao;
import eu.heliovo.dpas.ie.services.hqi.dao.impl.HqiQueryDaoImpl;
import eu.heliovo.dpas.ie.services.hqi.dao.interfaces.HqiQueryDao;
import eu.heliovo.dpas.ie.services.vso.dao.impl.VsoQueryDaoImpl;
import eu.heliovo.dpas.ie.services.vso.dao.interfaces.VsoQueryDao;
import eu.heliovo.dpas.ie.services.directory.dao.impl.DirQueryDaoImpl;
import eu.heliovo.dpas.ie.services.directory.dao.interfaces.DirQueryDao;

public class CommonDaoFactory extends DAOFactory {

	private static CommonDaoFactory instance = null;
	
	private CommonDaoFactory(){
		//Constructor
	}

	public static CommonDaoFactory getInstance(){
		if(instance==null){
			instance = new CommonDaoFactory();
		}
		return instance;
	}
	
	@Override
	public VsoQueryDao getVsoQueryDao(){
		return new VsoQueryDaoImpl();
	}
	
	@Override
	public HqiQueryDao getHqiQueryDao(){
		return new HqiQueryDaoImpl();
	}

	@Override
	public CdaWebQueryDao getCdaWebQueryDao() {
		return new CdaWebQueryDaoImpl();
	}
	
	public ShortNameQueryDao getShortNameQueryDao() {
		return new ShortNameQueryDaoImpl();
	}
	
	public DirQueryDao getDirQueryDao() {
		return new DirQueryDaoImpl();
	}
	
	public LongRunningQueryDao getLongRunningQueryDao(){
		return new LongRunningQueryDaoImpl();
	}
	
	public SoteriaQueryDao getSoteriaQueryDao(){
		return new SoteriaQueryDaoImpl();
	}
}
