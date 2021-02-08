package eu.europa.ec.digit.contentmanagement.repo.business.service;

import java.util.Set;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.Artifact_i;
import eu.europa.ec.digit.contentmanagement.domain.api.util.collections.PaginatedList_i;
import eu.europa.ec.digit.contentmanagement.repo.business.security.EccmAction;

/**
 * 
 * @author bentsth
 */
public class EccmNavigationService extends EccmAbstractService{
    
    
    public PaginatedList_i<? extends Artifact_i> getChildren(long id, int skipItems, int maxItems) throws Exception{
        checkAuthorisation(EccmAction.CAN_GET_CHILDREN, id);
        return daoModule.getArtifactDao().getChildren(null, id, skipItems, maxItems);
    }
    
	
	public Set<Artifact_i> getParents(long id) throws Exception {
		checkAuthorisation(EccmAction.CAN_GET_FOLDER_PARENT, id);
		return daoModule.getArtifactDao().getParentsAll(null, id);
	}
}
