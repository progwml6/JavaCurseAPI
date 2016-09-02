
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.curse.ArrayOfGameVersionLatestFile;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the addons.curse package. 
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

    private final static QName _AddOnAttachment_QNAME = new QName("Curse.AddOns", "AddOnAttachment");
    private final static QName _AddOnFileDependency_QNAME = new QName("Curse.AddOns", "AddOnFileDependency");
    private final static QName _FingerprintMatch_QNAME = new QName("Curse.AddOns", "FingerprintMatch");
    private final static QName _DownloadToken_QNAME = new QName("Curse.AddOns", "DownloadToken");
    private final static QName _AddOnModule_QNAME = new QName("Curse.AddOns", "AddOnModule");
    private final static QName _ArrayOfAddOnCategory_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnCategory");
    private final static QName _ArrayOfAddOnFile_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnFile");
    private final static QName _ArrayOfAddOnAuthor_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnAuthor");
    private final static QName _CategorySection_QNAME = new QName("Curse.AddOns", "CategorySection");
    private final static QName _ArrayOfAddOn_QNAME = new QName("Curse.AddOns", "ArrayOfAddOn");
    private final static QName _AddOnCategory_QNAME = new QName("Curse.AddOns", "AddOnCategory");
    private final static QName _FuzzyMatch_QNAME = new QName("Curse.AddOns", "FuzzyMatch");
    private final static QName _ArrayOfFingerprintMatch_QNAME = new QName("Curse.AddOns", "ArrayOfFingerprintMatch");
    private final static QName _ArrayOfAddOnModule_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnModule");
    private final static QName _FingerprintMatchResult_QNAME = new QName("Curse.AddOns", "FingerprintMatchResult");
    private final static QName _AddOn_QNAME = new QName("Curse.AddOns", "AddOn");
    private final static QName _ArrayOfAddOnAttachment_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnAttachment");
    private final static QName _AddOnFile_QNAME = new QName("Curse.AddOns", "AddOnFile");
    private final static QName _ArrayOfAddOnFileDependency_QNAME = new QName("Curse.AddOns", "ArrayOfAddOnFileDependency");
    private final static QName _AddOnAuthor_QNAME = new QName("Curse.AddOns", "AddOnAuthor");
    private final static QName _ArrayOfFuzzyMatch_QNAME = new QName("Curse.AddOns", "ArrayOfFuzzyMatch");
    private final static QName _AddOnModuleFoldername_QNAME = new QName("Curse.AddOns", "Foldername");
    private final static QName _AddOnPrimaryCategoryName_QNAME = new QName("Curse.AddOns", "PrimaryCategoryName");
    private final static QName _AddOnExternalUrl_QNAME = new QName("Curse.AddOns", "ExternalUrl");
    private final static QName _AddOnAttachments_QNAME = new QName("Curse.AddOns", "Attachments");
    private final static QName _AddOnLatestFiles_QNAME = new QName("Curse.AddOns", "LatestFiles");
    private final static QName _AddOnName_QNAME = new QName("Curse.AddOns", "Name");
    private final static QName _AddOnCategories_QNAME = new QName("Curse.AddOns", "Categories");
    private final static QName _AddOnAuthors_QNAME = new QName("Curse.AddOns", "Authors");
    private final static QName _AddOnSummary_QNAME = new QName("Curse.AddOns", "Summary");
    private final static QName _AddOnWebSiteURL_QNAME = new QName("Curse.AddOns", "WebSiteURL");
    private final static QName _AddOnGameVersionLatestFiles_QNAME = new QName("Curse.AddOns", "GameVersionLatestFiles");
    private final static QName _AddOnPrimaryAuthorName_QNAME = new QName("Curse.AddOns", "PrimaryAuthorName");
    private final static QName _AddOnDonationUrl_QNAME = new QName("Curse.AddOns", "DonationUrl");
    private final static QName _AddOnPrimaryCategoryAvatarUrl_QNAME = new QName("Curse.AddOns", "PrimaryCategoryAvatarUrl");
    private final static QName _AddOnAvatarUrl_QNAME = new QName("Curse.AddOns", "AvatarUrl");
    private final static QName _AddOnAuthorUrl_QNAME = new QName("Curse.AddOns", "Url");
    private final static QName _AddOnFileDependencies_QNAME = new QName("Curse.AddOns", "Dependencies");
    private final static QName _AddOnFileDownloadURL_QNAME = new QName("Curse.AddOns", "DownloadURL");
    private final static QName _AddOnFileGameVersion_QNAME = new QName("Curse.AddOns", "GameVersion");
    private final static QName _AddOnFileFileNameOnDisk_QNAME = new QName("Curse.AddOns", "FileNameOnDisk");
    private final static QName _AddOnFileFileName_QNAME = new QName("Curse.AddOns", "FileName");
    private final static QName _AddOnFileModules_QNAME = new QName("Curse.AddOns", "Modules");
    private final static QName _DownloadTokenIPAddress_QNAME = new QName("Curse.AddOns", "IPAddress");
    private final static QName _AddOnAttachmentTitle_QNAME = new QName("Curse.AddOns", "Title");
    private final static QName _AddOnAttachmentDescription_QNAME = new QName("Curse.AddOns", "Description");
    private final static QName _AddOnAttachmentThumbnailUrl_QNAME = new QName("Curse.AddOns", "ThumbnailUrl");
    private final static QName _FingerprintMatchFile_QNAME = new QName("Curse.AddOns", "File");
    private final static QName _CategorySectionInitialInclusionPattern_QNAME = new QName("Curse.AddOns", "InitialInclusionPattern");
    private final static QName _CategorySectionPath_QNAME = new QName("Curse.AddOns", "Path");
    private final static QName _CategorySectionExtraIncludePattern_QNAME = new QName("Curse.AddOns", "ExtraIncludePattern");
    private final static QName _FingerprintMatchResultExactMatches_QNAME = new QName("Curse.AddOns", "ExactMatches");
    private final static QName _FingerprintMatchResultPartialMatches_QNAME = new QName("Curse.AddOns", "PartialMatches");
    private final static QName _AddOnCategoryURL_QNAME = new QName("Curse.AddOns", "URL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: addons.curse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOn }
     * 
     */
    public AddOn createAddOn() {
        return new AddOn();
    }

    /**
     * Create an instance of {@link DownloadToken }
     * 
     */
    public DownloadToken createDownloadToken() {
        return new DownloadToken();
    }

    /**
     * Create an instance of {@link FingerprintMatchResult }
     * 
     */
    public FingerprintMatchResult createFingerprintMatchResult() {
        return new FingerprintMatchResult();
    }

    /**
     * Create an instance of {@link ArrayOfAddOn }
     * 
     */
    public ArrayOfAddOn createArrayOfAddOn() {
        return new ArrayOfAddOn();
    }

    /**
     * Create an instance of {@link ArrayOfFuzzyMatch }
     * 
     */
    public ArrayOfFuzzyMatch createArrayOfFuzzyMatch() {
        return new ArrayOfFuzzyMatch();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnFile }
     * 
     */
    public ArrayOfAddOnFile createArrayOfAddOnFile() {
        return new ArrayOfAddOnFile();
    }

    /**
     * Create an instance of {@link AddOnFile }
     * 
     */
    public AddOnFile createAddOnFile() {
        return new AddOnFile();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnAttachment }
     * 
     */
    public ArrayOfAddOnAttachment createArrayOfAddOnAttachment() {
        return new ArrayOfAddOnAttachment();
    }

    /**
     * Create an instance of {@link AddOnAttachment }
     * 
     */
    public AddOnAttachment createAddOnAttachment() {
        return new AddOnAttachment();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnAuthor }
     * 
     */
    public ArrayOfAddOnAuthor createArrayOfAddOnAuthor() {
        return new ArrayOfAddOnAuthor();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnCategory }
     * 
     */
    public ArrayOfAddOnCategory createArrayOfAddOnCategory() {
        return new ArrayOfAddOnCategory();
    }

    /**
     * Create an instance of {@link CategorySection }
     * 
     */
    public CategorySection createCategorySection() {
        return new CategorySection();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnFileDependency }
     * 
     */
    public ArrayOfAddOnFileDependency createArrayOfAddOnFileDependency() {
        return new ArrayOfAddOnFileDependency();
    }

    /**
     * Create an instance of {@link AddOnAuthor }
     * 
     */
    public AddOnAuthor createAddOnAuthor() {
        return new AddOnAuthor();
    }

    /**
     * Create an instance of {@link AddOnCategory }
     * 
     */
    public AddOnCategory createAddOnCategory() {
        return new AddOnCategory();
    }

    /**
     * Create an instance of {@link AddOnFileDependency }
     * 
     */
    public AddOnFileDependency createAddOnFileDependency() {
        return new AddOnFileDependency();
    }

    /**
     * Create an instance of {@link FuzzyMatch }
     * 
     */
    public FuzzyMatch createFuzzyMatch() {
        return new FuzzyMatch();
    }

    /**
     * Create an instance of {@link ArrayOfFingerprintMatch }
     * 
     */
    public ArrayOfFingerprintMatch createArrayOfFingerprintMatch() {
        return new ArrayOfFingerprintMatch();
    }

    /**
     * Create an instance of {@link FingerprintMatch }
     * 
     */
    public FingerprintMatch createFingerprintMatch() {
        return new FingerprintMatch();
    }

    /**
     * Create an instance of {@link ArrayOfAddOnModule }
     * 
     */
    public ArrayOfAddOnModule createArrayOfAddOnModule() {
        return new ArrayOfAddOnModule();
    }

    /**
     * Create an instance of {@link AddOnModule }
     * 
     */
    public AddOnModule createAddOnModule() {
        return new AddOnModule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnAttachment")
    public JAXBElement<AddOnAttachment> createAddOnAttachment(AddOnAttachment value) {
        return new JAXBElement<AddOnAttachment>(_AddOnAttachment_QNAME, AddOnAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFileDependency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnFileDependency")
    public JAXBElement<AddOnFileDependency> createAddOnFileDependency(AddOnFileDependency value) {
        return new JAXBElement<AddOnFileDependency>(_AddOnFileDependency_QNAME, AddOnFileDependency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingerprintMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "FingerprintMatch")
    public JAXBElement<FingerprintMatch> createFingerprintMatch(FingerprintMatch value) {
        return new JAXBElement<FingerprintMatch>(_FingerprintMatch_QNAME, FingerprintMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "DownloadToken")
    public JAXBElement<DownloadToken> createDownloadToken(DownloadToken value) {
        return new JAXBElement<DownloadToken>(_DownloadToken_QNAME, DownloadToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnModule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnModule")
    public JAXBElement<AddOnModule> createAddOnModule(AddOnModule value) {
        return new JAXBElement<AddOnModule>(_AddOnModule_QNAME, AddOnModule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnCategory")
    public JAXBElement<ArrayOfAddOnCategory> createArrayOfAddOnCategory(ArrayOfAddOnCategory value) {
        return new JAXBElement<ArrayOfAddOnCategory>(_ArrayOfAddOnCategory_QNAME, ArrayOfAddOnCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnFile")
    public JAXBElement<ArrayOfAddOnFile> createArrayOfAddOnFile(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_ArrayOfAddOnFile_QNAME, ArrayOfAddOnFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnAuthor")
    public JAXBElement<ArrayOfAddOnAuthor> createArrayOfAddOnAuthor(ArrayOfAddOnAuthor value) {
        return new JAXBElement<ArrayOfAddOnAuthor>(_ArrayOfAddOnAuthor_QNAME, ArrayOfAddOnAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "CategorySection")
    public JAXBElement<CategorySection> createCategorySection(CategorySection value) {
        return new JAXBElement<CategorySection>(_CategorySection_QNAME, CategorySection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOn")
    public JAXBElement<ArrayOfAddOn> createArrayOfAddOn(ArrayOfAddOn value) {
        return new JAXBElement<ArrayOfAddOn>(_ArrayOfAddOn_QNAME, ArrayOfAddOn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnCategory")
    public JAXBElement<AddOnCategory> createAddOnCategory(AddOnCategory value) {
        return new JAXBElement<AddOnCategory>(_AddOnCategory_QNAME, AddOnCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuzzyMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "FuzzyMatch")
    public JAXBElement<FuzzyMatch> createFuzzyMatch(FuzzyMatch value) {
        return new JAXBElement<FuzzyMatch>(_FuzzyMatch_QNAME, FuzzyMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfFingerprintMatch")
    public JAXBElement<ArrayOfFingerprintMatch> createArrayOfFingerprintMatch(ArrayOfFingerprintMatch value) {
        return new JAXBElement<ArrayOfFingerprintMatch>(_ArrayOfFingerprintMatch_QNAME, ArrayOfFingerprintMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnModule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnModule")
    public JAXBElement<ArrayOfAddOnModule> createArrayOfAddOnModule(ArrayOfAddOnModule value) {
        return new JAXBElement<ArrayOfAddOnModule>(_ArrayOfAddOnModule_QNAME, ArrayOfAddOnModule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FingerprintMatchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "FingerprintMatchResult")
    public JAXBElement<FingerprintMatchResult> createFingerprintMatchResult(FingerprintMatchResult value) {
        return new JAXBElement<FingerprintMatchResult>(_FingerprintMatchResult_QNAME, FingerprintMatchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOn")
    public JAXBElement<AddOn> createAddOn(AddOn value) {
        return new JAXBElement<AddOn>(_AddOn_QNAME, AddOn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnAttachment")
    public JAXBElement<ArrayOfAddOnAttachment> createArrayOfAddOnAttachment(ArrayOfAddOnAttachment value) {
        return new JAXBElement<ArrayOfAddOnAttachment>(_ArrayOfAddOnAttachment_QNAME, ArrayOfAddOnAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnFile")
    public JAXBElement<AddOnFile> createAddOnFile(AddOnFile value) {
        return new JAXBElement<AddOnFile>(_AddOnFile_QNAME, AddOnFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileDependency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfAddOnFileDependency")
    public JAXBElement<ArrayOfAddOnFileDependency> createArrayOfAddOnFileDependency(ArrayOfAddOnFileDependency value) {
        return new JAXBElement<ArrayOfAddOnFileDependency>(_ArrayOfAddOnFileDependency_QNAME, ArrayOfAddOnFileDependency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AddOnAuthor")
    public JAXBElement<AddOnAuthor> createAddOnAuthor(AddOnAuthor value) {
        return new JAXBElement<AddOnAuthor>(_AddOnAuthor_QNAME, AddOnAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFuzzyMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ArrayOfFuzzyMatch")
    public JAXBElement<ArrayOfFuzzyMatch> createArrayOfFuzzyMatch(ArrayOfFuzzyMatch value) {
        return new JAXBElement<ArrayOfFuzzyMatch>(_ArrayOfFuzzyMatch_QNAME, ArrayOfFuzzyMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Foldername", scope = AddOnModule.class)
    public JAXBElement<String> createAddOnModuleFoldername(String value) {
        return new JAXBElement<String>(_AddOnModuleFoldername_QNAME, String.class, AddOnModule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "PrimaryCategoryName", scope = AddOn.class)
    public JAXBElement<String> createAddOnPrimaryCategoryName(String value) {
        return new JAXBElement<String>(_AddOnPrimaryCategoryName_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ExternalUrl", scope = AddOn.class)
    public JAXBElement<String> createAddOnExternalUrl(String value) {
        return new JAXBElement<String>(_AddOnExternalUrl_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Attachments", scope = AddOn.class)
    public JAXBElement<ArrayOfAddOnAttachment> createAddOnAttachments(ArrayOfAddOnAttachment value) {
        return new JAXBElement<ArrayOfAddOnAttachment>(_AddOnAttachments_QNAME, ArrayOfAddOnAttachment.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "LatestFiles", scope = AddOn.class)
    public JAXBElement<ArrayOfAddOnFile> createAddOnLatestFiles(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_AddOnLatestFiles_QNAME, ArrayOfAddOnFile.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Name", scope = AddOn.class)
    public JAXBElement<String> createAddOnName(String value) {
        return new JAXBElement<String>(_AddOnName_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Categories", scope = AddOn.class)
    public JAXBElement<ArrayOfAddOnCategory> createAddOnCategories(ArrayOfAddOnCategory value) {
        return new JAXBElement<ArrayOfAddOnCategory>(_AddOnCategories_QNAME, ArrayOfAddOnCategory.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Authors", scope = AddOn.class)
    public JAXBElement<ArrayOfAddOnAuthor> createAddOnAuthors(ArrayOfAddOnAuthor value) {
        return new JAXBElement<ArrayOfAddOnAuthor>(_AddOnAuthors_QNAME, ArrayOfAddOnAuthor.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Summary", scope = AddOn.class)
    public JAXBElement<String> createAddOnSummary(String value) {
        return new JAXBElement<String>(_AddOnSummary_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "WebSiteURL", scope = AddOn.class)
    public JAXBElement<String> createAddOnWebSiteURL(String value) {
        return new JAXBElement<String>(_AddOnWebSiteURL_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGameVersionLatestFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "GameVersionLatestFiles", scope = AddOn.class)
    public JAXBElement<ArrayOfGameVersionLatestFile> createAddOnGameVersionLatestFiles(ArrayOfGameVersionLatestFile value) {
        return new JAXBElement<ArrayOfGameVersionLatestFile>(_AddOnGameVersionLatestFiles_QNAME, ArrayOfGameVersionLatestFile.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "PrimaryAuthorName", scope = AddOn.class)
    public JAXBElement<String> createAddOnPrimaryAuthorName(String value) {
        return new JAXBElement<String>(_AddOnPrimaryAuthorName_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "DonationUrl", scope = AddOn.class)
    public JAXBElement<String> createAddOnDonationUrl(String value) {
        return new JAXBElement<String>(_AddOnDonationUrl_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "PrimaryCategoryAvatarUrl", scope = AddOn.class)
    public JAXBElement<String> createAddOnPrimaryCategoryAvatarUrl(String value) {
        return new JAXBElement<String>(_AddOnPrimaryCategoryAvatarUrl_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "CategorySection", scope = AddOn.class)
    public JAXBElement<CategorySection> createAddOnCategorySection(CategorySection value) {
        return new JAXBElement<CategorySection>(_CategorySection_QNAME, CategorySection.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "AvatarUrl", scope = AddOn.class)
    public JAXBElement<String> createAddOnAvatarUrl(String value) {
        return new JAXBElement<String>(_AddOnAvatarUrl_QNAME, String.class, AddOn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Name", scope = AddOnAuthor.class)
    public JAXBElement<String> createAddOnAuthorName(String value) {
        return new JAXBElement<String>(_AddOnName_QNAME, String.class, AddOnAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Url", scope = AddOnAuthor.class)
    public JAXBElement<String> createAddOnAuthorUrl(String value) {
        return new JAXBElement<String>(_AddOnAuthorUrl_QNAME, String.class, AddOnAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileDependency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Dependencies", scope = AddOnFile.class)
    public JAXBElement<ArrayOfAddOnFileDependency> createAddOnFileDependencies(ArrayOfAddOnFileDependency value) {
        return new JAXBElement<ArrayOfAddOnFileDependency>(_AddOnFileDependencies_QNAME, ArrayOfAddOnFileDependency.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "DownloadURL", scope = AddOnFile.class)
    public JAXBElement<String> createAddOnFileDownloadURL(String value) {
        return new JAXBElement<String>(_AddOnFileDownloadURL_QNAME, String.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "GameVersion", scope = AddOnFile.class)
    public JAXBElement<ArrayOfstring> createAddOnFileGameVersion(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AddOnFileGameVersion_QNAME, ArrayOfstring.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "FileNameOnDisk", scope = AddOnFile.class)
    public JAXBElement<String> createAddOnFileFileNameOnDisk(String value) {
        return new JAXBElement<String>(_AddOnFileFileNameOnDisk_QNAME, String.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "FileName", scope = AddOnFile.class)
    public JAXBElement<String> createAddOnFileFileName(String value) {
        return new JAXBElement<String>(_AddOnFileFileName_QNAME, String.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnModule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Modules", scope = AddOnFile.class)
    public JAXBElement<ArrayOfAddOnModule> createAddOnFileModules(ArrayOfAddOnModule value) {
        return new JAXBElement<ArrayOfAddOnModule>(_AddOnFileModules_QNAME, ArrayOfAddOnModule.class, AddOnFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "IPAddress", scope = DownloadToken.class)
    public JAXBElement<String> createDownloadTokenIPAddress(String value) {
        return new JAXBElement<String>(_DownloadTokenIPAddress_QNAME, String.class, DownloadToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Title", scope = AddOnAttachment.class)
    public JAXBElement<String> createAddOnAttachmentTitle(String value) {
        return new JAXBElement<String>(_AddOnAttachmentTitle_QNAME, String.class, AddOnAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Url", scope = AddOnAttachment.class)
    public JAXBElement<String> createAddOnAttachmentUrl(String value) {
        return new JAXBElement<String>(_AddOnAuthorUrl_QNAME, String.class, AddOnAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Description", scope = AddOnAttachment.class)
    public JAXBElement<String> createAddOnAttachmentDescription(String value) {
        return new JAXBElement<String>(_AddOnAttachmentDescription_QNAME, String.class, AddOnAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ThumbnailUrl", scope = AddOnAttachment.class)
    public JAXBElement<String> createAddOnAttachmentThumbnailUrl(String value) {
        return new JAXBElement<String>(_AddOnAttachmentThumbnailUrl_QNAME, String.class, AddOnAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "File", scope = FingerprintMatch.class)
    public JAXBElement<AddOnFile> createFingerprintMatchFile(AddOnFile value) {
        return new JAXBElement<AddOnFile>(_FingerprintMatchFile_QNAME, AddOnFile.class, FingerprintMatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "LatestFiles", scope = FingerprintMatch.class)
    public JAXBElement<ArrayOfAddOnFile> createFingerprintMatchLatestFiles(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_AddOnLatestFiles_QNAME, ArrayOfAddOnFile.class, FingerprintMatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "File", scope = FuzzyMatch.class)
    public JAXBElement<AddOnFile> createFuzzyMatchFile(AddOnFile value) {
        return new JAXBElement<AddOnFile>(_FingerprintMatchFile_QNAME, AddOnFile.class, FuzzyMatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "LatestFiles", scope = FuzzyMatch.class)
    public JAXBElement<ArrayOfAddOnFile> createFuzzyMatchLatestFiles(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_AddOnLatestFiles_QNAME, ArrayOfAddOnFile.class, FuzzyMatch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "InitialInclusionPattern", scope = CategorySection.class)
    public JAXBElement<String> createCategorySectionInitialInclusionPattern(String value) {
        return new JAXBElement<String>(_CategorySectionInitialInclusionPattern_QNAME, String.class, CategorySection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Name", scope = CategorySection.class)
    public JAXBElement<String> createCategorySectionName(String value) {
        return new JAXBElement<String>(_AddOnName_QNAME, String.class, CategorySection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Path", scope = CategorySection.class)
    public JAXBElement<String> createCategorySectionPath(String value) {
        return new JAXBElement<String>(_CategorySectionPath_QNAME, String.class, CategorySection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ExtraIncludePattern", scope = CategorySection.class)
    public JAXBElement<String> createCategorySectionExtraIncludePattern(String value) {
        return new JAXBElement<String>(_CategorySectionExtraIncludePattern_QNAME, String.class, CategorySection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "ExactMatches", scope = FingerprintMatchResult.class)
    public JAXBElement<ArrayOfFingerprintMatch> createFingerprintMatchResultExactMatches(ArrayOfFingerprintMatch value) {
        return new JAXBElement<ArrayOfFingerprintMatch>(_FingerprintMatchResultExactMatches_QNAME, ArrayOfFingerprintMatch.class, FingerprintMatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "PartialMatches", scope = FingerprintMatchResult.class)
    public JAXBElement<ArrayOfFingerprintMatch> createFingerprintMatchResultPartialMatches(ArrayOfFingerprintMatch value) {
        return new JAXBElement<ArrayOfFingerprintMatch>(_FingerprintMatchResultPartialMatches_QNAME, ArrayOfFingerprintMatch.class, FingerprintMatchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "Name", scope = AddOnCategory.class)
    public JAXBElement<String> createAddOnCategoryName(String value) {
        return new JAXBElement<String>(_AddOnName_QNAME, String.class, AddOnCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Curse.AddOns", name = "URL", scope = AddOnCategory.class)
    public JAXBElement<String> createAddOnCategoryURL(String value) {
        return new JAXBElement<String>(_AddOnCategoryURL_QNAME, String.class, AddOnCategory.class, value);
    }

}
