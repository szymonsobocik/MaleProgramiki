/*import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.ExifSubIFDDirectory;*/

import java.io.File;
/*import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttributeView;
import java.text.SimpleDateFormat;
import java.util.Date;*/

/**
 * todo szymon opis klasy
 * <p/>
 * Created by IntelliJ IDEA.
 *
 * @author szymon.sobocik
 */
public class AtrybutyPlikowZeZdjeciami {

    public static void zmienDaty(File directory) {
//        doOperation(directory, Operation.ChangeDateOfModification);
    }

    public static void renameByOriginalDate(File directory) {
//        doOperation(directory, Operation.Rename);
    }

    private static void doOperation(File directory, Operation operation) {
/*        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.HHmm");
            for (File zdjecie : directory.listFiles()) {
                if (zdjecie.isFile()) {
                    Metadata metadata = ImageMetadataReader.readMetadata(zdjecie);
                    if (metadata != null) {
                        ExifSubIFDDirectory subIFDDirectory = metadata.getDirectory(ExifSubIFDDirectory.class);

                        if (subIFDDirectory != null) {
                            Date dateTimeOriginal = subIFDDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
                            if (dateTimeOriginal != null) {
                                if (operation.equals(Operation.Rename)) {
                                    String dateFormatted = sdf.format(dateTimeOriginal);
                                    File newFile = new File(zdjecie.getParent() + "\\" + dateFormatted + "-" + zdjecie.getName());
                                    boolean doneRenaming = zdjecie.renameTo(newFile);
                                    System.out.println("Renamed file " + zdjecie.getName() + " to " + newFile.getName() + " was " + doneRenaming);
                                } else if (operation.equals(Operation.ChangeDateOfModification)) {
                                    zdjecie.setLastModified(dateTimeOriginal.getTime());
                                }
                            }
                        }
                    }
                }
            }
        } catch (ImageProcessingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }*/

    }

    private static enum Operation {
        Rename,
        ChangeDateOfModification
    }
}
