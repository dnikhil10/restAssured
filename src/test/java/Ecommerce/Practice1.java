package Ecommerce;


public class Practice1 {

        private int laptop;
        private String name;
        private char type;

        public void setLaptop(int laptop)
        {
            this.laptop=laptop;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void setType(char type)
        {
            this.type=type;
        }

        public int getLaptop()
        {
            return laptop;
        }
        public String getName()
        {
            return name;
        }
        public char getType()
        {
            return type;
        }

    public static void main (String[] args)
    {
       Practice1 pr2=new Practice1();
       pr2.setLaptop(34);
       pr2.setName("Dell");
       pr2.setType('f');
       System.out.println(pr2.getLaptop());
    }
}
