package eu.europa.ec.digit.contentmanagement.repo.business.service;

import eu.europa.ec.digit.contentmanagement.domain.api.entities.Artifact_i;

/**
 * 
 * @author bentsth
 */
public class EccmObjectService extends EccmAbstractService {

    
    
//    public ObjectData getObject(String repositoryId, String objectId, String filter, Boolean includeAllowableActions,
//            IncludeRelationships includeRelationships, String renditionFilter, Boolean includePolicyIds,
//            Boolean includeAcl, ExtensionsData extension) {

    
    public Artifact_i getArtifact(String objectId) throws Exception {
        /*
         * In CMIS the repository id is also submitted. But ids are unique system wide so 
         * it is not necessary 
         */
        return daoModule.getArtifactDao().retrieve(objectId);
    }
    
}
