package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport{
    private List<File> upload;
    private List<String> uploadFileName;
    
    public String execute() throws Exception{
        String path =this.getClass().getClassLoader().getResource("/").getPath();
        File file = new File(path);
        path = file.getParentFile().getParentFile()+"\\image\\";
        file=new File(path);
        if(!file.isDirectory()){
            file.mkdir();
        }
        if(upload!=null){
            for(int i=0;i<upload.size();i++){
                InputStream is =new FileInputStream(upload.get(i));
                OutputStream os = new FileOutputStream(path+uploadFileName.get(i));
                byte buffer[] = new byte[1024];
                int count=0;
                while((count=is.read(buffer))>0){
                    os.write(buffer,0,count);
                }
                os.close();
                is.close();
            }
        }
        return SUCCESS;
    }

    public List<File> getUpload() {
        return upload;
    }

    public void setUpload(List<File> upload) {
        this.upload = upload;
    }

    public List<String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(List<String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
    
}
