package com.xm.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xm.mapper.AttachmentMapper;
import com.xm.model.Attachment;
import com.xm.model.PurSysUser;
import com.xm.shiro.constant.Constants;
import com.xm.shiro.util.DateUtil;
import com.xm.shiro.util.EnvironmentUtil;
import com.xm.shiro.util.FileTypeUtils;
import com.xm.shiro.util.UserContext;

@Service
public class AttachmentService {

	private Logger logger = LoggerFactory.getLogger(AttachmentService.class);
	private static final String RESOURCE_SERVER_ADDRESS = EnvironmentUtil.getInstance().getPropertyValue("resource.server.address");
	
	@Autowired
	private AttachmentMapper attachmentMapper;
	
	/**
	 * 上传附件并保存
	 * @param file
	 * @return
	 */
	public Attachment uploadFile(MultipartFile file) {
		if(file != null && file.getSize()>0){
			Attachment attachment = new Attachment();
			attachment.setFileName(file.getOriginalFilename());
			String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1);
			attachment.setFileType(FileTypeUtils.getFileTypeBySuffix(suffix));
			attachment.setPartialPath(getFileSaveRelativeDir(attachment.getFileType(),attachment.getFileName()));
			attachment.setFileSize(BigDecimal.valueOf(file.getSize()));
			Pattern p = Pattern.compile("^[A-Za-z0-9]+\\.xml$");
			String statement = file.getOriginalFilename();
			if( p.matcher(statement).matches() ) {
			    return null;
			}
			try {
				this.fileDirValidation(getServerAddressByType(attachment.getFileType()));
                //拿到输出流，同时重命名上传的文件  
                FileOutputStream os = new FileOutputStream(RESOURCE_SERVER_ADDRESS + attachment.getPartialPath());  
                //拿到上传文件的输入流  
                InputStream in =  file.getInputStream();  
                //以写字节的方式写文件  
                int b = 0;  
                while((b=in.read()) != -1){  
                    os.write(b);  
                }  
                os.flush();  
                os.close();  
                in.close();  
                  
            } catch (Exception e) {  
                e.printStackTrace();
                logger.error("======>>"+attachment.getFileName()+"文件上传出错");
            }
			return attachment;
		}else {
			return null;
		}
	}
		
	/**
	 * 获取资源服务器上的目标路径
	 * @param serverDir
	 * @return
	 * 
	 */
	private String fileDirValidation(String serverDir) {
		//根据附件类型构造路径:资源服务器根目录 + 类别目录 + 文件相对路径
		String path = RESOURCE_SERVER_ADDRESS + serverDir;
		//判断资源服务器上的目录是否存在
		File dirPath = new File(path);
		if(!dirPath.exists())
			if(!dirPath.mkdirs())
				return "";
		return path;
	}
	/**
	 * 根据附件类型获取文件上传分类路径
	 * @param fileType
	 * @return
	 * 
	 */
	private String getServerAddressByType(String fileType) {
		String serverAddress = "/other";
		if(fileType.equals(Constants.ATTACHMENT_TYPE_IMAGE)) {
			serverAddress = "/img";
		}else if (fileType.equals(Constants.ATTACHMENT_TYPE_VIDEO)) {
			serverAddress = "/video";
		}else if (fileType.equals(Constants.ATTACHMENT_TYPE_AUDIO)) {
			serverAddress = "/audio";
		}else if(fileType.equals(Constants.ATTACHMENT_TYPE_DOCUMENT) || fileType.equals(Constants.ATTACHMENT_TYPE_RAR) ) {
			serverAddress = "/document";
		} else {
			serverAddress = "/other";
		}
		return serverAddress + "/" + DateUtil.format(new Date(), "yyyy-MM-dd");
	}
	/**
	 * 通过文件类型和文件名称，获取文件生成的新文件的相对路径
	 * @param fileType
	 * @param fileName
	 * @return
	 */
	public String getFileSaveRelativeDir(String fileType,String fileName) {
		return getServerAddressByType(fileType) + "/" + new Date().getTime() + fileName;
	}
	/**
	 * 保存附件内容
	 * @param bsAttachment
	 * @param dataKey
	 */
	public void saveAttachment(Attachment attachment, String dataKey) {
		PurSysUser user = UserContext.getCurUser();
		if (attachment == null) {
			return;
		}
		attachment.setDataKey(dataKey);
		attachment.setType(10);// TODO
		attachment.setUploadTime(new Date());
		attachment.setUploaderId(user.getUserid());
		attachment.setUploaderName(user.getUsername());
		this.attachmentMapper.insert(attachment);
	}
}
