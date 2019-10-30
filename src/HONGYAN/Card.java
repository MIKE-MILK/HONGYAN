package HONGYAN;
import java.util.*;
public class Card {
    public static void main(String[] args) {
        List<Poker>list=new ArrayList<>();
        String []type={"♠","♣","♥","♦"};
        String []size={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i=0;i<type.length;i++){
            for (int j=0;j<type.length;j++){
                list.add(new Poker(type[i],size[j]));
            }
        }
        System.out.println("洗牌前：");
        for (int j = 0; j < list.size(); j++) {
            System.out.printf(list.get(j).toString() + " ");
            if (j == list.size() - 1) {
                System.out.println("");
            }
        }
        /** 洗牌 */
        Collections.shuffle(list);
        /** 输出洗牌结果 */
        System.out.println("洗牌后：");
        for (int j = 0; j < list.size(); j++) {
            System.out.printf(list.get(j).toString() + " ");
        }
    }

}
