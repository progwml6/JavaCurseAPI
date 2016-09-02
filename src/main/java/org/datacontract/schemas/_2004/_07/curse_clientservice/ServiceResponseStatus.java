
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceResponseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="UnknownException"/>
 *     &lt;enumeration value="JoinSyncGroup_GroupNotFound"/>
 *     &lt;enumeration value="JoinSyncGroup_AlreadyInGroup"/>
 *     &lt;enumeration value="CreateSyncGroup_GroupAlreadyExists"/>
 *     &lt;enumeration value="LeaveSyncGroup_GroupNotFound"/>
 *     &lt;enumeration value="LeaveSyncGroup_ComputerNotFound"/>
 *     &lt;enumeration value="SaveSyncSnapshot_GroupNotFound"/>
 *     &lt;enumeration value="SaveSyncTransactions_GroupNotFound"/>
 *     &lt;enumeration value="DeleteSavedGame_SavedGameNotFound"/>
 *     &lt;enumeration value="DeleteSavedGameRevision_SavedGameNotFound"/>
 *     &lt;enumeration value="DeleteSavedGameRevision_RevisionNotFound"/>
 *     &lt;enumeration value="SetSavedGameStatus_SavedGameNotFound"/>
 *     &lt;enumeration value="SetSavedGameName_SavedGameNotFound"/>
 *     &lt;enumeration value="SetSavedGameDescription_SavedGameNotFound"/>
 *     &lt;enumeration value="SetSavedGameDefaultRevision_SavedGameNotFound"/>
 *     &lt;enumeration value="SetSavedGameDefaultRevision_RevisionNotFound"/>
 *     &lt;enumeration value="SetSavedGameFavoriteRevision_SavedGameNotFound"/>
 *     &lt;enumeration value="SetSavedGameFavoriteRevision_RevisionNotFound"/>
 *     &lt;enumeration value="UserOrSlotsAvailable_NoCloudSlotsAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceResponseStatus")
@XmlEnum
public enum ServiceResponseStatus {

    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("UnknownException")
    UNKNOWN_EXCEPTION("UnknownException"),
    @XmlEnumValue("JoinSyncGroup_GroupNotFound")
    JOIN_SYNC_GROUP_GROUP_NOT_FOUND("JoinSyncGroup_GroupNotFound"),
    @XmlEnumValue("JoinSyncGroup_AlreadyInGroup")
    JOIN_SYNC_GROUP_ALREADY_IN_GROUP("JoinSyncGroup_AlreadyInGroup"),
    @XmlEnumValue("CreateSyncGroup_GroupAlreadyExists")
    CREATE_SYNC_GROUP_GROUP_ALREADY_EXISTS("CreateSyncGroup_GroupAlreadyExists"),
    @XmlEnumValue("LeaveSyncGroup_GroupNotFound")
    LEAVE_SYNC_GROUP_GROUP_NOT_FOUND("LeaveSyncGroup_GroupNotFound"),
    @XmlEnumValue("LeaveSyncGroup_ComputerNotFound")
    LEAVE_SYNC_GROUP_COMPUTER_NOT_FOUND("LeaveSyncGroup_ComputerNotFound"),
    @XmlEnumValue("SaveSyncSnapshot_GroupNotFound")
    SAVE_SYNC_SNAPSHOT_GROUP_NOT_FOUND("SaveSyncSnapshot_GroupNotFound"),
    @XmlEnumValue("SaveSyncTransactions_GroupNotFound")
    SAVE_SYNC_TRANSACTIONS_GROUP_NOT_FOUND("SaveSyncTransactions_GroupNotFound"),
    @XmlEnumValue("DeleteSavedGame_SavedGameNotFound")
    DELETE_SAVED_GAME_SAVED_GAME_NOT_FOUND("DeleteSavedGame_SavedGameNotFound"),
    @XmlEnumValue("DeleteSavedGameRevision_SavedGameNotFound")
    DELETE_SAVED_GAME_REVISION_SAVED_GAME_NOT_FOUND("DeleteSavedGameRevision_SavedGameNotFound"),
    @XmlEnumValue("DeleteSavedGameRevision_RevisionNotFound")
    DELETE_SAVED_GAME_REVISION_REVISION_NOT_FOUND("DeleteSavedGameRevision_RevisionNotFound"),
    @XmlEnumValue("SetSavedGameStatus_SavedGameNotFound")
    SET_SAVED_GAME_STATUS_SAVED_GAME_NOT_FOUND("SetSavedGameStatus_SavedGameNotFound"),
    @XmlEnumValue("SetSavedGameName_SavedGameNotFound")
    SET_SAVED_GAME_NAME_SAVED_GAME_NOT_FOUND("SetSavedGameName_SavedGameNotFound"),
    @XmlEnumValue("SetSavedGameDescription_SavedGameNotFound")
    SET_SAVED_GAME_DESCRIPTION_SAVED_GAME_NOT_FOUND("SetSavedGameDescription_SavedGameNotFound"),
    @XmlEnumValue("SetSavedGameDefaultRevision_SavedGameNotFound")
    SET_SAVED_GAME_DEFAULT_REVISION_SAVED_GAME_NOT_FOUND("SetSavedGameDefaultRevision_SavedGameNotFound"),
    @XmlEnumValue("SetSavedGameDefaultRevision_RevisionNotFound")
    SET_SAVED_GAME_DEFAULT_REVISION_REVISION_NOT_FOUND("SetSavedGameDefaultRevision_RevisionNotFound"),
    @XmlEnumValue("SetSavedGameFavoriteRevision_SavedGameNotFound")
    SET_SAVED_GAME_FAVORITE_REVISION_SAVED_GAME_NOT_FOUND("SetSavedGameFavoriteRevision_SavedGameNotFound"),
    @XmlEnumValue("SetSavedGameFavoriteRevision_RevisionNotFound")
    SET_SAVED_GAME_FAVORITE_REVISION_REVISION_NOT_FOUND("SetSavedGameFavoriteRevision_RevisionNotFound"),
    @XmlEnumValue("UserOrSlotsAvailable_NoCloudSlotsAvailable")
    USER_OR_SLOTS_AVAILABLE_NO_CLOUD_SLOTS_AVAILABLE("UserOrSlotsAvailable_NoCloudSlotsAvailable");
    private final String value;

    ServiceResponseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceResponseStatus fromValue(String v) {
        for (ServiceResponseStatus c: ServiceResponseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
