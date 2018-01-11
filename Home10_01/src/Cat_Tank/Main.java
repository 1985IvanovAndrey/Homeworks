package Cat_Tank;

import Cat_Tank.Cat;

public class Main {

    public static void main(String[] args) {
        Cat cot=new Cat();
        cot.setName("Bublik");
        cot.setColour("white");
        cot.setLenght(30);
        cot.setWeight(9);
        cot.setGrowth(10);
        System.out.println(cot.getName()+" цвета "+cot.getColour()+"" +
                " имеет силу "+ cot.Power(cot.getWeight(),cot.getLenght(),cot.getGrowth()));

    }


}