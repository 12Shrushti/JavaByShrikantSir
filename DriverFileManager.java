import java.util.*;

class FileManager {
    private String managerName;
    private String version;

    public FileManager() {}

    public FileManager(String managerName, String version) {
        this.managerName = managerName;
        this.version = version;
    }

    public void displayFileManager() {
        System.out.println("FileManager [Name: " + managerName + ", Version: " + version + "]");
    }
}

class Drive extends FileManager {
    private String driveName;
    private long capacityGB;

    public Drive() {}

    public Drive(String managerName, String version, String driveName, long capacityGB) {
        super(managerName, version);
        this.driveName = driveName;
        this.capacityGB = capacityGB;
    }

    public void displayDrive() {
        System.out.println("Drive [Name: " + driveName + ", Capacity: " + capacityGB + " GB]");
    }
}

class Folder extends Drive {
    private String folderName;
    private String createdDate;

    public Folder() {}

    public Folder(String managerName, String version, String driveName, long capacityGB,
                  String folderName, String createdDate) {
        super(managerName, version, driveName, capacityGB);
        this.folderName = folderName;
        this.createdDate = createdDate;
    }

    public void displayFolder() {
        System.out.println("Folder [Name: " + folderName + ", Created: " + createdDate + "]");
    }
}

class File extends Folder {
    private String fileName;
    private String fileType;
    private long fileSizeKB;

    public File() {}

    public File(String managerName, String version, String driveName, long capacityGB,
                String folderName, String createdDate,
                String fileName, String fileType, long fileSizeKB) {
        super(managerName, version, driveName, capacityGB, folderName, createdDate);
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSizeKB = fileSizeKB;
    }

    public void displayFile() {
        System.out.println("File [Name: " + fileName + ", Type: " + fileType +
                ", Size: " + fileSizeKB + " KB]");
    }
}
class DriverFileManager {
    public static void main(String[] args) {
        File myFile = new File(
                "Windows File Manager", "10.0",
                "Local Disk (C:)", 512,
                "Projects", "2025-04-01",
                "Resume.docx", "Document", 256
        );

        myFile.displayFile();
        System.out.println("--------------------------------");
        myFile.displayFolder();
        System.out.println("--------------------------------");
        myFile.displayDrive();
        System.out.println("--------------------------------");
        myFile.displayFileManager();
    }
}
