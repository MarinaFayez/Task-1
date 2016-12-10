
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.util.List;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class DAO  {

	 public Connection connection = null;
	public void insert_product(Product product){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
			PreparedStatement psmt = connection.prepareStatement("insert into Product values (?,?,?,?,?)");
			psmt.setInt(1, product.getProduct_ID());
			psmt.setString(2, product.getType());
			psmt.setString(3, product.getManufacturer());
			psmt.setString(4, product.getProduction_Date());
			psmt.setString(5, product.getExpiry_Date());
		
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "product was successfully added");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not added");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		
		}finally {

            if (connection != null) {
                System.out.println("Connection Success");

            } else {
                System.out.println("Connection Failed!");
            }
		}
	}
	
	
public void delete_product(Product product){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
			PreparedStatement psmt = connection.prepareStatement("delete from product where Product_ID = ?");
			psmt.setInt(1, product.getProduct_ID());
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "product was successfully deleted");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not deleted");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		
		}finally {

            if (connection != null) {
                System.out.println("Connection Success");

            } else {
                System.out.println("Connection Failed!");
            }
		}
	}


	public ArrayList <Product> QueryProducts(Product product) {	
		ArrayList<Product> products = new ArrayList<Product>();
		PreparedStatement psm =null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
		String manufacture =product.getManufacturer();
		String query ="select Product_ID, Type, Manufacturer, Production_Date, Expiry_Date from product where Manufacturer = '" + manufacture + "'";
		psm = conn.prepareStatement(query);
		//psm.setString(1, product.getManufacturer());
		
		//int i = psm.executeQuery();
		//System.out.println("val = " +i );

		
		ResultSet rs = psm.executeQuery(query);
		//rs.next(); 
		//int bm =rs.getInt("Product_ID");
			//System.out.println("val = " + bm );	

		while (rs.next())
	      {
			  Product  prod= new Product();
	        prod.setProduct_ID(rs.getInt("Product_ID"));
	       				    
	        prod.setType(rs.getString("Type"));
	       
	        prod.setManufacturer(rs.getString("Manufacturer"));

	        prod.setProduction_Date(rs.getString("Production_Date"));
	        prod.setExpiry_Date(rs.getString("Expiry_date"));
	        products.add(prod);

	        // print the results
	        System.out.println("Product ID: "+ rs.getInt("Product_ID"));
            System.out.println("Product name: "+ rs.getString("Type"));
            System.out.println("Supplier: "+ rs.getString("Manufacturer"));
	        //System.out.format("%s, %s, %s, %s, %s, %s\n", id, type, manofacturer,dateproduction, dateexpiry );
	      
	      }
		  
		
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
	
	}finally {

        if (connection != null) {
            System.out.println("Connection Success");

        } else {
            System.out.println("Connection Failed!");
        }
	}
	
	
	return products;
}

	
public void update_product(Product product){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "");
			PreparedStatement psmt = connection.prepareStatement("UPDATE `product` SET `Type`=?,`Manufacturer`=?,`Production_Date`=?,`Expiry_Date`=? WHERE Product_ID = ?");
			psmt.setInt(5, product.getProduct_ID());
			psmt.setString(1, product.getType());
			psmt.setString(2, product.getManufacturer());
			psmt.setString(3, product.getProduction_Date());
			psmt.setString(4, product.getExpiry_Date());
		
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "product was successfully updated");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not updated");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		
		}finally {

            if (connection != null) {
                System.out.println("Connection Success");

            } else {
                System.out.println("Connection Failed!");
            }
		}
	}

}
	
//	public Patient getPatient(String SSN){
//		Patient result = new Patient(fname, lname);
//		
//		return result;
//	}
//	public List<Patient> getPatients(String Name){
//		
//	}


