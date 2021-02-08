package eu.europa.ec.digit.contentmanagement.repo.business.security;


/**
 * Verbatim copy of CMIS - to keep deps out
 */
public enum EccmAction {

    // important: do not change the order of these values!
    CAN_DELETE_OBJECT("canDeleteObject"), //
    CAN_UPDATE_PROPERTIES("canUpdateProperties"), //
    CAN_GET_FOLDER_TREE("canGetFolderTree"), //
    CAN_GET_PROPERTIES("canGetProperties"), //
    CAN_GET_OBJECT_RELATIONSHIPS("canGetObjectRelationships"), //
    CAN_GET_OBJECT_PARENTS("canGetObjectParents"), //
    CAN_GET_FOLDER_PARENT("canGetFolderParent"), //
    CAN_GET_DESCENDANTS("canGetDescendants"), //
    CAN_MOVE_OBJECT("canMoveObject"), //
    CAN_DELETE_CONTENT_STREAM("canDeleteContentStream"), //
    CAN_CHECK_OUT("canCheckOut"), //
    CAN_CANCEL_CHECK_OUT("canCancelCheckOut"), //
    CAN_CHECK_IN("canCheckIn"), //
    CAN_SET_CONTENT_STREAM("canSetContentStream"), //
    CAN_GET_ALL_VERSIONS("canGetAllVersions"), //
    CAN_ADD_OBJECT_TO_FOLDER("canAddObjectToFolder"), //
    CAN_REMOVE_OBJECT_FROM_FOLDER("canRemoveObjectFromFolder"), //
    CAN_GET_CONTENT_STREAM("canGetContentStream"), //
    CAN_APPLY_POLICY("canApplyPolicy"), //
    CAN_GET_APPLIED_POLICIES("canGetAppliedPolicies"), //
    CAN_REMOVE_POLICY("canRemovePolicy"), //
    CAN_GET_CHILDREN("canGetChildren"), //
    CAN_CREATE_DOCUMENT("canCreateDocument"), //
    CAN_CREATE_FOLDER("canCreateFolder"), //
    CAN_CREATE_RELATIONSHIP("canCreateRelationship"), //
    CAN_CREATE_ITEM("canCreateItem"), //
    CAN_DELETE_TREE("canDeleteTree"), //
    CAN_GET_RENDITIONS("canGetRenditions"), //
    CAN_GET_ACL("canGetACL"), //
    CAN_APPLY_ACL("canApplyACL");

    private final String value;

    EccmAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EccmAction fromValue(String v) {
        for (EccmAction c : EccmAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}