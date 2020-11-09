package pl.karolina;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class YourPackage {

    private Order<?>[] packages = new Order[5];

    public void send(Order<?> order){
        int index = findEmptyField();
        if(index == -1){
            System.out.println("Not found.");
        } else {
            packages[index] = order;
            System.out.println(order);
        }
    }

    private int findEmptyField() {
        for(int i = 0; i < packages.length; i++){
            if(packages[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void get(int number, String code) {
        for(int i = 0 ; i<packages.length && packages[i] != null; i++){
            if(packages[i].getNumber() == number){
                if(packages[i].getCode().equals(code)){
                    System.out.println(packages[i]);
                    packages[i] = null;
                }
            }
        }
    }
}
