package com.xm.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xm.mapper.AttachmentMapper;
import com.xm.model.Attachment;
import com.xm.model.AttachmentExample;
import com.xm.model.AttachmentExample.Criteria;
import com.xm.service.AttachmentService;
import com.xm.shiro.util.AjaxResult;
import com.xm.shiro.util.EnvironmentUtil;

@RestController
@RequestMapping("file")
public class Filecontroller {

	private static Logger logger = LoggerFactory.getLogger(Filecontroller.class);
	private static final String RESOURCE_SERVER_ADDRESS = EnvironmentUtil.getInstance().getPropertyValue("resource.server.address");
	
	@Autowired
	private AttachmentService attachmentService;
	@Autowired
	private AttachmentMapper attachmentMapper;
	
	/**
	 * 上传附件
	 * @param files
	 * @param dataKey
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/upload")
	public AjaxResult upload(@RequestParam("file") MultipartFile[] files, String dataKey){
		List<Attachment> returnList = new ArrayList<Attachment>();
		try {
			for (MultipartFile file : files) {
				Attachment attachment = attachmentService.uploadFile(file);
				attachmentService.saveAttachment(attachment, dataKey);
				returnList.add(attachment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		AjaxResult resultMap = AjaxResult.objectResult(returnList);
		return resultMap;
	}
	/**
	 * 下载文件
	 * @param fileId
	 * @param request
	 * @param response
	 */
	@RequestMapping("downLoadFileByFileId")
	public void downLoadFile(Integer fileId, HttpServletRequest request, HttpServletResponse response) {
		
		Attachment attachment = attachmentMapper.selectByPrimaryKey(fileId);
		
		String fileName = attachment.getFileName();
		String filePath = RESOURCE_SERVER_ADDRESS + attachment.getPartialPath();
		// 准备下载
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (Exception e) {
            System.out.println("下载设置返回页面编码出现异常！");
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        // 获取文件的长度
        long fileLength = new File(filePath).length();
        // 设置文件输出类型 此为 *.*
        response.setContentType("application/octet-stream");
        try {
            response.setHeader("Content-disposition", "attachment; filename="
                    + new String(fileName.getBytes("GBK"), "ISO8859-1"));
            // 设置输出长度
            response.setHeader("Content-Length", String.valueOf(fileLength));
            // 获取输入流
            bis = new BufferedInputStream(new FileInputStream(filePath));
            // 输出流
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            // 关闭流
            bis.close();
            bos.close();
        } catch (Exception e) {
            logger.error("文件下载时出现异常", e);  
        }
	}
	
	/**
	 * 获取附件  produces 去除中文乱码问题
	 * @param dataKey 关联附件guid
	 * @return
	 */
	@RequestMapping("getFilesByDataKey")
	@ResponseBody
	public AjaxResult getFilesByDataKey(String dataKey) {
		//附件列表信息
		AttachmentExample attaExample = new AttachmentExample();
		Criteria attaC = attaExample.createCriteria();
		attaC.andDataKeyEqualTo(dataKey);
		List<Attachment> listAttachement = attachmentMapper.selectByExample(attaExample);
		AjaxResult resultMap = AjaxResult.objectResult(listAttachement);
		return resultMap;
	}
	/**
	 * 删除附件
	 * @param attachmentid
	 * @return
	 */
	@RequestMapping("deleteFilesById")
	@ResponseBody
	public AjaxResult deleteFilesById(Integer fileId) {
		if (fileId != null && fileId > 0) {
			int i = attachmentMapper.deleteByPrimaryKey(fileId);
			if (i > 0) {
				return AjaxResult.successResult();
			}
		}
		return AjaxResult.errorResult("删除失败");
	}
	
}
