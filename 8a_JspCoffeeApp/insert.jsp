<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee List</title>
</head>
<body>
    <h2>Coffee Records</h2>

<%
    String name = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    Connection conn = null;
    PreparedStatement insertStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC",
            "root", 
            "" // ✅ Replace with your MySQL password
        );

        // ✅ Insert new coffee product
        if (name != null && price != null) {
            String insertSQL = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, name);
            insertStmt.setBigDecimal(2, new java.math.BigDecimal(price));
            insertStmt.executeUpdate();

            out.println("<p style='color:green;'>Coffee '" + name + "' added successfully!</p>");
        }

        // ✅ Read and display all coffee records
        String selectSQL = "SELECT * FROM coffee";
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery(selectSQL);
%>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
<%
        while (rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getBigDecimal("price") %></td>
        </tr>
<%
        }
    } catch(Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch(Exception e) {}
        if (selectStmt != null) try { selectStmt.close(); } catch(Exception e) {}
        if (insertStmt != null) try { insertStmt.close(); } catch(Exception e) {}
        if (conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
    </table>
</body>
</html>
