package supermarket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TSVReader {

    public static void main(String[] args) {

        String tsvFile = "/Users/user/eclipse-workspace/SupermarketCodeTest/Products.tsv";
        BufferedReader br = null;
        String line = "";
        String tvsSplitBy = "\t";

        try {

            br = new BufferedReader(new FileReader(tsvFile));
            while ((line = br.readLine()) != null) {

                String[] products = line.split(tvsSplitBy);
                for(String product: products) {
                		ArrayList<Sku> stock = new ArrayList();
                		Sku stockObject = Sku.createNewSkuObject(product);
                		stock.add(stockObject);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
