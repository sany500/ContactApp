
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFunction {

    public ImageIcon resizeImage(String picPath,byte[] BLOBpic, int width, int height) {
        ImageIcon myImage ;
        if(picPath!=null){
            myImage= new ImageIcon(picPath);
        }else{
           myImage= new ImageIcon(BLOBpic);  
        }
        Image img = myImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);

        return myPicture;

    }

    public String browseImage(JLabel lbl) {
        String path = null;
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", ".jpg", ".png", ".gif");
        int fileState = filec.showSaveDialog(null);

        if (fileState == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            //imagePath=path;
            lbl.setIcon(resizeImage(path,null, lbl.getWidth(), lbl.getHeight()));
            // lblPicture.setIcon(new ImageIcon(path));
        } else if (fileState == JFileChooser.CANCEL_OPTION) {
            System.out.println("No image selected");
        }
        return path;
    }
}
