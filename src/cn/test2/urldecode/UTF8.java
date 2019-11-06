package cn.test2.urldecode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class UTF8 {
    /**
     * Utf8URL编码
     *
     * @param text
     * @return
     */
    public static final String Utf8URLencode(String text) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 0 && c <= 255) {
                result.append(c);
            } else {
                byte[] b = new byte[0];
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (Exception ex) {
                }
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) {
                        k += 256;
                    }
                    result.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }
        return result.toString();
    }

    /**
     * Utf8URL解码
     *
     * @param text
     * @return
     */
    public static final String Utf8URLdecode(String text) {
        String result = "";
        int p = 0;
        if (text != null && text.length() > 0) {
            text = text.toLowerCase();
            p = text.indexOf("%e");
            if (p == -1) {
                return text;
            }
            while (p != -1) {
                result += text.substring(0, p);
                text = text.substring(p, text.length());
                if (text == "" || text.length() < 9) {
                    return result;
                }
                result += CodeToWord(text.substring(0, 9));
                text = text.substring(9, text.length());
                p = text.indexOf("%e");
            }
        }
        return result + text;
    }

    /**
     * utf8URL编码转字符
     *
     * @param text
     * @return
     */
    private static final String CodeToWord(String text) {
        String result;
        if (Utf8codeCheck(text)) {
            byte[] code = new byte[3];
            code[0] = (byte) (Integer.parseInt(text.substring(1, 3), 16) - 256);
            code[1] = (byte) (Integer.parseInt(text.substring(4, 6), 16) - 256);
            code[2] = (byte) (Integer.parseInt(text.substring(7, 9), 16) - 256);
            try {
                result = new String(code, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                result = null;
            }
        } else {
            result = text;
        }
        return result;
    }

    /**
     * 编码是否有效
     *
     * @param text
     * @return
     */
    private static final boolean Utf8codeCheck(String text) {
        String sign = "";
        if (text.startsWith("%e")) {
            for (int i = 0, p = 0; p != -1; i++) {
                p = text.indexOf("%", p);
                if (p != -1) {
                    p++;
                }
                sign += p;
            }
        }
        return sign.equals("147-1");
    }

    /**
     * 判断是否Utf8Url编码
     *
     * @param text
     * @return
     */
    public static final boolean isUtf8Url(String text) {
        text = text.toLowerCase();
        int p = text.indexOf("%");
        if (p != -1 && text.length() - p > 9) {
            text = text.substring(p, p + 9);
        }
        return Utf8codeCheck(text);
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String revert = UTF8.Utf8URLdecode("%7B%22Result%22%3A%22OK%22%7D");
        System.out.println(revert);
        // 将字符串转为json串
        String decode = URLDecoder.decode("%7B%22Result%22%3A%22OK%22%7D", "UTF-8");
        System.out.println(decode);
    }
}
