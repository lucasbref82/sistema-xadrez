package br.com.projetos.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\entrada.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.err.println("Erro ao encontrar arquivo: "+ e.getMessage());
        }finally {
            if(scanner != null){
                System.out.println("Entrou no finally! ");
                scanner.close();
            }
        }
    }
}
