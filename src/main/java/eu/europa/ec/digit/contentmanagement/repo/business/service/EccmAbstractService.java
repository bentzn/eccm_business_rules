package eu.europa.ec.digit.contentmanagement.repo.business.service;

import org.apache.log4j.Logger;

import eu.europa.ec.digit.contentmanagement.domain.api.access.DaoModuleFactory;
import eu.europa.ec.digit.contentmanagement.domain.api.access.DaoModule_i;
import eu.europa.ec.digit.contentmanagement.repo.business.security.EccmAction;
import eu.europa.ec.digit.contentmanagement.repo.business.security.EccmSecurityException;

/**
 * 
 * @author bentsth
 */
public class EccmAbstractService {

    private static final Logger logger = Logger.getLogger(EccmAbstractService.class);
    protected DaoModule_i daoModule;


    protected EccmAbstractService() {
        try {
            daoModule = DaoModuleFactory.getDaoModule();
        } catch (Exception e) {
            logger.error("ERROR: was not able to get a DaoModule", e);
        }
    }


    protected void checkAuthorisation(EccmAction action, Object... param) throws EccmSecurityException {
    }
}
