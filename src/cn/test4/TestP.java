package cn.test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2020/2/24
 */
public class TestP {
    public static void main(String[] args) {
        List<String> hasData = Arrays.asList("闽DD32367",
                "闽DD37793",
                "闽DD32096",
                "闽DD32317",
                "闽DD38690",
                "闽DD39570",
                "闽DD37156",
                "闽DD38937",
                "闽DD31736",
                "闽DD26337",
                "闽DD32837",
                "苏ED57568",
                "闽DD32370",
                "闽DD36753",
                "闽DD29610",
                "闽DD35627",
                "闽DD31176",
                "闽DD39530",
                "闽DD33932",
                "闽DD35370",
                "闽DD28760",
                "闽DD12517",
                "闽DD37360",
                "闽DD35583",
                "闽DD35026",
                "闽DD35760",
                "闽DD32756",
                "闽DD39910",
                "闽DD33902",
                "闽DD32760",
                "闽DD31857",
                "闽DD35807",
                "闽DD23180",
                "闽DD21039",
                "闽DD33952",
                "闽DD38827",
                "闽DD22157",
                "闽DD15857",
                "闽DD38675",
                "闽DD35317",
                "闽DD36237",
                "闽DD30670",
                "闽DD20917",
                "闽DD32026",
                "闽DD39278",
                "闽DD27357",
                "闽DD32657",
                "闽DD27670"
        );

        System.out.println(hasData);
        System.out.println(hasData.size());

        List<String> totalData = Arrays.asList("闽DD35026",
                "闽DD32657",
                "闽DD31736",
                "闽DD37793",
                "闽DD27670",
                "闽DD28760",
                "闽DD36753",
                "闽DD33952",
                "闽DD36237",
                "闽DD21039",
                "闽DD32760",
                "闽DD32096",
                "闽DD38675",
                "闽DD32317",
                "闽DD20917",
                "闽DD29610",
                "闽DD39570",
                "闽DD37360",
                "闽DD35627",
                "闽DD33932",
                "闽DD26337",
                "闽DD38937",
                "闽DD39910",
                "闽DD39530",
                "闽DD35760",
                "闽DD22157",
                "闽DD32267",
                "闽DD32367",
                "闽DD37156",
                "闽DD32026",
                "闽DD27357",
                "闽DD38827",
                "闽DD35176",
                "闽DD38690",
                "闽DD32370",
                "闽DD39278",
                "闽DD12517",
                "闽DD33902",
                "闽DD31207",
                "闽DD35317",
                "闽DD35370",
                "闽DD23180",
                "闽DD35583",
                "闽DD31176",
                "闽DD32756",
                "闽DD35807",
                "闽DD32837",
                "闽DD30670",
                "闽DD31857",
                "闽DD15857",
                "苏ED55950",
                "苏ED57705",
                "苏ED59226",
                "苏ED51966",
                "苏ED58326",
                "苏ED58328",
                "苏ED56765",
                "苏ED57568",
                "苏ED50809",
                "苏ED35129");

        List<String> hasNoData = new ArrayList<>(20);
        for (String s : totalData) {
            if (!hasData.contains(s)) {
                hasNoData.add(s);
            }
        }

        System.out.println("======");
        System.out.println(hasNoData.size());
        System.out.println(hasNoData);

    }
}
