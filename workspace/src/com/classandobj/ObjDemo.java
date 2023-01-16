package com.classandobj;

/**
 * @author flywu
 * @date 2022/11/9 9:45
 */

//class Book {
//
//    String title;
//    double price;
//
//    public void getInfo() {
//        System.out.println("图书的名称：" + title + " 图书的价格：" + price);
//    }
//}

//class Book{
//
//    private String title;
//    private double price;
//
//    public void getInfo(){
//        System.out.println("图书的名称："+title+" 图书的价格："+price);
//    }
//}
////public class ObjDemo {
////    public static void main(String args[]) {
////        Book book = new Book();
////        book.title = "Java开发";
////        book.price = -89.9;
////        book.getInfo();
////    }
//    /**
//     * 运行结果
//     * 'title' has private access in 'com.classandobj.Book'
//     * 'price' has private access in 'com.classandobj.Book'
//     */
//}

//class Book{
//
//    private String title;
//    private double price;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//
//    public void setPrice(double price) {
//        if(price > 0.0){
//            this.price = price;
//        }else {
//            this.price = 0.0;
//        }
//    }
//
//    public void getInfo(){
//        System.out.println("图书的名称："+title+" 图书的价格："+price);
//    }
//}
//
//public class ObjDemo {
//    public static void main(String args[]) {
//        Book book = new Book();
//        book.setTitle("Java开发");
//        book.setPrice(-89.9);
//        book.getInfo();
//    }
//    /*运行结果
//    * 图书的名称：Java开发 图书的价格：-89.9
//    * */
//}
