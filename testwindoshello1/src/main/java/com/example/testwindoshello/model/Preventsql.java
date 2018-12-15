package com.example.testwindoshello.model;

public class Preventsql {
    public String sqlValidate(String str) {
        String str2 = str.toLowerCase();//统一转为小写
        String[] sqlStr1 = {"and", "exec", "execute", "insert", "select", "delete", "update", "count", "drop", "chr", "mid", "master", "truncate", "char", "declare", "sitename", "net user", "xp_cmdshell", "like", "and", "exec", "execute", "insert", "create", "drop", "table", "from", "grant", "use", "group_concat", "column_name", "information_schema.columns", "table_schema", "union", "where", "select", "delete", "update", "order", "by", "count", "chr", "mid", "master", "truncate", "char", "declare", "or"};//词语
        String[] sqlStr2 = {"*", "'", ";", "or", "-", "--", "+", "//", "/", "%", "#"};//特殊字符
        for (int i = 0; i < sqlStr1.length; i++) {
            if (str2.indexOf(sqlStr1[i]) >= 0) {
                str = str.replaceAll(sqlStr2[i], "");
            }
        }
        return str;
    }
}
