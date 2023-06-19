/* Goal: analyze the malformation of a HTML structure 
    (for example: opening tag differing from closing one)

    To compile:
 * javac HtmlAnalyzer.java
 * java HtmlAnalyzer <insert-url-here>
 * 
 */

import java.util.Scanner;
import java.util.Stack;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.io.File;
import java.io.FileNotFoundException; 



public class HTMLanalyzer {

    public static boolean isTagsMismatched (Scanner scanner) {
        Stack<String> pilhaDeTags = new Stack<>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.startsWith("<")) {
                if (line.substring(0, 1) == "</"
                    && !pilhaDeTags.isEmpty()) {
                        if (pilhaDeTags.firstElement().substring(1) == line.substring(2)) {
                            return false;
                        }
                }
                pilhaDeTags.push(line.trim());
            }
        }
        return true;
    }

    public static void Deepest (Scanner scanner) {
        int depth = 0;
        String deepestText = "";
        int deepestLevel = 0;
        Boolean verificador = false;
        int tagAbertura = 0;
        int tagFechamento = 0;

        while (scanner.hasNext()) {
            //System.out.println(scanner.nextLine());
            String line = scanner.nextLine();

            if (line.trim().startsWith("<")) {
                //linha tem tag de abertura ou fechamento

                if (line.trim().startsWith("</")) {
                    //linha tem tag de fechamento
                    tagFechamento++;

                    depth--;
                } 
                else {
                    //linha tem tag de abertura
                    tagAbertura++;

                    depth++;
                    if (deepestLevel < depth) {
                        deepestLevel = depth;
                        verificador = false;
                    }
                }
            } 
            else {
                //linha tem um trecho de texto
                
                if (depth == deepestLevel && verificador == false && !line.trim().isEmpty()) {
                    deepestText = line.trim();
                    verificador = true;
                } 
            }
        }
        
        if (tagAbertura != tagFechamento) {
            System.out.println("malformed HTML");
            return;
        }
        System.out.println(deepestText);
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = null;

        //lendo a partir de um link
        try {
            URL url = new URL(args[0]);                                                                     
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            scan = new Scanner(inputStream);

        //lendo a partir de arquivos html de teste locais    
        } catch (Exception e) {
            File html = new File("./malformed1.html");
            if (html.exists()) {
                scan = new Scanner(html);
            } else {
                System.out.println("O argumento não é uma URL válida ou não é um arquivo local");
            }
        }

        Deepest(scan);
    
    }

}
