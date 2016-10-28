
import java.util.List;

public class program {

    public static void main(String[] args) {

        DAOIMP newtest = new DAOIMP();
        product testprod = new product("10021");
       testprod.settype("orange juice");
       testprod.setmanfact("lamar");
        testprod.setprodate("2010-10-10");
        testprod.setexpdate("2015-10-10");
       newtest.insertProduct(testprod);
        product testprodUpd = new product("2016");
        testprodUpd.settype("Chocolate");
        testprodUpd.setmanfact("galaxy");
        testprodUpd.setprodate("2016-09-10");
        testprodUpd.setexpdate("2106-9-4");
        newtest.updateProduct(testprodUpd);
        List<product> list = newtest.retrieveProduct("pepsi");
       // System.out.println(list.get(0).gettype());
     
        newtest.deleteProduct("2016");
    }
}