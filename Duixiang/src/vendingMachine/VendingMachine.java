package vendingMachine;

public class VendingMachine {
      int price=80;
      int balance = 0;
      int total;
               /*��������������ԣ��ĸ�����*/
      VendingMachine(){        //���캯�����޷������ͣ��Ƚ����캯���ⲿ->����->���캯���ڲ�
    	                       
    	  System.out.println("Secret");
      }
      
      VendingMachine(int price){
    	  this.price=price;
    	  System.out.println("Link-");
      }
      void showPrompt()
      {
    	  System.out.println("Welcome!");
      }
          
      void insertMoney(int amount)
      {
    	  balance=balance+amount;
      }
      
      void showBalance()
      {
    	  System.out.println(balance);
      }
      
      void getFood()
      {
    	  if(balance>price){
    		  System.out.println("here are you");
    		  balance=balance-price;
    		  total=total+price;
    	  }
      }
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		
        VendingMachine vm1 = new VendingMachine(100);
        vm1.showBalance();
	}

}
