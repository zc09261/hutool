package com.rj.bd;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

/**
 * @desc 生成二维码工具
 * @author 张成
 *
 */
public class ErWeiMa {

	public static void main(String[] args) {
		QrCodeUtil.generate("https://www.java.com/zh-CN/", 300, 300, FileUtil.file("D:/2022.jpg"));
	}

}
