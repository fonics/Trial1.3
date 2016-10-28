import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class DAOIMP implements productDAO {

public void insertProduct(product Product) {
	        try {
	            Class.forName ("com.mysql.jdbc.Driver");
	            Connection myConn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/product_new", "root", "");
	            PreparedStatement psmt;
	            psmt = myConn.prepareStatement ("insert into product values (?,?,?,?,?)");
	            psmt.setString (1, Product.getidproduct());
	            psmt.setString (2, Product.gettype());
	            psmt.setString (3, Product.getmanfact());
	            psmt.setString (4, Product.getprodate());
	            psmt.setString (5, Product.getexpdate());
	            int i = psmt.executeUpdate();
	            if (i > 0) {
	                JOptionPane.showMessageDialog (null, "Product was successfully added");
	            } else {
	                JOptionPane.showMessageDialog (null, "Product was not added");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog (null, e);
	        }

	    }
 public void deleteProduct(String idproduct) {
	        try {
	            Class.forName ("com.mysql.jdbc.Driver");
	            Connection myConn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/product_new", "root", "");
	            PreparedStatement psmt;
	            psmt = myConn.prepareStatement ("delete from Product where idproduct = ?");
	            psmt.setString (1, idproduct);
	            int i = psmt.executeUpdate();
	            if (i > 0) {
	                JOptionPane.showMessageDialog (null, "Product was successfully deleted");
	            } else {
	                JOptionPane.showMessageDialog (null, "Product was not deleted");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog (null, e);
	        }
	    }

public void updateProduct(product Product) {
	        try {
	            Class.forName ("com.mysql.jdbc.Driver");
	            Connection myConn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/product_new", "root", "");
	            PreparedStatement psmt;
	            psmt = myConn.prepareStatement ("update product set idproduct=?,  type = ?,manfact = ?, prodate = ?, expdate = ? where idproduct = ?");
	            psmt.setString (1, Product.getidproduct());
	            psmt.setString (2, Product.gettype());
	            psmt.setString (3, Product.getmanfact());
	            psmt.setString (4, Product.getprodate());
	            psmt.setString (5, Product.getexpdate());
	            psmt.setString (6, Product.getidproduct());
	            int i = psmt.executeUpdate();
	            if (i > 0) {
	                JOptionPane.showMessageDialog (null, "Product was successfully updated");
	            } else {
	                JOptionPane.showMessageDialog (null, "Product was not updated");
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog (null, e);
	        }

	    }

public List<product> retrieveProduct(String manfact) {

	       List<product> productList = new ArrayList<product>();

	        try {
	            Class.forName ("com.mysql.jdbc.Driver");
	            Connection myConn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/product_new", "root", "");
	            PreparedStatement psmt;
	            psmt = myConn.prepareStatement ("select * from product where manfact = ?");
	            psmt.setString (1, manfact);
	            ResultSet Rlist = psmt.executeQuery();
	            while (Rlist.next()) {
	                product retrievedProduct = new product(Rlist.getString("idproduct"));
	                retrievedProduct.settype(Rlist.getString("type"));
	                retrievedProduct.setmanfact(Rlist.getString("manfact"));
	                retrievedProduct.setprodate(Rlist.getString("prodate"));
	                retrievedProduct.setexpdate(Rlist.getString("expdate"));
	                productList.add(retrievedProduct);
	                System.out.println(Rlist.getString("manfact") + "," + Rlist.getString("type") + "," + Rlist.getString("idproduct"));
	            }
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog (null, e);
	        }
	        return productList;
	    }
	    

}
	