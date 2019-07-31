package iteカフェ1;
public class Item {
    private int No;
    private String name;
    private int price;
        public Item(int No, String name, int price) {
            this.No = No;
            this.name = name;
            this.price = price;
        }
        public int getNo(){
        return No;    
        }

        public void setNo(int No){
            this.No = No;
        }
        
        public String getname(){
            return name;
        }
        
        public void setname(String name){
            this.name = name;
        }
        
        public int getprice(){
            return price;
        }
        public void setprice(int price){
            this.price = price;
        }
}
