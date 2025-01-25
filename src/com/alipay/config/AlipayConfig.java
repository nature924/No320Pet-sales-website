package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	// 沙箱环境需要用户自己配置 这个已经做了 配置就是用户自己的事情了
	//虚拟支付的付款返回 使用ajaxAction里面的pay方式更新
	public static String app_id = "2016091900550705";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCpj5cEijV8loAF/1YjbuUxC2aKyzxupXuKDZp7DLF1jAkE8XaKzPL/spYMpM22DtEK2i3CtUWdyTKd/GL1eifxW+TQoVWt3sXeKR6DR4i/W2eQQy/C/1IAvr+HyEdeEmTox3kPaC5Z45wNHPMbX/ROJez4V8XQMcWWcMGNl1b/s82B7eKRZtyXzhbqSf6jNujeWk0Lu/noyOWeeaqW+gcaKDD+QAkT1AP+N67T5piW8kzlBtGL0xYKeK80a0K2FceL0oNhQ/ta8AnmwJKNXp0tinRjo5ANcDzUpbSN/4ARqvdrC5DSljVtDHChA6ZxBI0fFxugJs2cFT/ADUB+q7stAgMBAAECggEBAJ2GZcF0+Q3e798igQ74FnsC4WfuOh19JZFy4+KPP0o6J6LtBLkcgGBmtBnY/be2eiR/32V1bNCSu7CkafcuXm9PdPsR93xJaz/iqZNC4NsN+t++W1/oPXGtxFhMC2ls40yTDHfwzKb72t0f2QbElT4I4+cv+/lYU/1YkaiOQefYxvBjxsHVYCfDvojQFJfKv4QWry1UBs/9pGpl4sqhCQLOkhDW1UT708hBRG22qoLMuABlx5rZURUq1afOTM+3+lkgf90ke4UBmTDXuFcOs1l+jWN8cIAaGr/vtoXKCS7fLAsLGSMlZIahD5qHdJxup9sr/0MYmV7irZd9ykD/f4ECgYEA8FJnGcUC2LmudGNyVmB1OAOiRE/U2oDNcfbIAco/ikK+JhLgRr5patxetxUr9lV5PwadI89MIZF20GJ2rHUAmGkVeDIsA8q/sqrGszOcF0laCcr24qvye86RALIKKAvw/aPU69pL7TxdjdaJHrqHHKGbXUpbZThsMcOU2dYDbCECgYEAtJ9p04r8oIcvOoj3phMr0a5FTP8UYpeZE//HtBupvffJnnnCvG9wRW8kMLOHB3sPCxBV5D4rXp8GrVMUkbAaaQQ1imBGIIkVHWXCDhPrpIvwLI+TjfczCs+afystAU1IrGQGdEVHfL51C7h/0ryi1Zd26iwir5a5wfg8ELzbjY0CgYAz5Ccc+lxF/bn8qah7nDJTWP2FsJMuZxd1XysKr+gOa6DxSawhumW6zECrWaf3dbdLc5skq1MuAGHeVxR24oCxaCdZn8O/Qd0osBVdhmxS3uTRLoEmqqgeMZk/xDHLOeDcc667CpTQcfNleAh9mRsphH+uoiqf7ZH3INsYOkzc4QKBgQCw5YOmi/OZYGxv3p70hsgeppf2rceQO7rPbG1wxrr6c0iCLev70wRY7F28WMdBG1ODWW9Vh1HAbO0EKV72xEtJWLb7HAjyam9EiFmCoh3h3K/PZJp1qonR57r/GxELul4XgCsWCpfV404MuZhukxLDL4FmHO2nnG23O9/P4LcCLQKBgQCMhXRb+tJ2jRXewqdf2qo1rpzWZcj9Tsx7vzKUFy89pIy++V2o5BdnlJx01PwNFpY3T5weU+Rb+7S8q3KPNXW6/BcT+84tzYS1rQhcKS89YPqjbI23uj+F/SQwG0Tiz/yoVTAOaoDmPrEOHZYw2qWscgtDR1wZZDHAddfJOxzvew==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqY+XBIo1fJaABf9WI27lMQtmiss8bqV7ig2aewyxdYwJBPF2iszy/7KWDKTNtg7RCtotwrVFnckynfxi9Xon8Vvk0KFVrd7F3ikeg0eIv1tnkEMvwv9SAL6/h8hHXhJk6Md5D2guWeOcDRzzG1/0TiXs+FfF0DHFlnDBjZdW/7PNge3ikWbcl84W6kn+ozbo3lpNC7v56MjlnnmqlvoHGigw/kAJE9QD/jeu0+aYlvJM5QbRi9MWCnivNGtCthXHi9KDYUP7WvAJ5sCSjV6dLYp0Y6OQDXA81KW0jf+AEar3awuQ0pY1bQxwoQOmcQSNHxcboCbNnBU/wA1Afqu7LQIDAQAB";

	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://120.77.244.156/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://120.77.244.156/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
