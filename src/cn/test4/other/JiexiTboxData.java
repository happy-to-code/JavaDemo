package cn.test4.other;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/24
 */
public class JiexiTboxData {
    public static void main(String[] args) {
        // 正常数据
        // String s = "232302FE4C41364E4641413135484235313433323201007414010F0F33370101030100000005099C0DD327105001004E200000020101033E4E204E20410DFC271A0500073CCF4201DC43850601120F0B01240EFB010435010832070200002000000000010000177EE10006516100000000E3000D0301FFFFFFFFA10C0302002000E400080001100E5E1E733F37";
        // 金旅数据
        // String s = "232302FE4C4C334141424A32384A4130303838333401015B1402180F201C010103010190000235E50EC1291324012E262A1A00020101015254EC4FCC530EC027DE05000702BB140190813D0601730CA1014C0C5B010642010240070000000000000000000801010EC1291300760001760C9A0C980C990C990C980C990C790C760C970C730C6F0C720C6E0C6D0C680C6F0C650C640C700C6C0C6E0C700C700C770C7B0C6C0C730C860C730C780C860C850C880C880C880C8B0C940C8F0C910C900C920C920C950C930C930C930C930C960C940C940C940C820C820C840C730C710C700C740C750C710C730C730C6F0C640C750C740C5D0C5C0C5F0C670C630C610C5D0C600C610C5B0C600C600C660C630C630C690C670C660C6E0C750C740C740C760C740C760C720C730C7E0C760C750C890C890C8A0C850C8B0C8D0C8A0C8A0C910C8D0C8F0C900C9D0C980C990C980C9B0CA00CA10C9B0C9B0C9F090101001241404041414241414141424142414040414193";

        // String data = mySub(0, 2);
        // System.out.println("起始符：" + data);
        //
        // System.out.println("命令标识：" + mySub(2, 3));
        // System.out.println("应答标志：" + mySub(3, 4));
        // System.out.println("唯一识别码(车架号)：" + mySub(4, 21));
        // System.out.println("数据单元加密方式：" + mySub(21, 22));
        // System.out.println("数据单元长度：" + mySub(22, 24));


        // System.out.println("车速：" + mySub(0, 2));
        // System.out.println("累计里程：" + mySub(2, 6));
        // System.out.println("总电压：" + mySub(6, 8));
        // System.out.println("总电流：" + mySub(8, 10));
        // System.out.println("SOC：" + mySub(10, 11));
        // System.out.println("DC-DC：" + mySub(11, 12));
        // System.out.println("档位：" + mySub(12, 13));
        // System.out.println("绝缘电阻：" + mySub(13, 15));
        // System.out.println("预留：" + mySub(15, 17));

        System.out.println("最高报警等级：" + mySub(0, 1));
        System.out.println("通用报警标志：" + mySub(1, 5));
        System.out.println("可充电储能装置故障总数N1：" + mySub(5, 6));
        System.out.println("可充电储能装置故障代码列表：");
        System.out.println("驱动电机故障总数N2：" + mySub(6, 7));
        System.out.println("驱动电机故障代码列表：");
        System.out.println("发动机故障总数N3：" + mySub(7, 8));
        System.out.println("发动机故障列表：");
        System.out.println("其他故障总数N4：" + mySub(8, 9));
        System.out.println("其他故障代码列表：");

        /*
         * 最高报警等级
         * 通用报警标志
         * 可充电储能装置故障总数N1
         * 可充电储能装置故障代码列表
         * 驱动电机故障总数N2
         * 驱动电机故障代码列表
         * 发动机故障总数N3
         * 发动机故障列表
         * 其他故障总数N4
         * 其他故障代码列表

         * */

    }

    /**
     * @param begin 开始位置
     * @param end   结束位置
     * @return
     */
    private static String mySub(int begin, int end) {
        String s = "0801010EC1291300760001760C9A0C980C990C990C980C990C790C760C970C730C6F0C720C6E0C6D0C680C6F0C650C640C700C6C0C6E0C700C700C770C7B0C6C0C730C860C730C780C860C850C880C880C880C8B0C940C8F0C910C900C920C920C950C930C930C930C930C960C940C940C940C820C820C840C730C710C700C740C750C710C730C730C6F0C640C750C740C5D0C5C0C5F0C670C630C610C5D0C600C610C5B0C600C600C660C630C630C690C670C660C6E0C750C740C740C760C740C760C720C730C7E0C760C750C890C890C8A0C850C8B0C8D0C8A0C8A0C910C8D0C8F0C900C9D0C980C990C980C9B0CA00CA10C9B0C9B0C9F090101001241404041414241414141424142414040414193";
        return s.substring(begin * 2, end * 2);
    }
}
