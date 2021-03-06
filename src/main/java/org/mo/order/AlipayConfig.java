package org.mo.order;

public class AlipayConfig {

	// appid
	public static String app_id = "2016082700327525";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝公钥
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApZZMz9urUUV+oRPq5yl2cHwXdW2aCWB/kpBtAbdYGkdp20EGe6QSsSk0MqRb0k26bDc+QALXmD0a7JSRBEmpjdR9GYkkp9eh/wYlNlEJQqWiI15NEo6HQ5QxiTxcOp2euomoJvf90yD6ix/mTztN7EKBD0yHrCdGFjrFHpOtqwEI8vLy7OR6/KU8OqjYD4PE/z7qAvSMUb4DSxyVCivhRh96mWtuUyN2OAIha4BPFoGW8N8Gc2zBlIhcZMknw7bwYhxpdhLLvkEeKRjNhATYGO70ZbpnlM+8BKaOhV5H6ChnIM42SO5AYvBThEfEgBQyu+cA93GytwRnz4UolkxvaQIDAQAB";
	
	// 支付宝私钥
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWhjzVg8T4gulSmq5O/GAg+KISqMwwzw05kPTIcEm+onlicQIjprxhtvT7rdCK8HsfI9tap1Dr1nE+Wpi927QFKohkNM/9m7QZ0RNiRdT07btdB6ukTlSWWEHwQjJF0+wpU5iGDkbZ8SUjKz8kb7wbo8KLj0ZNuVXaWQvAQvyEeKkLJ8zEGbn1y/IvFSEEqKl7cbfY8W/WJviyJXKFelB19IPxzQL2tLX28zRrVKmskQiSNYdvxZSaeAzXpGVpdnYhdHeiQ7JJh9jrKHBSA0Dfkto5kHETJgvti2L2fEvQRXTHUZZ/LKYmktu0dUYN11cP+nT9B3mPPVAx5DfDRneLAgMBAAECggEAbbcQtmyicKUzHkOi0+2+v6masNEabGUu9YvD8ClwhyR0J53JemT5IJwzuxL5U5xvkcYYB9626//VcSal+JUghTd4TNn11JveTYcIgvP1gkWZ8Pg7UrrJiwBvp4kIjb8nfwPww526ZPcRI65NCujqipb1obXf/50ch9ep6gypdIBEMukhk8eT6VK/2dXR097L5qpLYN2yfm9B8vrgxye3JJ4mGDh9b4OXowgbgoVIT11VXWFXV5z148QnShnyyJMbP7ZCZfoKsq0k1Kas/jykpmR7RGFKZjHq9gmEXIx5WwK5cBX24OfDY7eHOq8t9xaOw42+7horjbnUB04D7BDFAQKBgQDImeebm4BILKJB8m9YmZjIBRzj6ppzCLpEhd9OZEo4zBVl3UaquoWZWAW1W/F46z6Fh6fvpObSfCSW9xE6BBGsd5tIPSsWzSEja9hP/Grd0b4vpkTzYqQ9NrUEWKILEWkHzkThq0h55Q63f/8VnQrgj1amJqX4RUz7aPAGdTO0gQKBgQDAGADkjkWY5w7PvXS2EJt+EyYk8E0DIt8wT3fhZcxPLqtJHKmDWWbeCJsMdQ0Y1ttwXx8kk6+FL8qKNri19tHJtRKxfINc5JP8SX5z1diuUp6nTTto0CanPpeXNsaqc6EU6alTsxspSM4WP6Y69CthD18+/9VKbvJlUTF70rq2CwKBgGo4zOKiCeCt+dFv3bQNyVAJHQ42+Uf2lCOau+9XvdGrh50j+bqIABx99q/dGtWLw9STS8LjD/LfF8T02SNeajloMEqlUT7GqkiGX8mjALeqy8mRgqtaTVu4r0u43z17H6GpgOH6f+tD9nIGjf1U5iCY5iofBv2bPLNYEtlokFOBAoGABD9DncoLfeL179/nebMKTRJNUJnDiiM2PhIzu1cN2l5UySwKD25lmNkl3HOmE3uEpIpl3OArDE3PM5kcImHPp58KR8RR/zbKktRpKFR9EvWermJFwv5/LEl0/pHmeJRP5m94H/Kg0hva+qDzovANGXtGhtUPOTMUxuqxpmQ1XpsCgYEAj4rleMOl+8Q2fzmCj9llI+aXcQgXWwrM7qBy5rvk8NWDlLazoTnJBOzVKWKRLACnzilnJy24vvOJ0AGbZe7V6R3bFZdn3iY/S/NudgNBbuKeycWMQAyefIaezeH/EiWg90cvZpkc/7FM/qSqg13ygmSi3wMi0Eti2bLiRh8CUNY=";
	
	// 页面跳转同步通知页面
	public static String return_url = "http://4308a838.all123.net/my-alipay-springmvcdemo/returnUrl";
	
	// 服务器异步通知页面
	public static String notify_url = "http://4308a838.all123.net/my-alipay-springmvcdemo/notifyUrl";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 签名方式
	public static String sign_type = "RSA2";
	
}
