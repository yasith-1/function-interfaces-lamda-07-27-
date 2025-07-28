# 🛍️ Product Management Service

A modern Spring Boot REST API service for managing product inventory with advanced features like low stock monitoring and stream-based data processing.

## 🚀 Features

- 📦 **Product Management**: Complete CRUD operations for product inventory
- ⚠️ **Low Stock Alerts**: Automatic detection of products with low inventory (≤50 units)
- 🔄 **Stream API Integration**: Modern Java 8+ stream processing for efficient data handling
- 🗄️ **Database Integration**: MySQL database connectivity with JDBC Template
- 📊 **RESTful API**: Clean REST endpoints for easy integration
- 🎯 **Layered Architecture**: Well-structured service, repository, and controller layers

## 🛠️ Tech Stack

- **Java 21** ☕
- **Spring Boot 4.0.0-M1** 🍃
- **Spring Web** 🌐
- **Spring Data JPA** 📊
- **MySQL** 🗄️
- **Lombok** 🎯
- **Jackson** 📝
- **Maven** 📦
- **Swagger/OpenAPI** 📚

## 📋 Prerequisites

Before running this application, make sure you have:

- ☕ Java 21 or higher
- 🗄️ MySQL Server
- 📦 Maven 3.6+

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yasith-1/function-interfaces-lamda-07-27-.git
   cd function-interfaces-lamda-07-27-
   ```

2. **Configure Database**
   
   Create a MySQL database named `thogakade` and update the connection details in `application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/thogakade
       username: your_username
       password: your_password
   ```

3. **Create Database Table**
   ```sql
   CREATE TABLE item (
       code VARCHAR(50) PRIMARY KEY,
       description VARCHAR(255),
       unitPrice DECIMAL(10,2),
       qtyOnHand INT
   );
   ```

4. **Build and Run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## 🌐 API Endpoints

### 📦 Get All Products
```http
GET /api/product/allproducts
```
Returns a list of all products in the inventory.

### ⚠️ Get Low Stock Products
```http
GET /api/product/lowstock
```
Returns products with quantity on hand ≤ 50 units.

## 📊 API Response Format

```json
[
  {
    "code": "P001",
    "description": "Sample Product",
    "unitPrice": 25.99,
    "qtyOnHand": 45
  }
]
```

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/edu/icet/demoervice/
│   │   ├── Main.java                    # 🚀 Application entry point
│   │   ├── controller/
│   │   │   └── ProductController.java    # 🎮 REST controllers
│   │   ├── dto/
│   │   │   └── Product.java             # 📝 Data transfer objects
│   │   ├── entity/
│   │   │   └── ProductEntity.java       # 🗄️ Database entities
│   │   ├── mapper/
│   │   │   └── ProductEntityMapper.java # 🔄 Row mappers
│   │   ├── repository/
│   │   │   ├── ProductRepository.java   # 📊 Repository interfaces
│   │   │   └── impl/
│   │   │       └── ProductRepositoryImpl.java
│   │   └── service/
│   │       ├── ProductService.java      # 🎯 Service interfaces
│   │       └── impl/
│   │           └── ProductServiceImpl.java
│   └── resources/
│       └── application.yml              # ⚙️ Configuration
└── pom.xml                             # 📦 Maven dependencies
```

## 💡 Key Implementation Highlights

### 🔄 Stream API Usage
The service layer demonstrates both traditional and modern approaches:

```java
// Modern Stream API approach
return repository.getAllProducts()
    .stream()
    .filter(productEntity -> productEntity.getQtyOnHand() <= 50)
    .map(productEntity -> mapper.convertValue(productEntity, Product.class))
    .collect(Collectors.toList());
```

### 🗄️ Custom Row Mapper
Custom JDBC row mapper for flexible database result mapping:

```java
public class ProductEntityMapper implements RowMapper<ProductEntity> {
    @Override
    public ProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        // Custom mapping logic
    }
}
```

## 🧪 Testing

The application can be tested using:
- 📚 **Swagger UI**: Available at `http://localhost:8080/swagger-ui.html`
- 🧪 **Postman**: Import the API endpoints
- 🌐 **Browser**: Direct GET requests for testing

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Yasith** - [GitHub Profile](https://github.com/yasith-1)

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- MySQL for reliable database solutions
- Lombok for reducing boilerplate code

---

⭐ **Star this repository if you found it helpful!** ⭐
