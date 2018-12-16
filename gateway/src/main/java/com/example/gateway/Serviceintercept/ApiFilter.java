package com.example.gateway.Serviceintercept;

import com.example.gateway.encryption.AES;
import com.example.gateway.encryption.RSAEncrypt;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ApiFilter extends ZuulFilter {
    TypeCode typeCode = new TypeCode();

    @Override
    //filterType 为过滤类型，可选值有 pre（路由之前）、route（路由之时）、
    //post（路由之后）、error（发生错误时调用）。
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //校检代码
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = null;
        String tokenRSAs = request.getHeader("token");
        String tokenRSA = tokenRSAs.replace(" ", "+");
        String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJX9M4LM2fi5mbOvDGCvZP+OxhfLASN+2p9xrRhd7xEifhKu5QU6avSotxBqFROm1kGeL/mLYV1RIXZeMp60XncGIUj+B/6A2qF5qayiywuTxxLGMncNFwaqR7RBciqAGD8vFOTanT2X6aLiEYTaFxJEviY5TpNtAWOM7YIyAZPNAgMBAAECgYBOdey7UMP5i8WurDRyY24XDa3shmJrGhHtdH7TD1hfA0cmKN1fFccbgyJ4cLXj2NOd8c0w4kulkCpMDEy4nqwHFC9gMPR/AUc5DwZ2rTMydlNczqHOuTz9xMg4/j0e2He32i6X5zLFQWsIKWHEv5MXDAReAan3HQnOwEZR+cGTlQJBAM1BTxxzPFjz5s1SpZsCLfyxjuapJV69dVjdyzHPuZI38Do9HA/TgIwFiq8u49gfT7sHMfVETMs4Bys4JjcDAmcCQQC7EhQeX9aYbmB7V+dCfj9v7VNKj11pag4oRtLMOCL5Xx9aeA2vxiDeCjXmgrvCo6L5GcSpanSyjRgdig/w15+rAkEAkX7SDWDCTmvWF4WWTqLk5lMW8PrFurqiDDRsbQrKiJOOfjoDQlSyso7bGAMtD25injkjeLDJnuRAcKqErEo90QJAENu2OG6GlkIMK9FmI9XgvaNziBqXXnKSSArp4EGG1VY/KxX6lcaTG69r4BQT+5xniW9LC8FuNtEERVU1zox/9QJAPDaqYocltNpUPQKB2nLHIZupw1bUHPlFVXuDsCnO0oczQU5D4cie2eP2dYVoWe+IvtdiMuJaV1RJYOQ2Ea7WoQ==";
        try {
            token = RSAEncrypt.decrypt(tokenRSA,privateKey);
        } catch (Exception e){}
        String tokenAES = request.getHeader("token");
        try {
            String password = "12345678";
            byte[] decryptFrom = AES.parseHexStr2Byte(tokenAES);
            byte[] decryptResult = AES.decrypt(decryptFrom, password);
//            System.out.println("解密后:" + new String(decryptResult));
            token = new String(decryptResult);
        } catch (Exception e) {
        }


        if (!"12345".equals(token)) {
            //false代表的意思是,这个请求最终不会被zuul转发到后端服务器
            typeCode.setType(0);
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(402);
            try {
                context.getResponse().getWriter().write("token is invalid");
            } catch (Exception e) {
            }
        } else
            typeCode.setType(1);

        return null;
    }
}
