package com.spring.base.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.spring.base.utils.BaseLogger;

public class BaseController extends BaseLogger {

	public static int PAGE_SIZE = 10;
	public static String PREFIX = "";

	public static String FILEJPG = ".jpg";
	public static String FILEPNG = ".png";
	public static String FILEJPEG = ".jpeg";
	public static String FILEZIP = ".zip";
	public static String FILEGIF = ".gif";

	@Value("#{config['imgPath']}")
	public String imgPath="";
	
	@ExceptionHandler
	public String exp(HttpServletRequest request, Exception e) {
		e.printStackTrace();
		request.setAttribute("e", e);
		logger.error(e.getMessage(), e);
		return "/error";
	}

	@RequestMapping(value = "/view/{view}")
	public String index(@PathVariable String view) {
		return PREFIX + "/" + view;
	}

	/**
	 * 公共下载方法
	 * 
	 * @param response
	 * @param file
	 * 
	 * @param fileName
	 * 
	 * @return
	 * @throws Exception
	 */
	public HttpServletResponse downFile(HttpServletResponse response, File file, String fileName, boolean delFile) throws Exception {
		response.setContentType("application/x-download");
		response.setHeader("Pragma", "public");
		response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
		OutputStream out = null;
		InputStream in = null;
		fileName = new String(fileName.getBytes("GBK"), "ISO-8859-1");
		response.addHeader("Content-disposition", "attachment;filename=" + fileName);//

		try {
			out = response.getOutputStream();
			in = new FileInputStream(file);
			int len = in.available();
			byte[] b = new byte[len];
			in.read(b);
			out.write(b);
			out.flush();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception("!");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (delFile) {
				file.delete();
			}
		}
		return response;
	}
	
	/**
	 * 上传文件OR图片
	 * 
	 * @param fileUrl
	 * @param path
	 * @return
	 * @author 1695446827@qq.com
	 */
	public String fileUpload(MultipartFile fileUrl, String path) {
		String fileName = "";
		try {
			fileName = UUID.randomUUID().toString().substring(0, 8) + new Random().nextInt(60000);
		} catch (Exception e) {
			fileName = UUID.randomUUID().toString().substring(0, 8);
		}
		if (fileUrl.getOriginalFilename().contains(FILEJPG))
			fileName += FILEJPG;
		if (fileUrl.getOriginalFilename().contains(FILEPNG))
			fileName += FILEPNG;
		if (fileUrl.getOriginalFilename().contains(FILEJPEG))
			fileName += FILEJPEG;
		if (fileUrl.getOriginalFilename().contains(FILEZIP))
			fileName += FILEZIP;
		if (fileUrl.getOriginalFilename().contains(FILEGIF))
			fileName += FILEGIF;
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		try {
			fileUrl.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("path->"+path);
		fileName = imgPath+fileName;//存到数据库中的图片路径
		return fileName;
	}
}
