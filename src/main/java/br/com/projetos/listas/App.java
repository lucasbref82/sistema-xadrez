package br.com.projetos.listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void teste(ArrayList<String> strings, Predicate<String> stringPredicate){
        for (String s: strings) {
            if(stringPredicate.test(s)){
                System.out.println(s);
            }
        }
    }
    public static void main( String[] args )
    {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Lucas");
        strings.add("Debora");
        strings.add("Emerson");
        teste(strings, s -> s.startsWith("L"));

        List<String> novaList = strings.stream().filter(x -> x.startsWith("D")).toList();

        for (String lista : novaList) {
            System.out.println(lista);
        }

        System.out.println(" --------- Removendo Lucas --------------");
        strings.remove("Lucas");

        for (String removida : strings) {
            System.out.println(removida);
        }


        System.out.println(" --------- Adicionando Lilica --------------");

        strings.add("Lilica");

        for (String s : strings) {
            System.out.println(s);
        }




    }




}
