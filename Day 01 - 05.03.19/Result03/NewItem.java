package HomeWork.Result03;

public class NewItem {

    private Item product;
    private int bonus;


    public NewItem(Item product, int bonus) {
        this.product = product;
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public float Coat(int N) {
        if (N > 100) {

            return (100 * product.getPrice()+((N - 100) *(product.getPrice() -(product.getPrice() * ((float) bonus / 100)))));
        }
        else
            {
            return N * product.getPrice();
        }
    }

    public float NewCoat(int N) {
        if (N <= 100) {
            return N*product.getPrice();
        }
        else{
            int num=1;
            float temp=product.getPrice();
            while(num<N)
            {
                num+=100;
            }
            for(int i=0;i<(num-1)/100 && (temp>(float)product.getPrice()/2);i++)
            {
                temp=temp-(temp*((float)bonus/100));
            }
            if(temp>(float)product.getPrice()/2)
                return N*temp;
            else
                return N*((float)product.getPrice()/2);
        }
    }

}
