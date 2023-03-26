package resume.job.domain;

import lombok.Data;

@Data
public class ImageUploadFile {
    private String uploadFileName;
    private String storeFileName;

    public ImageUploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
