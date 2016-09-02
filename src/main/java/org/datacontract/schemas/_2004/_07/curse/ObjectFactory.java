
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import addons.curse.ArrayOfAddOnFile;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.curse package. 
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

    private final static QName _PackageTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "PackageTypes");
    private final static QName _ProjectStage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectStage");
    private final static QName _FileStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FileStatus");
    private final static QName _DependencyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "DependencyType");
    private final static QName _GameVersionLatestFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "GameVersionLatestFile");
    private final static QName _FolderFingerprint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FolderFingerprint");
    private final static QName _ProjectStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectStatus");
    private final static QName _FileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FileType");
    private final static QName _RepositoryMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "RepositoryMatch");
    private final static QName _ArrayOfGameVersionLatestFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ArrayOfGameVersionLatestFile");
    private final static QName _ArrayOfFolderFingerprint_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ArrayOfFolderFingerprint");
    private final static QName _FolderFingerprintFingerprints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "Fingerprints");
    private final static QName _FolderFingerprintFoldername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "Foldername");
    private final static QName _GameVersionLatestFileGameVesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "GameVesion");
    private final static QName _GameVersionLatestFileProjectFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectFileName");
    private final static QName _RepositoryMatchLatestFiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "LatestFiles");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.curse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfFolderFingerprint }
     * 
     */
    public ArrayOfFolderFingerprint createArrayOfFolderFingerprint() {
        return new ArrayOfFolderFingerprint();
    }

    /**
     * Create an instance of {@link RepositoryMatch }
     * 
     */
    public RepositoryMatch createRepositoryMatch() {
        return new RepositoryMatch();
    }

    /**
     * Create an instance of {@link GameVersionLatestFile }
     * 
     */
    public GameVersionLatestFile createGameVersionLatestFile() {
        return new GameVersionLatestFile();
    }

    /**
     * Create an instance of {@link ArrayOfGameVersionLatestFile }
     * 
     */
    public ArrayOfGameVersionLatestFile createArrayOfGameVersionLatestFile() {
        return new ArrayOfGameVersionLatestFile();
    }

    /**
     * Create an instance of {@link FolderFingerprint }
     * 
     */
    public FolderFingerprint createFolderFingerprint() {
        return new FolderFingerprint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "PackageTypes")
    public JAXBElement<PackageTypes> createPackageTypes(PackageTypes value) {
        return new JAXBElement<PackageTypes>(_PackageTypes_QNAME, PackageTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectStage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "ProjectStage")
    public JAXBElement<ProjectStage> createProjectStage(ProjectStage value) {
        return new JAXBElement<ProjectStage>(_ProjectStage_QNAME, ProjectStage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "FileStatus")
    public JAXBElement<FileStatus> createFileStatus(FileStatus value) {
        return new JAXBElement<FileStatus>(_FileStatus_QNAME, FileStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DependencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "DependencyType")
    public JAXBElement<DependencyType> createDependencyType(DependencyType value) {
        return new JAXBElement<DependencyType>(_DependencyType_QNAME, DependencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GameVersionLatestFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "GameVersionLatestFile")
    public JAXBElement<GameVersionLatestFile> createGameVersionLatestFile(GameVersionLatestFile value) {
        return new JAXBElement<GameVersionLatestFile>(_GameVersionLatestFile_QNAME, GameVersionLatestFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderFingerprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "FolderFingerprint")
    public JAXBElement<FolderFingerprint> createFolderFingerprint(FolderFingerprint value) {
        return new JAXBElement<FolderFingerprint>(_FolderFingerprint_QNAME, FolderFingerprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "ProjectStatus")
    public JAXBElement<ProjectStatus> createProjectStatus(ProjectStatus value) {
        return new JAXBElement<ProjectStatus>(_ProjectStatus_QNAME, ProjectStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "FileType")
    public JAXBElement<FileType> createFileType(FileType value) {
        return new JAXBElement<FileType>(_FileType_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "RepositoryMatch")
    public JAXBElement<RepositoryMatch> createRepositoryMatch(RepositoryMatch value) {
        return new JAXBElement<RepositoryMatch>(_RepositoryMatch_QNAME, RepositoryMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGameVersionLatestFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "ArrayOfGameVersionLatestFile")
    public JAXBElement<ArrayOfGameVersionLatestFile> createArrayOfGameVersionLatestFile(ArrayOfGameVersionLatestFile value) {
        return new JAXBElement<ArrayOfGameVersionLatestFile>(_ArrayOfGameVersionLatestFile_QNAME, ArrayOfGameVersionLatestFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderFingerprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "ArrayOfFolderFingerprint")
    public JAXBElement<ArrayOfFolderFingerprint> createArrayOfFolderFingerprint(ArrayOfFolderFingerprint value) {
        return new JAXBElement<ArrayOfFolderFingerprint>(_ArrayOfFolderFingerprint_QNAME, ArrayOfFolderFingerprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "Fingerprints", scope = FolderFingerprint.class)
    public JAXBElement<ArrayOflong> createFolderFingerprintFingerprints(ArrayOflong value) {
        return new JAXBElement<ArrayOflong>(_FolderFingerprintFingerprints_QNAME, ArrayOflong.class, FolderFingerprint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "Foldername", scope = FolderFingerprint.class)
    public JAXBElement<String> createFolderFingerprintFoldername(String value) {
        return new JAXBElement<String>(_FolderFingerprintFoldername_QNAME, String.class, FolderFingerprint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "GameVesion", scope = GameVersionLatestFile.class)
    public JAXBElement<String> createGameVersionLatestFileGameVesion(String value) {
        return new JAXBElement<String>(_GameVersionLatestFileGameVesion_QNAME, String.class, GameVersionLatestFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "ProjectFileName", scope = GameVersionLatestFile.class)
    public JAXBElement<String> createGameVersionLatestFileProjectFileName(String value) {
        return new JAXBElement<String>(_GameVersionLatestFileProjectFileName_QNAME, String.class, GameVersionLatestFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", name = "LatestFiles", scope = RepositoryMatch.class)
    public JAXBElement<ArrayOfAddOnFile> createRepositoryMatchLatestFiles(ArrayOfAddOnFile value) {
        return new JAXBElement<ArrayOfAddOnFile>(_RepositoryMatchLatestFiles_QNAME, ArrayOfAddOnFile.class, RepositoryMatch.class, value);
    }

}
