package com.cnp.springboot.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 字符串工具类
 */
public class StrUtil {
    /**
     * 按规则取字符
     * @param str
     * @param n
     * @return
     */
    public static String getStr(String str,int n) {
        String result = new String();
        int len = str.length();
        for (int i = 1; i < len; i += n) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * 把对象转成字符串，如果对象为空，则返回空字符串
     * 重写了java.lang.String.valueOf
     * @param obj
     * @return
     */
    public static String valueOf(Object obj) {
        return (obj == null) ? "" : obj.toString();
    }

    /**
     * 判断字符串对象是否为null或空白字符串(""/" ")
     * 重写了org.apache.commons.lang3.StringUtils.isBlank
     * @param obj
     * @return
     */
    public static boolean isBlank(Object obj) {
        if(obj instanceof String) {
            CharSequence cs = StrUtil.valueOf(obj);
            int strLen = cs.length();//字符串长度
            if(strLen==0){
                return true;//是空字符串""
            }
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
            return true;//是空白字符串" "
        }
        return true;//不是字符串对象
    }

    /**
     * 判断字符串对象是否为null或""
     * 重写了org.apache.commons.lang3.StringUtils.isEmpty
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        if(obj instanceof String) {
            CharSequence cs = StrUtil.valueOf(obj);
            return cs == null || cs.length() == 0;
        }
        return false;
    }

    /**
     * 按规则取字符
     * @param str
     * @param n
     * @return
     */
    public static String getRuleStr(String str,int n) {
        String result = new String();
        int len = str.length();
        for (int i = 1; i < len; i += n) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * 判断字符串是否以某个字符串开头
     * @param str
     * @return
     */
    public static boolean isStart(String str,String start){
        return str.startsWith(start);
    }

    /**
     * 判断字符串是否以某个字符串结尾
     * @param str
     * @return
     */
    public static boolean isEnd(String str,String end){
        return str.endsWith(end);
    }

    /**
     * List集合转字符串
     * @param separate
     * @param list
     * @return
     */
    public static String join(String separate, List<Object> list){
        return StringUtils.join(separate,list);
    }

    /**
     * 判断对象是否与某个字符串相等
     * @param obj
     * @param str
     * @return
     */
    public static boolean isMatch(Object obj,String str) {
        if(str!=null){
            return str.equals(valueOf(obj));
        }
        return false;
    }

    /**
     * 校验字符串
     * @param value
     * @return
     */
    public static boolean verifyValue(String value,String regex){
        return value.matches(regex);
    }

}
