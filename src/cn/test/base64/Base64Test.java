package cn.test.base64;

import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2018/12/6
 */
public class Base64Test {
    public static void main(String[] args) {
        String baseStr = "data:image/png;base64,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kzFPrru0p3XuuOOOcPPNN4cHHnggmTB///33ggBuvfXWxuvZ7y6//PKw9NJLhz/++CNccskl4eWXXw5vvfVWOPnkk8N55503dN7bb78dbrzxxnDBBReEtdZaK3z11VfhjDPOCFtssUU49dRTw5JLLhnuu+++cPDBB/fPXX755cO2224bjjjiiLDbbruFZZZZpvF+YuOdjXF88MEHxXhtnHbvf/75Z7j33nuLe7/rrrvCeuutV7lHw+e0004LG264YYEpn+lAAMKcjnksRmGL2kjm77//LlRQqsL84YcfwkUXXVQQ2jrrrBMuvvjisO6664ZDDjkkfP755wURm3pdccUVi2exTd399ddf4ZZbbineOtVEmEYoRppGNksttVRxn6+//no466yzwp133ll8v32eeOKJgnzsGkaY77//fqFKV1ttteLc5ZZbbmimYuOdjXFcdtllBeEbFuXn119/Dccdd1zYeeedw0EHHVS5v2+++abA0nC66qqrijHxmXwEIMzJn8NiBKaqzj333LDNNtuEhx56qFB0qYRpxPbll1+GXXfdtfhOI8wNNtigTwYPPvhgoa5MNQ1+jOg+/fTTRsJ85ZVXwuOPPx7OPvvsfgn+0UcfhRNPPDHccMMN/Xs0pWokf+211/aP++6774oEsNdee4XDDz+8cs1R452NcRgW7733XrjtttvCCius0L8X+7l96sni1VdfLRKKYWYJKHUupiQsp24YEOaUTOkjjzwSvvjii3DggQeGE044IYswP/nkk7DSSiuFVVZZpZEwv/322/DPP/+Etdde202YTfCawrzpppuK/0ryaSJMO9fsgWeeeaawGkzZlp9R452NcbzzzjsFYRp5lxbBv//+WxDl5ptvHg444IDKUO+///6w/fbbF/e/9dZbhx133HFKIm1+DwPCnIL5t2bE7bffXqg4886s4ZOjMOtQ1BVmDKpRCnPwnP/++y+8++674frrrw8nnXRS2Gyzzfq/jhGm/dzK3kFPNnW84x5HedPWJDJrwb5/0MO0Ut1Uvvmyzz33XHjttdcKK0O9hXwKQnHqhwBhTvgUm+K75pprwu677x422WST8NNPPw0RppHOdtttN3KkL730UtFoGfyMk2isDDcVtsQSSxTe5E477VT8u/zECLM8z7xNuz/PeGeb+O37zZs0hWxq3FT9IBnaPZu1scMOOwT795VXXhmuvvrqikKe8LCbt7cPYU741D///PPhxx9/DPvuu28xkibCzB3iOAmzJBlrhtjWHOu0m+dabi3yEmbOeMc9DhvLCy+8EGws+++/f4X47XdmIZhtYb6lqc3TTz+9UMmDijp3TjivWwQgzG7xb3V16wY//PDD4bDDDut3oOcyYZaD/fnnn8NRRx0Vjj766MLns0+MMD/88MNif6cpTOvc54x33IT54osvBmtI7bPPPkNkWfqa1lUf/Jjnuscee7Sab07uHgEIs/s5yL6D3FLbe8FxE015XStnL7zwwmIPZtldHuVhmt9pTZTvv/++c2vByNKaa2YvlNukBvE0tW/3eswxxxTjs8/dd98djPgNz/Jn3jnguLmFAIQ5t+aj9d3MNYX56KOPho8//rjwVcvucgphWpfZyLTcn1kHyDPecRH/G2+8UewhtaeUSrK0sZjSt/2i9rEtTVaq77LLLv1btfPsHqzTv+qqq7aeY76gOwQgzO6wn5UrewjEe+G2RFM+7fLbb78VDZJy87mV5Lav0rrIe++9d7Qkty60leNGtvYYYtPHM96247DrWmfeNtqfeeaZlU30NhbbZ1puXLfSe+ONN67suzTVaftJTU1vueWWXvg5bg4iAGHOwUlpc0um5uxZbfPQttpqq+yvKlXg6quvXniNsS0xtoHciMDIzTadr7HGGpVrWnn62GOPhSuuuKJ4UsY2c1tX3/ZK2iOTtu/TPoNP+lgjyDZ+2xM+NgbbLtX0pI+dp8Y7jnHYGA3P/fbbr3gWvvxYx94229u4rFNeHnfooYeG9ddfv3+cJQyzFWy/ps3N4O6A7AnixE4QgDA7gX38Fy2339hz3eXHHtmzPZLlRnTvVevf1fQ9see168fa3kvbi2jPoD/77LOF8jLVaE2flVdeubglU4Dnn39+//bs59YMMhVq/2/yCj3jHdc4TMWagnzqqacaIbQtWfYEVPkcfh2DwfHZ45JNj5B654bjukUAwuwWf64OAiAwQQhAmBM0WdwqCIBAtwhAmN3iz9VBAAQmCAEIc4Imi1sFARDoFgEIs1v8uToIgMAEIQBhTtBkcasgAALdIgBhdos/VwcBEJggBCDMCZosbhUEQKBbBCDMbvHn6iAAAhOEAIQ5QZPFrYIACHSLwP8ACG73ciTFpQkAAAAASUVORK5CYII=";
        String imagePath = "d://1134.png";

        String s = "data:image/png;base64,iVBORw0KGgo";
        System.out.println(s);
        String substring = s.substring(22);
        System.out.println(substring);
        System.out.println(s);


        // boolean b = base64ChangeImage(baseStr, imagePath);
        // System.out.println(b);


    }

    public static boolean base64ChangeImage(String baseStr, String imagePath) {
        if (baseStr == null) {
            return false;
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(baseStr);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(imagePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
