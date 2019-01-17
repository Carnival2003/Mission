import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public static void main(String[] args) {
        String message = "MAN Truck & Bus — это один из ведущих международных поставщиков грузовых автомобилей и услуг в области автотранспорта. Ассортимент компании включает в себя грузовые автомобили, городские, междугородные и туристические автобусы (в полной комплектации или только шасси), а также сервисные услуги, техническую поддержку и финансирование (кредитование). Кроме того, MAN предлагает дизельные и газовые двигатели для эксплуатации как на дорогах, так и в условиях бездорожья.";
        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
 
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}