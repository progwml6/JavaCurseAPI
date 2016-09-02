
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import addons.curse.AddOn;
import addons.curse.AddOnFile;
import addons.curse.ArrayOfAddOn;
import addons.curse.ArrayOfAddOnFile;
import addons.curse.ArrayOfFuzzyMatch;
import addons.curse.DownloadToken;
import addons.curse.FingerprintMatchResult;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.curse.ArrayOfFolderFingerprint;
import org.datacontract.schemas._2004._07.curse.RepositoryMatch;
import org.datacontract.schemas._2004._07.curse_addonservice.ArrayOfAddOnFileKey;
import org.datacontract.schemas._2004._07.curse_clientservice.ArrayOfSyncTransaction;
import org.datacontract.schemas._2004._07.curse_clientservice.ArrayOfSyncedAddon;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponse;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfArrayOfSavedGameeheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfESavedGameRestrictionLeveleheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfSavedGameConstraintseheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfSyncedGameInstanceeheogrl4;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.curse.addonservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAddOnFilesAddOnFileKeys_QNAME = new QName("http://addonservice.curse.com/", "addOnFileKeys");
    private final static QName _GetAddOnResponseGetAddOnResult_QNAME = new QName("http://addonservice.curse.com/", "GetAddOnResult");
    private final static QName _SetSavedGameNameResponseSetSavedGameNameResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameNameResult");
    private final static QName _JoinSyncGroupInstanceGUID_QNAME = new QName("http://addonservice.curse.com/", "instanceGUID");
    private final static QName _JoinSyncGroupInstanceLabel_QNAME = new QName("http://addonservice.curse.com/", "instanceLabel");
    private final static QName _JoinSyncGroupComputerName_QNAME = new QName("http://addonservice.curse.com/", "computerName");
    private final static QName _GetAllFilesForAddOnResponseGetAllFilesForAddOnResult_QNAME = new QName("http://addonservice.curse.com/", "GetAllFilesForAddOnResult");
    private final static QName _GetSyncProfileResponseGetSyncProfileResult_QNAME = new QName("http://addonservice.curse.com/", "GetSyncProfileResult");
    private final static QName _V2GetFingerprintMatchesResponseV2GetFingerprintMatchesResult_QNAME = new QName("http://addonservice.curse.com/", "v2GetFingerprintMatchesResult");
    private final static QName _V2GetAddOnsIds_QNAME = new QName("http://addonservice.curse.com/", "ids");
    private final static QName _GetFuzzyMatchesFolderFingerprints_QNAME = new QName("http://addonservice.curse.com/", "folderFingerprints");
    private final static QName _SetSavedGameRestrictionLevelResponseSetSavedGameRestrictionLevelResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameRestrictionLevelResult");
    private final static QName _GetRepositoryMatchFromSlugAddonSlug_QNAME = new QName("http://addonservice.curse.com/", "addonSlug");
    private final static QName _GetRepositoryMatchFromSlugGameSlug_QNAME = new QName("http://addonservice.curse.com/", "gameSlug");
    private final static QName _GetAddOnFilesResponseGetAddOnFilesResult_QNAME = new QName("http://addonservice.curse.com/", "GetAddOnFilesResult");
    private final static QName _V2GetAddOnsResponseV2GetAddOnsResult_QNAME = new QName("http://addonservice.curse.com/", "v2GetAddOnsResult");
    private final static QName _SetSavedGameDescriptionResponseSetSavedGameDescriptionResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameDescriptionResult");
    private final static QName _SaveSyncSnapshotSyncedAddons_QNAME = new QName("http://addonservice.curse.com/", "syncedAddons");
    private final static QName _GetAddOnFileResponseGetAddOnFileResult_QNAME = new QName("http://addonservice.curse.com/", "GetAddOnFileResult");
    private final static QName _GetAddOnDescriptionResponseGetAddOnDescriptionResult_QNAME = new QName("http://addonservice.curse.com/", "GetAddOnDescriptionResult");
    private final static QName _CacheHealthCheckResponseCacheHealthCheckResult_QNAME = new QName("http://addonservice.curse.com/", "CacheHealthCheckResult");
    private final static QName _GetChangeLogResponseGetChangeLogResult_QNAME = new QName("http://addonservice.curse.com/", "GetChangeLogResult");
    private final static QName _SetSavedGameDefaultRevisionResponseSetSavedGameDefaultRevisionResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameDefaultRevisionResult");
    private final static QName _HealthCheckResponseHealthCheckResult_QNAME = new QName("http://addonservice.curse.com/", "HealthCheckResult");
    private final static QName _GetDownloadTokenResponseGetDownloadTokenResult_QNAME = new QName("http://addonservice.curse.com/", "GetDownloadTokenResult");
    private final static QName _GetSavedGamesResponseGetSavedGamesResult_QNAME = new QName("http://addonservice.curse.com/", "GetSavedGamesResult");
    private final static QName _CreateSyncGroupResponseCreateSyncGroupResult_QNAME = new QName("http://addonservice.curse.com/", "CreateSyncGroupResult");
    private final static QName _LeaveSyncGroupResponseLeaveSyncGroupResult_QNAME = new QName("http://addonservice.curse.com/", "LeaveSyncGroupResult");
    private final static QName _SaveSyncSnapshotResponseSaveSyncSnapshotResult_QNAME = new QName("http://addonservice.curse.com/", "SaveSyncSnapshotResult");
    private final static QName _SetSavedGameNameName_QNAME = new QName("http://addonservice.curse.com/", "name");
    private final static QName _GetSecureDownloadTokenResponseGetSecureDownloadTokenResult_QNAME = new QName("http://addonservice.curse.com/", "GetSecureDownloadTokenResult");
    private final static QName _SaveSyncTransactionsTransactions_QNAME = new QName("http://addonservice.curse.com/", "transactions");
    private final static QName _SaveSyncTransactionsResponseSaveSyncTransactionsResult_QNAME = new QName("http://addonservice.curse.com/", "SaveSyncTransactionsResult");
    private final static QName _GetSavedGameRestrictionLevelResponseGetSavedGameRestrictionLevelResult_QNAME = new QName("http://addonservice.curse.com/", "GetSavedGameRestrictionLevelResult");
    private final static QName _DeleteSavedGameResponseDeleteSavedGameResult_QNAME = new QName("http://addonservice.curse.com/", "DeleteSavedGameResult");
    private final static QName _UploadAvailableForUserResponseUploadAvailableForUserResult_QNAME = new QName("http://addonservice.curse.com/", "UploadAvailableForUserResult");
    private final static QName _GetFuzzyMatchesResponseGetFuzzyMatchesResult_QNAME = new QName("http://addonservice.curse.com/", "GetFuzzyMatchesResult");
    private final static QName _GetSavedGameConstraintsResponseGetSavedGameConstraintsResult_QNAME = new QName("http://addonservice.curse.com/", "GetSavedGameConstraintsResult");
    private final static QName _V2GetFingerprintMatchesFingerprints_QNAME = new QName("http://addonservice.curse.com/", "fingerprints");
    private final static QName _GetFingerprintMatchesResponseGetFingerprintMatchesResult_QNAME = new QName("http://addonservice.curse.com/", "GetFingerprintMatchesResult");
    private final static QName _SetSavedGameDescriptionDescription_QNAME = new QName("http://addonservice.curse.com/", "description");
    private final static QName _SetSavedGameFavoriteRevisionResponseSetSavedGameFavoriteRevisionResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameFavoriteRevisionResult");
    private final static QName _DeleteSavedGameRevisionResponseDeleteSavedGameRevisionResult_QNAME = new QName("http://addonservice.curse.com/", "DeleteSavedGameRevisionResult");
    private final static QName _CreateSyncGroupInstanceName_QNAME = new QName("http://addonservice.curse.com/", "instanceName");
    private final static QName _GetAddOnsResponseGetAddOnsResult_QNAME = new QName("http://addonservice.curse.com/", "GetAddOnsResult");
    private final static QName _SetSavedGameStatusResponseSetSavedGameStatusResult_QNAME = new QName("http://addonservice.curse.com/", "SetSavedGameStatusResult");
    private final static QName _GetRepositoryMatchFromSlugResponseGetRepositoryMatchFromSlugResult_QNAME = new QName("http://addonservice.curse.com/", "GetRepositoryMatchFromSlugResult");
    private final static QName _V2GetChangeLogResponseV2GetChangeLogResult_QNAME = new QName("http://addonservice.curse.com/", "v2GetChangeLogResult");
    private final static QName _V2GetAddOnDescriptionResponseV2GetAddOnDescriptionResult_QNAME = new QName("http://addonservice.curse.com/", "v2GetAddOnDescriptionResult");
    private final static QName _ResetAllAddonCacheResponseResetAllAddonCacheResult_QNAME = new QName("http://addonservice.curse.com/", "ResetAllAddonCacheResult");
    private final static QName _JoinSyncGroupResponseJoinSyncGroupResult_QNAME = new QName("http://addonservice.curse.com/", "JoinSyncGroupResult");
    private final static QName _ResetSingleAddonCacheResponseResetSingleAddonCacheResult_QNAME = new QName("http://addonservice.curse.com/", "ResetSingleAddonCacheResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.curse.addonservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CacheHealthCheck }
     * 
     */
    public CacheHealthCheck createCacheHealthCheck() {
        return new CacheHealthCheck();
    }

    /**
     * Create an instance of {@link GetRepositoryMatchFromSlug }
     * 
     */
    public GetRepositoryMatchFromSlug createGetRepositoryMatchFromSlug() {
        return new GetRepositoryMatchFromSlug();
    }

    /**
     * Create an instance of {@link HealthCheck }
     * 
     */
    public HealthCheck createHealthCheck() {
        return new HealthCheck();
    }

    /**
     * Create an instance of {@link SetSavedGameName }
     * 
     */
    public SetSavedGameName createSetSavedGameName() {
        return new SetSavedGameName();
    }

    /**
     * Create an instance of {@link GetAddOnResponse }
     * 
     */
    public GetAddOnResponse createGetAddOnResponse() {
        return new GetAddOnResponse();
    }

    /**
     * Create an instance of {@link CreateSyncGroup }
     * 
     */
    public CreateSyncGroup createCreateSyncGroup() {
        return new CreateSyncGroup();
    }

    /**
     * Create an instance of {@link GetSecureDownloadToken }
     * 
     */
    public GetSecureDownloadToken createGetSecureDownloadToken() {
        return new GetSecureDownloadToken();
    }

    /**
     * Create an instance of {@link ResetSingleAddonCacheResponse }
     * 
     */
    public ResetSingleAddonCacheResponse createResetSingleAddonCacheResponse() {
        return new ResetSingleAddonCacheResponse();
    }

    /**
     * Create an instance of {@link DeleteSavedGameRevisionResponse }
     * 
     */
    public DeleteSavedGameRevisionResponse createDeleteSavedGameRevisionResponse() {
        return new DeleteSavedGameRevisionResponse();
    }

    /**
     * Create an instance of {@link V2GetChangeLog }
     * 
     */
    public V2GetChangeLog createV2GetChangeLog() {
        return new V2GetChangeLog();
    }

    /**
     * Create an instance of {@link GetSavedGameConstraintsResponse }
     * 
     */
    public GetSavedGameConstraintsResponse createGetSavedGameConstraintsResponse() {
        return new GetSavedGameConstraintsResponse();
    }

    /**
     * Create an instance of {@link GetDownloadTokenResponse }
     * 
     */
    public GetDownloadTokenResponse createGetDownloadTokenResponse() {
        return new GetDownloadTokenResponse();
    }

    /**
     * Create an instance of {@link SaveSyncTransactionsResponse }
     * 
     */
    public SaveSyncTransactionsResponse createSaveSyncTransactionsResponse() {
        return new SaveSyncTransactionsResponse();
    }

    /**
     * Create an instance of {@link GetFingerprintMatchesResponse }
     * 
     */
    public GetFingerprintMatchesResponse createGetFingerprintMatchesResponse() {
        return new GetFingerprintMatchesResponse();
    }

    /**
     * Create an instance of {@link LeaveSyncGroup }
     * 
     */
    public LeaveSyncGroup createLeaveSyncGroup() {
        return new LeaveSyncGroup();
    }

    /**
     * Create an instance of {@link LeaveSyncGroupResponse }
     * 
     */
    public LeaveSyncGroupResponse createLeaveSyncGroupResponse() {
        return new LeaveSyncGroupResponse();
    }

    /**
     * Create an instance of {@link V2GetAddOnDescriptionResponse }
     * 
     */
    public V2GetAddOnDescriptionResponse createV2GetAddOnDescriptionResponse() {
        return new V2GetAddOnDescriptionResponse();
    }

    /**
     * Create an instance of {@link JoinSyncGroup }
     * 
     */
    public JoinSyncGroup createJoinSyncGroup() {
        return new JoinSyncGroup();
    }

    /**
     * Create an instance of {@link GetAddOnsResponse }
     * 
     */
    public GetAddOnsResponse createGetAddOnsResponse() {
        return new GetAddOnsResponse();
    }

    /**
     * Create an instance of {@link SaveSyncSnapshotResponse }
     * 
     */
    public SaveSyncSnapshotResponse createSaveSyncSnapshotResponse() {
        return new SaveSyncSnapshotResponse();
    }

    /**
     * Create an instance of {@link GetFuzzyMatchesResponse }
     * 
     */
    public GetFuzzyMatchesResponse createGetFuzzyMatchesResponse() {
        return new GetFuzzyMatchesResponse();
    }

    /**
     * Create an instance of {@link GetFuzzyMatches }
     * 
     */
    public GetFuzzyMatches createGetFuzzyMatches() {
        return new GetFuzzyMatches();
    }

    /**
     * Create an instance of {@link GetChangeLog }
     * 
     */
    public GetChangeLog createGetChangeLog() {
        return new GetChangeLog();
    }

    /**
     * Create an instance of {@link GetSyncProfile }
     * 
     */
    public GetSyncProfile createGetSyncProfile() {
        return new GetSyncProfile();
    }

    /**
     * Create an instance of {@link UploadAvailableForUser }
     * 
     */
    public UploadAvailableForUser createUploadAvailableForUser() {
        return new UploadAvailableForUser();
    }

    /**
     * Create an instance of {@link GetAddOnDescriptionResponse }
     * 
     */
    public GetAddOnDescriptionResponse createGetAddOnDescriptionResponse() {
        return new GetAddOnDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetSavedGameConstraints }
     * 
     */
    public GetSavedGameConstraints createGetSavedGameConstraints() {
        return new GetSavedGameConstraints();
    }

    /**
     * Create an instance of {@link DeleteSavedGameRevision }
     * 
     */
    public DeleteSavedGameRevision createDeleteSavedGameRevision() {
        return new DeleteSavedGameRevision();
    }

    /**
     * Create an instance of {@link SetSavedGameDefaultRevision }
     * 
     */
    public SetSavedGameDefaultRevision createSetSavedGameDefaultRevision() {
        return new SetSavedGameDefaultRevision();
    }

    /**
     * Create an instance of {@link GetSecureDownloadTokenResponse }
     * 
     */
    public GetSecureDownloadTokenResponse createGetSecureDownloadTokenResponse() {
        return new GetSecureDownloadTokenResponse();
    }

    /**
     * Create an instance of {@link GetAddOn }
     * 
     */
    public GetAddOn createGetAddOn() {
        return new GetAddOn();
    }

    /**
     * Create an instance of {@link CacheHealthCheckResponse }
     * 
     */
    public CacheHealthCheckResponse createCacheHealthCheckResponse() {
        return new CacheHealthCheckResponse();
    }

    /**
     * Create an instance of {@link GetSavedGameRestrictionLevel }
     * 
     */
    public GetSavedGameRestrictionLevel createGetSavedGameRestrictionLevel() {
        return new GetSavedGameRestrictionLevel();
    }

    /**
     * Create an instance of {@link GetChangeLogResponse }
     * 
     */
    public GetChangeLogResponse createGetChangeLogResponse() {
        return new GetChangeLogResponse();
    }

    /**
     * Create an instance of {@link V2GetChangeLogResponse }
     * 
     */
    public V2GetChangeLogResponse createV2GetChangeLogResponse() {
        return new V2GetChangeLogResponse();
    }

    /**
     * Create an instance of {@link V2GetAddOnsResponse }
     * 
     */
    public V2GetAddOnsResponse createV2GetAddOnsResponse() {
        return new V2GetAddOnsResponse();
    }

    /**
     * Create an instance of {@link V2GetFingerprintMatches }
     * 
     */
    public V2GetFingerprintMatches createV2GetFingerprintMatches() {
        return new V2GetFingerprintMatches();
    }

    /**
     * Create an instance of {@link GetRepositoryMatchFromSlugResponse }
     * 
     */
    public GetRepositoryMatchFromSlugResponse createGetRepositoryMatchFromSlugResponse() {
        return new GetRepositoryMatchFromSlugResponse();
    }

    /**
     * Create an instance of {@link SaveSyncTransactions }
     * 
     */
    public SaveSyncTransactions createSaveSyncTransactions() {
        return new SaveSyncTransactions();
    }

    /**
     * Create an instance of {@link GetFingerprintMatches }
     * 
     */
    public GetFingerprintMatches createGetFingerprintMatches() {
        return new GetFingerprintMatches();
    }

    /**
     * Create an instance of {@link SetSavedGameDescription }
     * 
     */
    public SetSavedGameDescription createSetSavedGameDescription() {
        return new SetSavedGameDescription();
    }

    /**
     * Create an instance of {@link SetSavedGameDescriptionResponse }
     * 
     */
    public SetSavedGameDescriptionResponse createSetSavedGameDescriptionResponse() {
        return new SetSavedGameDescriptionResponse();
    }

    /**
     * Create an instance of {@link DeleteSavedGame }
     * 
     */
    public DeleteSavedGame createDeleteSavedGame() {
        return new DeleteSavedGame();
    }

    /**
     * Create an instance of {@link SetSavedGameStatus }
     * 
     */
    public SetSavedGameStatus createSetSavedGameStatus() {
        return new SetSavedGameStatus();
    }

    /**
     * Create an instance of {@link GetSavedGamesResponse }
     * 
     */
    public GetSavedGamesResponse createGetSavedGamesResponse() {
        return new GetSavedGamesResponse();
    }

    /**
     * Create an instance of {@link SetSavedGameStatusResponse }
     * 
     */
    public SetSavedGameStatusResponse createSetSavedGameStatusResponse() {
        return new SetSavedGameStatusResponse();
    }

    /**
     * Create an instance of {@link SetSavedGameFavoriteRevision }
     * 
     */
    public SetSavedGameFavoriteRevision createSetSavedGameFavoriteRevision() {
        return new SetSavedGameFavoriteRevision();
    }

    /**
     * Create an instance of {@link SetSavedGameDefaultRevisionResponse }
     * 
     */
    public SetSavedGameDefaultRevisionResponse createSetSavedGameDefaultRevisionResponse() {
        return new SetSavedGameDefaultRevisionResponse();
    }

    /**
     * Create an instance of {@link GetAddOns }
     * 
     */
    public GetAddOns createGetAddOns() {
        return new GetAddOns();
    }

    /**
     * Create an instance of {@link GetDownloadToken }
     * 
     */
    public GetDownloadToken createGetDownloadToken() {
        return new GetDownloadToken();
    }

    /**
     * Create an instance of {@link GetAddOnDump }
     * 
     */
    public GetAddOnDump createGetAddOnDump() {
        return new GetAddOnDump();
    }

    /**
     * Create an instance of {@link SaveSyncSnapshot }
     * 
     */
    public SaveSyncSnapshot createSaveSyncSnapshot() {
        return new SaveSyncSnapshot();
    }

    /**
     * Create an instance of {@link ResetAllAddonCacheResponse }
     * 
     */
    public ResetAllAddonCacheResponse createResetAllAddonCacheResponse() {
        return new ResetAllAddonCacheResponse();
    }

    /**
     * Create an instance of {@link GetAddOnDescription }
     * 
     */
    public GetAddOnDescription createGetAddOnDescription() {
        return new GetAddOnDescription();
    }

    /**
     * Create an instance of {@link SetSavedGameNameResponse }
     * 
     */
    public SetSavedGameNameResponse createSetSavedGameNameResponse() {
        return new SetSavedGameNameResponse();
    }

    /**
     * Create an instance of {@link SetSavedGameRestrictionLevel }
     * 
     */
    public SetSavedGameRestrictionLevel createSetSavedGameRestrictionLevel() {
        return new SetSavedGameRestrictionLevel();
    }

    /**
     * Create an instance of {@link HealthCheckResponse }
     * 
     */
    public HealthCheckResponse createHealthCheckResponse() {
        return new HealthCheckResponse();
    }

    /**
     * Create an instance of {@link V2GetFingerprintMatchesResponse }
     * 
     */
    public V2GetFingerprintMatchesResponse createV2GetFingerprintMatchesResponse() {
        return new V2GetFingerprintMatchesResponse();
    }

    /**
     * Create an instance of {@link GetAllFilesForAddOn }
     * 
     */
    public GetAllFilesForAddOn createGetAllFilesForAddOn() {
        return new GetAllFilesForAddOn();
    }

    /**
     * Create an instance of {@link V2GetAddOns }
     * 
     */
    public V2GetAddOns createV2GetAddOns() {
        return new V2GetAddOns();
    }

    /**
     * Create an instance of {@link GetSavedGameRestrictionLevelResponse }
     * 
     */
    public GetSavedGameRestrictionLevelResponse createGetSavedGameRestrictionLevelResponse() {
        return new GetSavedGameRestrictionLevelResponse();
    }

    /**
     * Create an instance of {@link GetAddOnFile }
     * 
     */
    public GetAddOnFile createGetAddOnFile() {
        return new GetAddOnFile();
    }

    /**
     * Create an instance of {@link JoinSyncGroupResponse }
     * 
     */
    public JoinSyncGroupResponse createJoinSyncGroupResponse() {
        return new JoinSyncGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteSavedGameResponse }
     * 
     */
    public DeleteSavedGameResponse createDeleteSavedGameResponse() {
        return new DeleteSavedGameResponse();
    }

    /**
     * Create an instance of {@link UploadAvailableForUserResponse }
     * 
     */
    public UploadAvailableForUserResponse createUploadAvailableForUserResponse() {
        return new UploadAvailableForUserResponse();
    }

    /**
     * Create an instance of {@link ResetAllAddonCache }
     * 
     */
    public ResetAllAddonCache createResetAllAddonCache() {
        return new ResetAllAddonCache();
    }

    /**
     * Create an instance of {@link GetAllFilesForAddOnResponse }
     * 
     */
    public GetAllFilesForAddOnResponse createGetAllFilesForAddOnResponse() {
        return new GetAllFilesForAddOnResponse();
    }

    /**
     * Create an instance of {@link GetAddOnFileResponse }
     * 
     */
    public GetAddOnFileResponse createGetAddOnFileResponse() {
        return new GetAddOnFileResponse();
    }

    /**
     * Create an instance of {@link SetSavedGameFavoriteRevisionResponse }
     * 
     */
    public SetSavedGameFavoriteRevisionResponse createSetSavedGameFavoriteRevisionResponse() {
        return new SetSavedGameFavoriteRevisionResponse();
    }

    /**
     * Create an instance of {@link GetSavedGames }
     * 
     */
    public GetSavedGames createGetSavedGames() {
        return new GetSavedGames();
    }

    /**
     * Create an instance of {@link SetSavedGameRestrictionLevelResponse }
     * 
     */
    public SetSavedGameRestrictionLevelResponse createSetSavedGameRestrictionLevelResponse() {
        return new SetSavedGameRestrictionLevelResponse();
    }

    /**
     * Create an instance of {@link ResetSingleAddonCache }
     * 
     */
    public ResetSingleAddonCache createResetSingleAddonCache() {
        return new ResetSingleAddonCache();
    }

    /**
     * Create an instance of {@link GetSyncProfileResponse }
     * 
     */
    public GetSyncProfileResponse createGetSyncProfileResponse() {
        return new GetSyncProfileResponse();
    }

    /**
     * Create an instance of {@link CreateSyncGroupResponse }
     * 
     */
    public CreateSyncGroupResponse createCreateSyncGroupResponse() {
        return new CreateSyncGroupResponse();
    }

    /**
     * Create an instance of {@link GetAddOnFiles }
     * 
     */
    public GetAddOnFiles createGetAddOnFiles() {
        return new GetAddOnFiles();
    }

    /**
     * Create an instance of {@link GetAddOnDumpResponse }
     * 
     */
    public GetAddOnDumpResponse createGetAddOnDumpResponse() {
        return new GetAddOnDumpResponse();
    }

    /**
     * Create an instance of {@link V2GetAddOnDescription }
     * 
     */
    public V2GetAddOnDescription createV2GetAddOnDescription() {
        return new V2GetAddOnDescription();
    }

    /**
     * Create an instance of {@link GetAddOnFilesResponse }
     * 
     */
    public GetAddOnFilesResponse createGetAddOnFilesResponse() {
        return new GetAddOnFilesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "addOnFileKeys", scope = GetAddOnFiles.class)
    public JAXBElement<ArrayOfAddOnFileKey> createGetAddOnFilesAddOnFileKeys(ArrayOfAddOnFileKey value) {
        return new JAXBElement<ArrayOfAddOnFileKey>(_GetAddOnFilesAddOnFileKeys_QNAME, ArrayOfAddOnFileKey.class, GetAddOnFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAddOnResult", scope = GetAddOnResponse.class)
    public JAXBElement<AddOn> createGetAddOnResponseGetAddOnResult(AddOn value) {
        return new JAXBElement<AddOn>(_GetAddOnResponseGetAddOnResult_QNAME, AddOn.class, GetAddOnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameNameResult", scope = SetSavedGameNameResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameNameResponseSetSavedGameNameResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameNameResponseSetSavedGameNameResult_QNAME, ServiceResponse.class, SetSavedGameNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceGUID", scope = JoinSyncGroup.class)
    public JAXBElement<String> createJoinSyncGroupInstanceGUID(String value) {
        return new JAXBElement<String>(_JoinSyncGroupInstanceGUID_QNAME, String.class, JoinSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceLabel", scope = JoinSyncGroup.class)
    public JAXBElement<String> createJoinSyncGroupInstanceLabel(String value) {
        return new JAXBElement<String>(_JoinSyncGroupInstanceLabel_QNAME, String.class, JoinSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "computerName", scope = JoinSyncGroup.class)
    public JAXBElement<String> createJoinSyncGroupComputerName(String value) {
        return new JAXBElement<String>(_JoinSyncGroupComputerName_QNAME, String.class, JoinSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceGUID", scope = LeaveSyncGroup.class)
    public JAXBElement<String> createLeaveSyncGroupInstanceGUID(String value) {
        return new JAXBElement<String>(_JoinSyncGroupInstanceGUID_QNAME, String.class, LeaveSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAllFilesForAddOnResult", scope = GetAllFilesForAddOnResponse.class)
    public JAXBElement<ArrayOfAddOnFile> createGetAllFilesForAddOnResponseGetAllFilesForAddOnResult(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_GetAllFilesForAddOnResponseGetAllFilesForAddOnResult_QNAME, ArrayOfAddOnFile.class, GetAllFilesForAddOnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetSyncProfileResult", scope = GetSyncProfileResponse.class)
    public JAXBElement<ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4> createGetSyncProfileResponseGetSyncProfileResult(ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 value) {
        return new JAXBElement<ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4>(_GetSyncProfileResponseGetSyncProfileResult_QNAME, ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 .class, GetSyncProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingerprintMatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "v2GetFingerprintMatchesResult", scope = V2GetFingerprintMatchesResponse.class)
    public JAXBElement<FingerprintMatchResult> createV2GetFingerprintMatchesResponseV2GetFingerprintMatchesResult(FingerprintMatchResult value) {
        return new JAXBElement<FingerprintMatchResult>(_V2GetFingerprintMatchesResponseV2GetFingerprintMatchesResult_QNAME, FingerprintMatchResult.class, V2GetFingerprintMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "ids", scope = V2GetAddOns.class)
    public JAXBElement<ArrayOfint> createV2GetAddOnsIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_V2GetAddOnsIds_QNAME, ArrayOfint.class, V2GetAddOns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderFingerprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "folderFingerprints", scope = GetFuzzyMatches.class)
    public JAXBElement<ArrayOfFolderFingerprint> createGetFuzzyMatchesFolderFingerprints(ArrayOfFolderFingerprint value) {
        return new JAXBElement<ArrayOfFolderFingerprint>(_GetFuzzyMatchesFolderFingerprints_QNAME, ArrayOfFolderFingerprint.class, GetFuzzyMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameRestrictionLevelResult", scope = SetSavedGameRestrictionLevelResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameRestrictionLevelResponseSetSavedGameRestrictionLevelResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameRestrictionLevelResponseSetSavedGameRestrictionLevelResult_QNAME, ServiceResponse.class, SetSavedGameRestrictionLevelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "addonSlug", scope = GetRepositoryMatchFromSlug.class)
    public JAXBElement<String> createGetRepositoryMatchFromSlugAddonSlug(String value) {
        return new JAXBElement<String>(_GetRepositoryMatchFromSlugAddonSlug_QNAME, String.class, GetRepositoryMatchFromSlug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "gameSlug", scope = GetRepositoryMatchFromSlug.class)
    public JAXBElement<String> createGetRepositoryMatchFromSlugGameSlug(String value) {
        return new JAXBElement<String>(_GetRepositoryMatchFromSlugGameSlug_QNAME, String.class, GetRepositoryMatchFromSlug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAddOnFilesResult", scope = GetAddOnFilesResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp> createGetAddOnFilesResponseGetAddOnFilesResult(ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp value) {
        return new JAXBElement<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp>(_GetAddOnFilesResponseGetAddOnFilesResult_QNAME, ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.class, GetAddOnFilesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "v2GetAddOnsResult", scope = V2GetAddOnsResponse.class)
    public JAXBElement<ArrayOfAddOn> createV2GetAddOnsResponseV2GetAddOnsResult(ArrayOfAddOn value) {
        return new JAXBElement<ArrayOfAddOn>(_V2GetAddOnsResponseV2GetAddOnsResult_QNAME, ArrayOfAddOn.class, V2GetAddOnsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameDescriptionResult", scope = SetSavedGameDescriptionResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameDescriptionResponseSetSavedGameDescriptionResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameDescriptionResponseSetSavedGameDescriptionResult_QNAME, ServiceResponse.class, SetSavedGameDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSyncedAddon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "syncedAddons", scope = SaveSyncSnapshot.class)
    public JAXBElement<ArrayOfSyncedAddon> createSaveSyncSnapshotSyncedAddons(ArrayOfSyncedAddon value) {
        return new JAXBElement<ArrayOfSyncedAddon>(_SaveSyncSnapshotSyncedAddons_QNAME, ArrayOfSyncedAddon.class, SaveSyncSnapshot.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAddOnFileResult", scope = GetAddOnFileResponse.class)
    public JAXBElement<AddOnFile> createGetAddOnFileResponseGetAddOnFileResult(AddOnFile value) {
        return new JAXBElement<AddOnFile>(_GetAddOnFileResponseGetAddOnFileResult_QNAME, AddOnFile.class, GetAddOnFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAddOnDescriptionResult", scope = GetAddOnDescriptionResponse.class)
    public JAXBElement<String> createGetAddOnDescriptionResponseGetAddOnDescriptionResult(String value) {
        return new JAXBElement<String>(_GetAddOnDescriptionResponseGetAddOnDescriptionResult_QNAME, String.class, GetAddOnDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "CacheHealthCheckResult", scope = CacheHealthCheckResponse.class)
    public JAXBElement<String> createCacheHealthCheckResponseCacheHealthCheckResult(String value) {
        return new JAXBElement<String>(_CacheHealthCheckResponseCacheHealthCheckResult_QNAME, String.class, CacheHealthCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetChangeLogResult", scope = GetChangeLogResponse.class)
    public JAXBElement<String> createGetChangeLogResponseGetChangeLogResult(String value) {
        return new JAXBElement<String>(_GetChangeLogResponseGetChangeLogResult_QNAME, String.class, GetChangeLogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameDefaultRevisionResult", scope = SetSavedGameDefaultRevisionResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameDefaultRevisionResponseSetSavedGameDefaultRevisionResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameDefaultRevisionResponseSetSavedGameDefaultRevisionResult_QNAME, ServiceResponse.class, SetSavedGameDefaultRevisionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "HealthCheckResult", scope = HealthCheckResponse.class)
    public JAXBElement<String> createHealthCheckResponseHealthCheckResult(String value) {
        return new JAXBElement<String>(_HealthCheckResponseHealthCheckResult_QNAME, String.class, HealthCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetDownloadTokenResult", scope = GetDownloadTokenResponse.class)
    public JAXBElement<DownloadToken> createGetDownloadTokenResponseGetDownloadTokenResult(DownloadToken value) {
        return new JAXBElement<DownloadToken>(_GetDownloadTokenResponseGetDownloadTokenResult_QNAME, DownloadToken.class, GetDownloadTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfSavedGameeheogrl4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetSavedGamesResult", scope = GetSavedGamesResponse.class)
    public JAXBElement<ServiceResponseOfArrayOfSavedGameeheogrl4> createGetSavedGamesResponseGetSavedGamesResult(ServiceResponseOfArrayOfSavedGameeheogrl4 value) {
        return new JAXBElement<ServiceResponseOfArrayOfSavedGameeheogrl4>(_GetSavedGamesResponseGetSavedGamesResult_QNAME, ServiceResponseOfArrayOfSavedGameeheogrl4 .class, GetSavedGamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfSyncedGameInstanceeheogrl4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "CreateSyncGroupResult", scope = CreateSyncGroupResponse.class)
    public JAXBElement<ServiceResponseOfSyncedGameInstanceeheogrl4> createCreateSyncGroupResponseCreateSyncGroupResult(ServiceResponseOfSyncedGameInstanceeheogrl4 value) {
        return new JAXBElement<ServiceResponseOfSyncedGameInstanceeheogrl4>(_CreateSyncGroupResponseCreateSyncGroupResult_QNAME, ServiceResponseOfSyncedGameInstanceeheogrl4 .class, CreateSyncGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "LeaveSyncGroupResult", scope = LeaveSyncGroupResponse.class)
    public JAXBElement<ServiceResponse> createLeaveSyncGroupResponseLeaveSyncGroupResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_LeaveSyncGroupResponseLeaveSyncGroupResult_QNAME, ServiceResponse.class, LeaveSyncGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SaveSyncSnapshotResult", scope = SaveSyncSnapshotResponse.class)
    public JAXBElement<ServiceResponse> createSaveSyncSnapshotResponseSaveSyncSnapshotResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SaveSyncSnapshotResponseSaveSyncSnapshotResult_QNAME, ServiceResponse.class, SaveSyncSnapshotResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "name", scope = SetSavedGameName.class)
    public JAXBElement<String> createSetSavedGameNameName(String value) {
        return new JAXBElement<String>(_SetSavedGameNameName_QNAME, String.class, SetSavedGameName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetSecureDownloadTokenResult", scope = GetSecureDownloadTokenResponse.class)
    public JAXBElement<DownloadToken> createGetSecureDownloadTokenResponseGetSecureDownloadTokenResult(DownloadToken value) {
        return new JAXBElement<DownloadToken>(_GetSecureDownloadTokenResponseGetSecureDownloadTokenResult_QNAME, DownloadToken.class, GetSecureDownloadTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSyncTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "transactions", scope = SaveSyncTransactions.class)
    public JAXBElement<ArrayOfSyncTransaction> createSaveSyncTransactionsTransactions(ArrayOfSyncTransaction value) {
        return new JAXBElement<ArrayOfSyncTransaction>(_SaveSyncTransactionsTransactions_QNAME, ArrayOfSyncTransaction.class, SaveSyncTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SaveSyncTransactionsResult", scope = SaveSyncTransactionsResponse.class)
    public JAXBElement<ServiceResponse> createSaveSyncTransactionsResponseSaveSyncTransactionsResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SaveSyncTransactionsResponseSaveSyncTransactionsResult_QNAME, ServiceResponse.class, SaveSyncTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfESavedGameRestrictionLeveleheogrl4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetSavedGameRestrictionLevelResult", scope = GetSavedGameRestrictionLevelResponse.class)
    public JAXBElement<ServiceResponseOfESavedGameRestrictionLeveleheogrl4> createGetSavedGameRestrictionLevelResponseGetSavedGameRestrictionLevelResult(ServiceResponseOfESavedGameRestrictionLeveleheogrl4 value) {
        return new JAXBElement<ServiceResponseOfESavedGameRestrictionLeveleheogrl4>(_GetSavedGameRestrictionLevelResponseGetSavedGameRestrictionLevelResult_QNAME, ServiceResponseOfESavedGameRestrictionLeveleheogrl4 .class, GetSavedGameRestrictionLevelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "DeleteSavedGameResult", scope = DeleteSavedGameResponse.class)
    public JAXBElement<ServiceResponse> createDeleteSavedGameResponseDeleteSavedGameResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_DeleteSavedGameResponseDeleteSavedGameResult_QNAME, ServiceResponse.class, DeleteSavedGameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "UploadAvailableForUserResult", scope = UploadAvailableForUserResponse.class)
    public JAXBElement<ServiceResponse> createUploadAvailableForUserResponseUploadAvailableForUserResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_UploadAvailableForUserResponseUploadAvailableForUserResult_QNAME, ServiceResponse.class, UploadAvailableForUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFuzzyMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetFuzzyMatchesResult", scope = GetFuzzyMatchesResponse.class)
    public JAXBElement<ArrayOfFuzzyMatch> createGetFuzzyMatchesResponseGetFuzzyMatchesResult(ArrayOfFuzzyMatch value) {
        return new JAXBElement<ArrayOfFuzzyMatch>(_GetFuzzyMatchesResponseGetFuzzyMatchesResult_QNAME, ArrayOfFuzzyMatch.class, GetFuzzyMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseOfSavedGameConstraintseheogrl4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetSavedGameConstraintsResult", scope = GetSavedGameConstraintsResponse.class)
    public JAXBElement<ServiceResponseOfSavedGameConstraintseheogrl4> createGetSavedGameConstraintsResponseGetSavedGameConstraintsResult(ServiceResponseOfSavedGameConstraintseheogrl4 value) {
        return new JAXBElement<ServiceResponseOfSavedGameConstraintseheogrl4>(_GetSavedGameConstraintsResponseGetSavedGameConstraintsResult_QNAME, ServiceResponseOfSavedGameConstraintseheogrl4 .class, GetSavedGameConstraintsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "fingerprints", scope = V2GetFingerprintMatches.class)
    public JAXBElement<ArrayOflong> createV2GetFingerprintMatchesFingerprints(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_V2GetFingerprintMatchesFingerprints_QNAME, ArrayOflong.class, V2GetFingerprintMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingerprintMatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetFingerprintMatchesResult", scope = GetFingerprintMatchesResponse.class)
    public JAXBElement<FingerprintMatchResult> createGetFingerprintMatchesResponseGetFingerprintMatchesResult(FingerprintMatchResult value) {
        return new JAXBElement<FingerprintMatchResult>(_GetFingerprintMatchesResponseGetFingerprintMatchesResult_QNAME, FingerprintMatchResult.class, GetFingerprintMatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "description", scope = SetSavedGameDescription.class)
    public JAXBElement<String> createSetSavedGameDescriptionDescription(String value) {
        return new JAXBElement<String>(_SetSavedGameDescriptionDescription_QNAME, String.class, SetSavedGameDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "ids", scope = GetAddOns.class)
    public JAXBElement<ArrayOfint> createGetAddOnsIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_V2GetAddOnsIds_QNAME, ArrayOfint.class, GetAddOns.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameFavoriteRevisionResult", scope = SetSavedGameFavoriteRevisionResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameFavoriteRevisionResponseSetSavedGameFavoriteRevisionResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameFavoriteRevisionResponseSetSavedGameFavoriteRevisionResult_QNAME, ServiceResponse.class, SetSavedGameFavoriteRevisionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "DeleteSavedGameRevisionResult", scope = DeleteSavedGameRevisionResponse.class)
    public JAXBElement<ServiceResponse> createDeleteSavedGameRevisionResponseDeleteSavedGameRevisionResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_DeleteSavedGameRevisionResponseDeleteSavedGameRevisionResult_QNAME, ServiceResponse.class, DeleteSavedGameRevisionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceGUID", scope = CreateSyncGroup.class)
    public JAXBElement<String> createCreateSyncGroupInstanceGUID(String value) {
        return new JAXBElement<String>(_JoinSyncGroupInstanceGUID_QNAME, String.class, CreateSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceLabel", scope = CreateSyncGroup.class)
    public JAXBElement<String> createCreateSyncGroupInstanceLabel(String value) {
        return new JAXBElement<String>(_JoinSyncGroupInstanceLabel_QNAME, String.class, CreateSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "instanceName", scope = CreateSyncGroup.class)
    public JAXBElement<String> createCreateSyncGroupInstanceName(String value) {
        return new JAXBElement<String>(_CreateSyncGroupInstanceName_QNAME, String.class, CreateSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "computerName", scope = CreateSyncGroup.class)
    public JAXBElement<String> createCreateSyncGroupComputerName(String value) {
        return new JAXBElement<String>(_JoinSyncGroupComputerName_QNAME, String.class, CreateSyncGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetAddOnsResult", scope = GetAddOnsResponse.class)
    public JAXBElement<ArrayOfAddOn> createGetAddOnsResponseGetAddOnsResult(ArrayOfAddOn value) {
        return new JAXBElement<ArrayOfAddOn>(_GetAddOnsResponseGetAddOnsResult_QNAME, ArrayOfAddOn.class, GetAddOnsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "SetSavedGameStatusResult", scope = SetSavedGameStatusResponse.class)
    public JAXBElement<ServiceResponse> createSetSavedGameStatusResponseSetSavedGameStatusResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_SetSavedGameStatusResponseSetSavedGameStatusResult_QNAME, ServiceResponse.class, SetSavedGameStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "GetRepositoryMatchFromSlugResult", scope = GetRepositoryMatchFromSlugResponse.class)
    public JAXBElement<RepositoryMatch> createGetRepositoryMatchFromSlugResponseGetRepositoryMatchFromSlugResult(RepositoryMatch value) {
        return new JAXBElement<RepositoryMatch>(_GetRepositoryMatchFromSlugResponseGetRepositoryMatchFromSlugResult_QNAME, RepositoryMatch.class, GetRepositoryMatchFromSlugResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "v2GetChangeLogResult", scope = V2GetChangeLogResponse.class)
    public JAXBElement<String> createV2GetChangeLogResponseV2GetChangeLogResult(String value) {
        return new JAXBElement<String>(_V2GetChangeLogResponseV2GetChangeLogResult_QNAME, String.class, V2GetChangeLogResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "v2GetAddOnDescriptionResult", scope = V2GetAddOnDescriptionResponse.class)
    public JAXBElement<String> createV2GetAddOnDescriptionResponseV2GetAddOnDescriptionResult(String value) {
        return new JAXBElement<String>(_V2GetAddOnDescriptionResponseV2GetAddOnDescriptionResult_QNAME, String.class, V2GetAddOnDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "fingerprints", scope = GetFingerprintMatches.class)
    public JAXBElement<ArrayOflong> createGetFingerprintMatchesFingerprints(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_V2GetFingerprintMatchesFingerprints_QNAME, ArrayOflong.class, GetFingerprintMatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "ResetAllAddonCacheResult", scope = ResetAllAddonCacheResponse.class)
    public JAXBElement<String> createResetAllAddonCacheResponseResetAllAddonCacheResult(String value) {
        return new JAXBElement<String>(_ResetAllAddonCacheResponseResetAllAddonCacheResult_QNAME, String.class, ResetAllAddonCacheResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "JoinSyncGroupResult", scope = JoinSyncGroupResponse.class)
    public JAXBElement<ServiceResponse> createJoinSyncGroupResponseJoinSyncGroupResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_JoinSyncGroupResponseJoinSyncGroupResult_QNAME, ServiceResponse.class, JoinSyncGroupResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://addonservice.curse.com/", name = "ResetSingleAddonCacheResult", scope = ResetSingleAddonCacheResponse.class)
    public JAXBElement<String> createResetSingleAddonCacheResponseResetSingleAddonCacheResult(String value) {
        return new JAXBElement<String>(_ResetSingleAddonCacheResponseResetSingleAddonCacheResult_QNAME, String.class, ResetSingleAddonCacheResponse.class, value);
    }

}
