
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse.ArrayOfGameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse.PackageTypes;
import org.datacontract.schemas._2004._07.curse.ProjectStage;
import org.datacontract.schemas._2004._07.curse.ProjectStatus;


/**
 * <p>Java class for AddOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{Curse.AddOns}ArrayOfAddOnAttachment" minOccurs="0"/>
 *         &lt;element name="Authors" type="{Curse.AddOns}ArrayOfAddOnAuthor" minOccurs="0"/>
 *         &lt;element name="AvatarUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categories" type="{Curse.AddOns}ArrayOfAddOnCategory" minOccurs="0"/>
 *         &lt;element name="CategorySection" type="{Curse.AddOns}CategorySection" minOccurs="0"/>
 *         &lt;element name="CommentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DefaultFileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DonationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownloadCount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExternalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GameId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GamePopularityRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GameVersionLatestFiles" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}ArrayOfGameVersionLatestFile" minOccurs="0"/>
 *         &lt;element name="IconId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InstallCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsFeatured" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatestFiles" type="{Curse.AddOns}ArrayOfAddOnFile" minOccurs="0"/>
 *         &lt;element name="Likes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}PackageTypes" minOccurs="0"/>
 *         &lt;element name="PopularityScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PrimaryAuthorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryAvatarUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stage" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}ProjectStage" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}ProjectStatus" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSiteURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOn", propOrder = {
    "attachments",
    "authors",
    "avatarUrl",
    "categories",
    "categorySection",
    "commentCount",
    "defaultFileId",
    "donationUrl",
    "downloadCount",
    "externalUrl",
    "gameId",
    "gamePopularityRank",
    "gameVersionLatestFiles",
    "iconId",
    "id",
    "installCount",
    "isFeatured",
    "latestFiles",
    "likes",
    "name",
    "packageType",
    "popularityScore",
    "primaryAuthorName",
    "primaryCategoryAvatarUrl",
    "primaryCategoryId",
    "primaryCategoryName",
    "rating",
    "stage",
    "status",
    "summary",
    "webSiteURL"
})
public class AddOn {

    @XmlElementRef(name = "Attachments", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnAttachment> attachments;
    @XmlElementRef(name = "Authors", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnAuthor> authors;
    @XmlElementRef(name = "AvatarUrl", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> avatarUrl;
    @XmlElementRef(name = "Categories", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnCategory> categories;
    @XmlElementRef(name = "CategorySection", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<CategorySection> categorySection;
    @XmlElement(name = "CommentCount")
    protected Integer commentCount;
    @XmlElement(name = "DefaultFileId")
    protected Integer defaultFileId;
    @XmlElementRef(name = "DonationUrl", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> donationUrl;
    @XmlElement(name = "DownloadCount")
    protected Double downloadCount;
    @XmlElementRef(name = "ExternalUrl", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalUrl;
    @XmlElement(name = "GameId")
    protected Integer gameId;
    @XmlElement(name = "GamePopularityRank")
    protected Integer gamePopularityRank;
    @XmlElementRef(name = "GameVersionLatestFiles", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGameVersionLatestFile> gameVersionLatestFiles;
    @XmlElement(name = "IconId")
    protected Integer iconId;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "InstallCount")
    protected Integer installCount;
    @XmlElement(name = "IsFeatured")
    protected Integer isFeatured;
    @XmlElementRef(name = "LatestFiles", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnFile> latestFiles;
    @XmlElement(name = "Likes")
    protected Integer likes;
    @XmlElementRef(name = "Name", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "PackageType")
    @XmlSchemaType(name = "string")
    protected PackageTypes packageType;
    @XmlElement(name = "PopularityScore")
    protected Double popularityScore;
    @XmlElementRef(name = "PrimaryAuthorName", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAuthorName;
    @XmlElementRef(name = "PrimaryCategoryAvatarUrl", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCategoryAvatarUrl;
    @XmlElement(name = "PrimaryCategoryId")
    protected Integer primaryCategoryId;
    @XmlElementRef(name = "PrimaryCategoryName", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCategoryName;
    @XmlElement(name = "Rating")
    protected Integer rating;
    @XmlElement(name = "Stage")
    @XmlSchemaType(name = "string")
    protected ProjectStage stage;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ProjectStatus status;
    @XmlElementRef(name = "Summary", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "WebSiteURL", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webSiteURL;

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnAttachment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnAttachment }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<ArrayOfAddOnAttachment> value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnAuthor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnAuthor> getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnAuthor }{@code >}
     *     
     */
    public void setAuthors(JAXBElement<ArrayOfAddOnAuthor> value) {
        this.authors = value;
    }

    /**
     * Gets the value of the avatarUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Sets the value of the avatarUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvatarUrl(JAXBElement<String> value) {
        this.avatarUrl = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnCategory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnCategory> getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnCategory }{@code >}
     *     
     */
    public void setCategories(JAXBElement<ArrayOfAddOnCategory> value) {
        this.categories = value;
    }

    /**
     * Gets the value of the categorySection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategorySection }{@code >}
     *     
     */
    public JAXBElement<CategorySection> getCategorySection() {
        return categorySection;
    }

    /**
     * Sets the value of the categorySection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategorySection }{@code >}
     *     
     */
    public void setCategorySection(JAXBElement<CategorySection> value) {
        this.categorySection = value;
    }

    /**
     * Gets the value of the commentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * Sets the value of the commentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentCount(Integer value) {
        this.commentCount = value;
    }

    /**
     * Gets the value of the defaultFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultFileId() {
        return defaultFileId;
    }

    /**
     * Sets the value of the defaultFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultFileId(Integer value) {
        this.defaultFileId = value;
    }

    /**
     * Gets the value of the donationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDonationUrl() {
        return donationUrl;
    }

    /**
     * Sets the value of the donationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDonationUrl(JAXBElement<String> value) {
        this.donationUrl = value;
    }

    /**
     * Gets the value of the downloadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDownloadCount() {
        return downloadCount;
    }

    /**
     * Sets the value of the downloadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDownloadCount(Double value) {
        this.downloadCount = value;
    }

    /**
     * Gets the value of the externalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalUrl() {
        return externalUrl;
    }

    /**
     * Sets the value of the externalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalUrl(JAXBElement<String> value) {
        this.externalUrl = value;
    }

    /**
     * Gets the value of the gameId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * Sets the value of the gameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGameId(Integer value) {
        this.gameId = value;
    }

    /**
     * Gets the value of the gamePopularityRank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGamePopularityRank() {
        return gamePopularityRank;
    }

    /**
     * Sets the value of the gamePopularityRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGamePopularityRank(Integer value) {
        this.gamePopularityRank = value;
    }

    /**
     * Gets the value of the gameVersionLatestFiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGameVersionLatestFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGameVersionLatestFile> getGameVersionLatestFiles() {
        return gameVersionLatestFiles;
    }

    /**
     * Sets the value of the gameVersionLatestFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGameVersionLatestFile }{@code >}
     *     
     */
    public void setGameVersionLatestFiles(JAXBElement<ArrayOfGameVersionLatestFile> value) {
        this.gameVersionLatestFiles = value;
    }

    /**
     * Gets the value of the iconId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * Sets the value of the iconId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIconId(Integer value) {
        this.iconId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the installCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstallCount() {
        return installCount;
    }

    /**
     * Sets the value of the installCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstallCount(Integer value) {
        this.installCount = value;
    }

    /**
     * Gets the value of the isFeatured property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsFeatured() {
        return isFeatured;
    }

    /**
     * Sets the value of the isFeatured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsFeatured(Integer value) {
        this.isFeatured = value;
    }

    /**
     * Gets the value of the latestFiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnFile> getLatestFiles() {
        return latestFiles;
    }

    /**
     * Sets the value of the latestFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}
     *     
     */
    public void setLatestFiles(JAXBElement<ArrayOfAddOnFile> value) {
        this.latestFiles = value;
    }

    /**
     * Gets the value of the likes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLikes(Integer value) {
        this.likes = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageTypes }
     *     
     */
    public PackageTypes getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageTypes }
     *     
     */
    public void setPackageType(PackageTypes value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the popularityScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPopularityScore() {
        return popularityScore;
    }

    /**
     * Sets the value of the popularityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPopularityScore(Double value) {
        this.popularityScore = value;
    }

    /**
     * Gets the value of the primaryAuthorName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAuthorName() {
        return primaryAuthorName;
    }

    /**
     * Sets the value of the primaryAuthorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAuthorName(JAXBElement<String> value) {
        this.primaryAuthorName = value;
    }

    /**
     * Gets the value of the primaryCategoryAvatarUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCategoryAvatarUrl() {
        return primaryCategoryAvatarUrl;
    }

    /**
     * Sets the value of the primaryCategoryAvatarUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCategoryAvatarUrl(JAXBElement<String> value) {
        this.primaryCategoryAvatarUrl = value;
    }

    /**
     * Gets the value of the primaryCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    /**
     * Sets the value of the primaryCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryCategoryId(Integer value) {
        this.primaryCategoryId = value;
    }

    /**
     * Gets the value of the primaryCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCategoryName() {
        return primaryCategoryName;
    }

    /**
     * Sets the value of the primaryCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCategoryName(JAXBElement<String> value) {
        this.primaryCategoryName = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRating(Integer value) {
        this.rating = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectStage }
     *     
     */
    public ProjectStage getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectStage }
     *     
     */
    public void setStage(ProjectStage value) {
        this.stage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectStatus }
     *     
     */
    public ProjectStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectStatus }
     *     
     */
    public void setStatus(ProjectStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * Gets the value of the webSiteURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebSiteURL() {
        return webSiteURL;
    }

    /**
     * Sets the value of the webSiteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebSiteURL(JAXBElement<String> value) {
        this.webSiteURL = value;
    }

}
