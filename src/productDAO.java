
import java.util.List;
public interface productDAO {

	   public void insertProduct(product Product);
	   public void updateProduct(product Product);
	   public void deleteProduct(String idproduct);
	   public  List<product> retrieveProduct(String manfact);
	}

