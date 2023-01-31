import java.util.Arrays;
public class Main {
    static boolean isFind (int [] list, int value){
        for (int i : list){
            if (i == value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeatList = new int [list.length];
        int count=1;
        System.out.println("Dizi : "+ Arrays.toString(list));

        for (int i =0; i< list.length;i++){
                if(isFind(repeatList,list[i])){
                    for (int j=0; j< list.length;j++){
                        if ((i!=j) && (list[i]==list[j])){
                        count++;
                        }
                        repeatList[i]=list[i];

                }
                    System.out.println(list[i]+" Sayısı "+count+" kere tekrar edildi.");
                    count=1;
            }

        }

    }


}
