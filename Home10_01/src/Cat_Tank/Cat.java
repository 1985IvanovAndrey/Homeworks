package Cat_Tank;


public class Cat {
    private String name;
    private int weight;
    private int growth;
    private String colour;
    private int lenght;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight<0){
            System.out.println("Вес не может быть отрицательным");
        }else{
            this.weight = weight;
        }
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        if(growth<0){
            System.out.println("Рост не может быть отрицательным");
        }else{
            this.growth = growth;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        if(lenght<0){
            System.out.println("Длина не может быть отрицательной");
        }else{
            this.lenght = lenght;
        }
    }

    public static int Power(int weight, int growth, int lenght){

        return weight*growth*lenght;
    }

}