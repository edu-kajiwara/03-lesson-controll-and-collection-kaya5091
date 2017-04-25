import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {

    public static void showKeyAndValue(){
        Map<String,String> programingLanguage = new HashMap<>();
        programingLanguage.put("Java","様々な環境で動くプログラミング言語");
        programingLanguage.put("PHP","WEB開発で用いられるプログラミング言語");
        programingLanguage.put("swift","iOS開発で主に用いられるプログラミング言語");
        programingLanguage.put("JavaScript","Webのフロントエンド開発で用いられるプログラミング言語");
        programingLanguage.put("JavaScript","Webのフロントエンド開発で用いられるプログラミング言語");
        Set<Map.Entry<String,String>> keyAndValueSet = programingLanguage.entrySet();
        for (Map.Entry<String,String> keyAndValue:keyAndValueSet) {
            System.out.println(keyAndValue.getKey() + " is " + keyAndValue.getValue());
        }
    }

    public static void main(String[] args) {
        showKeyAndValue();
    }
}