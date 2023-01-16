package com.classandobj;

/**
 * @author flywu
 * @date 2023/1/12 15:31
 */
class Demo {
    public static String String() {
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "六六六";
        }
        return result;
    }
    public static StringBuilder String(int a){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("六六六");
        }
        return sb;
    }
    public static void main(String[] args) {
        String chenmo = "沉默";
        String wanger = "王二";
        String cmower = String.join("", chenmo, wanger);
        System.out.println(cmower);

//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i < 10; i++) {
//            String chenmo = "沉默";
//            String wanger = "王二";
//            sb.append(chenmo);
//            sb.append(wanger);
//        }
//        System.out.println(sb);
    }
}

