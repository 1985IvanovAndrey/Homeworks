public class tableMultiplication {

    public static void main(String[] args) {

        System.out.println("Таблица умножения в обычном виде");
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Таблица умножения в реверсном варианте");
        for(int i=9;i!=0;i--){
            for(int j=9;j!=0;j--) {
                System.out.print(j * i + "\t");
            }
            System.out.println("");
        }
    }

}