
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    // a simple main program
    public static void main(String[] args) throws Exception {
        HashMap<String,String> list = new HashMap<String,String>();

        RandomAccessFile file = new RandomAccessFile("/Users/abhi/Downloads/test.txt", "r");
        String str;
        //String[] pr=new String[2];

        try
        {
            while ((str = file.readLine()) !=null) {
                String[] pr=str.split(" ",2);
                list.put(pr[0],pr[1]);
            }
            file.close();
        }
        finally{

            StringBuilder sb = new StringBuilder();
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>GLOSSARY");
            sb.append("</title>");
            sb.append("</head>");
            sb.append("<body> <b>GLOSSARY</b>");
            for (String l: list.keySet())
                sb.append("<p>"+l+"</p>");
            System.out.println("kshfdakld");
            sb.append("</body>");
            sb.append("</html>");
            FileWriter fstream = new FileWriter("/Users/abhi/Downloads/op.html");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(sb.toString());
            out.close();
        }
    }
}
