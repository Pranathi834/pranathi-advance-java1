<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Coffee Result</title>
</head>
<body>

<%
    String idStr = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    if (idStr != null && coffeeName != null && priceStr != null) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC",
                "root", "" // change password if needed
            );

            String sql = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, coffeeName);
            ps.setDouble(2, price);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<p style='color:green;'>Coffee record updated successfully!</p>");
            } else {
                out.println("<p style='color:red;'>No record found with ID: " + id + "</p>");
            }

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            if (ps != null) try { ps.close(); } catch (Exception e) {}
            if (conn != null) try { conn.close(); } catch (Exception e) {}
        }
    } else {
        out.println("<p style='color:red;'>Missing input data!</p>");
    }
%>

<hr>
<a href="update_coffee.html">Go Back</a>

</body>
</html>
