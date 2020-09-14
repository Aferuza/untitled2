package ExceptionsHandling;


 public class Checked_Unchecked_Exceptions {

        private String owner;
        private int amount;


        // unchecked Exception
        public Checked_Unchecked_Exceptions(String bOwner, int bAmount){
//        if(amount <= 0){
//            throw new RuntimeException("Cannot create account with negatt balance");
//        }
//        this.owner = bOwner;
//        this.amount = bAmount;

        }
        // checked Exception
        public void withdraw(int amountToWithdr) throws Exception {
            if(amount - amountToWithdr <0){
                throw new Exception("Not enogh money");
            }
            this.amount -= amountToWithdr;

        }
    }





    class Main {

        public static void main(String[] args) {

            //unchecked
            Checked_Unchecked_Exceptions account1 = new Checked_Unchecked_Exceptions("Ally", 120);
            Checked_Unchecked_Exceptions account2 = new Checked_Unchecked_Exceptions("Cally", -2);

            //checked
            try {
                account1.withdraw(150);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



