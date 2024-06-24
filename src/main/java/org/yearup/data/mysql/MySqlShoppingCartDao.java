package org.yearup.data.mysql;

import org.springframework.stereotype.Component;
import org.yearup.data.ProductDao;
import org.yearup.data.ShoppingCartDao;
import org.yearup.models.Product;
import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MySqlShoppingCartDao extends MySqlDaoBase implements ShoppingCartDao {
    private final ProductDao productDao;

    public MySqlShoppingCartDao(DataSource dataSource, ProductDao productDao) {
        super(dataSource);
        this.productDao = productDao;
    }

    @Override
    public ShoppingCart getCartByUserId(int userId) {
        ShoppingCart cart = new ShoppingCart();
        List<ShoppingCartItem> items = new ArrayList<>();

        String sql = "SELECT * FROM shopping_cart_items WHERE user_id = ?";

        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ShoppingCartItem item = mapRow(resultSet);
                items.add(item);
            }

            // Convert List<ShoppingCartItem> to Map<Integer, ShoppingCartItem>
            Map<Integer, ShoppingCartItem> itemsMap = new HashMap<>();
            for (ShoppingCartItem item : items) {
                itemsMap.put(item.getProduct().getId(), item);
            }

            cart.setItems(itemsMap); // Setting the map to the cart
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cart;
    }

    @Override
    public ShoppingCartItem getItemByUserIdAndProductId(int userId, int productId) {
        String sql = "SELECT * FROM shopping_cart_items WHERE user_id = ? AND product_id = ?";
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.setInt(2, productId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapRow(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void addProductToCart(int userId, int productId, int quantity) {
        String sql = "INSERT INTO shopping_cart_items (user_id, product_id, quantity) VALUES (?, ?, ?)";
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.setInt(2, productId);
            statement.setInt(3, quantity);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateProductQuantity(int userId, int productId, int quantity) {
        String sql = "UPDATE shopping_cart_items SET quantity = ? WHERE user_id = ? AND product_id = ?";
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, quantity);
            statement.setInt(2, userId);
            statement.setInt(3, productId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clearCart(int userId) {
        String sql = "DELETE FROM shopping_cart_items WHERE user_id = ?";
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ShoppingCartItem mapRow(ResultSet resultSet) throws SQLException {
        int userId = resultSet.getInt("user_id");
        int productId = resultSet.getInt("product_id");
        int quantity = resultSet.getInt("quantity");

        Product product = productDao.getById(productId); // Fetch the product object

        ShoppingCartItem item = new ShoppingCartItem();
        item.setUserId()
        item.setProduct(product); // Set the product object
        item.setQuantity(quantity);

        return item;
    }
}
