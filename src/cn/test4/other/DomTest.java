package cn.test4.other;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/3/2
 */
public class DomTest {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        // String sMsg = "<xml><ToUserName><![CDATA[wx697368e10b88271a]]></ToUserName><FromUserName><![CDATA[sys]]></FromUserName><CreateTime>1582884511</CreateTime><MsgType><![CDATA[event]]></MsgType><Event><![CDATA[change_external_contact]]></Event><ChangeType><![CDATA[del_external_contact]]></ChangeType><UserID><![CDATA[liuqian_bs]]></UserID><ExternalUserID><![CDATA[wmiqFYEQAAPbG7cm4e-z05MlQj5EOdEA]]></ExternalUserID></xml>";

        String sMsg = "<xml><ToUserName><![CDATA[wx697368e10b88271a]]></ToUserName><FromUserName><![CDATA[sys]]></FromUserName><CreateTime>1584063312</CreateTime><MsgType><![CDATA[event]]></MsgType><Event><![CDATA[change_external_contact]]></Event><ChangeType><![CDATA[add_external_contact]]></ChangeType><UserID><![CDATA[liuqian_bs]]></UserID><ExternalUserID><![CDATA[wmiqFYEQAAPbG7cm4e-z05MlQj5EOdEA]]></ExternalUserID><WelcomeCode><![CDATA[3LStcCBsjfExcGuPYHNL8_QEvJYNNjCkAsxmN3ReQRA]]></WelcomeCode></xml>";

        /**
         * 获取本地项目路径，相对路径
         */
        final String LOCAL_USER_PATH = System.getProperty("user.dir");

        String xmlFilePath = LOCAL_USER_PATH + "/xmlFile/";

        String fileName = "123test.xml";

        //生成文件
        File dest = new File(xmlFilePath, fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        FileWriter writer;
        try {
            writer = new FileWriter(xmlFilePath + fileName);
            writer.write(sMsg);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File f = new File(xmlFilePath + fileName);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(f);
        NodeList nl = doc.getElementsByTagName("xml");
        for (int i = 0; i < nl.getLength(); i++) {
            System.out.print("ToUserName:" + doc.getElementsByTagName("ToUserName").item(i).getFirstChild().getNodeValue());
            System.out.println("FromUserName:" + doc.getElementsByTagName("FromUserName").item(i).getFirstChild().getNodeValue());
            System.out.println("CreateTime:" + doc.getElementsByTagName("CreateTime").item(i).getFirstChild().getNodeValue());
            System.out.println("MsgType:" + doc.getElementsByTagName("MsgType").item(i).getFirstChild().getNodeValue());
            System.out.println("Event:" + doc.getElementsByTagName("Event").item(i).getFirstChild().getNodeValue());
            System.out.println("ChangeType:" + doc.getElementsByTagName("ChangeType").item(i).getFirstChild().getNodeValue());
            System.out.println("UserID:" + doc.getElementsByTagName("UserID").item(i).getFirstChild().getNodeValue());
            System.out.println("ExternalUserID:" + doc.getElementsByTagName("ExternalUserID").item(i).getFirstChild().getNodeValue());
        }
        deleteFile(dest.getAbsolutePath());
    }

    /**
     * 删除单个文件
     *
     * @param fileName 要删除的文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
