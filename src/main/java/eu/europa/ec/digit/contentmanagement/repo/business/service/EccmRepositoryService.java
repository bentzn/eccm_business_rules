package eu.europa.ec.digit.contentmanagement.repo.business.service;

import java.util.List;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.Repository_i;
import eu.europa.ec.digit.contentmanagement.domain.api.entities.TypeDefinition_i;
import eu.europa.ec.digit.contentmanagement.domain.api.util.collections.PaginatedList_i;

/**
 * 
 * @author bentsth
 */
public class EccmRepositoryService extends EccmAbstractService {
    

    public List<? extends Repository_i> getRepositories() throws Exception {
        // No check of authorisation
        List<? extends Repository_i> lst = daoModule.getRepositoryDao().all();
        return lst;
    }


    public TypeDefinition_i getTypeDefinition(String typeDefinitionId) throws Exception {
        /*
         * In CMIS the repository id is also submitted. But ids are unique system wide so 
         * it is not necessary 
         */
        // No check of authorisation
        return daoModule.getTypeDefinitionDao().retrieve(typeDefinitionId);
    }
    
    
    public PaginatedList_i<? extends TypeDefinition_i> getTypeDefinitionChildren(String typeDefinitionId, boolean includePropertyDefinitions, int pageNo, int pageLength) throws Exception{
        /*
         * In CMIS the repository id is also submitted. But ids are unique system wide so 
         * it is not necessary 
         */
        return daoModule.getTypeDefinitionDao().getChildren(null, typeDefinitionId, pageNo, pageLength);
    }
}
