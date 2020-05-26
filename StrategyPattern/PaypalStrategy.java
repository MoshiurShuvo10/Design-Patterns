public class PaypalStrategy implements PaymentStrategy{
        private String email ;
        private String password ;

        public PaypalStrategy(String email,String password){
            this.email = email ;
            this.password = password ;
        }

        @Override
        public void pay(int amount){
            System.out.println(amount+" paid with paypal");
            System.out.println("Email: "+this.email) ;
        }
    }
